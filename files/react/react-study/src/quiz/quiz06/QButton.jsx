function QButton(props){
    let boxArr = props.param;
    let setBoxArr = props.func;
    let temp;
    return(
        <button onClick={()=>{
            if(props.work === '추가'){
                if(props.color === 'red'){
                    if(props.dir === '앞') temp = ['red' , ...boxArr];
                    else temp = [...boxArr , 'red'];
                }
                else if(props.color === 'blue'){
                    if(props.dir === '앞') temp = ['blue' , ...boxArr];
                    else temp = [...boxArr , 'blue']; 
                }
                else if(props.color === 'green'){
                    if(props.dir === '앞') temp = ['green' , ...boxArr];
                    else temp = [...boxArr , 'green'];  
                }
                setBoxArr(temp);
            }
            else{
                temp = [...boxArr];
                if(props.dir === '앞') temp.shift();
                else temp.pop();
                setBoxArr(temp);
            }
        }}>{props.dir}{props.name}박스{props.work}</button>
    )
}
export default QButton;