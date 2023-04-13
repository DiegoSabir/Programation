import java.util.Date;

public class Admission {
    private Date admissionDate;
    private Date dischargeDate;
    private Area admissionArea;

    public Admission(Date admissionDate, Date dischargeDate, Area admissionArea) {
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.admissionArea = admissionArea;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public Area getAdmissionArea() {
        return admissionArea;
    }

    public void setAdmissionArea(Area admissionArea) {
        this.admissionArea = admissionArea;
    }
}