package Models;

public class House extends Services {
    private String standardRoom;
    private String comfortDescription;
    private String amountFloors;

    public House(String serviceName, double areaUsed, double rentCost, int amountPeople, TypeRent typeRent,
                 String standardRoom, String comfortDescription, String amountFloors) {
        super(serviceName, areaUsed, rentCost, amountPeople, typeRent);
        this.standardRoom = standardRoom;
        this.comfortDescription = comfortDescription;
        this.amountFloors = amountFloors;
    }

    public House() {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getComfortDescription() {
        return comfortDescription;
    }

    public void setComfortDescription(String comfortDescription) {
        this.comfortDescription = comfortDescription;
    }

    public String getAmountFloors() {
        return amountFloors;
    }

    public void setAmountFloors(String amountFloors) {
        this.amountFloors = amountFloors;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "\nstandardRoom='" + standardRoom +
                "\ncomfortDescription='" + comfortDescription +
                "\namountFloors='" + amountFloors ;
    }
}
