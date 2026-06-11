
function Basic01(){
    // js code
    let hello1 = "안녕하세요";
    let hello2 = "Hello";
    let hello12 = "";
    for(let i=0;i<2;i++){
        hello12 += (hello1 + hello2);
    }
    // js + xml
    return(
        <div>
            <h1>React Basic01</h1>
            <h2 className="font-red">hello react</h2>
            <h3>{hello1}</h3>
            <h3>{hello2}</h3>
            <h3>{2 > 3 ? <p>{hello1}</p> : <p>{hello2}</p>}</h3>
            <h2 style={{color:'blue', fontSize:'25px'}}>{hello12}</h2>
        </div>
    )
}
export default Basic01;