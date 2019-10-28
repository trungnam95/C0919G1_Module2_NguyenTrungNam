package Models;

public class House extends Services {
    private String standardRoom;
    private String comfortDescription;
    private String amountFloors;

    public House(String serviceName, double areaUsed, double rentCost, int amountPeople,
                 String standardRoom, String comfortDescription, String amountFloors) {
        super(serviceName, areaUsed, rentCost, amountPeople);
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

//    @Override
//    public String toString() {
//        return
//                super.toString()+
//                "\nstandardRoom='" + standardRoom +
//                "\ncomfortDescription='" + comfortDescription +
//                "\namountFloors='" + amountFloors ;
//    }
    @Override
    public String showInfor() {
        return "\nService name: " + super.getServiceName() +
                "\nArea Used: " + super.getAreaUsed() +
                "\nRent Cost: " + super.getRentCost() +
                "\nAmount People: "+super.getAmountPeople()+
                "\nStandard Room "+standardRoom+
                "\nComfort Description "+comfortDescription+
                "\nAmountFloors:"+amountFloors;
    }
}
