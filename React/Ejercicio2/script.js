const App = () => {
    const companies = [
      {
        name: "Taxi",
        modality: "autónomo",
        permission: "licencia de taxi"
      },
      {
        name: "Uber",
        modality: "multinacional",
        permission: "Vehículos de Turismo con Conductor (VTC)"
      },
      {
        name: "Cabify",
        modality: "multinacional",
        permission: "Vehículos de Turismo con Conductor (VTC)"
      }
    ];
  
    return (
      <ul>
        {companies.map((company) => (
          <li key={company.name}>{company.name}</li>
        ))}
      </ul>
    );
  };
  
  ReactDOM.render(<App />, document.getElementById("root"));