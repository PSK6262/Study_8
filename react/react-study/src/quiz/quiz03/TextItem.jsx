function TextItem(item){
    // props : 컴포넌트 내부에서 필요로하는 매개변수 전달받기

    return (
            <div className='textItem'>
                <p className='title'>제목 : {item.title}</p>
                <p>내용 : {item.text}</p>
            </div>
    )
}
export default TextItem;
