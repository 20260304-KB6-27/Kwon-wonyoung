<template>
  <div class="row">
    <div class="col">
      <ul class="list-group">
        <TodoListItem
          v-for="t in todolist"
          :key="t.id"
          :todo="t.todo"
          :id="t.id"
          :completed="t.completed"
          @delete-todo="deleteTodo"
          @toggle-completed="toggleCompleted"
        />
      </ul>
    </div>
  </div>
</template>

<script setup>
import TodoListItem from './TodoListItem.vue';

const props = defineProps(['todolist']);

const emit = defineEmits(['delete-todo', 'toggle-completed']);

const deleteTodo = (id) => {
  emit('delete-todo', id);
};

const toggleCompleted = (id) => {
  emit('toggle-completed', id);
};
</script>

<style scoped></style>
