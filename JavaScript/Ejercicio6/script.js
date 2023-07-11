function suma(num1, num2, num3) {
  return num1 + num2 + num3;
}

const resultado = suma(1, 1, 1);
console.log(resultado);

function mostrarNombreCompleto(nombre, apellido1, apellido2) {
  const nombreCompleto = nombre + " " + apellido1 + " " + apellido2;
  console.log(nombreCompleto);
}

mostrarNombreCompleto("Alejandro", "Tome", "Valle");

function encontrarNumeroMayor(num1, num2) {
  if (num1 > num2) {
    return num1;
  } else {
    return num2;
  }
}

const numeroMayor = encontrarNumeroMayor(5, 7);
console.log(numeroMayor);
