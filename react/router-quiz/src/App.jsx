import { useState } from 'react'
import { Routes , Route , Link , useNavigate } from 'react-router';
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import Main from '../components/Main';
import Info from '../components/Info';
import MyPage from '../components/MyPage';
import Cart from '../components/Cart';
import './App.css'

function App() {
  const [count, setCount] = useState(0)
  let navigate = useNavigate();
  return (
    <>
      <div>
        <button onClick={()=>{navigate("/")}}>Main</button>
        <button onClick={()=>{navigate("/info")}}>info</button>
        <button onClick={()=>{navigate("/mypage")}}>mypage</button>
        <button onClick={()=>{navigate("/cart")}}>cart</button>
      </div>
      <Routes>
          <Route path="/" element={<Main/>}></Route>
          <Route path="/info" element={<Info/>}></Route>
          <Route path="/mypage" element={<MyPage/>}></Route>
          <Route path="/cart" element={<Cart/>}></Route>
      </Routes>
    </>
  )
}

export default App
