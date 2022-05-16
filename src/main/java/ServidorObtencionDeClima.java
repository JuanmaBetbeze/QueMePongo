import java.util.List;
import java.util.Map;

public interface ServidorObtencionDeClima {
    List<Map<String, Object>> obtenerCondicionClimaticaBuenosAires();
    List<Map<String, Object>> obtenerCondicionClimatica(String ciudad);
    int obtenerTemperaturaEnGradosCentigrados(String ciudad);
}
