import { use, useState } from "react"
import Box from "./box"
import '../quiz05/Quiz05.css';
function Quiz05(){
    let [boxCount , setBoxCount] = useState([Box,Box]);

    let [cnt , setCnt] = useState(2);
    return(
        <div>
            <button onClick={()=>{
                // let temp = [...boxCount , 1]; // boxCount.push(1);
                // setBoxCount(temp);
                setCnt(cnt+1);
            }}>박스 추가</button>
            <br />
            {
                [...Array(cnt)].map((_,index)=>{
                    return <Box key={index} />
                })
            }
        </div>
    )
}

export default Quiz05