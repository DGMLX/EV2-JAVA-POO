
import java.util.ArrayList;


public class RegistroAuto {
    ArrayList<Auto> listaAutos;
    ArrayList<Auto> listaEliminado;

    public RegistroAuto() {
        listaAutos = new ArrayList<>();
        listaEliminado = new ArrayList<>();
    }
    
    public void agregar(Auto auto){
        if(validarChasis(auto.getNumeroChasis())){
            System.out.println("ERROR. Auto ya existe.");
        }else{
            System.out.println("Auto agregado");
            listaAutos.add(auto);
        }
    }
    
    public boolean validarChasis(int chasis){
        boolean existe = false;
        for(Auto i : listaAutos){
            if(i.getNumeroChasis() == chasis){
                existe = true;
            }
        }
        return existe;
    }
    
    public void listar(){
        for(Auto i : listaAutos){
            System.out.println(i.toString());
        }
    }
    
    public void eliminarAuto(Auto auto){
        for(Auto i : listaAutos){
            if(i.getNumeroChasis() == auto.getNumeroChasis()){
                listaEliminado.add(i);
            }
        }
        System.out.println("Auto eliminado");
        listaAutos.removeAll(listaEliminado);
    }
    
    public void obtenerAutosCaros(){
        int cantidad = 0;
        for(Auto i : listaAutos){
            if(i.getPrecio()>10000000){
                cantidad = cantidad +1;
            }
        }
        System.out.println("Cantidad de autos caros :" + cantidad);
        
    }
    
    
}
