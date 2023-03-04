<script setup>
//imports
import MyVisitsItem from './MyVisitsItem.vue'
import DocumentationIcon from './icons/IconDocumentation.vue'
// import { BButton } from 'bootstrap-vue'
// Vue.component('b-button', BButton)
</script>

<template>
<!-- template -->

<MyVisitsItem>
    <template #icon>
      <DocumentationIcon />
      Gloop
      
    </template>
    <template #heading>Documentation</template>
    <button><img src=".\icons\img\Plus.png">New Visit</button>
    
    Text
</MyVisitsItem>

<button>hello</button>
</template>

<style>
/* style */
</style>
