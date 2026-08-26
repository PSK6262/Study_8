import { useState } from 'react';
import './NewsBlog.css';
import NewsPost from './NewsPost.jsx';

function NewsBlog_QUIZ(){

    let [news, setNews] = useState(['어제의 뉴스','오늘의 뉴스','내일의 뉴스']);
    
    return(
        <div>
            <div className="black-nav">
                <h3>Blog Header</h3>
                <div style={{color:"orange", fontSize:"20px"}}>React Study</div>
            </div>
            {
                news.map((value,index)=>{
                    return(
                        <NewsPost title={news[index]} key={index}/>
                    )
                })
            }
        </div>
        )
}

export default NewsBlog_QUIZ;
