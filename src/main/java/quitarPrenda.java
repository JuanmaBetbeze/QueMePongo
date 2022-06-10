public class quitarPrenda implements Propuesta{
  Guardarropa guardarropa;
  Prenda prenda;

  public quitarPrenda (Guardarropa guardarropa, Prenda prenda) {
    this.guardarropa = guardarropa;
    this.prenda = prenda;
  }

  @Override
  public void aceptar() {
    guardarropa.quitarPrenda(prenda);
  }

  @Override
  public void deshacer() {
    guardarropa.agregarPrenda(prenda);
  }
}
