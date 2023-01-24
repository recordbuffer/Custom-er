import Vue from 'vue'
import VueRouter from 'vue-router';

import Home from "@/pages/Home";
import Signup from "@/pages/Signup";
import Login from "@/pages/Login";
import Mypage from "@/pages/Mypage";
import Products from "@/pages/Products";

const routes = [
    {path: '/', component: Home},
    {path: '/signup', component: Signup},
    {path: '/login', component: Login},
    {path: '/mypage', component: Mypage},
    {path: '/products', component: Products}
]

Vue.use(VueRouter);

const router = new VueRouter({
    mode: 'history',
    routes
})

export default router;