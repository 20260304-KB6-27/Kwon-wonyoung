<template>
  <!-- 객체 자체를 가져온 것 -> 반응형 유지 -->
  <h3>반응형으로 꺼내기: {{ counter.count }}</h3>
  <!-- 구조분해할당으로 값만 복사 -->
  <h3>값만 꺼내기: {{ count }}</h3>
  <button @click="increment">+ 증가</button>
  <button @click="reset">초기화</button>
</template>

<script setup>
// import { useCounterStore } from '@/stores/counter';
import { useCounterPersistStore } from '@/stores/persist/persist_counter';

// 구조분해 할당을 하면 반응형이 없어짐.
const counter = useCounterPersistStore();
const { count, increment, reset } = useCounterPersistStore(); // 구조분해할당으로 값 복사
</script>

<style scoped></style>
