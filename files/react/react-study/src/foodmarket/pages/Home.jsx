import { Container , Row , Col } from 'react-bootstrap';
import banner_bg from '../img/banner_bg.jpg'; 
import FoodCard from '../FoodCard.jsx'

function Home({foods}){
    return(
        <>
            <div className="main-bg"></div>
            <Container>
                <Row>
                    {
                        foods.map((food,index)=>{
                            return(
                                <Col md={4} sm={2} key={index}>
                                    <FoodCard arr={foods} idx={index}/>
                                </Col>
                            )
                        })
                    }
                </Row>
            </Container>
        </>
    )    
}
export default Home;