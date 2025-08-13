import ListDepartments from "./components/ListDepartments"
import DepartmentComponent from "./components/DepartmentComponent"
import {BrowserRouter, Routes, Route} from 'react-router-dom'
function App() {
  
  return (
    <>
    <BrowserRouter>
       <Routes>
         {/* http://localhost:3000/ */}
          <Route path="/" element={<ListDepartments />} />
          {/* http://localhost:3000/departments */}
          <Route path="/departments" element={<ListDepartments />} />
          {/* http://localhost:3000/createdept */}
          <Route path="/createdept" element={<DepartmentComponent />} />
          {/* http://localhost:3000/editdept/:id */}
          <Route path="/editdept/:id" element={<DepartmentComponent />} />
       </Routes>
    </BrowserRouter>
    </>
  )
}

export default App
