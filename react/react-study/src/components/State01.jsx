import { useState } from "react";

function State01(){
    
    let cnt = 0; // 렌더링시 값 유지가 안된다
    // React Hooks
    // useState -> 상태 저장 변수, 렌더링시 기존 값 유지
    // state변수 set함수를 통해서 값 변경 -> re-rendering
    let [count, setCount] = useState(0); // 렌더링시 값 유지가 된다
    let [num ,setNum] = useState(0);
    // const | let [변수명,set함수명] = useState(초기값);
    return(
        <div>
            <h1>State01</h1>
            <p>{cnt}</p>
            <button onClick={()=>{
                console.log('cnt증가 버튼 클릭');
                cnt++; //렌더링 일어나지 않음
                console.log(cnt);
                num++;
                console.log(num);
            }}>cnt증가</button>
            <br />
            <p>{count}</p>
            <button onClick={()=>{
                console.log('count증가 버튼 클릭');
                setCount(count+1); // 렌더링 발생 조건
                
                setNum(num+1); // 인근에 있는 렌더링 요소들을 모아서 한번에 실행함
                //state는 일종의 예약 개념이라 count+1이 두개 있으면 +2가 되는것이 아니라
                //뒤의 count+1로 덮어씌워져서 +1만 오른다
                setCount(count+1); // 
                //setCount( count => count +1 ); // 이렇게 해야 한다. 이전 함수값에서 + 1
                console.log(count);    
            }}>count증가</button>
        </div>
    )
}

export default State01;