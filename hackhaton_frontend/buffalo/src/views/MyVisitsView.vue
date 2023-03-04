<script setup>
import MyVisitsBase from '../components/MyVisitsBase.vue'
</script>

<template>

  <h1>My Visits</h1>
  <div class="my-visits">
    <main><MyVisitsBase/></main>
  </div>
  <main><MyVisitsBase/></main>
  
</template>


<style>
  .my-visits {
    min-height: 100vh;
    display: flex;
    justify-content: center;
  }
</style>
