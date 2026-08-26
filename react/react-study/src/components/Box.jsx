function Box(props){
    // props : 컴포넌트 내부에서 필요로하는 매개변수 전달받기

    return (
        <div style={{backgroundColor:"lightgreen"}}>
            <h1>{props.text}</h1>
            <p>{props.detail}</p>
        </div>
    )
}
export default Box;