package design3;


public class PointCP3 {
        private double x; // x-coordinate
        private double y; // y-coordinate
    
        public PointCP3(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
    

        public double getX() {
            return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
        
            }
        
         
        
            public double getY() {
                return Math.toDegrees(Math.atan2(y, x));
            }
        
  
    
        @Override
        public String toString() {
            return "CartesianCoordinate{x=" + getX() + ", y=" + getY() + '}';
        }

        public void convertStorageToPolar() {
          if (x < 0) {
              double temp = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
              y = Math.toDegrees(Math.atan2(y,x ));
              x = temp;
          }
        }
}
