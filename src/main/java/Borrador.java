import org.apache.commons.lang3.Validate;

import java.awt.*;

public class Borrador {
    TipoPrenda tipo;
    Tela tela;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama;

    public Borrador(TipoPrenda tipo) {
        Validate.notNull(tipo,"El tipo de prenda no puede ser nulo");
        this.tipo = tipo;
        this.trama=Trama.LISA;
    }

    public void agregarTela(Tela tela){
        Validate.notNull(tela,"La tela de la prenda no puede ser nulo");
        this.tela=tela;
    }
    public void agregarColorPrincipal(Color colorPrincipal){
        Validate.notNull(colorPrincipal,"El color principal de la prenda no puede ser nulo");
        this.colorPrincipal=colorPrincipal;
    }
    public void agregarColorSecundario(Color colorSecundario){
        this.colorSecundario=colorSecundario;
    }
    public void agregarTrama(Trama trama){
        Validate.notNull(trama,"La trama de la prenda no puede ser nulo");
        this.trama=trama;
    }
    public Prenda crearPrenda(){
        Validate.notNull(tela,"La tela de la prenda no puede ser nulo");
        Validate.notNull(colorPrincipal,"El color principal de la prenda no puede ser nulo");
        return new Prenda(tipo,tela,colorPrincipal,colorSecundario,trama);
    }

}
