import { useState } from "react"
import Box from './Box.jsx'
import '../quiz06/Quiz06.css';
import QButton from "./QButton.jsx";

function Quiz06(){
    let nameArr = ['빨간','파란','초록','빨간','파란','초록'];
    let direction = ['앞','뒤'];
    let colorArr = ['red','blue','green','red','blue','green'];
    let work = ['추가','삭제'];
    let [boxArr,setBoxArr] = useState(["black"]);
    let [cntSix,setCntSix] = useState(6);
    let [cntTwo,setCntTwo] = useState(2);
    return (
        <div>
            {
                [...Array(cntSix)].map((_,index)=>{
                    return <QButton color={colorArr[index]} dir = {direction[Math.floor(index/3)]}
                    name={nameArr[index]} key={index} func = {setBoxArr} param = {boxArr} work={work[0]}/>
                })
            }
            {
                [...Array(cntTwo)].map((_,index)=>{
                    return <QButton dir ={direction[index]} work={work[1]} func={setBoxArr} param ={boxArr}/> 
                })
            }
            <br />
            {
                boxArr.map((item,index)=>{
                    return(
                        <Box color={boxArr[index]}/>
                    )
                })
            }
        </div>
    )
}

export default Quiz06