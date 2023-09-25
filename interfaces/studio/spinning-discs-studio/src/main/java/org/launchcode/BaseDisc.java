package org.launchcode;

public abstract class BaseDisc {

    private String name;
    private String discType;

    private int spinRate; //RPMs

    public BaseDisc(String name, String discType, int spinRate) {
        this.name = name;
        this.discType = discType;
        this.spinRate = spinRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        String asterisks = "*******";
        return newline + asterisks + " " + asterisks +
                "Disc Type: " + discType + newline +
                "Spin Rate: " + spinRate + "RPM" + newline ;
    }

    void spinDisc () {
        String newline = System.lineSeparator();
    }
}
