public enum TipoPrenda {
    ZAPATO(Categoria.CALZADO),CAMISA(Categoria.SUPERIOR),PANTALON(Categoria.INFERIOR);
    Categoria categoria;

    TipoPrenda(Categoria categoria) {
        this.categoria = categoria;
    }
}
