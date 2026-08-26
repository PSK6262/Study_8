let strUrl1 = "https://human.or.kr";
let strUrl2 = "http://human.or.kr";
let strUrl3 = "http.human.or.kr";

/* {코딩부분} */
function changeLink(str){
    if(str.indexOf("://") == -1){
        return "경로가 잘못되었습니다.";
    }
    else if(str.indexOf("https") == -1){
        let temp = str.substring(0,str.indexOf(":")) +"s" +
        str.substring(str.indexOf(":"), str.indexOf(":")+3) + "open." +
        str.substring(str.indexOf(":")+3);
        return temp;
    }
    else {
        let temp = str.substring(0,str.indexOf(":")+3) +
        "secure." + str.substring(str.indexOf(":")+3);
        return temp;
    }
}

console.log(changeLink(strUrl1));
console.log(changeLink(strUrl2));
console.log(changeLink(strUrl3));