package com.shop.customer.repository;

import com.shop.customer.domain.Category;
import com.shop.customer.domain.eums.ProductStatus;
import com.shop.customer.domain.products.Note;
import com.shop.customer.domain.products.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    EntityManager em;

    @Autowired
    ProductRepository repository;

    @Test
    public void createNewProductNote() {
        //given
        Category category = new Category();
        category.setName("문구");

        em.persist(category);
        em.flush();

        //when
        Note note = new Note();
        note.setName("최고심노트");
        note.setPrice(3500);
        note.setStockNum(500);
        note.setDescription("최고의 최고심 노트를 만나보셔요");
        note.setStatus(ProductStatus.ON_SALE);
        note.setCategory(category);

        repository.save(note);

        //then
        Product product = repository.findAll().get(0);
        assertThat(product.getName()).isEqualTo("최고심노트");
        assertThat(product.getCategory()).isEqualTo(category);
    }
}