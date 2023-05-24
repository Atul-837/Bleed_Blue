import axios from "axios";
import React, { useState } from "react";
import "../css/News.css";
import { GET_NEWS_LATEST } from "../url constants/url's";


const News = () => {
    let [news, setNews] = useState([])

    React.useEffect(() => {
        axios.get(GET_NEWS_LATEST)
        .then(response => setNews(response.data));
        
    },[])
 
   
    return (

        <div className="container news">
            {
                news.map(story => (
                    <div className="container story" key={story.id}>
                        <h3>{story.hline}</h3>
                        <div>{story.intro}</div>
                        <div>{story.context}</div>
                        <div>Source: {story.source}</div>
                    </div>
                ))
            }   
           
        </div>

    )

}

export default News;