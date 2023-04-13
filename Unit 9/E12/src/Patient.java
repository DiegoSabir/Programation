import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Patient extends Person {
    private Date admissionDate;
    private String disease;
    private HashMap<Integer, Admission> admissionHistory;

    public Patient(String dni, String name, int age, String address, Date admissionDate, String disease) {
        super(dni, name, age, address);
        this.admissionDate = admissionDate;
        this.disease = disease;
        this.admissionHistory = new HashMap<>();
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public HashMap<Integer, Admission> getAdmissionHistory() {
        return admissionHistory;
    }

    public void setAdmissionHistory(HashMap<Integer, Admission> admissionHistory) {
        this.admissionHistory = admissionHistory;
    }

    /**
     * METHODS
     */

    public void addAdmission(Integer admissionId, Admission admissionData){
        this.admissionHistory.put(admissionId, admissionData);
    }

    @Override
    public double calculateCost() {
        Iterator it = admissionHistory.keySet().iterator();
        Admission adm;
        double partialCost, totalCost = 0;

        while(it.hasNext()){
            Integer codigo = (Integer) it.next();
            adm = this.admissionHistory.get(codigo);

            //Resta de fechas
            long tiempoTranscurrido = adm.getDischargeDate().getTime() - adm.getAdmissionDate().getTime();

            //Señalar en que rango de valores trabajos(años, dias, meses, ...)
            TimeUnit timeValue = TimeUnit.DAYS;
            long days = timeValue.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);

            //Calcular los costes
            partialCost = days * 700;
            if (adm.getAdmissionArea().getAreaName().equalsIgnoreCase("Orthopedics")){
                partialCost *=1.02;
            }
            totalCost += partialCost;
        }
        return totalCost;
    }
}