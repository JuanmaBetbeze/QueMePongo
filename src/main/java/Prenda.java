import java.awt.*;
import org.apache.commons.lang3.Validate;

public class Prenda {
    TipoPrenda tipo;
    Tela tela;
    Color colorPrincipal;
    Color colorSecundario;

    public Prenda(TipoPrenda tipo, Tela tela, Color colorPrincipal, Color colorSecundario) {
        this.tipo = tipo;
        this.tela = tela;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        Validate.notNull(tipo,"El tipo de prenda no puede ser nulo");
        Validate.notNull(tela,"La tela de la prenda no puede ser nulo");
        Validate.notNull(colorPrincipal,"El color principal de la prenda no puede ser nulo");
    }
    
}
