

public class Sedan extends Auto{
    private String versionSedan;
    int total = 0;
    double desct_sed = 0;
    double desct_iva = 0;

    public Sedan(String versionSedan, int numeroChasis, int cilindrada, int precio) {
        super(numeroChasis, cilindrada, precio);
        setVersionSedan(versionSedan);
    }

    public Sedan() {
    }

    public String getVersionSedan() {
        return versionSedan;
    }

    private void setVersionSedan(String versionSedan) {
        if(versionSedan.equalsIgnoreCase("A") || versionSedan.equalsIgnoreCase("B") || versionSedan.equalsIgnoreCase("C")){
            this.versionSedan = versionSedan;
        }else{
            System.out.println("Version de sedan inválida.");
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
        sb.append("Sedan{");
        sb.append("versionSedan=").append(versionSedan);
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
        System.out.println("Tienes un descuento de: $" + Math.round(total*DESCUENTO_SEDAN)+ " sin considerar IVA");
        System.out.println("Tienes un descuento de IVA de $" + Math.round(total*IVA));
        desct_iva =(total*IVA);
        desct_sed = (total*DESCUENTO_SEDAN);
    }

    @Override
    public void obtenerTotalFinal() {
        System.out.println("Total a pagar considerando descuentos : $" + Math.round(total-desct_iva-desct_sed));
    }

    @Override
    public void clasificacionAuto() {
        if(this.getClass().getName().equalsIgnoreCase("Sedan")){
            System.out.println(this.getClass().getName() + ": Chasis " +  this.getNumeroChasis() + ", $" + this.getPrecio() + " version " + this.getVersionSedan());
        }else{
            System.out.println("Tipo de auto inválido.");
        }
    }
    
    
    

    
    
    
}

