package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private String filmGenre;
//    create constructor
    public DVD(String name, int capacity, String filmGenre) {
        super(name, capacity);
        this.filmGenre = filmGenre;
    }
//    implement methods (shared but different)
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at 570-1600 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Playing film.");
    }
    public void playVideo() {
        System.out.println("Playing a " + filmGenre + " film.");
    }
}
