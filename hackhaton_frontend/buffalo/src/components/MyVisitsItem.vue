<script setup>
//imports
</script>

<template>
<!-- template -->

<div class="myvisit-item">
    <div class="myvisit-details">
      <h3>
        <i>
            <slot name="icon"></slot>
        </i>

        <slot name="heading"></slot>
      </h3>

      <slot></slot>
    </div>
  </div>
</template>

<style>
/* style */
    /* .myvisit-item{
        justify-content: center;
        align-items: center;
    }
    .myvisit-details{
        justify-content: center;
        align-items: center;
    } */
    
</style>
