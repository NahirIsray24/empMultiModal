package empmultimodal;
/**
 @author Isray nahir
 */
public class EmpMultimodal {
    public static void main(String[] args) {
       clsTrasporta objTransporta= new clsTrasporta("juan","perez",21,"carnet","madera","equipoA");
       System.out.println("\n--- Muestra todos los datos del conductor que tranporte ---\n");
       objTransporta.mostrarDatos();
       
       clsCamion objCamion= new clsCamion("chevrolet","NPR ","4HK1",6 );
       System.out.println("\n--- Muestra todos los datos del vehiculo ---\n");
       objCamion.tipoVehiculo();
       objCamion.mostrarDatos();
       objCamion.inicioRecorrido();
       objCamion.entregaPaquete();
       objCamion.finRecorrido();
       
       
    }
    
}
