import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useCounterPersistStore = defineStore(
  'counter-persist',
  () => {
    // state
    const count = ref(0);

    // actions
    function increment() {
      count.value++;
    }

    function reset() {
      count.value = 0;
    }

    return { count, increment, reset };
  },
  {
    persist: true, // localstorage에 자동으로 저장
  },
);
