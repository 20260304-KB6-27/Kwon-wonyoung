<template>
  <div class="input-group">
    <input
      class="form-control"
      type="text"
      v-model="todo"
      @keyup.enter="addTodo()"
    />
    <span class="btn btn-primary" @click="addTodo(todo)">할일 추가</span>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const todo = ref('');
const emit = defineEmits('add-todo');

const addTodo = () => {
  emit('add-todo', todo.value);
  todo.value = '';
};
</script>

<style scoped></style>
