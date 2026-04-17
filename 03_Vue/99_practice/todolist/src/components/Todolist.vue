<template>
  <ul class="list-group">
    <TodolistItem
      v-for="todo in todos"
      :todo="todo"
      :key="todo.id"
      @todo-toggle="toggleTodo"
      @delete-todo="deleteTodo"
    />
  </ul>
</template>

<script setup>
import TodolistItem from './TodolistItem.vue';

defineProps(['todos']);

const emit = defineEmits(['todo-toggle', 'delete-todo']);

const deleteTodo = (id) => {
  emit('delete-todo', id);
};

const toggleTodo = (id) => {
  emit('todo-toggle', id);
};
</script>

<style scoped></style>
