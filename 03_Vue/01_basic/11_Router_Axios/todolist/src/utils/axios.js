import axios from 'axios';


const instance = axios.create({
  baseURL: 'api/',

  /*
  axios 요청에 대해 공통적인 설정을 할 수 있음.
   */
  // header
  // headers: {
  //   // 공통 헤더들
  //   Authorization: 'Bearer + ...',
  // },

  // timeout

});

export default instance;
