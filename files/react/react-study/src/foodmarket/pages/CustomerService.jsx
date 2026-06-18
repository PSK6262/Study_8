function CustomerService(){

    /*
        localStorage 사용
        브라우저에 간단한 데이터 저장 및 활용

        읽기 localStorage.getItem(key)
        쓰기 localStorage.setItem(key,value)
        삭제 localStorage.removeItem(key)
    */
    localStorage.setItem('key1','안녕하세요');
    localStorage.setItem('hello','nice to meet you');

    localStorage.removeItem('abc');
    console.log(localStorage.getItem('msg'));

    let temp = {
        id : 'fd001',
        title : "French Fries",
        content : "정신에 좋은 감자튀김",
        price : "9000",
        imgPath : '/images/food2.jpg',
        stockCount: 5
    }
    // localStorage 단순 텍스트만 저장 가능
    //localStorage.setItem('tempFood',temp); // [object Object]로 저장된다
    // JSON format의 텍스트로 변환해야 한다.
    // js객체 -> JSON 변환 후 저장 - > 이후 다시 js로 변환해서 사용
    //        JSON.stringify()    //    JSON.parse()
    localStorage.setItem('tempFoodJSON',JSON.stringify(temp));
    let tempFoodJSON = localStorage.getItem('tempFoodJSON');
    let foodJSON = JSON.parse(tempFoodJSON);

    console.log(foodJSON.id);
    console.log(foodJSON.title);
    console.log(foodJSON.content);

    return(
        <div>
            <h1>고객 서비스 페이지</h1>
            <h2>정성을 다하겠습니다.</h2>
        </div>
    )
}
export default CustomerService;