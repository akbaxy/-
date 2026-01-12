<template>
  <div id="homePage">
    <h1>{{ message }}</h1>
    <a-space direction="vertical" :size="12">
      <a-date-picker v-model:value="value1" />
      <a-date-picker v-model:value="value2" picker="week" />
      <a-date-picker v-model:value="value3" picker="month" />
      <a-date-picker v-model:value="value4" picker="quarter" />
      <a-date-picker v-model:value="value5" picker="year" />
    </a-space>
  </div>
</template>

<script setup lang="ts">
import { ref } from 'vue'
const message = '这里是首页'
import type { Dayjs } from 'dayjs'
const value1 = ref<Dayjs>()
const value2 = ref<Dayjs>()
const value3 = ref<Dayjs>()
const value4 = ref<Dayjs>()
const value5 = ref<Dayjs>()
</script>

<style scoped></style>
