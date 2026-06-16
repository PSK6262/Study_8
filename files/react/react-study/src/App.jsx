import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import NewsBlog_QUIZ from './quiz/quiz04/NewsBlog_QUIZ.jsx'
import Quiz05 from './quiz/quiz05/Quiz05.jsx'

function App() {
  const [count, setCount] = useState(0)

  return (
    <Quiz05/>
  )
}

export default App;
