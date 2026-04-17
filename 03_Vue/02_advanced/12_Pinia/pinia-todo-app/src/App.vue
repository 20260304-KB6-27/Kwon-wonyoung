<template>
  <div id="app" class="container">
    <div class="card card-body bg-light">
      <div class="title">::Todolist App</div>
    </div>
    <div class="card card-default card-borderless">
      <div class="card-body">
        <InputTodo @add-todo="addTodo" />
        <TodoList
          :todolist="counter.todolist"
          @delete-todo="deleteTodo"
          @toggle-completed="toggleCompleted"
        />
      </div>
    </div>
    <div>완료된 할일의 수: {{ counter.completed }}</div>
  </div>
</template>

<script setup>
import InputTodo from './components/InputTodo.vue';
import TodoList from './components/TodoList.vue';

import { useCounterStore } from './stores/counter';

const counter = useCounterStore();
const { deleteTodo, toggleCompleted, addTodo } = useCounterStore();
</script>

<style scoped></style>
