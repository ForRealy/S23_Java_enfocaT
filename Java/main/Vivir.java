package com.main;

abstract class SerVivo {

  abstract void alimentarse();

}

class Planta extends SerVivo {

  @Override
  void alimentarse() {
    // Las plantas se alimentan mediante la fotosíntesis, un proceso que les permite convertir la energía del sol en energía química que pueden utilizar para crecer y reproducirse.
  }

}

class Animal extends SerVivo {

  @Override
  void alimentarse() {
    // Los animales se alimentan de otros seres vivos, ya sean plantas, animales o ambos.
  }

}

class Herbívoro extends Animal {

  @Override
  void alimentarse() {
    // Los herbívoros se alimentan de plantas.
  }

}

class Omnívoro extends Animal {

  @Override
  void alimentarse() {
    // Los omnívoros se alimentan de plantas y animales.
  }

}

class Carnívoro extends Animal {

  @Override
  void alimentarse() {
    // Los carnívoros se alimentan de otros animales.
  }

}
