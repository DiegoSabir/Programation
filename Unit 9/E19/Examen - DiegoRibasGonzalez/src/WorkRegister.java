import java.util.Date;

public class WorkRegister {
    private Section section;
    private Date beginingDate;
    private Date endingDate;

    public WorkRegister(Section section, Date beginingDate, Date endingDate) {
        this.section = section;
        this.beginingDate = beginingDate;
        this.endingDate = endingDate;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Date getBeginingDate() {
        return beginingDate;
    }

    public void setBeginingDate(Date beginingDate) {
        this.beginingDate = beginingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }
}
