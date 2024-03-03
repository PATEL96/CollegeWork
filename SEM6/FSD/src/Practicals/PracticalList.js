import React from "react";
import { Link } from "react-router-dom";
import './List.css'

export default function PracticalList() {
	return(
		<div className="Navbar">
			<Link className="links" to="/">Home</Link>
			<Link className="links" to="/Practical1">Practical 1</Link>
			<Link className="links" to="/Practical2A">Practical 2A</Link>
			<Link className="links" to="/Practical2B">Practical 2B</Link>
			<Link className="links" to="/Practical5A">Practical 5A</Link>
			<Link className="links" to="/Practical5B">Practical 5B</Link>
		</div>
	);
}