import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import Export01 from './components/Export01'
import Quiz01 from './quiz/Quiz01'

function App() {
  const [count, setCount] = useState(0)

  return (
    <Quiz01/>
  )
}

export default App
