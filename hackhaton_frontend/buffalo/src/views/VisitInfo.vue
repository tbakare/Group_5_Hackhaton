<template>
  {{ visit.name }} {{ visit.date }}
  <div>
    <button @click="this.orderStatus()">Order Status</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      visit: { "date": "03-04-23", "name": "Visit 1", "id": "1", "order": { "number": "1", "status": "processed" } },
    }
  },
  methods: {
    async getVisitData() {
      const res = await fetch("https://jsonplaceholder.typicode.com/posts");
      const finalRes = await res.json();
      this.visit = finalRes;
    },
    oderStatus() {
      alert(`${this.visit.order.status}`)
    }
  }
}
</script>

<style></style>

