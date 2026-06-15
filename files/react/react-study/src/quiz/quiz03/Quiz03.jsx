import '../quiz03/Quiz03.css'
import TextItem from './TextItem';
function Quiz03(){

    
    let titleArr = ['하나','둘','셋','넷','다섯'];
    return (
        <div className="App">
            {
                titleArr.map((item,index)=>{
                    return(
                        <TextItem title={titleArr[index]} text={'내용'+titleArr[index]}/>
                    )
                })
            }
        </div>
    );
}

export default Quiz03;