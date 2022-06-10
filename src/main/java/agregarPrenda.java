public class agregarPrenda implements Propuesta{
Guardarropa guardarropa;
Prenda prenda;

  public agregarPrenda (Guardarropa guardarropa, Prenda prenda) {
    this.guardarropa = guardarropa;
    this.prenda = prenda;
  }

  @Override
  public void aceptar () {
    guardarropa.agregarPrenda(prenda);
  }

  @Override
  public void deshacer () {
    guardarropa.quitarPrenda(prenda);
  }
}
