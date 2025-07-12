import React from 'react'

const ContactUsComponent = () => {
  return (
    <div>
        <div className="row p-5 justify-content-evenly my-5" style={{backgroundColor:'#f1f1f1'}}>
            <h4 className='text-center pb-5'>Contact Us</h4>
            <div className="col-md-5">
                <div className="mb-3">
                    <label for="exampleFormControlInput1" className="form-label">Full Name</label>
                    <input type="text" className="form-control" id="exampleFormControlInput1" placeholder="Full Name" />
                </div>
                <div className="mb-3">
                    <label for="exampleFormControlInput1" className="form-label">Email address</label>
                    <input type="email" className="form-control" id="exampleFormControlInput1" placeholder="E-Mail"/>
                </div>
                <div className="mb-3">
                    <label for="exampleFormControlTextarea1" className="form-label">Message</label>
                    <textarea className="form-control" id="exampleFormControlTextarea1" rows="3"
                        placeholder="Describe Yourself"></textarea>
                </div>
                <button type="submit" className="btn btn-primary">Submit</button>
                <button type="reset" className="btn btn-success">Reset</button>
            </div>
            <div className="col-md-5">
                <h6>Address</h6>
                <p>Shashank Technologies Attigupe Metro Station Vijayanagar 2nd Pahse Bangalore - 560023
                </p>
                <div className="pb-2">
                    <i className="bi bi-telephone-inbound-fill "></i> <span>:
                        080-234-567-123</span>
                </div>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3888.0160464676574!2d77.53478887412031!3d12.970824914897236!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bae3ddddccc3acb%3A0x4ea472db769a21aa!2sVijayanagar%20Metro%20Railway%20Station!5e0!3m2!1sen!2sin!4v1749704566698!5m2!1sen!2sin" width="400" height="300" style={{border:'0'}} allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
            </div>
        </div>
    </div>
  )
}

export default ContactUsComponent