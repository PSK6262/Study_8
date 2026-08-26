import Box from "./Box";

function Props01(){

    let arr = ['아침','점심','저녁'];
    let detail =['졸리다','배부르다','피곤하다'];

    return(
        <div>
            {
                arr.map((item,index)=>{
                    return(
                        <Box text={arr[index]} detail={detail[index]}/>
                    )
                })   
            }
        </div>
    )
}
export default Props01