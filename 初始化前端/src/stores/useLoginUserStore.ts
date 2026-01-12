import { ref } from 'vue'
import { defineStore } from 'pinia'

/**
 * 存储登陆用户信息的状态
 */
export const useLoginUserStore = defineStore('loginUser', () => {
  const loginUser = ref<any>({
    userName: '未登录',
  })
  async function fetchLoginUser() {
    // todo 由于后端没有提供接口，暂时注释

    //测试用户登录，三秒后自动登录
    setTimeout(()=>{
      loginUser.value = {userName: "测试用户登录",id:1}
    },3000)
  }

  /**
   * 设置登录用户
   */
  function setLoginUser(newLoginUser: any) {
    loginUser.value = newLoginUser
  }
  //返回
  return { loginUser, fetchLoginUser, setLoginUser }
})
