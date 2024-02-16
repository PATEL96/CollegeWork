import { Component, useState } from "react";

export function Counter() {

	const [val, setVal] = useState(0);

	return(
		<div>
			<div>{val}</div>
			<div>
				<button onClick={() => {setVal(val + 1)}}>Add</button>
				<button onClick={() => {val === 0 ? setVal(0) : setVal(val - 1)}}>Sub</button>
			</div>
		</div>
	);
}

export class CliclUpdater extends Component {
	constructor(props) {
		super(props)
		this.state = {
			clicks: 0
		}
	}

	handleCLickAdd = () => {
		this.setState(prevState => ({
			clicks: prevState.clicks + 1
		}))
	}
	handleCLickSub = () => {
		this.state.clicks === 0 ? 
		this.setState(() => ({
			clicks: 0
		})) : this.setState(prevState => ({
			clicks: prevState.clicks - 1
		}))
	}

	render() {
		return(
			<div>
				<div>{this.state.clicks}</div>
				<button onClick={this.handleCLickAdd}>Add</button>
				<button onClick={this.handleCLickSub}>Sub</button>
			</div>
		);
	}
}