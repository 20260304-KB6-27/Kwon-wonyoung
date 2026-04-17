import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

/*
Pinia
- Vue3에서 사용하는 상태 관리 라이브러리
- 전역 상태(반응형 데이터들)를 관리할 수 있다.

1. state -> 데이터
2. getter -> 계산된 값 조회
3. actions -> 함수 (비즈니스로직) API 요청, state 변경하는 함수 등

localStorage
- 로그인 상태, 사용자설정 등 관리
*/



export const useCounterStore = defineStore('counter', () => {
  // state
  const count = ref(Number(localStorage.getItem('local-count')) || 0);

  // actions
  function increment() {
    count.value++;
    localStorage.setItem('local-count', count.value);
  }

  function reset() {
    count.value = 0;
    localStorage.setItem('local-count', 0);
  }

  return { count, increment, reset };
});
