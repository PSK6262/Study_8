function Box(props){
    return(
        <div className="box" id={props.color}>
            <button onClick={()=>{
                let boxArr = props.param;
                let setBoxArr = props.func;
                let index = props.index;
                let temp = [...boxArr];
                temp.splice(index,1);
                setBoxArr(temp);
            }}>X</button>
        </div>
    )
}
export default Box;
