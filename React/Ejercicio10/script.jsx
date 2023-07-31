const companies = [
    {
        name: "Taxi",
        modality: "autónomo",
        permit: "licencia de taxi",
    },
    {
        name: "Uber",
        modality: "multinacional",
        permit: "Vehículos de Turismo con Conductor (VTC)",
    },
    {
        name: "Cabify",
        modality: "multinacional",
        permit: "Vehículos de Turismo con Conductor (VTC)",
    },
];

const CompanyComponent = ({ company }) => {
    return (
        <div>
            <h1>{company.name}</h1>
            <p>{company.modality}</p>
            <p>{company.permit}</p>
        </div>
    );
};

import React, { useState, useEffect } from "react";
import ReactDOM from "react-dom";
import CompanyComponent from "./CompanyComponent";
import HideAllButton from "./HideAllButton";

const App = () => {
    const [companies, setCompanies] = useState(companies);

    useEffect(() => {
        setCompanies(companies.map(company => ({
            name: company.name,
            modality: company.modality,
            permit: company.permit,
            hide: false,
        })));
    }, [companies]);

    return (
        <div>
            <h1>Companies</h1>
            <ul>
                {companies.filter(company => !company.hide).map(company => (
                    <li key={company.id}>
                        <CompanyComponent company={company} />
                    </li>
                ))}
            </ul>
            <HideAllButton />
        </div>
    );
};

ReactDOM.render(<App />, document.getElementById("app"));
