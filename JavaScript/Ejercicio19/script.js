var slides = document.querySelectorAll('.slide');
var currentSlide = 0;
var stats = {
  comer: 100,
  dormir: 100,
  jugar: 100,
  pelear: 100
};

var comerProgress = document.getElementById('comerProgress');
var dormirProgress = document.getElementById('dormirProgress');
var jugarProgress = document.getElementById('jugarProgress');
var pelearProgress = document.getElementById('pelearProgress');
var buttons = document.querySelectorAll('button');

function showSlide() {
  slides.forEach(function (slide) {
    slide.classList.remove('active');
  });
  slides[currentSlide].classList.add('active');
}

function hideSlide() {
  slides[currentSlide].classList.remove('active');
}

function updateStats() {
  comerProgress.value = stats.comer;
  dormirProgress.value = stats.dormir;
  jugarProgress.value = stats.jugar;
  pelearProgress.value = stats.pelear;

  var zeroStats = Object.values(stats).filter(stat => stat <= 0);
  if (zeroStats.length >= 2) {
    clearInterval(interval);
    buttons.forEach(function (button) {
      button.disabled = true;
    });
    alert('¡El juego ha terminado!');

    slides.forEach(function (slide, index) {
      slide.src = './img/gameover' + (index + 1) + '.png';
    });
    var interval = setInterval(function () {
      hideSlide();
      currentSlide = (currentSlide + 1) % slides.length;
      showSlide();
    }, 10000);
    currentSlide = 1; // Reiniciar el índice del carrusel al inicio
    showSlide(); // Mostrar la primera imagen del carrusel de juego terminado
  }
}

var images = {
  comer: [
    './img/nam1.png',
    './img/nam2.png',
    './img/nam3.png',
    './img/nam4.png',
    './img/nam5.png'
  ],
  dormir: [
    './img/zZz1.png',
    './img/zZz2.png',
    './img/zZz3.png',
    './img/zZz4.png',
    './img/zZz5.png'

  ],
  jugar: [
    './img/run1.png',
    './img/run2.png',
    './img/run3.png',
    './img/run4.png',
    './img/run5.png'
  ],
  pelear: [
    './img/battle1.png',
    './img/battle2.png',
    './img/battle3.png',
    './img/battle4.png',
    './img/battle5.png'
  ]
};

function updateImage(action) {
  slides.forEach(function (slide, index) {
    var imageIndex = (currentSlide + index) % slides.length;
    var imageName = images[action][imageIndex];
    slide.src = imageName;
  });
}

function doAction(action) {
  switch (action) {
    case 'comer':
      stats.comer += 10;
      stats.dormir -= 5;
      stats.jugar -= 5;
      stats.pelear -= 5;
      break;
    case 'dormir':
      stats.comer -= 3;
      stats.dormir += 10;
      stats.jugar -= 5;
      stats.pelear -= 5;
      break;
    case 'jugar':
      stats.comer -= 5;
      stats.dormir -= 5;
      stats.jugar += 10;
      stats.pelear -= 5;
      break;
    case 'pelear':
      stats.comer -= 5;
      stats.dormir -= 5;
      stats.jugar -= 5;
      stats.pelear += 10;
      break;
  }

  updateImage(action);
  updateStats();
}

var interval = setInterval(function () {
  hideSlide();
  currentSlide = (currentSlide + 1) % slides.length;
  showSlide();
}, 200);

showSlide();
updateStats();
