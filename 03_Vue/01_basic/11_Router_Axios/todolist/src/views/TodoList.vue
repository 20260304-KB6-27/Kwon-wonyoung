<template>
  <!-- todo 추가 버튼 -->
  <div class="row">
    <div class="col p-3">
      <RouterLink class="btn btn-primary" to="/todos/add">
        할일 추가
      </RouterLink>
    </div>
  </div>

  <!-- todo 목록 -->
  <div class="row">
    <div class="col p-3">
      <ul class="list-group">
        <Todoitem
          v-for="todoItem in todoList"
          :key="todoItem.id"
          :todoItem="todoItem"
        />
      </ul>
    </div>
  </div>
</template>

<script setup>
import Todoitem from '@/components/Todoitem.vue';
import { inject } from 'vue';

const todoList = inject('todoList');
</script>

<style scoped></style>
