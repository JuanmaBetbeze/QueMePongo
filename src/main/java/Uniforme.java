import org.apache.commons.lang3.Validate;

public class Uniforme {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;


    public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
        validarCategoriaPrenda(prendaInferior,Categoria.INFERIOR);
        validarCategoriaPrenda(prendaSuperior,Categoria.SUPERIOR);
        validarCategoriaPrenda(calzado,Categoria.CALZADO);
        this.prendaSuperior = prendaSuperior;
        this.prendaInferior = prendaInferior;
        this.calzado = calzado;
    }
    public void validarCategoriaPrenda(Prenda prenda,Categoria categoriaPrenda){
        Validate.isTrue(prenda.getTipo().getCategoria()==categoriaPrenda,"La categoria de la prenda debe ser " + categoriaPrenda);
    }
}
