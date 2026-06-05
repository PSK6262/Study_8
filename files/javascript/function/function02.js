// 함수 리턴

function sum1(){
    return 1;
}
sum1();

let s1 = sum1();
console.log(s1);
console.log(sum1());

const sum2 = function(a, b){
    return a+b;
}
console.log(sum2(10,20));

const sum3 = function sum333(a, b){
    return a+b;
}
console.log(sum3(20,30));

const sum4 = (x, y) =>{
    return x+y;
}
console.log(sum4(30,40));
//화살표함수, =>뒤에 괄호없이 바로 나오는 것을 return값으로 인식함
const sum5 = (x, y) => x+y; //return x+y;

console.log(sum5(40,50));

const sum6 = ()=>1+2+3+4+5;
console.log(sum6());

function func(){
    let x = 10;
}
let x = 11;


//호이스팅

console.log(w);
var w; // var 쓰지않기

check(); // 함수는 기본적으로 hoisting

function check(){
    console.log('check()');
}
//일회용 함수 /즉시실행
(function onetime(){
    console.log('일회용 함수 실행');
})();
//onetime(); 인식불가