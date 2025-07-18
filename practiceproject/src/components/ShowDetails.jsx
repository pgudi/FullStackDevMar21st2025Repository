import React, { useEffect, useState } from 'react'

const ShowDetails = () => {
    const [count, setCount] = useState(0)

    useEffect(() =>{
        console.log("Executing this Block!!");
        
    },[count])

     function handleLoad(){
        setCount(count+1)
    }
  return (
    <div>
        <h2>{ count }</h2>
        <button onClick={handleLoad}>Increment Count</button>
    </div>
  )
}

export default ShowDetails