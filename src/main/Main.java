package main;

import box.Box;
import box.BoxWeight;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(12, 12, 12);
        BoxWeight boxWeight = new BoxWeight(12, 12, 12, 12);

        box.showVolume();
        boxWeight.showVolume();
        box.showInfo();
        boxWeight.showInfo();
    }
}
