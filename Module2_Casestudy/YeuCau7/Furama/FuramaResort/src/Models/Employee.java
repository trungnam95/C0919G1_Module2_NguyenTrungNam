package Models;

public class Employee {
    private String nameEmployee;
    private int ageEmployee;
    private String addressEmployee;
    private int codeEmployee;
    public Employee(String nameEmployee, int ageEmployee, String addressEmployee,int codeEmployee) {
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.addressEmployee = addressEmployee;
        this.codeEmployee=codeEmployee;
    }

    public Employee() {
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }
    public int getcodeEmployee() {
        return codeEmployee;
    }

    public void setCodeEmployee(int codeEmployee) {
        this.codeEmployee = codeEmployee;
    }
    @Override
    public String toString() {
        return
                "\nName Employee: " + nameEmployee +
                "\nAge Employee: " + ageEmployee +
                "\nAddress Employee: " + addressEmployee+
                "\nCode Employee: "+codeEmployee;
    }
}
