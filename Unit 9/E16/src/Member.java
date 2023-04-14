import java.util.Date;

public abstract class Member extends Person{
    private Date joiningDate;

    public Member(String dni, String name, int age, String address, Date joiningDate) {
        super(dni, name, age, address);
        this.joiningDate = joiningDate;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public abstract void discountBonusApply();
}
