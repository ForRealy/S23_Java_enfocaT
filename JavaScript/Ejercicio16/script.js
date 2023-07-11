
function jugarPiedraPapelTijera() {
  var opciones = ["✊ Piedra", "🖐️ Papel", "✌️ Tijera"];
  var opcionUsuario = parseInt(prompt("Elige una opción: \n0 - Piedra\n1 - Papel\n2 - Tijera"));
  
  if (isNaN(opcionUsuario) || opcionUsuario < 0 || opcionUsuario > 2) {
    document.write("<p>Opción inválida. Por favor, elige un número entre 0 y 2.</p>");
  } else {
    var opcionComputadora = Math.floor(Math.random() * 3);
    
    document.write("<p>Tú: " + opciones[opcionUsuario] + "</p>");
    document.write("<p>IA: " + opciones[opcionComputadora] + "</p>");
    
    if (opcionUsuario === opcionComputadora) {
      document.write("<p>JAJAJAJAJAJA 👀</p>");
    } else if (
      (opcionUsuario === 0 && opcionComputadora === 2) ||
      (opcionUsuario === 1 && opcionComputadora === 0) ||
      (opcionUsuario === 2 && opcionComputadora === 1)
    ) {
      document.write("<p>Te aplaudo? 🥱</p>");
    } else {
      document.write("<p>Te gana un bot 🤡</p>");
    }
  }
}

jugarPiedraPapelTijera();