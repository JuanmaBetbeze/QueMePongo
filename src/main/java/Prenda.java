import java.awt.*;

public class Prenda {
    TipoPrenda tipo;
    Tela tela;
    Color colorPrincipal;
    Color colorSecundario;

    Trama trama;

    public Prenda(TipoPrenda tipo, Tela tela, Color colorPrincipal, Color colorSecundario,Trama trama) {
        this.tipo = tipo;
        this.tela = tela;
        this.trama=trama;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }
    public TipoPrenda getTipo() {
        return tipo;
    }
    
}
