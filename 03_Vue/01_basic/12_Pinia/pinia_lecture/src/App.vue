<template>
  <h1>App</h1>
  <h2>App에서 보는 Counter : {{ counter.count }}</h2>
  <Counter />
  <hr />
  <h2>좋아요 수 : {{ like.like }}</h2>
  <h2>좋아요 수 x 5: {{ like.fivetime }}</h2>
  <Like />
</template>

<script setup>
import Counter from './components/Counter.vue';
import Like from './components/Like.vue';

// import { useCounterStore } from './stores/counter';
// import { useLikeStore } from './stores/like';

import { useCounterPersistStore } from './stores/persist/persist_counter';
import { useLikePersistStore } from './stores/persist/persist_like';

const like = useLikePersistStore();
const counter = useCounterPersistStore();
</script>

<style scoped></style>
