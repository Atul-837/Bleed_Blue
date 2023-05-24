import axios from "axios";
import React, { useState } from "react";
import { GET_ACTIVE_SQUAD, GET_PLAYER_IMAGES } from "../url constants/url's";
import "../css/ActiveSquad.css"


const ActiveSquad = () => {

    let [players, setPlayers] = useState([])


    React.useEffect(() => {
        axios.get(GET_ACTIVE_SQUAD)
        .then(response => setPlayers(response.data))    
    }, [])

    return (
        <div className="container-fluid players">
            { 
                players.map(player => 
                        <div className="card player-card" key={player.id}>
                            <img src={`${player.imageUrl}`} className="card-img-top player-image" alt="..."/>
                            <div className="card-body">
                                <h6 className="card-title">{player.name}</h6>
                            </div>
                        </div> 
           )}            
        </div>
    )
}


export default ActiveSquad;