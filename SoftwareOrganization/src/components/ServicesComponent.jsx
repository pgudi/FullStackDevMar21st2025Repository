import React from 'react'
import ImgService from './../assets/images/service1.jpg'
const ServicesComponent = () => {
    return (
        <div>
            <div className="row p-5 justify-content-evenly">
                <h4 className='text-center'>Our Services</h4>
                <div className="col-md-3">
                    <div className="card">
                        <img src={ImgService} className="img-fluid" alt="Team memebers" />
                        <div className="card-body">
                            <h5 className="card-title">Springboot</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">View Profile</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card">
                        <img src={ImgService} className="img-fluid" alt="Team memebers" />
                        <div className="card-body">
                            <h5 className="card-title">Bootstrap</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">View Profile</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card">
                        <img src={ImgService} className="img-fluid" alt="Team memebers" />
                        <div className="card-body">
                            <h5 className="card-title">React</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">View Profile</a>
                        </div>
                    </div>
                </div>
            </div>
            <div className="row p-5 justify-content-evenly">
                <div className="col-md-3">
                    <div className="card">
                        <img src={ImgService} className="img-fluid" alt="Team memebers" />
                        <div className="card-body">
                            <h5 className="card-title">Playwright</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">View Profile</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card">
                        <img src={ImgService} className="img-fluid" alt="Team memebers" />
                        <div className="card-body">
                            <h5 className="card-title">Selenium</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">View Profile</a>
                        </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card">
                        <img src={ImgService} className="img-fluid" alt="Team memebers" />
                        <div className="card-body">
                            <h5 className="card-title">Rest-Assured</h5>
                            <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                            <a href="#" className="btn btn-primary">View Profile</a>
                        </div>
                    </div>
                </div>
            </div>
        </div >
    )
}

export default ServicesComponent