class CounterComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            counter: 0,
        };
    }

    incrementCounter = () => {
        this.setState(prevState => ({
            counter: prevState.counter + 1,
        }));
    };

    resetCounter = () => {
        this.setState({
            counter: 0,
        });
    };

    render() {
        return (
            <div>
                <h1>Counter</h1>
                <p>Counter: {this.state.counter}</p>
                <button onClick={this.incrementCounter}>Increment</button>
                <button onClick={this.resetCounter}>Reset</button>
            </div>
        );
    }
}

const CounterComponent = () => {
    const [counter, setCounter] = useState(0);

    const incrementCounter = () => {
        setCounter(counter + 1);
    };

    const resetCounter = () => {
        setCounter(0);
    };

    return (
        <div>
            <h1>Counter</h1>
            <p>Counter: {counter}</p>
            <button onClick={incrementCounter}>Increment</button>
            <button onClick={resetCounter}>Reset</button>
        </div>
    );
};

class CoinFlipComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            result: null,
        };
    }

    flipCoin = () => {
        this.setState({
            result: Math.random() > 0.5 ? "Heads" : "Tails",
        });
    };

    render() {
        return (
            <div>
                <h1>Coin Flip</h1>
                <p>Result: {this.state.result}</p>
                <button onClick={this.flipCoin}>Flip</button>
            </div>
        );
    }
}

const CoinFlipComponent = () => {
    const [result, setResult] = useState(null);

    const flipCoin = () => {
        setResult(Math.random() > 0.5 ? "Heads" : "Tails");
    };

    return (
        <div>
            <h1>Coin Flip</h1>
            <p>Result: {result}</p>
            <button onClick={flipCoin}>Flip</button>
        </div>
    );
};