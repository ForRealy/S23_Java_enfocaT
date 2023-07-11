const cardImage = document.getElementById('cardImage');

    cardImage.addEventListener('mouseenter', () => {
      cardImage.src = './img/card-front.png';
    });

    cardImage.addEventListener('mouseleave', () => {
      cardImage.src = './img/card-back.png';
    });