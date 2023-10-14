package revVehicular;

public class Revision {
    private Vehiculo vehiculo;
    private String resultadoRevision;
    private int totalRevision;

    public Revision(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.resultadoRevision = "";
        this.totalRevision = 0;
        darResuldadoRevision();
    }

    public void darResuldadoRevision(){
        int estadoFreno = vehiculo.getFreno().getEstadoFreno();
        int estadoLlanta = vehiculo.getLlanta().getEstadoLlanta();
        int estadoMotor = vehiculo.getMotor().getEstadoMotor();
        int estadoTransmision = vehiculo.getTransmision().getEstadoTransmision();
        int kitEmergencia = 0;
        if(vehiculo.isKitEmergencia()){
            kitEmergencia = 3;
        }
        totalRevision = estadoFreno+estadoLlanta+estadoMotor+estadoTransmision+kitEmergencia;

        // Evaluacion
        if(totalRevision==23){
            this.resultadoRevision = "Perfecto";
        } else if (totalRevision>=16 && totalRevision<23) {
            this.resultadoRevision = "Aprobado";
        } else if (totalRevision>=10 && totalRevision<16) {
            this.resultadoRevision = "Rechazado";
        }else {
            this.resultadoRevision = "Demolicion";
        }
    }

    public String getResultadoRevision() {
        return resultadoRevision;
    }

    public int getTotalRevision() {
        return totalRevision;
    }
}
