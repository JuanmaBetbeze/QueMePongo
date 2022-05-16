import org.apache.commons.lang3.Validate;
import java.util.Collections;
import java.util.List;

public class GeneradorDeSugerenciasDeAtuendos {
    ServidorObtencionDeClima servidor;
    public GeneradorDeSugerenciasDeAtuendos(ServidorObtencionDeClima servidor) {
        this.servidor = servidor;
    }
    public Atuendo generarSugerencias( List <Prenda> prendas) {
        int temperaturaActual=servidor.obtenerTemperaturaEnGradosCentigrados("Buenos Aires, Argentina");
        Prenda prendaSuperior= obtenerPrenda(prendas,Categoria.SUPERIOR,temperaturaActual);
        Prenda prendaInferior= obtenerPrenda(prendas,Categoria.INFERIOR,temperaturaActual);
        Prenda accesorio= obtenerPrenda(prendas,Categoria.ACCESORIO,temperaturaActual);
        Prenda calzado= obtenerPrenda(prendas,Categoria.CALZADO,temperaturaActual);
        return new Atuendo(prendaSuperior,prendaInferior,accesorio,calzado);
    }
    public Prenda obtenerPrenda(List<Prenda> prendas,Categoria categoria, int temperatura){
        Collections.shuffle(prendas);
        Prenda prendaObtenida=prendas.stream().filter(prenda -> prenda.getTipo().getCategoria()==categoria && prenda.getTipo().getTemperaturaMaxima()>temperatura).findAny().orElse(null);
        Validate.notNull(prendaObtenida,"No hay prendas que coincidan con la categoría "+ categoria);
        return prendaObtenida;
    }
}
