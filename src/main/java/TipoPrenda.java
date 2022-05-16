public enum TipoPrenda {
    ZAPATO(Categoria.CALZADO,28),
    CAMISA(Categoria.SUPERIOR,35),
    PANTALON(Categoria.INFERIOR,25),
    CHOMBA(Categoria.SUPERIOR,38),
    ZAPATILLA(Categoria.CALZADO,40);

    final Categoria categoria;
    final int temperaturaMaxima;
    TipoPrenda(Categoria categoria,int temperaturaMaxima) {
        this.categoria = categoria;
        this.temperaturaMaxima=temperaturaMaxima;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public int getTemperaturaMaxima(){return temperaturaMaxima;}
}
