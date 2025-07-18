import React, { useEffect, useState } from 'react'

const API_USER_URL = "https://api.github.com/users"
const UsersComponent = () => {
    const [users, setUsers]=useState([])

    async function getUsersData(){
        const response=await fetch(API_USER_URL)
        const allUsers= await response.json()
        console.log(allUsers);
        setUsers(allUsers)
    }

    useEffect(()=>{
        getUsersData()
    },[users])
  return (
    <div>
        <table>
          <thead>
            <tr>
              <th>UserName</th>
              <th>Profile Photo</th>
            </tr>
          </thead>
          <tbody>
            {
              users.map((user) =>{
                return(
                  <tr>
                    <td>{user.login}</td>
                    <td><img src={user.avatar_url} className='img-fluid' height='50px' width='50px'></img></td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
    </div>
  )
}

export default UsersComponent