import React, { useState } from 'react'

const DisplayDemo1 = () => {
    const [message, setMessage] = useState('Good Morning')
    console.log(message)
    function handleChange(){
        if(message == 'Good Morning'){
            setMessage('Let Us go for Breakfast Now!!')
        }
        else{
           setMessage('Good Morning') 
        }
    }
  return (
    <div>
       <h2>{message}</h2>
       <button onClick={handleChange}>Change Message</button>
    </div>
  )
}

export default DisplayDemo1