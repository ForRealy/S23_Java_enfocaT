// Const añadir
const emojiElement = document.getElementById("emoji");
const pushButton = document.querySelector("button[data-action='push']");
const unshiftButton = document.querySelector("button[data-action='unshift']");
const insertButton = document.querySelector("button[data-action='insert']");
const insertInput = document.querySelector("input[type='number']");

// Almacnar emojis
let emojis = [];

// Agregar emojis
function addEmoji(action) {
  const emoji = getRandomEmoji();
  if (emojis.length >= 8) {
    console.log("Se ha alcanzado el límite máximo de emojis.");
    return;
  }
  if (action === "push") {
    emojis.push(emoji);
  } else if (action === "unshift") {
    emojis.unshift(emoji);
  } else if (action === "insert") {
    const index = parseInt(insertInput.value) - 1;
    if (index >= 0 && index <= emojis.length) {
      emojis.splice(index, 0, emoji);
    } else {
      console.error("Invalid index for insertion.");
      return;
    }
  }

  updateEmojiDisplay();
}

// Añadir emojis
function updateEmojiDisplay() {
  emojiElement.textContent = "[" + emojis.join(" ") + "]";
}

// Emoji aleatorio
function getRandomEmoji() {
  const emojis = ["😀", "😊", "🎉", "🌟", "🔥", "❤️", "🐶", "🐱", "🌈", "🍕"];
  const randomIndex = Math.floor(Math.random() * emojis.length);
  return emojis[randomIndex];
}

// Botones añadir
pushButton.addEventListener("click", () => addEmoji("push"));
unshiftButton.addEventListener("click", () => addEmoji("unshift"));
insertButton.addEventListener("click", () => addEmoji("insert"));


// Const borrar
const popButton = document.querySelector("button[data-action='pop']");
const shiftButton = document.querySelector("button[data-action='shift']");
const removeButton = document.querySelector("button[data-action='remove']");
const removeInput = document.querySelector("input[type='number']");

// Eliminar emojis
function removeEmoji(action) {
  if (action === "pop") {
    emojis.pop();
  } else if (action === "shift") {
    emojis.shift();
  } else if (action === "remove") {
    const index = parseInt(removeInput.value) - 1;
    if (index >= 0 && index < emojis.length) {
      emojis.splice(index, 1);
    } else {
      console.error("Invalid index for removal.");
      return;
    }
  }

  updateEmojiDisplay();
}

// Botones borrar
popButton.addEventListener("click", () => removeEmoji("pop"));
shiftButton.addEventListener("click", () => removeEmoji("shift"));
removeButton.addEventListener("click", () => removeEmoji("remove"));
