function arrForEach1(){
    let arr= [10,20,30,40];

    for(let i in arr){
        console.log(i + " : " + arr[i]);
    }

    arrForEach1();
}
function arrForEach2(arr){
    for(let i in arr){
        console.log(i + " : " + arr[i]);
    }
}
arrForEach2([1,5,7,12,33]);

function arrForEach3(func){
    let arr = [11,20,30,40,55];
    func(arr);
}
arrForEach3(arrForEach2);

//-----------------------
const printFunc = (index,value) => {
    console.log(index + " : " + value);
}

function arrForEach4( func ) {
    let arr = [66,77,388,799,55];

    for(let i in arr){
        func(i,arr[i]);
    }
}

arrForEach4(printFunc);

function arrForEach5(arr,func){
    for(let i in arr){
        func(i ,arr[i]);
    }
}

arrForEach5( [9,8,7,6],printFunc);

arrForEach5 ( [99,88,77,66], (i,v)=>{
    console.log('index:'+i + " <<<------->>> value:" + v);
})

//setTimeout(함수, 시간) -> 매개변수로 넘긴 시간이 지난 후 함수 실행

setTimeout( ()=>{
    console.log(`setTimeout에 매개변수로 넘긴 콜백함수`);
},3000);

const cb = ()=>{
    console.log("cb()함수 호출");
}

const outCh = (f)=>{
    console.log(`outCb()함수 1`);
    console.log(`outCb()함수 2`);
    console.log(`outCb()함수 3`);
    f();
}
outCh(cb);

setTimeout( ()=>{
    console.log(`setTimeout 콜백함수 실행`);
    outCh(cb);
},5000);