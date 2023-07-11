const darbukaButtons = document.querySelectorAll('.darbuka-button');

function playSound(sound) {
  const audio = new Audio(sound);
  audio.play();
}

darbukaButtons.forEach(button => {
  const sound = button.dataset.sound;
  button.addEventListener('click', () => {
    playSound(sound);
  });
});

document.addEventListener('keydown', event => {
  const key = event.key.toUpperCase();
  const sounds = {
    // Mapeo de teclas a sonidos de la darbuka
    // Asegúrate de mapear todas las teclas que deseas utilizar
    // Por ejemplo: 'A': 'sound/darbuka1.wav', 'S': 'sound/darbuka2.wav', etc.
  };
  const sound = sounds[key];
  if (sound) {
    playSound(sound);
  }
});
