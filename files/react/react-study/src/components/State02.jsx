function State02(){
    let numArr = [1,1,1,1]; // 4회반복

    //실제 화면에 그려지는 요소로 사용되는 data array
    let msgArr = ["안녕","하이","반가워","hi","안녕하십니까"];


    let text = "";
    for(let i=1;i<=5;i++){
        text += "<p>안녕하세요! test for문</p>";
    } // 이거는 text로만 나온다..

    let eleArr = []; // 결과는 map이랑 같다
    for(let i=1;i<=5;i++){
        eleArr.push(<p>안녕하세요 eleArr for</p>);
    }

    return(
        <div>
            {
                numArr.map(()=>{
                    return (
                        <p>안녕하세요 numArr map()</p>
                    )
                })
            }
            <hr />
            {text}
            <hr />
            {eleArr}
            <hr />
            {
                msgArr.map((msg)=>{
                    return(
                        <p>인사 : {msg}</p>
                    )
                })
            }
        </div>
    );
}
export default State02