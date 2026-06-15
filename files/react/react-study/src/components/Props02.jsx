import { useState } from "react";
import Box from "./Box";
function Props02(){

    let [textArr , setTextArr] = useState(['아침','점심','저녁']);
    let [detailArr, setDetailArr] = useState(['졸리다','배부르다','피곤하다']);
    //변경된 값 유지 -> (useState)


    return (
        <div>
            <button onClick={()=>{
                let temp = [...textArr];
                temp.push('야식');
                setTextArr(temp);
                detailArr.push('행복하다');
                setDetailArr(detailArr);

            }}>야식추가버튼</button>
            {
                textArr.map((item,index)=>{
                    return(
                        <Box text={textArr[index]} detail={detailArr[index]} key={index}/>
                    )
                })   
            }
        </div>
    )
}
export default Props02;