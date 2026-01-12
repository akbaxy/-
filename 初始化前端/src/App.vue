<template>
  <div id="app">
    <a-config-provider :getPopupContainer="getPopupContainer" :locale="zhCN">
      <BasicLayout />
    </a-config-provider>
  </div>
</template>

<script setup lang="ts">
import BasicLayout from '@/layouts/BasicLayout.vue'
import { healthUsingGet } from '@/api/mainController.ts'
import { useLoginUserStore } from '@/stores/useLoginUserStore.ts'
import zhCN from 'ant-design-vue/es/locale/zh_CN'

const getPopupContainer = (el: HTMLElement, dialogContext?: any) => {
  if (dialogContext) {
    return dialogContext.getDialogWrap()
  } else {
    return document.body
  }
}

const loginUserStore = useLoginUserStore()
loginUserStore.fetchLoginUser()

healthUsingGet().then((res) => {
  console.log(res)
})
</script>

<style scoped></style>
