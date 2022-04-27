public abstract class UniformesArmados {

    protected abstract Prenda obtenerPrendaSuperior();

    protected abstract Prenda obtenerPrendaInferior();

    protected abstract Prenda obtenerCalzado();
    public Uniforme crearUniforme(){
        return new Uniforme(this.obtenerPrendaSuperior(),this.obtenerPrendaInferior(),this.obtenerCalzado());
    }
}
