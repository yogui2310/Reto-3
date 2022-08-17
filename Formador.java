
package reto3;

public class Formador extends UsuarioMoodle{
    private String escalafon;

    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }

    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }
    
    public void calificar(Tripulante tripulanteACalificar, int k){
        for(int i=0; i<tripulanteACalificar.getCalificaciones().length; i++){
            if(tripulanteACalificar.getEntregas()[k]){
                tripulanteACalificar.getCalificaciones()[k]=5;
            }
            if(tripulanteACalificar.getCalificaciones()[i]!=5.0){
                tripulanteACalificar.getCalificaciones()[i]=0;
            }
        }
    }
    
}
