package alumnos;

/**
 *
 * @author cdiaz
 */
public class AlumnoConstructor {

    String nombre = "";
    int numeroDeLista = 0;
    String cuenta = "";
    float[] calificaciones = new float[6];

    public AlumnoConstructor(String nombre, int numeroDeLista, String cuenta, float calificaciones[]) {
        /*Assigment*/
        
        this.nombre = nombre;
        this.numeroDeLista = numeroDeLista;
        this.cuenta = cuenta;
        this.calificaciones = calificaciones;

    };
    
     /*declare get and setters*/
    /*getters*/
   public String getNombre() {
        return nombre;
    };
   public int getNumeroDeLista(){
       return numeroDeLista;
   };
   public String getCuenta(){
       return cuenta;
   };
   public float[] getCalificaciones(){
       return calificaciones;
   };
   /*setters*/
   public void setNombre(String nombre){
       this.nombre=nombre;
   };
   public void setNumeroDeLista(int numeroDeLista){
       this.numeroDeLista=numeroDeLista;
   };
   public void setCuenta(String cuenta){
       this.cuenta=cuenta;
   }
   public void setCalificaciones(float calificaciones[]){
       this.calificaciones=calificaciones;
   }
}
