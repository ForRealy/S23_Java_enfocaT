async function fetchPokemons() {
    const response = await fetch('https://pokeapi.co/api/v2/pokemon');
    const data = await response.json();
    const pokemons = data.results;

    // Muestra los datos en el navegador
    for (const pokemon of pokemons) {
      document.querySelector('.pokemons').innerHTML += `
        <p>${pokemon.name}</p>
      `;
    }
  }

  // Llama a la función cuando la página cargue
  window.onload = fetchPokemons;