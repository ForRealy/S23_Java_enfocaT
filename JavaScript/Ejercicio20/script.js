function changeTheme(theme) {
  const root = document.documentElement;

  if (theme === "dark") {
    root.style.setProperty("--background-color", "hsl(228, 45%, 44%)");
    root.style.setProperty("--button-background", "darkblue");
    root.style.setProperty("--button-color", "#f0f0f0");
    root.style.setProperty("--button-hover-color", "#e0e0e0");
    root.style.setProperty("--display-background", "darkmagenta");
    root.style.setProperty("--display-color", "white");
    root.style.setProperty("--text-color", "black");
  } else if (theme === "light") {
    root.style.setProperty("--background-color", "#f0f0f0");
    root.style.setProperty("--button-background", "#e0e0e0");
    root.style.setProperty("--button-color", "black");
    root.style.setProperty("--button-hover-color", "#f0f0f0");
    root.style.setProperty("--display-background", "white");
    root.style.setProperty("--display-color", "black");
    root.style.setProperty("--text-color", "white");
  } else {
    // Default theme
    root.style.setProperty("--background-color", "hsl(228, 45%, 44%)");
    root.style.setProperty("--button-background", "darkmagenta");
    root.style.setProperty("--button-color", "#f0f0f0");
    root.style.setProperty("--button-hover-color", "#e0e0e0");
    root.style.setProperty("--display-background", "darkmagenta");
    root.style.setProperty("--display-color", "white");
    root.style.setProperty("--text-color", "black");
  }
}

changeTheme("default");
let displayValue = '';

function appendToDisplay(value) {
  displayValue += value;
  document.getElementById('display').value = displayValue;
}

function calculate() {
  try {
    displayValue = eval(displayValue);
    document.getElementById('display').value = displayValue;
  } catch (error) {
    document.getElementById('display').value = 'Error';
  }
}

function clearDisplay() {
  displayValue = '';
  document.getElementById('display').value = displayValue;
}

function deleteLast() {
  displayValue = displayValue.slice(0, -1);
  document.getElementById('display').value = displayValue;
}
