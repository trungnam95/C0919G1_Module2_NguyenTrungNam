package Models;

import org.omg.CORBA.StringHolder;

public class Room extends Services {
    private String serviceFree;

    public Room(String serviceName, double areaUsed, double rentCost, int amountPeople, String typeRent, String ID,
                String serviceFree) {
        super(serviceName, areaUsed, rentCost, amountPeople, typeRent, ID);
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

    public String showInfor() {
        return  "\nService name: " + super.getServiceName() +
                "\nArea Used: " + super.getAreaUsed() +
                "\nRent Cost: " + super.getRentCost() +
                "\nAmount People: "+super.getAmountPeople()+
                "\nType Rent: "+super.getTypeRent()+
                "\nID: "+super.getID()+
                "\nService free:"+serviceFree;
    }
}
