import { useState } from 'react'
import { MakingAnApiCall } from './Components/MakingAnApiCall'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <MakingAnApiCall />
    </>
  )
}

export default App
