import React from 'react'
import ImgAbout from './../assets/images/staff.jpg'
const AboutUsComponent = () => {
  return (
    <div>
        <div className="row p-5 justify-content-evenly">
            <h4 className='text-center pb-5'>About Us</h4>
            <div className="col-md-5">
                <img src={ImgAbout} className='img-fluid' alt="Staff Image" />
            </div>
            <div className="col-md-5">
                <p style={{textAlign:'justify'}}>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Incidunt commodi totam repellat, quas iste libero harum repellendus! Consequuntur quo mollitia ipsam commodi consequatur est earum! Impedit veritatis non quos minus. Voluptatem impedit consequuntur dolores libero ratione, aliquid dicta distinctio magni quasi vitae inventore delectus possimus minus maiores corrupti ex in vero incidunt. Vitae, temporibus! Temporibus similique voluptates saepe nostrum nobis!</p>
            </div>
        </div>
    </div>
  )
}

export default AboutUsComponent