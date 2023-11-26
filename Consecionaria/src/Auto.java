
public abstract class Auto implements ImpuestosYDescuentos {
    protected int numeroChasis,cilindrada,precio;

    public Auto(int numeroChasis, int cilindrada, int precio) {
        this.numeroChasis = numeroChasis;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    public Auto() {
    }

    public int getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public abstract void clasificacionAuto();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto{");
        sb.append("numeroChasis=").append(numeroChasis);
        sb.append(", cilindrada=").append(cilindrada);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
