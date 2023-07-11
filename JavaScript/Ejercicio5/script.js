function lanzarMoneda() {
    const resultado = Math.round(Math.random());
  
    if (resultado === 1) {
      return "cara";
    } else {
      return "cruz";
    }
  }
  
  const resultadoMoneda = lanzarMoneda();
  console.log(resultadoMoneda);
  