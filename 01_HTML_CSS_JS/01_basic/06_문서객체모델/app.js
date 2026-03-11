// document 객체: 최상위 DOM 요소
console.log(document);

// HTML Collection
// document에서 getElements_로 찾아온 요소들의 묶음
// 유사 배열 (배열은 아닌)
let li = document.getElementsByTagName('li');
console.log(li);

const $h1 = document.getElementById('header');
$h1.style.color = 'red';
