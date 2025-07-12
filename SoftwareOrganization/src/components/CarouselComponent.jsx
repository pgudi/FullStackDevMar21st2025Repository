import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import CarouselImage from './../assets/images/bnr15.jpg'
const CarouselComponent = () => {
    return (
        <div>
            <Carousel>
                <Carousel.Item>
                    <img src={CarouselImage} className="d-block w-100" alt="CarouselImage"></img>                   
                </Carousel.Item>
                <Carousel.Item>
                    <img src={CarouselImage} className="d-block w-100" alt="CarouselImage"></img>
                </Carousel.Item>
                <Carousel.Item>
                    <img src={CarouselImage} className="d-block w-100" alt="CarouselImage"></img>
                </Carousel.Item>
            </Carousel>
        </div>
    )
}

export default CarouselComponent