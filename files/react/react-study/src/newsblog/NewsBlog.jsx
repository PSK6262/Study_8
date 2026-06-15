import { useState } from 'react';
import Modal from './Modal.jsx';
import './NewsBlog.css';

function NewsBlog(){

    // //제목 , 내용 하드코딩 vs 변수 vs state
    // let [news1, setNews1] = useState('어제의 뉴스');
    // let [news2, setNews2] = useState('오늘의 뉴스');
    // let [news3, setNews3] = useState('내일의 뉴스');

    let [news, setNews] = useState(['어제의 뉴스','오늘의 뉴스','내일의 뉴스']);
    let [likeCount, setLikeCount] = useState(0);

    let [modalFlag, setModalFlag] = useState(false);

    return(
        <div>
            <div className="black-nav">
                <h3>Blog Header</h3>
                <div style={{color:"orange", fontSize:"20px"}}>React Study</div>
            </div>
            <div className="post-list">
                <h4 onClick={()=>{
                    setModalFlag(!modalFlag);
                }}>{news[0]} <span onClick={(event)=>{
                    // event.preventDefault();
                    event.stopPropagation(); // 이벤트발생 전파 방지
                    // 하트 누르면 span onclick h4 onclick이 다 실행됨
                    // 전파하지마라 -> span에서만 작동
                    setLikeCount(likeCount+1);
                }}>♥</span>{likeCount}</h4>
                <p>내용자리</p>
            </div>
            <div className="post-list">
                <h4>{news[1]}</h4>
                <p>내용자리</p>
            </div>
            <div className="post-list">
                <h4>{news[2]}</h4>
                <p>내용자리</p>
            </div>
            {
                modalFlag == true ? <Modal/> : null
            }
        </div>
        )
}

export default NewsBlog;