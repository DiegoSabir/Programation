public class Area {
    private int idArea;
    private String nombreArea;

    public Area() {
        this.idArea = 0;
        this.nombreArea = "DefectoNombreArea";
    }

    public Area(int idArea, String nombreArea) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }
}
