<template>
  <Carousel :items-to-show="2.5" :wrap-around="true">
    <Slide v-for="item in listItems" :key="item.id">
      <div class="carousel__item">
        <RouterLink to="/visitinfo/{{ item.id }}">{{ item.name }}</RouterLink><br>{{ item.date }}
      </div>

    </Slide>
    <template #addons>
      <Navigation />
      <Pagination />
    </template>
  </Carousel>
</template>

<script>
import 'vue3-carousel/dist/carousel.css'
import { Carousel, Slide, Pagination, Navigation } from 'vue3-carousel'
export default {
  data() {
    return {
      //listItems: this.getData(),
      listItems: [{ "date": "03-04-23", "name": "Visit 1", "id": "1" }, { "date": "02-04-23", "name": "Visit 2", "id": "2" }, { "date": "02-03-23", "name": "Visit 3", "id": "3" }]
    }
  },
  methods: {
    async getData() {
      const res = await fetch("https://jsonplaceholder.typicode.com/posts");
      const finalRes = await res.json();
      this.listItems = finalRes;
    }
  },
  components: {
    Carousel,
    Slide,
    Pagination,
    Navigation,
  },
}
</script>

<style>
.carousel__item {
  min-height: 200px;
  width: 100%;
  background-color: green;
  color: white;
  font-size: 20px;
  border-radius: 8px;
  display: flex;
  justify-content: center;
  align-items: center;
}

.carousel__slide {
  padding: 10px;
}

.carousel__prev,
.carousel__next {
  box-sizing: content-box;
}
</style>

