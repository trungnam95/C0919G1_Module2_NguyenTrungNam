package Models;

import java.sql.Struct;

public class Customer {
    private String IDCustomer;
    private String nameCustomer;
    private String birthday;
    private String gender;
    private int idCard;
    private int phoneNumber;
    private String emailCustomer;
    private String typeCustomer;
    private String address;

    public Customer(String IDCustomer, String nameCustomer, String birthday, String gender, int idCard,
                    int phoneNumber, String emailCustomer, String typeCustomer, String address) {
        this.IDCustomer = IDCustomer;
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.emailCustomer = emailCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer() {
    }

    public String getIDCustomer() {
        return IDCustomer;
    }

    public void setIDCustomer(String IDCustomer) {
        this.IDCustomer = IDCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String showInforCustomer() {
        return
                "\nIDCustomer: " + IDCustomer +
                "\nnameCustomer: " + nameCustomer +
                "\nbirthday: " + birthday +
                "\n gender: " + gender +
                "\nidCard: " + idCard +
                "\nphoneNumber: " + phoneNumber +
                "\nemailCustomer: " + emailCustomer +
                "\ntypeCustomer: " + typeCustomer +
                "\naddress: " + address ;

    }


}
