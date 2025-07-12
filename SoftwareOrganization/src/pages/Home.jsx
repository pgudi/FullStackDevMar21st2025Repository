import React from 'react'
import CarouselComponent from "./../components/CarouselComponent"
import TagLineComponent from "./../components/TagLineComponent"
import ObjectiveComponent from "./../components/ObjectiveComponent"
import TeamMembersComponent from "./../components/TeamMembersComponent"
import GrowthComponent from './../components/GrowthComponent'

const Home = () => {
    return (
        <div>
            <CarouselComponent />
            <TagLineComponent></TagLineComponent>
            <ObjectiveComponent />
            <TeamMembersComponent />
            <GrowthComponent />
        </div>
    )
}

export default Home