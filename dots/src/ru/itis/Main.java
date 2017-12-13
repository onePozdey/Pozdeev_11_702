package ru.itis;

public class Main {

    public static void main(String[] args) {
        Space space = new Space();
        space.addDot(new Dots(1,1));
        space.addDot(new Dots(2,4));
        space.addDot(new Dots(4,6));
        space.addDot(new Dots(8,8));
        space.addDot(new Dots(4,5));
        space.addDot(new Dots(6,6));
        space.addDot(new Dots(8,6));
        space.addDot(new Dots(4,1));
        space.addDot(new Dots(5,2));
        space.addDot(new Dots(6,4));
        space.addDot(new Dots(8,5));
        space.addDot(new Dots(6,1));
        space.addDot(new Dots(8,3));
        space.addLine(new Line());
        space.addLine(new Line());
        space.addLine(new Line());
        space.addLine(new Line());
        space.addLine(new Line());
        space.addLine(new Line());
        space.printDots();

        for (int i = space.getSize() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (space.getDots()[j].getX() > space.getDots()[j+1].getX()) {
                    Dots t = space.getDots()[j];
                    space.getDots()[j] = space.getDots()[j+1];
                    space.getDots()[j+1] = t;
                }
            }
        }
        for (int i = space.getSize() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((space.getDots()[i].getX() == space.getDots()[j].getX()) && (space.getDots()[i].getY() < space.getDots()[j].getY())) {
                    Dots t = space.getDots()[j];
                    space.getDots()[j] = space.getDots()[j+1];
                    space.getDots()[j+1] = t;
                }
            }
        }

//        do{
//            space.addLine(new Line());
//            for(int i = 0; i < space.getSize(); i++) {
//
//            }
//        } while(space.getSize() > 0);
        space.getLines()[0].addDot(space.getDots()[0]);
        while(space.getSize() > 0) {
            for(int i = 0; i < space.getSize2(); i++) {
                for (int j = 1; j < space.getSize(); j++) {
                    if((space.getLines()[i].getLine()[j - 1].getX() <= space.getLines()[i].getLine()[j].getX()) && ((space.getLines()[i].getLine()[j - 1].getY() <= space.getLines()[i].getLine()[j].getY()))) {
                        space.getLines()[i].addDot(space.getDots()[j]);
                    }
                }
            }
        }
        System.out.println("------------------------");
        space.printDots();

        System.out.println("------------------------");
        space.printLines();

    }
}
