<template>
  <div class="input-group">
    <input
      type="text"
      placeholder="할일을 여기에 입력!"
      class="form-control"
      v-model="todo"
      @keyup.enter="addTodo"
    />
    <button @click="addTodo" class="btn btn-primary">추가</button>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const todo = ref('');
const emit = defineEmits(['add-todo']);

const addTodo = () => {
  emit('add-todo', todo.value);

  todo.value = '';
};
</script>

<style scoped></style>
