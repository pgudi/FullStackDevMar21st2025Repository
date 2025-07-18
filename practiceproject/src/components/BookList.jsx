import React from 'react'

const BookList = () => {
  return (
    <div>
        <Book name="JavaScript" author="Richard" />
        <Book name="Bootstrap" author="Santosh" >
          <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Maiores distinctio sit alias et nesciunt aperiam, consectetur a minima accusantium quia illum, inventore neque. Exercitationem inventore quae, maiores perferendis accusantium vitae.</p>
        </Book>
        <Book name="Docker" author="Williams" />
    </div>
  )
}

const Book = (props) =>{
    return(
        <h3>Book Name {props.name} Author {props.author} { props.children}</h3>
        
    )
}

export default BookList