import { Container, Row, Col , Button } from "react-bootstrap";
import { Navigate, useNavigate, useParams } from "react-router";
import { useState , useEffect } from "react";
function Detail({foods}){

    let [orderCount, setOrderCount] = useState(0);
    let [test,setTest] = useState(0);

    useEffect(()=>{
        console.log('useEffect 함수 실행 (의존성 배열 없음)');
    }) // 의존성 배열 없으면 로딩마다 실행
    useEffect(()=>{
        console.log('useEffect 함수 실행 [] 빈배열 의존');
    },[]) // 빈배열 // 생성 or 로딩시 1회만
    useEffect(()=>{ // orderCount가 바뀌면 실행
        console.log('useEffect 함수 실행 [orderCount] 의존성 배열');
        console.log('useEffect[orderCount] : ' + orderCount);
    },[orderCount])
    useEffect(()=>{ // test가 바뀌면 실행
        console.log('useEffect 함수 실행 [test] 의존성 배열');
    },[test])
    useEffect(()=>{ // orderCount랑 test 둘중 하나가 바뀌면 실행됨
        console.log('useEffect 함수 실행 [test , orderCount] 의존성 배열');
    },[test , orderCount])

    // 접속 path = /detail/:id
    // ex) /detail/fd000
    // fd000인걸 foodsData에서 찾아서 출력

    let { id } = useParams();
    // 경로상 :id 였어서 id로 받는다

    let food_idx = foods.findIndex((item)=>{
        return item.id == id;
    })

    let navigate = useNavigate();
    if(food_idx == -1){
        return(
            <div>
                <h1>존재하지 않는 상품입니다.</h1>
                <h2>잘못된 접근입니다.</h2>
                <Button variant="dark" onClick={()=>{navigate("/")}}>홈으로 돌아가기</Button>
            </div>
        )
    } 
        return(
            <Container>
                <Row>
                    <Col md={6}>
                        <img src={foods[food_idx].imgPath} style={{width:"100%"}}/>
                    </Col>
                    <Col md={6}>
                        <h4>{foods[food_idx].title}</h4>
                        <p>{foods[food_idx].content}</p>
                        <p>{foods[food_idx].price}</p>
                        <p>
                            <Button variant="dark" onClick={()=>{
                                setOrderCount(orderCount-1)
                                console.log('onClick() : ' + orderCount);    
                            }}>-</Button>
                            <span> {orderCount} </span>
                            <Button variant="dark" onClick={()=>{
                                setOrderCount(orderCount+1)
                                console.log('onClick() : ' + orderCount);
                            }}>+</Button>
                        </p>
                    </Col>
                </Row>
            </Container>
        )    
}
export default Detail;