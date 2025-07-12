import React from 'react'
import { Link } from 'react-router'

const HeaderComponent = () => {
    return (
        <div>
            <nav className="navbar navbar-expand-lg bg-primary">
                <div className="container-fluid">
                    <Link to={'/home'} className="navbar-brand text-white fw-bold" href="#">Shashank InfoTech</Link>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav ms-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <Link to={'/home'} className="nav-link active text-white" aria-current="page" href="#">Home</Link>
                            </li>
                            <li className="nav-item">
                                <Link to={'/services'} className="nav-link text-white" href="#">Services</Link>
                            </li>
                            <li className="nav-item">
                                <Link to={'/about'} className="nav-link text-white" href="#">About Us</Link>
                            </li>
                            <li className="nav-item">
                                <Link to={'/contact'} className="nav-link text-white" href="#">Contact Us</Link>
                            </li>
                        </ul>
                       
                    </div>
                </div>
            </nav>
        </div>
    )
}

export default HeaderComponent