import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'my-visits',
      component: () => import('../views/MyVisitsView.vue')
    },
    {
      path: '/visit_history',
      name: 'visit_history',
      component: () => import('../views/VisitHistory.vue')
    },
    {
      path: '/visitinfo/:id',
      name: 'visitinfo',
      component: () => import('../views/VisitInfo.vue')
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/new-visit',
      name: 'new-visit',
      component: () => import('../views/NewVisitView.vue')
    }
  ]
})

export default router
