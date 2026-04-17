import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useCounterStore = defineStore('counter', () => {
  const ts = new Date().getTime();

  const todolist = ref([
    { id: ts, todo: '자전거 타기', completed: false },
    { id: ts + 1, todo: '딸과 공원 산책', completed: true },
    { id: ts + 2, todo: '일요일 애견 카페', completed: false },
    { id: ts + 3, todo: 'Vue 원고 집필', completed: false },
  ]);

  // getter
  const completed = computed(
    () => todolist.value.filter((item) => item.completed === true).length,
  );

  // actions

  const deleteTodo = (id) => {
    let index = todolist.value.findIndex((item) => item.id === id);
    todolist.value.splice(index, 1);
  };

  const toggleCompleted = (id) => {
    let index = todolist.value.findIndex((item) => item.id === id);
    todolist.value[index].completed = !todolist.value[index].completed;
  };

  const addTodo = (todo) => {
    todolist.value.push({
      id: new Date().getTime(),
      todo: todo,
      completed: false,
    });
  };

  return { todolist, completed, deleteTodo, toggleCompleted, addTodo };
});
