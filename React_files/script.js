import React from "react";
import ReactDOM from "react-dom";

// const heading = React.createElement("h1",
//  {} ,
//  "hello!");

const root = ReactDOM.createRoot(document.getElementById('root'));
//     root.render(heading);


// const jsxHeading = <h1>Bhiya Ram</h1>;
// root.render(jsxHeading);

// const HeadingComponent = () => {
//     return <h1>40 LPA</h1>
// }

const Title = () => (
    <h1 className="head" tabIndex={5}>
        component composition is composing two components into one another.
    </h1>
);

const HeadingComponent = () => (
    <div id="container">
        <h1 className="heading">Functional component is a function returning jsx.</h1>
        <Title></Title>; // <Title/> is another way to write this
    </div>
);

root.render(<HeadingComponent/>)