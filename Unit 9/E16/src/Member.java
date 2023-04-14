import java.time.LocalDate;
import java.util.Date;

public abstract class Member extends Person{
    private LocalDate joiningDate;

    public Member(String dni, String name, int age, String address) {
        super(dni, name, age, address);
        this.joiningDate = LocalDate.of(1111,11,11);
    }

    public Member(String dni, String name, int age, String address, LocalDate joiningDate) {
        super(dni, name, age, address);
        this.joiningDate = joiningDate;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public abstract void discountBonusApply();
}
