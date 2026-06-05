function func01(){
    console.log("function01()");
}

func01();

const func02 = function(){
    console.log("func02()");
}

func02();

const func03 = function func033(){
    console.log("func03()");
}

//func033(); 불가
func03();

const func04 = ()=>{
    console.log("func04()");
}

function func05(a, b){
    console.log('func05() '+a+' '+b);
}

func05(10,20);


const func06 = function(a, b){
    console.log('func06() '+a+' '+b);
}

func06(10,20);

const func07 = function func077(a, b){
    console.log('func07() '+a+' '+b);
}

func07(10,20);

const func08 = (a, b) => {
    console.log('func08() '+a+' '+b);
}

func08(`hi`,2000);