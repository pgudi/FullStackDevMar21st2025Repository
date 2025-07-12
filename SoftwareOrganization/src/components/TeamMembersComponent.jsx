import React from 'react'
import UserImage from './../assets/images/user.avif'
const TeamMembersComponent = () => {
    return (
        <div>
            <div className="row p-5 justify-content-evenly">
                <h4 className='text-center'>Our Team Members</h4>
                <div className="col-md-3">
                    <div className="card">
                        <img src={UserImage} className="img-fluid" alt="Team memebers" />
                            <div className="card-body">
                                <h5 className="card-title">Chethan</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">View Profile</a>
                            </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card">
                        <img src={UserImage} className="img-fluid" alt="Team memebers" />
                            <div className="card-body">
                                <h5 className="card-title">Chethan</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">View Profile</a>
                            </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card">
                        <img src={UserImage} className="img-fluid" alt="Team memebers" />
                            <div className="card-body">
                                <h5 className="card-title">Chethan</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">View Profile</a>
                            </div>
                    </div>
                </div>
            </div>

            <div className="row p-5 justify-content-evenly">
                <div className="col-md-3">
                    <div className="card">
                        <img src={UserImage} className="img-fluid" alt="Team memebers" />
                            <div className="card-body">
                                <h5 className="card-title">Chethan</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">View Profile</a>
                            </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card">
                        <img src={UserImage} className="img-fluid" alt="Team memebers" />
                            <div className="card-body">
                                <h5 className="card-title">Chethan</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">View Profile</a>
                            </div>
                    </div>
                </div>
                <div className="col-md-3">
                    <div className="card">
                        <img src={UserImage} className="img-fluid" alt="Team memebers" />
                            <div className="card-body">
                                <h5 className="card-title">Chethan</h5>
                                <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card’s content.</p>
                                <a href="#" className="btn btn-primary">View Profile</a>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default TeamMembersComponent