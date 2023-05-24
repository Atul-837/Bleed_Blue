import React from "react";
import "../css/Header.css"

const Header = () => {
  return (
    <nav className="navbar navbar-expand-lg">
  <div className="container-fluid">
  <div className="collapse navbar-collapse left-side" id="navbarNavAltMarkup">
      <div className="navbar-nav">
        <a className="nav-link" href="/schedule">SCHEDULE</a>
        <a className="nav-link" href="/previous_results">PREVIOUS RESULTS</a>
        </div>
    </div>
    <a className="navbar-brand" href="/">
      <img src="LOGO.png" className="logo"/>
    </a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div className="navbar-nav">
        <a className="nav-link" href="/active_squad">PLAYERS</a>
        <a className="nav-link" href="/news">NEWS</a>
      </div>
    </div>
  </div>
</nav>
  )
}

export default Header;