package design5;

public abstract class PointCP5 {

    protected double x;
    protected double y;

    public PointCP5(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Other abstract methods common to Design 2 and Design 3 can be added here

}

class PointCP2 extends PointCP5 {

    public PointCP2(double xOrRho, double xOrTheta) {
        super(xOrRho, xOrTheta);
    }
    // Design 2 specific implementations can be added here
}

class PointCP3 extends PointCP5 {

    public PointCP3(double x, double y) {
        super(x, y);
    }
    // Design 3 specific implementations can be added here
}