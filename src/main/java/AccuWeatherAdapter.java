
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuWeatherAdapter implements ServidorObtencionDeClima {
    AccuWeatherAPI accuWeatherAPI;

    public AccuWeatherAdapter(AccuWeatherAPI accuWeatherAPI) {
        this.accuWeatherAPI = accuWeatherAPI;
    }
    public List<Map<String, Object>> obtenerCondicionClimaticaBuenosAires(){
        return obtenerCondicionClimatica("Buenos Aires, Argentina");
    }
    public List<Map<String, Object>> obtenerCondicionClimatica(String ciudad) {
        return accuWeatherAPI.getWeather(ciudad);
    }
    public int obtenerTemperaturaEnFarenheit(String ciudad){
        List<Map<String, Object>> condicionclimatica=obtenerCondicionClimatica(ciudad);
        HashMap<String, Object> temperatura= (HashMap<String, Object>) condicionclimatica.get(0).get("Temperature");
        return (int) temperatura.get("Value");
    }
    public int obtenerTemperaturaEnGradosCentigrados(String ciudad){
        return obtenerTemperaturaEnFarenheit(ciudad)-32;
    }
}
