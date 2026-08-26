function func1() {
    let x = 10;
    return x + 20;
}

let value = func1();
console.log(value);

function func2(){
    return ()=>{
        console.log('함수에서 return한 함수 호출');
    };
}

const fn = func2();

function func3(){

    return (x)=>{
        console.log(`매개변수 `+x+` 를 입력 후 return`);
    };
}

const fn3 = func3();
fn3();
fn3(1234);