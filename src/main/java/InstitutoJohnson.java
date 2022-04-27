import java.awt.*;

public class InstitutoJohnson extends UniformesArmados{
    @Override
    protected Prenda obtenerPrendaSuperior() {
        Borrador borrador= new Borrador(TipoPrenda.CAMISA);
        borrador.agregarTela(Tela.ALGODON);
        borrador.agregarColorPrincipal(Color.WHITE);
        return borrador.crearPrenda();
    }

    @Override
    protected Prenda obtenerPrendaInferior() {
        Borrador borrador= new Borrador(TipoPrenda.PANTALON);
        borrador.agregarTela(Tela.ACETATO);
        borrador.agregarColorPrincipal(Color.BLACK);
        return borrador.crearPrenda();
    }

    @Override
    protected Prenda obtenerCalzado() {
        Borrador borrador= new Borrador(TipoPrenda.ZAPATO);
        borrador.agregarTela(Tela.CUERO);
        borrador.agregarColorPrincipal(Color.BLACK);
        return borrador.crearPrenda();
    }
}
