import { useState } from "react";
import Modal from "../../newsblog/Modal";
function NewsPost(props){
    let [likeCount, setLikeCount] = useState(0);
    let [modalFlag, setModalFlag] = useState(false);
    return (
        <>
            <div className="post-list">
                <h4 onClick={()=>{
                    setModalFlag(!modalFlag);
                }}>{props.title} <span onClick={(event)=>{
                    event.stopPropagation();
                    setLikeCount(likeCount+1);
                }}>♥</span>{likeCount}</h4>
                <p>내용 무</p>
            </div>
            {
                modalFlag == true ? <Modal/> : null
            }
        </>
    )
}
export default NewsPost