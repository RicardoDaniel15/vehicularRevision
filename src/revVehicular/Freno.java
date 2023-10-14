package revVehicular;

public class Freno {
    private int estadoFreno;

    public Freno() {
        this.estadoFreno = 0;
    }

    public int getEstadoFreno() {
        return estadoFreno;
    }

    public void setEstadoFreno(int estadoFreno) {
        if(estadoFreno>= 0 && estadoFreno<=5){
            this.estadoFreno = estadoFreno;
        }else {
            this.estadoFreno = 0;
        }
    }

    @Override
    public String toString() {
            return String.format("Estado Freno: %s",this.estadoFreno);
    }
}
