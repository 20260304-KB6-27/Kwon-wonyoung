import { defineStore } from 'pinia';
import { computed, ref } from 'vue';

export const useLikePersistStore = defineStore(
  'like-persist',
  () => {
    // state
    const like = ref(0);

    // getter
    const fivetime = computed(() => like.value * 5);

    // actions
    function increment() {
      like.value++;
    }

    function reset() {
      like.value = 0;
    }

    return { like, fivetime, increment, reset };
  },
  {
    persist: {
      key: 'like-p', // Storage에 저장될 key 이름 (default: store ID)
      storage: sessionStorage, // (default: localStorage)
      pick: ['like'] // 저장하고 싶은 상태값 지정 가능
    },
  },
);
