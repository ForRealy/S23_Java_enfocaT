const ayuda = () => {
  console.log("Alejandro Tome");
};
ayuda();

const qpro = function () {
  console.log("qpro");
};
qpro();

//opcion 1
const inf = function (...valorant) {
  console.log(typeof valorant); //Array
  valorant.forEach((element) => {
    console.log(element);
  });
};
inf(1, 2, 3, 4);

//opcion 2
const inf2 = function (valorant) {
  console.log(typeof valorant); //Array
  valorant.forEach((element) => {
    console.log(element);
  });
};
inf2([5, 6, 7, 8]);
