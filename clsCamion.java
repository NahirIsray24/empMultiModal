
package empmultimodal;

public class clsCamion extends clsVehiculos{
    
    public clsCamion (String marca,String modelo, String tipoMotor,int ruedas){
    super( marca, modelo,  tipoMotor, ruedas);
    }
    @Override
    
    public void tipoVehiculo(){
        System.out.println("TIPO DE VEHICULO: CAMION");
    }
    @Override
    
    public void inicioRecorrido(){
        System.out.println("\nEl camion acaba de iniciar el recorrido");
    }
   
      @Override
     public  void entregaPaquete(){
        System.out.println("El camion acaba de entegar el paquete");
        }
     
      @Override
     public  void finRecorrido(){
        System.out.println("El camion acaba de finalizar el recorrido el recorrido");
        }
     
           public void mostrarDatos(){
    System.out.print("\nMARCA DE VEHICULO:"+getMarca()+"\nMODELO:"+getModelo()+"\nTIPO DE MOTOR:"+getTipoMotor()+"\nCANTIDAD DE RUEDAS:"+getRuedas());
    }
}
