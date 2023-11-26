


public interface ImpuestosYDescuentos {
    static final float IVA = 0.19f;
    static final float DESCUENTO_SUV = 0.1f;
    static final float DESCUENTO_SEDAN = 0.05f;
    
    public abstract void obtenerTotalCompra(int cantidad);
    public abstract void descontar();
    public abstract void obtenerTotalFinal();



}
