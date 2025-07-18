import React from "react";
// function GoodEvening(){
//     return(
//         <div>
//             <h2>Good Evening to My Team Members</h2>
//             <h2>My Work Started Now!!</h2>
//         </div>
        
//     )
// }

function GoodEvening(){
    return React.createElement("div",{}, React.createElement("h2",{},"Good Evening to My Team Members") ,React.createElement("h2",{},"My Work Started Now!!"))
}

export default GoodEvening