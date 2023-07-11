//Apartado  A
const pizza = ['🍔', '🌯', '🍣', '🍕', '🍜', '🍱', '🍙', '🍘', '🥩'];
const cervezas = Array(pizza.length).fill('🍺');
console.log(cervezas);

//Apartado  B
const piña = ['🍕', '🍕', '🍍', '🍕', '🍕'];
const existePina = piña.includes('🍍');
console.log(existePina);

//Apartado  C
const con = ['🍕', '🍕', '🍍', '🍕', '🍕'];
const conSinPina = con.filter(elemento => elemento !== '🍍');
console.log(conSinPina);

//Apartado D
const setas = ['🍓', '🍋', '🍓', '🍋', '🍓'];
const fresasConvSetas = setas.map(elemento => elemento === '🍓' ? '🍄' : elemento);
console.log(fresasConvSetas);

//Apartado  E
const pica = ['🌶', '🥛', '🌶', '🥛', '🌶', '🥛'];
const picanteConIcono = pica.flatMap(elemento => elemento === '🌶' ? [elemento, '🥵'] : elemento);
console.log(picanteConIcono);

//Apartado  F
const array = ['🎴', '🎴', '🎴', '🃏', '🎴', '🎴', '🎴'];
const posicion = 3;
const cartaComodin = '🃏';

array.splice(posicion, 0, cartaComodin);

console.log(array);
