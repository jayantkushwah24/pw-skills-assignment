import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <button className='h-10 w-20 bg-yellow-500' type='submit'>Submit</button>
    </>
  )
}

export default App
