// Importamos las funciones necesarias
import React, { useState, useEffect } from 'react';
import axios from 'axios';

// Creamos el componente
const JokeComponent = () => {
  // Declaramos las variables de estado
  const [joke, setJoke] = useState(null);
  const [category, setCategory] = useState('animal');

  // A la carga del componente, hacemos una llamada a la API
  useEffect(() => {
    axios.get(`https://api.chucknorris.io/jokes/random?category=${category}`)
      .then((response) => {
        setJoke(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, [category]);

  // Devolvemos el componente
  return (
    <div>
      <h1>Chuck Norris Joke</h1>
      <p>{joke.joke}</p>
      <select onChange={(event) => setCategory(event.target.value)}>
        <option value="animal">Animal</option>
        <option value="food">Food</option>
        <option value="history">History</option>
        <option value="science">Science</option>
        <option value="sports">Sports</option>
      </select>
    </div>
  );
};

// Exportamos el componente
export default JokeComponent;
