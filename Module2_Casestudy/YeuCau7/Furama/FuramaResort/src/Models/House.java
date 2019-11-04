package Models;

public class House extends Services {
    private String standardRoom;
    private String comfortDescription;
    private int amountFloors;

    public House(String serviceName, double areaUsed, double rentCost, int amountPeople, String typeRent, String ID,
                 String standardRoom, String comfortDescription, int amountFloors) {
        super(serviceName, areaUsed, rentCost, amountPeople, typeRent, ID);
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

    public int getAmountFloors() {
        return amountFloors;
    }

    public void setAmountFloors(int amountFloors) {
        this.amountFloors = amountFloors;
    }

    @Override
    public String showInfor() {
        return "\nService name: " + super.getServiceName() +
                "\nArea Used: " + super.getAreaUsed() +
                "\nRent Cost: " + super.getRentCost() +
                "\nAmount People: "+super.getAmountPeople()+
                "\nType Rent: "+super.getTypeRent()+
                "\nID: "+super.getID()+
                "\nStandard Room "+standardRoom+
                "\nComfort Description "+comfortDescription+
                "\nAmountFloors: "+amountFloors;

    }
}
