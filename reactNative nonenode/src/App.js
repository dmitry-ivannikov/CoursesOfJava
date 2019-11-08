import React from 'react';
import logo from './logo.svg';
import './App.css';
import Chart from './screens/Chart'
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import ReactApexChart from 'apexcharts';
import ChartsPage from "./screens/ChartsPage";
import TableGetter from "./screens/TableGetter";

class HomeScreen extends React.Component {
    constructor() {
        super();
        this.state = {
            mode: 'choice'
        }
    }

    drawBar = () => {
        return (
            // if(this.state.mode === 'choice')
            <div>
                <nav className="navbar navbar-expand-lg navbar-light bg-light">
                    {/*<a className="navbar-brand" href="/chart">Chart</a>*/}
                    <button className="nav-item active" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation"
                            onClick={() => {
                                if (this.state.mode === 'choice') this.setState({mode: 'chart'})
                            }}
                    >Chart
                    </button>

                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav mr-auto">
                            <li className="nav-item active">
                                <a className="nav-link" href="/">Home <span className="sr-only">(current)</span></a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="/">Link</a>
                            </li>
                            <li className="nav-item dropdown">
                                <a className="nav-link dropdown-toggle" href="/" id="navbarDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Dropdown
                                </a>
                                <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <a className="dropdown-item" href="/">Action</a>
                                    <a className="dropdown-item" href="/">Another action</a>
                                    <div className="dropdown-divider"></div>
                                    <a className="dropdown-item" href="/">Something else here</a>
                                </div>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link disabled" href="/">Disabled</a>
                            </li>
                        </ul>
                        <form className="form-inline my-2 my-lg-0">
                            <input className="form-control mr-sm-2" type="search" placeholder="Search"
                                   aria-label="Search"/>
                            <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </form>
                    </div>
                </nav>
            </div>
        );
    };

    drawBody = () => {
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                    <p>
                        Edit <code>src/App.js</code> and save to reload.
                    </p>
                    <a
                        className="App-link"
                        href="https://reactjs.org"
                        target="_blank"
                        rel="noopener noreferrer"
                    >
                        Learn React
                    </a>
                </header>
            </div>
        );
    };

    render() {
        if (this.state.mode === 'choice') {
            return (
                <div>
                    {this.drawBar()}
                    {this.drawBody()}

                    {/*if (this.state.mode === 'chart')*/}
                    {/*return <Chart/>*/}


                </div>
            );
        }
        if (this.state.mode === 'chart') {
            return <Chart/>
        }
    }

}

class SettingsScreen extends React.Component {
    render() {
        return <Chart/>
    }
}

function App() {
    return (
        <Router>
            <div>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/about">About</Link>
                    </li>
                    <li>
                        <Link to="/topics">Topics</Link>
                    </li>
                    <li>
                        <Link to="/chart2">Chart2</Link>
                    </li>
                    <li>
                        <Link to="/getter">getter</Link>
                    </li>
                </ul>

                <hr />

                <Route exact path="/" component={Home} />
                <Route path="/about" component={About} />
                <Route path="/topics" component={Topics} />
                <Route path="/chart2" component={Chart2} />
                <Route path="/getter" component={Getter} />
            </div>
        </Router>
    );
}

class LineChart extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            options: {
                chart: {
                    zoom: {
                        enabled: false
                    }
                },
                dataLabels: {
                    enabled: false
                },
                stroke: {
                    curve: 'straight'
                },
                title: {
                    text: 'Product Trends by Month',
                    align: 'left'
                },
                grid: {
                    row: {
                        colors: ['#f3f3f3', 'transparent'], // takes an array which will be repeated on columns
                        opacity: 0.5
                    },
                },
                xaxis: {
                    categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep'],
                }
            },
            series: [{
                name: "Desktops",
                data: [10, 41, 35, 51, 49, 62, 69, 91, 148]
            }],
        }
    }

    render() {

        return (
            <div id="chart">
                <ReactApexChart options={this.state.options} series={this.state.series} type="line" height="350" />
            </div>
        );
    }
}

function Chart2() {
    return (
        <ChartsPage/>
        );
}

function Getter() {
    return (<TableGetter/>
    );
}

function Home() {
    return (<HomeScreen/>
    );
}

function About() {
    return (
        <div>
            <h2>About</h2>
        </div>
    );
}

function Topics({ match }) {
    return (
        <div>
            <h2>Topics</h2>
            <ul>
                <li>
                    <Link to={`${match.url}/rendering`}>Rendering with React</Link>
                </li>
                <li>
                    <Link to={`${match.url}/components`}>Components</Link>
                </li>
                <li>
                    <Link to={`${match.url}/props-v-state`}>Props v. State</Link>
                </li>
            </ul>

            <Route path={`${match.path}/:topicId`} component={Topic} />
            <Route
                exact
                path={match.path}
                render={() => <h3>Please select a topic.</h3>}
            />
        </div>
    );
}

function Topic({ match }) {
    return (
        <div>
            <h3>{match.params.topicId}</h3>
        </div>
    );
}

export default App;




// export default App;