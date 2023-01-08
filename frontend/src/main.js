import Vue from 'vue'
import App from './App.vue'
import {createRouter, createWebHistory} from 'vue-router'
import Home from "@/pages/Home";
import Login from "@/pages/Login";

const routes = [
  {path: '/', component: Home},
  {path: '/login', component: Login}
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
