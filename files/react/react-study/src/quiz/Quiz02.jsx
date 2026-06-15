import { useState } from "react";

function Quiz02(){

    let countArr = ['하나','둘','셋'];
    let [count, setCount] = useState(0);
    
    return(
        <div>
            <p>{countArr[count]}</p><br/>
            <button onClick={()=>{
                setCount((count+1)%countArr.length);
            }}>변경버튼</button>
        </div>
    )
}

export default Quiz02;