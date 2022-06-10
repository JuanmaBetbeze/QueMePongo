import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
  String criterio;
  List<Prenda> prendas;
  List<Propuesta>propuestasAceptadas;
  List<Propuesta>propuestasRechzadas;
  public Guardarropa (String criterio) {
    this.criterio = criterio;
    this.prendas=new ArrayList<>();
    this.propuestasAceptadas=new ArrayList<>();
    this.propuestasRechzadas=new ArrayList<>();
  }
  public void agregarPrenda(Prenda prenda){
    prendas.add(prenda);
  }
  public void quitarPrenda(Prenda prenda){
    prendas.remove(prenda);
  }
  public void aceptarPropuesta(Propuesta propuesta){
    propuesta.aceptar();
    propuestasAceptadas.add(propuesta);
  }
  public void rechazarPropuesta(Propuesta propuesta){
    propuestasRechzadas.add(propuesta);
  }
  public void deshacerPropuesta(Propuesta propuesta){
    verificarPropuesta(propuesta);
    propuesta.deshacer();
    propuestasAceptadas.remove(propuesta);
  }
  public void verificarPropuesta(Propuesta propuesta){
    if(!propuestasAceptadas.contains(propuesta)){
      throw new RuntimeException("La propuesta no se encontraba aceptada");
    }
  }
}
