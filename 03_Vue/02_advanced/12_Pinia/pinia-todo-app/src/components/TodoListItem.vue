<template>
  <li
    class="list-group-item"
    :class="{ 'list-group-item-success': completed }"
    @click="toggleCompleted(id)"
  >
    <span class="pointer" :class="{ 'todo-done': completed }">
      {{ todo }} {{ completed ? '(완료)' : '' }}
    </span>
    <span class="float-end badge bg-secondary pointer" @click="deleteTodo(id)"
      >삭제</span
    >
  </li>
</template>

<script setup>
const props = defineProps(['todo', 'completed', 'id']);

const emit = defineEmits(['toggle-completed', 'delete-todo']);

const deleteTodo = (id) => {
  emit('delete-todo', id);
};

const toggleCompleted = (id) => {
  emit('toggle-completed', id);
};
</script>

<style scoped></style>
