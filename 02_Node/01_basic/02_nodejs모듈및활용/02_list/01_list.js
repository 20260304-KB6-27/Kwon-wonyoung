const fs = require('fs');

// 동기 방식
// let files = fs.readdirSync('./');
// console.log(files);

// 콜백 방식
fs.readdir('./', (err, files) => {
  if (err) {
    console.error(err);
    return;
  }

  console.log(files);
});

// Promise 방식
fs.promises
  .readdir('./')
  .then((files) => {
    console.log(files);
  })
  .catch((err) => {
    console.error(err);
  });

  