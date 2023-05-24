import axios from "axios";
import React, { useState } from "react";
import "../css/Main.css";
import { GET_TROPHIES } from "../url constants/url's";



const MainPage = () => {

    let [trophies, setTrophies] = useState([])

    const Fetch_Trophies =  () => {
        const response = fetch(GET_TROPHIES, {
            method: 'get',
            mode: 'no-cors'
        });
        const data = response.json();
        // setTrophies(trophies = data);
        console.log(data);
    }

    React.useEffect(() => {
        axios.get(GET_TROPHIES, {
            mode: 'no-cors'
        }).then(response => setTrophies(response.data))
    }, [])
    console.log(trophies)
    return (
        <div className="container-fluid outer">
        <div className="container-fluid india d-flex">
            <div className="container left">
                <img src="team logo.png" className="team-logo"/>
            </div>
            <div className="container center">
                <img src="back11.png" className="center-wall"/>
            </div>
            <div className="container right d-flex">
                ICC TITLES WON SO FAR
                {
                    trophies.map(trophy => 
                        <div className="card" key={trophy.id}>
                            <img src={`${trophy.imageUrl}`} className="card-img-top" alt="..."/>
                            <div className="card-body">
                                <h6 className="card-title">{trophy.trophyName}</h6>
                                <p className="card-text">{trophy.winningYear}</p>
                            </div>
                        </div>
                    )
                }
                <p className="below-text">AND THE SAGA CONTINUES....</p>
            </div>
        </div>
            <div className="container bottom"></div>
        </div>
    )
}


export default MainPage;