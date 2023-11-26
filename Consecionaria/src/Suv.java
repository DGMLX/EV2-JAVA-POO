
public class Suv extends Auto{
    private int traccion;
    int total = 0;
    double desct_suv = 0;
    double desct_iva = 0;

    public Suv(int traccion, int numeroChasis, int cilindrada, int precio) {
        super(numeroChasis, cilindrada, precio);
        setTraccion(traccion);
    }

    public Suv() {
    }

    public int getTraccion() {
        return traccion;
    }

    private void setTraccion(int traccion) {
        if(traccion>=2 && traccion<=4 ){
            this.traccion = traccion;
        }else{
            System.out.println("Traccion invalida.");
        }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Suv{");
        sb.append("traccion=").append(traccion);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void obtenerTotalCompra(int cantidad) {
        System.out.println("El precio de " + cantidad + " autos " + this.getClass().getName() +" con numero de chasis "+ this.getNumeroChasis() +" es $" + (cantidad*this.getPrecio()));
        total = (cantidad*this.getPrecio());
    }

    @Override
    public void descontar() {
        System.out.println("Tienes un descuento de: $" + (Math.round(total*DESCUENTO_SUV)) + " sin considerar IVA");
        System.out.println("Tienes un descuento de IVA de $" + (Math.round(total*IVA)));
        desct_iva =(total*IVA);
        desct_suv = (total*DESCUENTO_SUV);
    }

    @Override
    public void obtenerTotalFinal() {
        System.out.println("Total a pagar considerando descuentos : $" + Math.round(total-desct_iva-desct_suv));
    }

    @Override
    public void clasificacionAuto() {
        if(this.getClass().getName().equalsIgnoreCase("Suv")){
            System.out.println(this.getClass().getName() + ": Chasis " +  this.getNumeroChasis() + ", $" + this.getPrecio() + " para motor traccion " + this.getTraccion());
        }else{
            System.out.println("Tipo de auto inválido.");
        }
    }
    
    
}
