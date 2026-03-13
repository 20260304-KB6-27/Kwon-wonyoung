const fs = require('fs');
const path = require('path');

// stream
// 데이터를 작은 단위로 나누어 처리하는 방식
// - readable (읽기), writeable (쓰기), duplex (읽고 쓰기)

const filePath = path.join(__dirname, 'readMe.txt');

// stream
/**
 * stream 이벤트
 * - data: 데이터를 읽을 때
 * - end: 데이터를 다 읽었을 때
 * - error: 에러
 */
const rs = fs.createReadStream(filePath, 'utf-8');

rs.on('data', (chunk) => {
  console.log(`새로운 청크 도착`);
  console.log(`청크 길이`, chunk.length);
  console.log(`청크 내용: `, chunk);
})
  .on('end', () => {
    console.log(`data 읽기가 완료되었습니다.`);
  })
  .on('error', (err) => {
    console.error(`error가 발생했습니다 ${err}`);
  });
