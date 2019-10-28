package Models;

import org.omg.CORBA.StringHolder;

public class Room extends Services {
    private String serviceFree;

    public Room(String serviceName, double areaUsed, double rentCost, int amountPeople,
                TypeRent typeRent, String serviceFree) {
        super(serviceName, areaUsed, rentCost, amountPeople, typeRent);
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

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +super.toString()+
                '}';
    }
}
