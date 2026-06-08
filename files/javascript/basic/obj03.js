
//Java 배열  new int[3]  new int[5] 
// --> ArrayList  .add .remove


// js 배열 처리
/*
    shift   : 앞요소 삭제
    unshift : 앞요소 추가

    pop     : 뒤요소 삭제
    push    : 뒤요소 추가
*/

let arr = [1,2,3];

console.log(arr);
arr.unshift(-5);
console.log(arr);
arr.push(4);
console.log(arr);
arr.shift();
console.log(arr);
// arr.pop();  뒤에요소 삭제
let removeItem = arr.pop();
console.log("현재 pop으로 삭제되는 요소 : " + removeItem);
//console.log(arr.pop());
console.log(arr);

// concat 배열 연결
let arr1 = [1,2,3];
let arr2 = [4,5,6];

console.log(arr1.concat(arr2));
console.log(arr2.concat(arr1));

console.log(arr1);  // [ 1, 2, 3 ]
arr1 = arr1.concat(arr2);  // 원본을 바꾸고 싶으면 다시 저장!   (비파괴적함수)
console.log(arr1); // [ 1, 2, 3, 4, 5, 6 ]

/*
    함수 수행

    파괴적함수   : 함수 실행 후 원본에 영향 O
    비파괴적함수 : 함수 실행 후 원본에 영향 X
*/

let n = 10;
console.log(n+1);
console.log(n);
console.log(n++);
console.log(n);

console.log("----------------------");
// 배열 복사
// 깊은복사(deep copy)    : 값 자체를 통으로 새롭게 복사
// 얕은복사(shallow copy) : 바라보는 주소만 복사

arr2 = [4,5,6];
let arr3 = arr2; //얕은복사

console.log(arr2);
console.log(arr3);
arr3[0] = 999;
console.log(arr2);
console.log(arr3);

// 전개연산자 ...
arr2 = [4,5,6];
let arr4 = [...arr2];  //깊은복사         [ ...[4,5,6] ];       [ 4,5,6 ];  

console.log(arr2);
console.log(arr4);
arr4[0] = 777;
console.log(arr2);
console.log(arr4);


let x = [1,2,3];
let y = x;      //얕은
let z = [...x]; //깊은

console.log(x);
console.log(y);
console.log(z);
x[2]=888;
console.log(x);
console.log(y);
console.log(z);

let q = [10, 20, ...x, 40 , 50  ];   // [10, 20, 1, 2, 888, 40 , 50  ];
console.log(q);


// splice 함수
// 배열 특정 위치에 추가, 삭제

// splice(인덱스, 삭제할갯수)
// splice(인덱스, 삭제할갯수, 추가할값)

// 파괴적함수 vs 비파괴적함수 생각해보기

console.log("----------------------");
let arr5 = [1,2,3,4,5];
console.log(arr5);
arr5.splice(1, 2); //1인덱스에서 2개 삭제   //파괴적함수 원본 변형됨
console.log(arr5);
arr5.push(6);
arr5.unshift(0);
console.log(arr5);
// arr5[2] = 50;
arr5.splice(2, 1, 50);   //[ 0, 1, 50, 5, 6 ]
console.log(arr5);
arr5.splice(2, 0, 60);  //2인덱스위치에서 0개를 지우고  60을 추가      
console.log(arr5);
arr5.splice(4, 1);  //4인덱스 1개삭제
console.log(arr5);



console.log("----------------------");
let obj = {
    name:"김밥천국",
    menu:"참치김밥"
};

console.log(obj);
obj.menu = "치즈김밥";  //특정 키에 값 수정
console.log(obj);       
obj.price = 6500;      //새로운 키 추가
console.log(obj);
obj.price = 0;         // 기존 키의 값을 0으로 수정
delete obj.price;      // 기존 특정키를 삭제 
console.log(obj);