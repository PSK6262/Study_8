let scores = [10,20,30,50];

console.log(scores);
//정석
for(let i=0;i<scores.length;i++){
    console.log(scores[i]);
}
//for in
for(let i in scores){
    console.log(i+" "+scores[i]);
}
//for of -> java enhanced for랑 같다
for(let value of scores){
    console.log(value);
}
//foreach -> for in이랑 같은 출력결과
scores.forEach( (value,index)=>{
    console.log(index+" "+ value);
})