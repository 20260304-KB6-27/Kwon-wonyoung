<template>
  <div class="container">
    <div class="input-group m-2">
      <InputTodo @add-todo="addTodo" />
    </div>
    <Todolist
      :todos="todos"
      @todo-toggle="handleToggleTodo"
      @delete-todo="handleDeleteTodo"
    />
  </div>
</template>

<script setup>
import { onMounted } from 'vue';
import InputTodo from './components/InputTodo.vue';
import Todolist from './components/Todolist.vue';
import { storeToRefs } from 'pinia';
import { useCounterStore } from './stores/counter';

const counter = useCounterStore();
const { addTodo, fetchTodo, handleDeleteTodo, handleToggleTodo } =
  useCounterStore();
const { todos } = storeToRefs(counter);

onMounted(() => {
  fetchTodo();
});
</script>

<style scoped></style>
