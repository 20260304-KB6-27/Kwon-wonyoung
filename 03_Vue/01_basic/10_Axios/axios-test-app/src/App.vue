<template>
  <div>
    <button @click="requestAxios">axios 버튼</button>
    <button @click="requestFetch">fetch 버튼</button>
  </div>
</template>

<script setup>
import axios from 'axios';

const url = '/api/todos';

// const response = axios.get(url);
// console.log('response: ', response);

const requestAxios = () => {
  axios.get(url).then((response) => {
    console.log(`[axios] 응답객체: `, response.data);
  });
};

const requestFetch = () => {
  fetch(url)
    .then((response) => response.json())
    .then((data) => {
      console.log(`[fetch] 응답: `, data);
    });
};
</script>

<style scoped></style>
