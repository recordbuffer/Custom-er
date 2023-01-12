<template>
  <header class="p-3 text-bg-dark">
    <div class="container">
      <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
        <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
          <img class="bi me-2" width="90" height="40" src="../assets/logo.png" />
        </a>

        <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
          <li class="nav-item dropdown">
            <button class="btn btn-dark dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">문구</button>
            <ul class="dropdown-menu dropdown-menu-dark">
              <li><a class="dropdown-item" href="#">노트</a></li>
              <li><a class="dropdown-item" href="#">스티커</a></li>
            </ul>
          </li>
          <li class="nav-item dropdown">
            <button class="btn btn-dark dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">생활</button>
            <ul class="dropdown-menu dropdown-menu-dark">
              <li><a class="dropdown-item" href="#">컵</a></li>
              <li><a class="dropdown-item" href="#">티셔츠</a></li>
            </ul>
          </li>
        </ul>

        <div class="text-end">
          <button type="button" class="btn btn-outline-light me-2" @click="$router.push('/login')">로그인</button>
          <button type="button" class="btn btn-outline-light" style="background-color: #FC5030" @click="$router.push('/signup')">회원가입</button>
        </div>
      </div>
    </div>
  </header>
</template>

<script>
export default {
  name: 'Header'
}
</script>

<style scoped>
</style>
