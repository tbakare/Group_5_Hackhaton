<template>
  <div v-for="item in listItems" :key="item.id">
    {{ item.title }}
  </div>
</template>


<script>
export default {
  data() {
    return {
      listItems: this.getData()
    }
  },
  methods: {
    async getData() {
      const res = await fetch("https://jsonplaceholder.typicode.com/posts");
      const finalRes = await res.json();
      this.listItems = finalRes;
    }
  }
}
</script>
<style>
@media (min-width: 1024px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
  }
}
</style>
