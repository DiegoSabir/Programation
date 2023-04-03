public class Area {
    private String idArea;
    private String nombreEspecialiad;

    public Area(){
        this.idArea = "areaDefecto";
        this.nombreEspecialiad = "especialidadDefecto";
    }

    public Area(String idArea, String nombreEspecialiad) {
        this.idArea = idArea;
        this.nombreEspecialiad = nombreEspecialiad;
    }

    public String getIdArea() {
        return idArea;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public String getNombreEspecialiad() {
        return nombreEspecialiad;
    }

    public void setNombreEspecialiad(String nombreEspecialiad) {
        this.nombreEspecialiad = nombreEspecialiad;
    }

    @Override
    public String toString() {
        return "Area{" +
                "idArea='" + idArea + '\'' +
                ", nombreEspecialiad='" + nombreEspecialiad + '\'' +
                '}';
    }
}