import { ref, computed } from 'vue';
import { defineStore } from 'pinia';
import axios from 'axios';

export const useCounterStore = defineStore('counter', () => {
  const todos = ref([]);
  const todo = ref('');

  const fetchTodo = async () => {
    try {
      const response = await axios.get('/api/todos');
      todos.value = response.data;
      console.log('todos: ', todos.value);
    } catch (error) {
      console.error(error);
    }
  };

  const addTodo = async (newDo) => {
    try {
      console.log('todo: ', newDo);
      const response = await axios.post('/api/todos', {
        todo: newDo,
        completed: false,
      });

      todo.value = '';
      todos.value.push(response.data);
      await fetchTodo();
    } catch (error) {
      console.log(error);
    }
  };

  const handleToggleTodo = async (id) => {
    let index = todos.value.findIndex((item) => item.id === id);
    todos.value[index].completed = !todos.value[index].completed;

    try {
      const response = await axios.patch(`/api/todos/${id}`, {
        completed: todos.value[index].completed,
      });

      console.log('결과: ', response.data);
    } catch (error) {
      console.error(error);
    }
  };

  const handleDeleteTodo = async (id) => {
    let index = todos.value.findIndex((item) => item.id === id);
    todos.value.splice(index, 1);

    try {
      const response = await axios.delete(`/api/todos/${id}`);
      console.log('결과: ', response.data);
    } catch (error) {
      console.log(error);
    }
  };

  return { todos, addTodo, fetchTodo, handleToggleTodo, handleDeleteTodo };
});
