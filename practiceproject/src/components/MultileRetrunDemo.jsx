import React, { useState } from 'react'

const MultileRetrunDemo = () => {
    const[loading,setLoading] = useState(false);

    if(loading){
        return(
        <div>
            <h1>It is a First Block Compnent</h1>
        </div>
    )
    }
    
  return (
    <div>
        <h1>It is an Second Block Component</h1>
    </div>
  )
}

export default MultileRetrunDemo