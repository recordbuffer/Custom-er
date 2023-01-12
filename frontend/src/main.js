import Vue from 'vue'
import App from './App'
import axios from "axios";
import router from "@/router";

Vue.prototype.$axios = axios;

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
