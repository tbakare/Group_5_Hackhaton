<script setup>
//imports
</script>

<template>
<!-- template -->

<div class="myvisit-item">
    <i>
      <slot name="icon"></slot>
    </i>
    <div class="myvisit-details">
      <h3>
        <slot name="heading"></slot>
      </h3>
      <slot></slot>
    </div>
  </div>
</template>

<style>
/* style */
</style>
