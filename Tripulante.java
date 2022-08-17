
package reto3;

public class Tripulante extends UsuarioMoodle{
    private double[] calificaciones;
    private boolean[] entregas;
    
    //Constructor

    public Tripulante(int n, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.calificaciones=new double[n];
        this.entregas=new boolean[n];    
    }
    
    //Método
    public void resolverReto(int retoAEntregar){
        for(int i=0; i<this.calificaciones.length; i++){
            this.calificaciones[retoAEntregar]=1;
        }
        for(int i=0; i<this.calificaciones.length; i++){
            if(this.calificaciones[i]==1.0){
                this.entregas[i]=true;
            }
        }
        
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean[] getEntregas() {
        return entregas;
    }

    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
    
    
    
    
    
}