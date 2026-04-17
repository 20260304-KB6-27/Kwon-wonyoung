<template>
  <button @click="increment">좋아요</button>
  <button @click="reset">초기화</button>
</template>

<script setup>
import { useLikePersistStore } from '@/stores/persist/persist_like';

// import { useLikeStore } from '@/stores/like';

const { increment, reset } = useLikePersistStore();
</script>

<style scoped></style>
