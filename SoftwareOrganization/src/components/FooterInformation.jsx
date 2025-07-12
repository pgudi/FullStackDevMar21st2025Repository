import React from 'react'
import { Link } from 'react-router'

const FooterInformation = () => {
  return (
    <div>
        <div className="row bg-dark justify-content-evenly">
            <div className="col-md-3 pb-3">
                <h6 className='text-white'>Shashank Technologies</h6>
                <p className='text-white'>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Repudiandae sequi ducimus non aspernatur!</p>
            </div>
            <div className="col-md-3 pb-3">
                <h6 className='text-white'>Important Links</h6>
                <Link to={'/home'}  class="d-block text-white text-decoration-none">Home</Link>
                <Link to={'/services'}  class="d-block text-white text-decoration-none">Service</Link>
                <Link to={'/about'}  class="d-block text-white text-decoration-none">About Us</Link>
                <Link to={'/contact'}  class="d-block text-white text-decoration-none">Contact Us</Link>
            </div>
            <div className="col-md-3 pb-4">
                <h6 className='text-white'>Address</h6>
                <p className='text-white'>Aishu Technologies Attigupe Metro Station Vijayanagar 2nd Pahse Bangalore - 560023</p>
                <div>
                    <i className="bi bi-telephone-inbound text-white"></i>
                    <span className='text-white'>: 080-234-567-123</span>
                </div>
            </div>
        </div>
    </div>
  )
}

export default FooterInformation