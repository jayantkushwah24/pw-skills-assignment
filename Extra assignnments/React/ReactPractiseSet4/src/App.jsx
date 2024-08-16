import { useState } from 'react'
import './App.css'
import { RenderHeroAndVillain } from './Components/ShowHeroAndVillain1'
import { ChangeFontSize } from './Components/IncreaseDecreaseFontSize2'
import { RenderItems } from './Components/RenderItemsByCategory3'

function App() {

  return (
    <>
      {/* <RenderHeroAndVillain /> */}
      {/* <ChangeFontSize /> */}
      <RenderItems />
    </>
  )
}

export default App
