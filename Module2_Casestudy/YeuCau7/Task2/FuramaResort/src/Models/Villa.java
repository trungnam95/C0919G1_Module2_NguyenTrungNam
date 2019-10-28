package Models;

public class Villa extends House {
    private float poolArea;

    public Villa(String serviceName, double areaUsed, double rentCost, int amountPeople,
                 String standardRoom, String comfortDescription, String amountFloors, float poolArea) {
        super(serviceName, areaUsed, rentCost, amountPeople, standardRoom, comfortDescription, amountFloors);
        this.poolArea = poolArea;
    }

    public Villa() {
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }


    public String showInfor() {
        return
                "\nserviceName='" + super.getServiceName() +
                        "\nareaUsed=" + super.getAreaUsed() +
                        "\nrentCost=" + super.getRentCost() +
                        "\namountPeople=" + super.getAmountPeople() +
                        "\nstandardRoom='" + super.getStandardRoom() +
                        "\ncomfortDescription='" + super.getComfortDescription() +
                        "\namountFloors='" + super.getAmountFloors()+
                        "\npoolarea:" + this.poolArea;

    }
}
