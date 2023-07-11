// Tipo de dato string
var nombre = "Juan";
console.log(nombre);
console.log(typeof nombre);

// Tipo de dato number
var edad = 25;
console.log(edad);
console.log(typeof edad);

// Tipo de dato boolean
var esMayorDeEdad = true;
console.log(esMayorDeEdad);
console.log(typeof esMayorDeEdad);

// Tipo de dato undefined
var miVariable;
console.log(miVariable);
console.log(typeof miVariable);

// Tipo de dato null
var miVariableNull = null;
console.log(miVariableNull);
console.log(typeof miVariableNull);

// Scope local y global
function ejemploScope() {
  var localVariable = "Variable local";
  console.log(localVariable);

  globalVariable = "Variable global";
}

ejemploScope();
console.log(globalVariable);
