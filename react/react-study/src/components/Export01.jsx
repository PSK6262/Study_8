import menus from "../data/mydata01";
//import menu3 from .. 해도 {menu3}이 라면이 아니고 김돈라가 나오게 됨
//export를 menus로 했기 때문에, 굳이 이름을 바꿀 이유도 없다.
import { menu1 , menu3} from "../data/mydata01";
import { menu4 , menu5 , menu6 } from "../data/mydata02";
// {} 빼버리면 다시 default값 받아옴
function Export01(){
    return(
        <div>
            <h1>Export01</h1>
            <h2>{menus}</h2>
            <h3>{menu1}</h3>
            <h3>{menu3}</h3>
            <h3>{menu4}</h3>
            <h3>{menu5}</h3>
            <h3>{menu6}</h3>
        </div>
    )
}
export default Export01;

/*
    <script src = "index.js">
*/