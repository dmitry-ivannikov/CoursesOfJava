import React, { Component } from 'react';
import Tabletop from 'tabletop';

class TableGetter extends Component {
    constructor() {
        super();
        this.state = {
            data: []
        }
    }

    componentDidMount() {
        Tabletop.init({
            key: '1R_4t_U8vT-CtidFb0DIL38_6dK36XM5Y44RD_959nKs',
            callback: googleData => {
                console.log('google sheet data --->', googleData)
            },
            simpleSheet: true
        })
    }

    render() {
        return (
            <div className="App">
                <header className="App-header">
                    {/*<img src={logo} className="App-logo" alt="logo" />*/}
                    <h1 className="App-title">React + Google Sheets Demo</h1>
                </header>
            </div>
        );
    }
}

export default TableGetter;