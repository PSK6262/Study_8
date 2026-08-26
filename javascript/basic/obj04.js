let str = "aaa123@naver.com";
console.log(str.length);
console.log(str.includes("@")); // return true of false

console.log(str.indexOf("@")); // return int , 위치찾기 , 없으면 -1

console.log(str.substring(0,4)); // 0 <= index < 4 , str 원본유지

console.log(str.substring(0,str.indexOf("@")));
console.log(str.substring(str.indexOf("@")+1)); // ~부터 끝까지
console.log(str.substring(str.indexOf("@")+1,str.length)); // 위랑 같다

//앞뒤 공백제거 trim()
// "abc" 가입진행 -> " abc" , "abc " X

let test = " abc ";

console.log("|"+test+"|");
console.log("|"+test.trim()+"|"); // test 원본유지
test = test.trim();
console.log("|"+test+"|");

let phone = "010-1234-5678";
let spt = phone.split("-");
console.log(spt); // array

let today = new Date();
console.log(today);
console.log(today.getFullYear()); 
console.log(today.getMonth()); // 0~11  getMonth()+1;
console.log(today.getDate());
console.log(today.getHours());
console.log(today.getMinutes());
console.log(today.getSeconds());

console.log(today.getDay()); // 요일 0~6 (일월화수목금토)

console.log(Math.abs(-10));
console.log(Math.round(123.56)); // 소수점 반올림 -> 124
console.log(Math.ceil(123.56)); // 올림

console.log(Math.floor(123.9)); // 내림 123
console.log(Math.floor(-123.9)); // -124

console.log(Math.trunc(123.55)); // 소수점 제거
console.log(Math.trunc(-123.55)); // -123

console.log(Math.max(10,50)); // 최대
console.log(Math.min(10,50)); // 최소

let arr=[10,30,50,90];
console.log(Math.max(...arr)); // console.log(Math.max(10,30,50,90));
console.log(Math.random()); // 0 <= value < 1
console.log(Math.floor(Math.random()*45)+1);

console.log(Math.sqrt(225)); // root