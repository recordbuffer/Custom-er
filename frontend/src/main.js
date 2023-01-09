import Vue from 'vue'
import App from './App'
import Home from "@/pages/Home";
import VueRouter from 'vue-router';
import Signup from "@/pages/Signup";

const routes = [
  {path: '/', component: Home},
  {path: '/signup', component: Signup}
]

Vue.use(VueRouter);
const router = new VueRouter({
  mode: 'history',
  routes
})

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
