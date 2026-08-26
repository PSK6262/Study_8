function getMealByTime(time){
    if(time >= 6 && time <= 10)       return `아침`;
    else if(time >= 11 && time <= 14) return `점심`;
    else if(time >= 17 && time <= 20) return `저녁`;
    else if(time >= 21 && time <= 23) return `야식`;
    else                              return `금식`;
}
console.log(getMealByTime(5)); //출력값 : 금식
console.log(getMealByTime(8)); //출력값 : 아침
console.log(getMealByTime(13)); //출력값 : 점심
console.log(getMealByTime(16)); //출력값 : 금식
console.log(getMealByTime(19)); //출력값 : 저녁
console.log(getMealByTime(22)); //출력값 : 야식
console.log(getMealByTime(2)); //출력값 : 금식

console.log(`-----------------------`);

function getMealByTime2(){
    return (time)=>{
        if(time >= 6 && time <= 10)       return `아침`;
        else if(time >= 11 && time <= 14) return `점심`;
        else if(time >= 17 && time <= 20) return `저녁`;
        else if(time >= 21 && time <= 23) return `야식`;
        else                              return `금식`;
    };
}
const bt1 = getMealByTime2(); 

console.log(bt1(5)); //출력값 : 금식
console.log(bt1(8)); //출력값 : 아침
console.log(bt1(13)); //출력값 : 점심
console.log(bt1(16)); //출력값 : 금식
console.log(bt1(19)); //출력값 : 저녁
console.log(bt1(22)); //출력값 : 야식
console.log(bt1(2)); //출력값 : 금식
console.log(`-----------------`)

const bt2 = getMealByTime2();
const timeArray = [5,8,13,16,19,22,2];
const getMealByTime3 = (array) => {
    for(let v of array){
        console.log(bt2(v));
    }
}
getMealByTime3(timeArray);