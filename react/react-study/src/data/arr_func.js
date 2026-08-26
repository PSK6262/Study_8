import { useState } from "react";

let arr = [10,20,30,40];

//Map
//index 숫자만큼 반복
arr.map(()=>{
    console.log('arr map');   
});
arr.map((item)=>{
    console.log('arr map : '+ item);
});
//foreach
arr.forEach((v)=>{
    console.log('forEach : '+ v);
});

arr.map((item,index)=>{
    console.log('arr map item : '+item + ' index : '+ index);
})

let result1 = arr.map(()=>{
    return 99;
});

console.log(result1);

let result2 = arr.map((item)=>{
    console.log(item);
})

console.log(result2);

let result3 = arr.map((item)=>{
    return item + 100;
})

console.log(result3);

let result4 = arr.map((item)=>{
    return '원래 가지고 있던 값 : ' + item;
})

console.log(result4);

let menuArr = ['라면','우동','김밥'];

let result5 = menuArr.map((menu)=>{
    return "<p>"+menu+"</p>";
});

console.log(result5);

let result6 = menuArr.map((menu)=>"<p>"+menu+"</p>");

console.log(result6);

// filter
arr = [1,2,3,4,5];

let result7 = arr.filter((value)=>{
    return true;
});
console.log(result7);


let result8 = arr.filter((value)=>{
    return value>3;
});
console.log(result8);


let result9 = arr.filter((value)=>{
    return value != 3;
});
console.log(result9);

arr = [1,2,2,2,2,3,3];
//find 값찾으면 끝
let result10 = arr.find((value)=>{ // 못찾으면 undefined
    return value==3;
});
console.log(result10);


let result11 = arr.findIndex((value)=>{ // 못찾으면 -1 , 앞에거 먼저
    return value==3;
});
console.log(result11);

//구조분해할당 Destructuring Assignment
let arr2 = [5,10,15];

let [n1,n2,n3] = [11,22,33];
console.log(n1);
console.log(n2);
console.log(n3);

let [num,setNum] = [33,44];

function func1(){
    console.log('func01()');
}

let [c, f] = [50,func1];
console.log(c);
console.log(f);

// let [count , setCount] = useState(0);
// // function useState(n){
// //     let v = n;
// //     function setV(input){
// //         v = input;
// //     }
// //     return [v,setV];
// // }

// console.log(count);
// setCount(10);
// console.log(count);

let obj1 = {
    num1: 30,
    num2: 50
};

let obj2 = obj1;

let {num1,num2} = obj1; // 키값이랑 같아야된다. 넘겨줌
console.log(num1,num2);