public enum TipoPrenda {
    ZAPATO(Categoria.CALZADO),
    CAMISA(Categoria.SUPERIOR),
    PANTALON(Categoria.INFERIOR),
    CHOMBA(Categoria.SUPERIOR),
    ZAPATILLA(Categoria.CALZADO);

    final Categoria categoria;
    TipoPrenda(Categoria categoria) {
        this.categoria = categoria;
    }
    public Categoria getCategoria() {
        return categoria;
    }
}
