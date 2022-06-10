import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Guardarropa>guardarropas=new ArrayList<>();
  List<Prenda>prendasTotales=new ArrayList<>();
  public void agregarPrenda (Prenda prenda){
    prendasTotales.add(prenda);
  }
  public void agregarGuardarropa(Guardarropa guardarropa){
    guardarropas.add(guardarropa);
  }
}
