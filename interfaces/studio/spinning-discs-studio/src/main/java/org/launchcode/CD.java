package org.launchcode;

// TODO: Implement your custom interface.

import java.util.List;

// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.
public class CD extends BaseDisc implements OpticalDisc {

    private String artist;
    public CD(String name, int capacity, String artist) {
        super(name, capacity);
        this.artist = artist;
    }

//    public CD(String name, int capacity, List<String> content) {
//        super(name, capacity, content);
//    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at 200-500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Let's Rock!");
    }

    public void playSong(){
        System.out.println("Playing song by " + artist);
    }
}
