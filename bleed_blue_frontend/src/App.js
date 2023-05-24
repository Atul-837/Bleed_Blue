import React from "react";
import Header from "./components/Header";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import MainPage from "./components/MainPage";
import "./App.css";
import ActiveSquad from "./components/ActiveSquad";
import PreviousResults from "./components/PreviousResults";
import News from "./components/News";
import Schedule from "./components/Schedule";

const App = () => {
    return (
        <div className="app">
            <Header/>
                <Router>
                    <Routes>
                        <Route path="/" element={<MainPage/>}/>
                        <Route path="/active_squad" element={<ActiveSquad/>}/>
                        <Route path="/previous_results" element={<PreviousResults/>}/>
                        <Route path="/news" element={<News/>}/>
                        <Route path="/schedule" element={<Schedule/>}/>
                    </Routes>
                </Router>
        </div>
    )
}

export default App;