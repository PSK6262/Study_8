import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import State01 from './components/State01'

function App() {
  const [count, setCount] = useState(0)

  return (
    <State01/>
  )
}

export default App
