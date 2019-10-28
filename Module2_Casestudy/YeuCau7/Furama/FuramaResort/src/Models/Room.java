package Models;

import org.omg.CORBA.StringHolder;

public class Room extends Services {
    private String serviceFree;

    public Room(String serviceName, double areaUsed, double rentCost, int amountPeople,
                 String serviceFree) {
        super(serviceName, areaUsed, rentCost, amountPeople);
        this.serviceFree = serviceFree;
    }

    public Room() {
    }


    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

//    @Override
//    public String toString() {
//        return "Room{" +
//                "serviceFree='" + serviceFree + '\'' +super.toString()+
//                '}';
//    }

    @Override
    public String showInfor() {
        return    "\nService name: " + super.getServiceName() +
                "\nArea Used: " + super.getAreaUsed() +
                "\nRent Cost: " + super.getRentCost() +
                "\nAmount People: "+super.getAmountPeople()+
                "\nService free:"+serviceFree;
    }
}
