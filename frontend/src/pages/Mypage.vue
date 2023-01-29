<template>
  <div>
    <div class="container">
      <div class="col-md-10 mx-auto text-center">
        <div class="header-title">
          <div class="container text-center">
            <div class="row">
              <div class="col" @click="onTabClick('USER')">
                <div class="fs-5 mb-3">
                  <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-person-fill-gear" viewBox="0 0 16 16">
                    <path d="M11 5a3 3 0 1 1-6 0 3 3 0 0 1 6 0Zm-9 8c0 1 1 1 1 1h5.256A4.493 4.493 0 0 1 8 12.5a4.49 4.49 0 0 1 1.544-3.393C9.077 9.038 8.564 9 8 9c-5 0-6 3-6 4Zm9.886-3.54c.18-.613 1.048-.613 1.229 0l.043.148a.64.64 0 0 0 .921.382l.136-.074c.561-.306 1.175.308.87.869l-.075.136a.64.64 0 0 0 .382.92l.149.045c.612.18.612 1.048 0 1.229l-.15.043a.64.64 0 0 0-.38.921l.074.136c.305.561-.309 1.175-.87.87l-.136-.075a.64.64 0 0 0-.92.382l-.045.149c-.18.612-1.048.612-1.229 0l-.043-.15a.64.64 0 0 0-.921-.38l-.136.074c-.561.305-1.175-.309-.87-.87l.075-.136a.64.64 0 0 0-.382-.92l-.148-.045c-.613-.18-.613-1.048 0-1.229l.148-.043a.64.64 0 0 0 .382-.921l-.074-.136c-.306-.561.308-1.175.869-.87l.136.075a.64.64 0 0 0 .92-.382l.045-.148ZM14 12.5a1.5 1.5 0 1 0-3 0 1.5 1.5 0 0 0 3 0Z"/>
                  </svg>
                  회원 정보
                </div>
              </div>
              <div class="col" @click="onTabClick('ORDER')">
                <div class="fs-5 mb-3">
                  <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-truck" viewBox="0 0 16 16">
                    <path d="M0 3.5A1.5 1.5 0 0 1 1.5 2h9A1.5 1.5 0 0 1 12 3.5V5h1.02a1.5 1.5 0 0 1 1.17.563l1.481 1.85a1.5 1.5 0 0 1 .329.938V10.5a1.5 1.5 0 0 1-1.5 1.5H14a2 2 0 1 1-4 0H5a2 2 0 1 1-3.998-.085A1.5 1.5 0 0 1 0 10.5v-7zm1.294 7.456A1.999 1.999 0 0 1 4.732 11h5.536a2.01 2.01 0 0 1 .732-.732V3.5a.5.5 0 0 0-.5-.5h-9a.5.5 0 0 0-.5.5v7a.5.5 0 0 0 .294.456zM12 10a2 2 0 0 1 1.732 1h.768a.5.5 0 0 0 .5-.5V8.35a.5.5 0 0 0-.11-.312l-1.48-1.85A.5.5 0 0 0 13.02 6H12v4zm-9 1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm9 0a1 1 0 1 0 0 2 1 1 0 0 0 0-2z"/>
                  </svg>
                  주문 배송
                </div>
              </div>
              <div class="col" @click="onTabClick('COUPON')">
                <div class="fs-5 mb-3">
                  <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-box2-heart-fill" viewBox="0 0 16 16">
                    <path d="M3.75 0a1 1 0 0 0-.8.4L.1 4.2a.5.5 0 0 0-.1.3V15a1 1 0 0 0 1 1h14a1 1 0 0 0 1-1V4.5a.5.5 0 0 0-.1-.3L13.05.4a1 1 0 0 0-.8-.4h-8.5ZM8.5 4h6l.5.667V5H1v-.333L1.5 4h6V1h1v3ZM8 7.993c1.664-1.711 5.825 1.283 0 5.132-5.825-3.85-1.664-6.843 0-5.132Z"/>
                  </svg>
                  쿠폰 적립금
                </div>
              </div>
            </div>
          </div>
          <hr>
        </div>

        <b-card v-if="activeTab == 'USER'">
          <h2 class="wv-heading--subtitle">회원 정보 확인</h2>
          <br>
          <div class="row">
            <div class="col-md-5 mx-auto">
              <form>
                <div class="row mb-3">
                  <label for="inputEmail3" class="col-sm-3 col-form-label">이름</label>
                  <div class="col-sm-8">
                    <input type="email" class="form-control" id="inputEmail3">
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputEmail3" class="col-sm-3 col-form-label">이메일</label>
                  <div class="col-sm-8" style="text-align: left">
                    <p>ss@sample.com</p>
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputPassword3" class="col-sm-3 col-form-label">비밀번호</label>
                  <div class="col-sm-8">
                    <input type="password" class="form-control" id="inputPassword3" placeholder="새로운 비밀번호를 입력하세요">
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputPhone3" class="col-sm-3 col-form-label">연락처</label>
                  <div class="col-sm-8">
                    <input type="phone" class="form-control" id="inputPhone3">
                  </div>
                </div>
                <div class="row mb-3">
                  <label for="inputAddress3" class="col-sm-3 col-form-label">주소</label>
                  <div class="col-sm-8">
                    <input type="address" class="form-control" id="inputAddress3">
                  </div>
                </div>
                <br>
                <button type="submit" class=" btn btn-block send-button tx-tfm">수정</button>
              </form>
            </div>
          </div>
        </b-card>
        <b-card v-if="activeTab == 'ORDER'">
          this is 배송
        </b-card>
        <b-card v-if="activeTab == 'COUPON'">
          this is 쿠폰
        </b-card>
      </div>

    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      activeTab: 'USER',
      tabCategory: [
        {text: '회원 정보', value: 'USER'},
        {text: '주문 배송', value: 'ORDER'},
        {text: '쿠폰 적립금', value: 'COUPON'}
      ],
    }
  },
  methods: {
    onTabClick(tab) {
      this.activeTab = tab;
    },
    getUserInfo() {

    }
  }
}
</script>

<style scoped>
form {
  padding-bottom: 3em;
}

.send-button {
  background: #FC5030;
  width: 100%;
  font-weight: 600;
  color: #fff;
  padding: 8px 25px;
}

input[type=number]::-webkit-inner-spin-button,
input[type=number]::-webkit-outer-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

.header-title {
  margin: 4rem;
}

h1 {
  font-size: 31px;
  line-height: 40px;
  font-weight: 600;
  color: #4c5357;
}

h2 {
  color: #5e8396;
  font-size: 21px;
  line-height: 32px;
  font-weight: 400;
}

@media screen and (max-width: 480px) {
  h1 {
    font-size: 26px;
  }

  h2 {
    font-size: 20px;
  }
}
</style>