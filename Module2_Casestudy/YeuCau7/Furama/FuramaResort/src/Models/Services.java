package Models;

public abstract class Services {
    private String serviceName;
    private double areaUsed;
    private double rentCost;
    private int amountPeople;
    private String typeRent;
    private String ID;

    public Services(String serviceName, double areaUsed, double rentCost, int amountPeople,String typeRent,String ID) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentCost = rentCost;
        this.amountPeople = amountPeople;
        this.typeRent = typeRent;
        this.ID=ID;
    }

    public Services() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent( String typeRent) {
        this.typeRent = typeRent;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    //    @Override
//    public String toString() {
//        return
//                "\nserviceName='" + serviceName +
//                        "\nareaUsed=" + areaUsed +
//                        "\nrentCost=" + rentCost +
//                        "\namountPeople=" + amountPeople ;
//    }

    abstract String showInfor();
}
