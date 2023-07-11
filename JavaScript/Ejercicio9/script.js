//Apartado  A
function substituirLetras(palabra) {
    palabra.toLowerCase().replaceAll('a', 'o');
    palabra = palabra.substring(0, 1).toUpperCase().concat(palabra.substring(1));
    return palabra;
}

console.log(substituirLetras("academia"));

//Apartado B
function comprobarInicio(inicio) {
    return inicio.startsWith('aca');
  }
  
  const texto1 = 'academia';
  const texto2 = 'escuela';
  
  console.log(comprobarInicio(texto1));
  console.log(comprobarInicio(texto2));

//Apartado  C
function saludar(repetir) {
    const saludo = repetir.repeat(3);
    console.log(saludo);
  }
  
  const saludoInicial = 'Hola';
  
  saludar(saludoInicial);
  