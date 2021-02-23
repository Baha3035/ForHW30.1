package kg.megacom;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> volumesOfCylinder = new ArrayList<>();

        try {
            volumesOfCylinder.add(volumeOfCylinder(3, 11));
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }
        try {
            volumesOfCylinder.add(volumeOfCylinder(-6, 11));
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }
        try {
            volumesOfCylinder.add(volumeOfCylinder(11, 11));
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }
        try {
            volumesOfCylinder.add(volumeOfCylinder(-5, 11));
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }
        try {
            volumesOfCylinder.add(volumeOfCylinder(22, 11));
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }
    }
    public static int volumeOfCylinder(int radius, int height) throws NegativeValueException{
        if (radius < 0){
            System.err.println("Radius is negative: " + radius);
            throw new NegativeValueException("Parameters of cylinder can't be negative");
        }else if (height < 0){
            System.err.println("Height is negative: " + height);
            throw new NegativeValueException("Parameters of cylinder can't be negative");
        }
    return height * radius;
    }
}
