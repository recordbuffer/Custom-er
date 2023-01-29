<template>
  <div>
    <section class="py-5">
      <div class="container px-4 px-lg-5 my-5">
        <div class="row gx-4 gx-lg-5 align-items-center">
          <div class="col-md-6"><img class="card-img-top mb-5 mb-md-0"
                                     src="../assets/Cup.png" alt="..."/></div>
          <div class="col-md-6">
            <div class="small mb-1">Make YourSelf Custom-er</div>
            <h1 class="display-5 fw-bolder">Basic White Cup</h1>
            <div class="fs-5 mb-5">
              <!--              <span class="text-decoration-line-through">$45.00</span>-->
              <span>12,000원</span>
            </div>
            <p class="lead">나만의 홈 카페를 만들기 위한 최고의 선택</p>
            <p class="lead">세라믹 도자기로 가볍고 튼튼하게</p>
            <br>
            <div class="d-flex">
              <input class="form-control text-center me-3" id="inputQuantity" type="num" value="1"
                     style="max-width: 3rem"/>
              <button class="btn btn-outline-dark flex-shrink-0" type="button">
                <i class="bi-cart-fill me-1"></i>
                Add to cart
              </button>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
export default {
  data() {
    return {
      product: [
        {text: 'cup', src: require('../assets/Cup.png') },
        {text: 'note', src: require('../assets/Cup.png') },
        {text: 'sticker', src: require('../assets/Cup.png') },
        {text: 'tshirt', src: require('../assets/Cup.png') }
      ]
    }
  }
}
</script>

<style scoped>
</style>