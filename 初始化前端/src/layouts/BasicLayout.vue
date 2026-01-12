<template>
  <div id="basicLayout">
    <a-layout style="min-height: 100vh">
      <!-- 顶部 -->
      <a-layout-header class="header">
        <GlobalHeader />
      </a-layout-header>
      <!-- 中间内容需要替换 -->
      <a-layout-content class="content">
        <router-view />
      </a-layout-content>

      <!-- 底部 -->
      <a-layout-footer class="footer">
        <a href="https://www.code-nav.cn" target="_blank"> 编程导航 </a>
      </a-layout-footer>
    </a-layout>
  </div>
</template>

<script setup lang="ts">
import GlobalHeader from '@/components/GlobalHeader.vue'
</script>
<style scoped>
#basicLayout .header {
  background: white;
  color: unset;
  margin-bottom: 16px;
  padding-inline: 20px;
}
#basicLayout .content {
  padding: 20px;
  background: linear-gradient(to bottom, #fefefe, #fff);
  margin-bottom: 30px;
}
#basicLayout .footer {
  padding: 16px;
  background: #efefef;
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  text-align: center;
}
</style>
