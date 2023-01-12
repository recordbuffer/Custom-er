import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const store = new Vuex.Store({
    state: {
        user: {
            id: 0
        }
    },
    mutations: {
        setUser(state, payload) {
            state.user.id = payload;
        }
    }
})

export default store;