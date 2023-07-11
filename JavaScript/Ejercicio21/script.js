const jokeText = document.getElementById('jokeText');
const newJokeBtn = document.getElementById('newJokeBtn');

function fetchJoke() {
  fetch('https://api.chucknorris.io/jokes/random')
    .then(response => response.json())
    .then(data => {
      jokeText.textContent = data.value;
    })
    .catch(error => {
      jokeText.textContent = 'Failed to fetch a joke. Please try again later.';
    });
}

newJokeBtn.addEventListener('click', fetchJoke);
fetchJoke(); // Fetch a joke when the page loads
