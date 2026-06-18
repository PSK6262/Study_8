import { Container, Row, Col , Button , Modal } from "react-bootstrap";
import { Navigate, useNavigate, useParams } from "react-router";
import { useState , useEffect } from "react";
import './Detail.css';
function Detail({foods}){

    let [orderCount, setOrderCount] = useState(0);
    let [test,setTest] = useState(0);

    // useEffect(()=>{
    //     console.log('useEffect 함수 실행 (의존성 배열 없음)');
    // }) // 의존성 배열 없으면 로딩마다 실행
    // useEffect(()=>{
    //     console.log('useEffect 함수 실행 [] 빈배열 의존');
    // },[]) // 빈배열 // 생성 or 로딩시 1회만
    // useEffect(()=>{ // orderCount가 바뀌면 실행
    //     console.log('useEffect 함수 실행 [orderCount] 의존성 배열');
    //     console.log('useEffect[orderCount] : ' + orderCount);
    //     return ()=>{ // clean up function
    //         console.log('useEffect[orderCount] -> return() 실행');
    //     }
    // },[orderCount])
    // useEffect(()=>{ // test가 바뀌면 실행
    //     console.log('useEffect 함수 실행 [test] 의존성 배열');
    // },[test])
    // useEffect(()=>{ // orderCount랑 test 둘중 하나가 바뀌면 실행됨
    //     console.log('useEffect 함수 실행 [test , orderCount] 의존성 배열');
    // },[test , orderCount])
    let [modalShow, setModalShow] = useState(true);
    useEffect(()=>{
        setTimeout(()=>{
            setModalShow(false);
        },2000)
    },[])
    // 접속 path = /detail/:id
    // ex) /detail/fd000
    // fd000인걸 foodsData에서 찾아서 출력
    let [viewStatus, setViewStatus] = useState('');
    useEffect(()=>{
        setTimeout(()=>{
            setViewStatus('end'); // opacity 0 -> 1로 바꾸기
        },2000);
    },[])
    // 누적으로 쌓이면 문제되는 코드 -> clean up 으로 처리
    useEffect(()=>{
        const iv = setInterval(() => {
            console.log('interval');
        }, 1000);

        return ()=>{
            clearInterval(iv);
        }
    },[orderCount])


    let { id } = useParams();
    // 경로상 :id 였어서 id로 받는다

    let food_idx = foods.findIndex((item)=>{
        return item.id == id;
    })

    let navigate = useNavigate();
                    
    let stock_Count = foods[food_idx].stockCount == 0 ? '품절' : '주문하기';
                    

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
        <Container className={"start " + viewStatus}>
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
                            if(orderCount >= 1) {
                                setOrderCount(orderCount-1)
                                console.log('onClick() : ' + orderCount);
                            }    
                        }}>-</Button>
                        <span> {orderCount} </span>
                        <Button variant="dark" onClick={()=>{
                            if(orderCount < foods[food_idx].stockCount){
                                setOrderCount(orderCount+1)
                                console.log('onClick() : ' + orderCount);
                            }
                        }}>+</Button>
                    </p>
                    <Button variant="primary">{stock_Count}</Button>
                </Col>
            </Row>
        <Modal
            show = {modalShow}
            onHide = {()=>setModalShow(false)}
            size="lg"
            aria-labelledby="contained-modal-title-vcenter"
            centered
            >
            <Modal.Header closeButton>
                <Modal.Title id="contained-modal-title-vcenter">
                    어서오세요
                </Modal.Title>
            </Modal.Header>
            <Modal.Body>
                <h4>Food Good</h4>
                <p>
                    많이 구매하세요
                </p>
            </Modal.Body>
            <Modal.Footer>
                <Button onClick={()=>{setModalShow(false)}}>Close</Button>
            </Modal.Footer>
        </Modal>
        </Container>
        )    
}
export default Detail;