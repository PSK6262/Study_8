import { useState } from "react";
import axios from "axios";


function Login() {

    let [id, setId] = useState('');
    let [pw, setPw] = useState('');

    return (
        <div>
            <h1>React Spring API Login</h1>

            <p>id : <input type="text" onChange={(e)=>{
                setId(e.target.value);
            }}></input></p>
            <p>pw : <input type="password" onChange={(e)=>{
                setPw(e.target.value);
            }}></input></p>

            <button onClick={()=>{
                // 로그인 버튼 클릭
                // 입력된 값 id , pw <- useState
                // id , pw 유효성 검사
                // 취합 -> json format 정리 -> server -> api 요청 (post)

                // axios.post(url,databody,header).then().catch()
                axios.post('/api/login', // url
                    
                    //유효성검사 패스

                    { // body data
                        id:id,
                        pw:pw
                    },
                    {
                        header: {
                            'Content-Type':'application/json'
                        }
                    }
                ).then((response)=>{
                    console.log(response.data);

                    //response.data loginOK
                    if(response.data.header.resultCode == '100'){
                        // 성공시 로직
                        alert(`성공`);
                        console.log("로그인 성공");
                    } else {
                        alert(`실패`);
                        console.log("로그인 실패");
                    }
                }).catch((error)=>{
                    console.log(error);
                })
            }}>로그인</button>

            <div>
                <button onClick={()=>{
                    axios.post('/api/loginCheck')
                    .then((response)=>{
                        console.log(response.data);
                    })
                    .catch((error)=>{
                        console.log(error);
                    })
                }}>로그인확인</button>
            </div>
        </div>
    );
}

export default Login;