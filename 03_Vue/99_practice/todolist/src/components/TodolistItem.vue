<template>
  <li
    class="list-group-item"
    :class="{ 'bg-success text-white': todo.completed }"
    @click="toggleTodo(todo.id)"
  >
    {{ todo.todo }}
    <span class="btn btn-primary" @click="deleteTodo">삭제</span>
  </li>
</template>

<script setup>
defineProps(['todo']);

const emit = defineEmits(['todo-toggle', 'delete-todo']);

const deleteTodo = (id) => {
  emit('delete-todo', id);
};

const toggleTodo = (id) => {
  emit('todo-toggle', id);
};
</script>

<style scoped></style>
