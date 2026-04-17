import { defineStore } from 'pinia';
import { computed, ref } from 'vue';

/**
 * sessionStorage
 * - 현재 탭에서만 유지
 * - 임시데이터, 일회성 상태
 * 
 */

export const useLikeStore = defineStore('like', () => {
  // state
  const like = ref(Number(sessionStorage.getItem('like-session')) || 0);

  // getter
  const fivetime = computed(() => like.value * 5);

  // actions
  function increment() {
    like.value++;

    sessionStorage.setItem('like-session', like.value);
  }

  function reset() {
    like.value = 0;

    sessionStorage.setItem('like-session', like.value);
  }

  return { like, fivetime, increment, reset };
});
