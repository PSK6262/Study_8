import './FoodMarket.css'

import {Button, Container, Nav , Navbar , Card} from 'react-bootstrap';
import { Routes , Route , Link , useNavigate } from 'react-router';
import CustomerService from './pages/CustomerService.jsx';
import Home from './pages/Home.jsx';
import foodsData from './data/foodsData.js';
import { useState } from 'react';
import Detail from './pages/Detail.jsx';

function FoodMarket(){
    let [foods, setFoods] = useState(foodsData);

    // react-router
    // Link to = 주소
    // navigate(주소) *

    let navigate = useNavigate();


    return(
        <div>
            <Navbar bg="light" data-bs-theme="light">
                <Container>
                <Navbar.Brand onClick={()=>{navigate("/")}}>FoodMarket</Navbar.Brand>
                <Nav className="me-auto">
                    {/* <Nav.Link href="#home"><Link to="/">Home</Link></Nav.Link> // 얘들은 페이지 자체가 이동 
                    <Nav.Link href="#features"><Link to="/detail">FoodDetail</Link></Nav.Link> */}
                    <Nav.Link onClick={()=>{navigate("/")}}>Home</Nav.Link>
                    <Nav.Link onClick={()=>{navigate("detail")}}>FoodDetail</Nav.Link>
                    <Nav.Link onClick={()=>{navigate("/info")}}>Info</Nav.Link>
                    <Nav.Link onClick={()=>{navigate("/help")}}>고객센터</Nav.Link>
                    {/* <Nav.Link href="/info">Info</Nav.Link> // 이 두가지는 사실상 새로 그리기 
                    <Nav.Link href="/help">고객센터</Nav.Link> */}
                </Nav>
                </Container>
            </Navbar>
            <Routes>
                <Route path="/" element={<Home foods = {foods}/>}></Route>
                <Route path="/help" element={<CustomerService/>}></Route>
                <Route path="/detail/:id" element={<Detail foods = {foods}/>}></Route>
                <Route path="/detail" element={<div><h1>detail page</h1></div>}></Route>
                <Route path="/info" element={<div><h1>info page</h1></div>}></Route>
                <Route path="/*" element={<div><h1>잘못된 접근입니다</h1></div>}></Route>
            </Routes>
        </div>
    )
}
export default FoodMarket