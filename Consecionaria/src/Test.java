
public class Test {
    public static void main(String[] args) {
        RegistroAuto registro = new RegistroAuto();
        Sedan sedan1 = new Sedan("B", 321, 4000, 20000000);
        Suv suv1 = new Suv(2, 444, 2000, 50000000);

        
        System.out.println("*** INFO SUV ***");
        suv1.obtenerTotalCompra(2);
        suv1.descontar();
        suv1.obtenerTotalFinal();

        System.out.println("------");
        
        registro.agregar(sedan1);
        registro.agregar(suv1);
        
        System.out.println("------");
        
        registro.listar();
        
        System.out.println("------");
        
        registro.obtenerAutosCaros();
        System.out.println("------");
        
        
        registro.eliminarAuto(suv1);
        System.out.println("------");
        
        registro.listar();
        
        
        
    }
}
