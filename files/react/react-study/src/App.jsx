import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import NewsBlog_QUIZ from './quiz/quiz04/NewsBlog_QUIZ.jsx'

function App() {
  const [count, setCount] = useState(0)

  return (
    <NewsBlog_QUIZ/>
  )
}

export default App;
