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

    <template #heading>New Visit</template>
    <template #icon></template>
    <button><img src=".\icons\img\Plus.png"></button>
</MyVisitsItem>

<MyVisitsItem>
    
    <template #icon></template>
    <template #heading>Previous Visits</template>
    <button><img src=".\icons\img\Previous.png"></button>
</MyVisitsItem>

<MyVisitsItem>
    
    <template #icon></template>
    <template #heading>Patient Information</template>
    <button><img src=".\icons\img\Info.png"></button>
</MyVisitsItem>
</template>

<style>
/* style */

</style>
