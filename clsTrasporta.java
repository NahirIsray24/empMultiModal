
package empmultimodal;

public class clsTrasporta extends clsPersona{
    private String documentacion ;
    private String materiaPrima ;
    private String equipos ;
  
    
    public clsTrasporta ( String nombre, String apellido, int edad,String documentacion,String materiaPrima, String equipos){
    super(nombre, apellido, edad);
    this.documentacion= documentacion;
    this.materiaPrima= materiaPrima;
    this.equipos= equipos;
   
    }
    public clsTrasporta( String nombre, String apellido, int edad){
     super(nombre, apellido, edad);
    };
    
    public void setDocumentacion(String documentacion){
     this.documentacion = documentacion ;
    }
    public String getDocumentacion(){
      return documentacion;
    }
    
    public void setMateriaPrima(String materiaPrima){
     this.materiaPrima = materiaPrima ;
    }
    public String getMateriaPrima(){
      return materiaPrima;
    }
    
    public void setEquipos(String equipos ){
     this.equipos= equipos ;
    }
    public String getEquipos(){
      return equipos ;
    }
    
     public void mostrarDatos(){
    System.out.print("\nNOMBRE:"+getNombre()+"\nAPELLIDO:"+getApellido()+"\nEDAD:"+getEdad()+"\nDOCUMENTACION:"+getDocumentacion()+"\nMATERIA PRIMA:"+getMateriaPrima()+"\nEQUIPO:"+getEquipos());
    }
}
   


