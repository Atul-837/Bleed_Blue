import axios from "axios";
import React, { useState } from "react";
import "../css/PreviousResults.css";
import { GET_PREVIOUS_RESULTS } from "../url constants/url's";

const PreviousResults = () => {

    let [previousResults, setPreviousResults] = useState([]);

    const getDate = (date) => {
        let number = parseInt(date)
        let d = new Date(number)
        return d.toDateString();
    }
    
    React.useEffect(() => {
        axios.get(GET_PREVIOUS_RESULTS)
        .then(response => setPreviousResults(response.data));
    },[])

    console.log(previousResults)

    return (
        <div className="container results">
            <div className="container result-left">
                {
                    previousResults.map(pr => 
                        <div className=" container series-name" key={pr.seriesId}>{pr.key}</div>
                        )
                }
            </div>
            <div className="container result-right">
                    {
                        previousResults.map(each => 
                            (
                            each.match.map(eachMatch => 
                                <div className="container each" key={eachMatch.matchInfo.matchId}>
                                    <div className=" vs">{eachMatch.matchInfo.team1.teamName} VS {eachMatch.matchInfo.team2.teamName}</div>
                                    <div className="info">{eachMatch.matchInfo.matchDesc}</div>
                                    <div className="info">{getDate(eachMatch.matchInfo.startDate)}</div> 
                                    <div className="">{eachMatch.matchInfo.venueInfo.city}</div><br/>
                                    <div className="container won">{eachMatch.matchInfo.status}</div>
                                </div>
                        )
                            ))
                    
                            }
            </div>
        </div>
    )

}

export default PreviousResults;