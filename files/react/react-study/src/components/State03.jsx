import { useState } from "react";
function State03(){
    //let arr = [1,2,3,4,5];
    let [arr, setArr] = useState([1,2,3,4,5]); 
    return(
        <div>
            <button onClick={()=>{
                setArr([1,2,3,4,5,7]);
                console.log(arr);
                // deep copy만 적용됨..
                //let temp = arr; // shallow
                let temp = [...arr]; // deep
                temp.push(7);
                setArr(temp);

            }}>배열변경버튼</button>
            {
                arr.map((val)=>{
                    return <p>{val}</p>
                })
            }
        </div>
    )
}
export default State03