package design2;

public class PointCP2Test {
    
    public static void main(String[] args) {
        PointCP2 point = new PointCP2(1, 2);
        System.out.println(point);
        point.setRho();
        point.setTheta();
        System.out.println(point);
    }
    
}
