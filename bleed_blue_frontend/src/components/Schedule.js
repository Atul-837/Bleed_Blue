import axios from "axios";
import React, { useState } from "react";
import "../css/Schedule.css";
import { GET_SCHEDULE } from "../url constants/url's";

const Schedule = () => {
    let [schedule, setSchedule] = useState([]);

    const getDate = (date) => {
        let number = parseInt(date)
        let d = new Date(number)
        return d.toDateString();
    }


    React.useEffect(() => {
        axios.get(GET_SCHEDULE)
        .then(response => setSchedule(response.data))
    },[])
    console.log(schedule)

    return (
        <div className="container schedule">
            {
                schedule.map(each => 
                    <div className=" container title" key={each.seriesId}>{each.key}
                         <div className="container empty"></div>

                         {
                            each.match.map(eachMatch => 
                                <div className="container match" key={eachMatch.matchInfo.matchId}>
                                <div className="versus">{eachMatch.matchInfo.team1.teamName} VS {eachMatch.matchInfo.team2.teamName}</div>
                                <div className="desc">{eachMatch.matchInfo.state}</div>
                                <div className="desc">{eachMatch.matchInfo.matchDesc}</div>
                                <div className="desc">{getDate(eachMatch.matchInfo.startDate)}</div> 
                                <div className="venue">{eachMatch.matchInfo.venueInfo.city}</div>
                                <div className="container empty1"></div>
                                </div>
                              )
                        }   </div>
                            )
            }

        </div>
    )
}

export default Schedule;