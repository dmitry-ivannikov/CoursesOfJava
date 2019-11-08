import React from 'react';
import {View, Text} from 'bootstrap';

export default class Chart extends React.Component {
    render() {
        return (
            <View>
                {/*<Text>New Screen</Text>*/}
                <div>
                    <div>
                        qweqwe
                    </div>
                    <div className="col-lg-6">
                        <div className="ibox ">
                            <div className="ibox-title">
                                <h5>Line Chart Example
                                    <small>With custom colors.</small>
                                </h5>
                            </div>
                            <div className="ibox-content">
                                <div>
                                    <iframe className="chartjs-hidden-iframe"
                                            style="width: 100%; display: block; border: 0px; height: 0px; margin: 0px; position: absolute; left: 0px; right: 0px; top: 0px; bottom: 0px;"></iframe>
                                    <canvas id="lineChart" height="226" width="486"
                                            style="display: block; width: 486px; height: 226px;"></canvas>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </View>
        );
    }
}

// export default Chart;