import FooterComponent from "./components/FooterComponent"
import HeaderComponent from "./components/HeaderComponent"
import './App.css'
import FooterInformation from "./components/FooterInformation"
import { BrowserRouter, Routes, Route } from 'react-router'
import Home from "./pages/Home"
import Services from "./pages/Services"
import AboutUs from "./pages/AboutUs"
import ContactUs from "./pages/ContactUs"
function App() {

  return (
    <>
      <BrowserRouter>
        <HeaderComponent />
        <Routes>
            <Route path="/home" element={<Home/>}></Route>
            <Route path="/services" element={<Services/>}></Route>
            <Route path="/about" element={<AboutUs/>}></Route>
            <Route path="/contact" element={<ContactUs/>}></Route>
        </Routes>
        <FooterInformation/>
        <FooterComponent />
      </BrowserRouter>
    </>
  )
}

export default App
