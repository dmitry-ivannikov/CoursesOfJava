import React from "react";
import { Line } from "react-chartjs-2";
import { MDBContainer } from "mdbreact";
import Tabletop from 'tabletop';

class ChartsPage extends React.Component {
    // dataForChart = {labelss: [], dataa: []};
    constructor(){
        super();
        this.state = {
            //data: [],
            dataLine: {
                // labels: ["January", "February", "March", "April", "May", "June", "July"],
                labels: [],//this.dataForChart.labelss,
                datasets: [
                    {
                        label: "My First dataset",
                        fill: true,
                        lineTension: 0.3,
                        backgroundColor: "rgba(225, 204,230, .3)",
                        borderColor: "rgb(205, 130, 158)",
                        borderCapStyle: "butt",
                        borderDash: [],
                        borderDashOffset: 0.0,
                        borderJoinStyle: "miter",
                        pointBorderColor: "rgb(205, 130,1 58)",
                        pointBackgroundColor: "rgb(255, 255, 255)",
                        pointBorderWidth: 10,
                        pointHoverRadius: 5,
                        pointHoverBackgroundColor: "rgb(0, 0, 0)",
                        pointHoverBorderColor: "rgba(220, 220, 220,1)",
                        pointHoverBorderWidth: 2,
                        pointRadius: 1,
                        pointHitRadius: 10,
                        // data: [65, 59, 80, 81, 56, 55, 40]
                        data: []//this.dataForChart.dataa
                    },
                    // {
                    //     label: "My Second dataset",
                    //     fill: true,
                    //     lineTension: 0.3,
                    //     backgroundColor: "rgba(184, 185, 210, .3)",
                    //     borderColor: "rgb(35, 26, 136)",
                    //     borderCapStyle: "butt",
                    //     borderDash: [],
                    //     borderDashOffset: 0.0,
                    //     borderJoinStyle: "miter",
                    //     pointBorderColor: "rgb(35, 26, 136)",
                    //     pointBackgroundColor: "rgb(255, 255, 255)",
                    //     pointBorderWidth: 10,
                    //     pointHoverRadius: 5,
                    //     pointHoverBackgroundColor: "rgb(0, 0, 0)",
                    //     pointHoverBorderColor: "rgba(220, 220, 220, 1)",
                    //     pointHoverBorderWidth: 2,
                    //     pointRadius: 1,
                    //     pointHitRadius: 10,
                    //     data: [28, 48, 40, 19, 86, 27, 90]
                    // }
                ]
            }
        }
    }

    componentDidMount() {
        Tabletop.init({
            key: '1R_4t_U8vT-CtidFb0DIL38_6dK36XM5Y44RD_959nKs',
            callback: googleData => {
                let newState = {...this.state};
                this.date = googleData;
                console.log('google sheet data --->', googleData);
                    for (let dat in googleData){
                        newState.dataLine.labels.push(googleData[dat].date);
                        newState.dataLine.datasets[0].data.push(googleData[dat].value);
                    }
                this.setState(newState);
            },
            simpleSheet: true
        })
    }

    render() {
        return (
            <MDBContainer>
                <h3 className="mt-5">Line chart</h3>
                <Line data={this.state.dataLine} options={{ responsive: true }} />
            </MDBContainer>
        );
    }
}

export default ChartsPage;