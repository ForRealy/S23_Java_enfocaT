//Apartado 1
function obtenerNombreMes(numeroMes) {
  let nombreMes;

  switch (numeroMes) {
    case 1:
      nombreMes = "Enero";
      break;
    case 2:
      nombreMes = "Febrero";
      break;
    case 3:
      nombreMes = "Marzo";
      break;
    case 4:
      nombreMes = "Abril";
      break;
    case 5:
      nombreMes = "Mayo";
      break;
    case 6:
      nombreMes = "Junio";
      break;
    case 7:
      nombreMes = "Julio";
      break;
    case 8:
      nombreMes = "Agosto";
      break;
    case 9:
      nombreMes = "Septiembre";
      break;
    case 10:
      nombreMes = "Octubre";
      break;
    case 11:
      nombreMes = "Noviembre";
      break;
    case 12:
      nombreMes = "Diciembre";
      break;
    default:
      nombreMes = "Mes inválido";
      break;
  }

  return nombreMes;
}

const mes = 3;
const nombreMes = obtenerNombreMes(mes);
console.log(nombreMes);

//Apartado 2
function convertirNumero(numeroString) {
  let numero;

  switch (numeroString) {
    case "uno":
      numero = 1;
      break;
    case "dos":
      numero = 2;
      break;
    case "tres":
      numero = 3;
      break;
    case "cuatro":
      numero = 4;
      break;
    case "cinco":
      numero = 5;
      break;
    default:
      numero = NaN;
      break;
  }

  return numero;
}

const numeroEscrito = "dos";
const numeroConvertido = convertirNumero(numeroEscrito);
console.log(numeroConvertido);
