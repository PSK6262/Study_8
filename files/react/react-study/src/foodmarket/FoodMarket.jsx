import './FoodMarket.css'

import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

import {Button, Spinner, Container, Nav , Navbar , Card} from 'react-bootstrap';
import banner_bg from './img/banner_bg.jpg'; 
import food1 from './img/food1.jpg';
import food2 from './img/food2.jpg';
import food3 from './img/food3.jpg';
import food4 from './img/food4.jpg';
import food5 from './img/food5.jpg';
import food6 from './img/food6.jpg';
import food7 from './img/food7.jpg';
import food8 from './img/food8.jpg';
import food9 from './img/food9.jpg';
function FoodMarket(){
    // let banner_bg =
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
            {/* <div style={{backgroundImage: 'url('+ banner_bg + ')'}}></div> */}
            <div className="main-bg"></div>
                <Container>
                    <Row>
                        <Col md={4} sm={2}>
                            <Card style={{ width: '18rem' }}>
                            <Card.Img variant="top" src="holder.js/100px180" src={food1}/>
                            <Card.Body>
                                <Card.Title>Card Title</Card.Title>
                                <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                                </Card.Text>
                                <Button variant="primary">Go somewhere</Button>
                            </Card.Body>
                            </Card>
                        </Col>
                        <Col md={4} sm={2}>
                            <Card style={{ width: '18rem' }}>
                            <Card.Img variant="top" src="holder.js/100px180" src={food2}/>
                            <Card.Body>
                                <Card.Title>Card Title</Card.Title>
                                <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                                </Card.Text>
                                <Button variant="primary">Go somewhere</Button>
                            </Card.Body>
                            </Card>
                        </Col>
                        <Col md={4} sm={2}>
                            <Card style={{ width: '18rem' }}>
                            <Card.Img variant="top" src="holder.js/100px180" src={food3}/>
                            <Card.Body>
                                <Card.Title>Card Title</Card.Title>
                                <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                                </Card.Text>
                                <Button variant="primary">Go somewhere</Button>
                            </Card.Body>
                            </Card>
                        </Col>
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