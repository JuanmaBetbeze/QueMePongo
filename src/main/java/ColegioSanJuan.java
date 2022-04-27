import java.awt.*;

public class ColegioSanJuan extends UniformesArmados {

    @Override
    protected Prenda obtenerPrendaSuperior() {
        Borrador borrador= new Borrador(TipoPrenda.CHOMBA);
        borrador.agregarTela(Tela.PIQUE);
        borrador.agregarColorPrincipal(Color.GREEN);
        return borrador.crearPrenda();
    }

    @Override
    protected Prenda obtenerPrendaInferior() {
        Borrador borrador= new Borrador(TipoPrenda.PANTALON);
        borrador.agregarTela(Tela.ACETATO);
        borrador.agregarColorPrincipal(Color.GRAY);
        return borrador.crearPrenda();
    }

    @Override
    protected Prenda obtenerCalzado() {
        Borrador borrador= new Borrador(TipoPrenda.ZAPATILLA);
        borrador.agregarTela(Tela.CUERO);
        borrador.agregarColorPrincipal(Color.WHITE);
        return borrador.crearPrenda();
    }
}
