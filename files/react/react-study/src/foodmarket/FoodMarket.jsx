import './FoodMarket.css'

import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

import {Button, Spinner, Container, Nav , Navbar , Card} from 'react-bootstrap';
import banner_bg from './img/banner_bg.jpg'; 
import foodsData from './data/foodsData.js';
import FoodCard from './FoodCard.jsx'

function FoodMarket(){
    return(
        <div>
            <Navbar bg="light" data-bs-theme="light">
                <Container>
                <Navbar.Brand href="#home">FoodMarket</Navbar.Brand>
                <Nav className="me-auto">
                    <Nav.Link href="#home">Home</Nav.Link>
                    <Nav.Link href="#features">Features</Nav.Link>
                    <Nav.Link href="#pricing">Pricing</Nav.Link>
                </Nav>
                </Container>
            </Navbar>
            <div className="main-bg"></div>
                <Container>
                    <Row>
                        {
                            foodsData.map((value,index)=>{
                                return(
                                    <Col md={4} sm={2}>
                                        <FoodCard arr={foodsData} idx={index}/>
                                    </Col>
                                )
                            })
                        }
                    </Row>
                </Container>
        </div>
        // {
        //     /* 
        //         이미지 사용
        //         react 컴포넌트에서 시미지 사용시 , import -> 사용
        //         <img src=""/> 이거안씀
        //         <img src={import한 이미지}/> 이렇게 쓴다.
        //     */ 
        // //    <img src={}/>
        // }
    )
}
export default FoodMarket