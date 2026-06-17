
import {Button, Navbar , Card} from 'react-bootstrap';



/*
    CRA랑 Vite의 주소처리가 다르다
    설정이 바뀔 때 마다 img의 경로를 바꿀 수 없기에 조금 동적으로

    CRA : <img src={process.env.PUBLIC_URL + '/images/food1.jpg'}/> // 기본 경로를 따라가준다.
        기본설정 package.json 파일 뒤에 추가 "homepage":"/detailServicePath" 상세경로설정
        -> https://localhost:5173/detailServicePath/images/food1.jpg 가 됨.
    Vite : <img src={ import.meta.env.BASE_URL + '/image/food1.jpg'}/> 
*/
function FoodCard(props){
    let foodsData = props.arr;
    let index = props.idx;
    return(
        <Card style={{ width: '18rem' }}>
            <Card.Img variant="top" src="holder.js/100px180" src={foodsData[index].imgPath}/>
            <Card.Body>
                <Card.Title>{foodsData[index].title}</Card.Title>
                <Card.Text>{foodsData[index].content}</Card.Text>
                <Card.Text>{foodsData[index].price+"원"}</Card.Text>
                <Button variant="primary">상세 보기</Button>
            </Card.Body>
        </Card>
    )
}

export default FoodCard;