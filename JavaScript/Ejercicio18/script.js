var isOn = false;

function toggleImage() {
  var btn = document.getElementById('toggleBtn');
  var bulb = document.getElementById('bulbImg');
  var intensitySlider = document.getElementById('intensitySlider');

  if (!isOn) {
    btn.style.backgroundImage = 'url("./img/bon.jpg")';
    bulb.style.backgroundImage = 'url("./img/on.jpg")';
    intensitySlider.disabled = false;
    isOn = true;
  } else {
    btn.style.backgroundImage = 'url("./img/boff.jpg")';
    bulb.style.backgroundImage = 'url("./img/off.jpg")';
    intensitySlider.disabled = true;
    isOn = false;
  }
}

function updateIntensity() {
  if (isOn) {
    var intensitySlider = document.getElementById('intensitySlider');
    var bulb = document.getElementById('bulbImg');
    var intensity = intensitySlider.value;

    if (intensity > 100) {
      intensity = 100;
      intensitySlider.value = 100;
    }

    var opacity = 1 - (intensity / 100);
    bulb.style.opacity = opacity;
  }
}

function updateSize() {
    var sizeSlider = document.getElementById('sizeSlider');
    var bulb = document.getElementById('bulbImg');
    var sizePercentage = sizeSlider.value;

    var width = 600 * (sizePercentage / 100);
    var height = 800 * (sizePercentage / 100);

    bulb.style.width = width + 'px';
    bulb.style.height = height + 'px';
  }