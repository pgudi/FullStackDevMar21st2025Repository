import React, { useState } from 'react'
import { students } from './students'
const StudentComponent = () => {
    const [allstudents, setAllStudents] = useState(students)
    function handleClear(){
        setAllStudents([])
    }
  return (
    <div>
        {
            allstudents.map((student) =>{
                return <h2 key={student.rollNo}>{student.name} {student.course}</h2>
            })
        }
        <button onClick={handleClear}>Clear All</button>

    </div>
  )
}

export default StudentComponent