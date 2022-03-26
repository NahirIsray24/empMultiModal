
package empmultimodal;

public abstract class clsVehiculos {
    private String marca ;
    private String modelo ;
    private String tipoMotor ;
    private int ruedas ;
    
    public clsVehiculos (String marca,String modelo, String tipoMotor,int ruedas){
    this.marca= marca;
    this.modelo= modelo;
    this.tipoMotor= tipoMotor;
    this.ruedas= ruedas;
    }
    public clsVehiculos(){};
    
    public void setMarca(String marcar){
     this.marca = marca ;
    }
    public String getMarca(){
      return marca;
    }
    
    public void setModelo(String modelo){
     this.modelo = modelo ;
    }
    public String getModelo(){
      return modelo;
    }
    
    public void setTipoMotor(String tipoMotor ){
     this.tipoMotor= tipoMotor ;
    }
    public String getTipoMotor(){
      return tipoMotor ;
    }
    
    public void setRuedas(int ruedas){
     this.ruedas= ruedas ;
    }
    public int getRuedas(){
      return ruedas ;
    }
    public abstract void tipoVehiculo();
    public abstract void inicioRecorrido();//metodo abstracto para la clase auto, camion que comienza a entregar paquete 
    public abstract void entregaPaquete();
    public abstract void finRecorrido();
    
    
}
