//js파일

let menu1 = "김밥";
let menu2 = "돈까스";
let menu3 = "라면";

let menus = menu1+menu2+menu3;

export default menus; // 다른곳에서 import시에, menus로 찾으면 됨

export {menu1,menu3}; // 이경우 import에서도 {menu1, menu3}으로 받아야 한다.