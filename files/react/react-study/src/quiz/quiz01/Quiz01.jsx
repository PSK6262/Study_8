import { useState } from "react";

function Quiz01(){

    let [count,setCount] = useState(0);

    return (
        <div>
            <button onClick={()=>{
                setCount(count + 2);
            }}>짝수출력</button>
            <h2 style={{color:"red"}}>{count}</h2>
        </div>
    )
}

export default Quiz01;