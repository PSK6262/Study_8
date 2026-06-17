import { Container, Row, Col , Button } from "react-bootstrap";
import { Navigate, useNavigate, useParams } from "react-router";
function Detail({foods}){

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
                            <Button variant="dark">-</Button>
                            <span> 0 </span>
                            <Button variant="dark">+</Button>
                        </p>
                    </Col>
                </Row>
            </Container>
        )    
}
export default Detail;