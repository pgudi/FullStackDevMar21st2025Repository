import React from 'react'

const fruits=["Mango","Apple","Pineapple","Banana","Grapes"]
const FruitsList = () => {
  return (
    <div>
       <Fruits fruits={fruits} />
    </div>
  )
}

const Fruits = (props) => {
  return (
    <div>
        {
          props.fruits.map((fruit) =>{
            return <li>{fruit}  </li>
          })
        }
    </div>
  )
}

export default FruitsList