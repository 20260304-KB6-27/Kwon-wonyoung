const path = require('path');
// import path from 'path';

/*
path 모듈
- 파일 경로나 디렉토리 경로를 다루는 모듈
- 운영체제 간의 경로를 구분하는 구분자가 다른데 통일 할 수 있음
*/

// import { fileURLToPath } from 'url';

// const dir = fileURLToPath(import.meta.url);
// console.log(dir);

console.log(`파일 절대 경로: ${__filename}`);
/*
- 절대경로: root ----->
- 상대경로: 현재 작업 디렉토리 --->
*/
const dir = path.dirname(__filename);
console.log(`폴더까지만: ${dir}`);

// 현재 작업 디렉토리
console.log(process.cwd());
