import React, { useState } from 'react'
import { students } from './students'
const StudentTable = () => {
    const [morestudents,SetMoreStudents]=useState(students)
  return (
    <div>
        <table className='table border table-striped '>
          <thead>
            <tr>
              <th>RollNo</th>
              <th>StudentName</th>
              <th>CourseName</th>
            </tr>
          </thead>
          <tbody>
            {
              morestudents.map((student) =>{
                return(
                  <tr>
                    <td>{student.rollNo}</td>
                    <td>{student.name}</td>
                    <td>{student.course}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
    </div>
  )
}

export default StudentTable