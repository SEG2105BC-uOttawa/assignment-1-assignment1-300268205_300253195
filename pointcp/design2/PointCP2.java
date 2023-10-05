package design2;


public class PointCP2 {
        private double xOrRho; // r
        private double yOrTheta;  // θ in radians    
        public PointCP2(double xOrRho, double xOrTheta) {
            this.xOrRho = xOrRho;
            this.yOrTheta = xOrTheta;
        }
    
        public double getRho()
        {
            return Math.cos(Math.toRadians(yOrTheta));

        }
  
        
        
  
  public double getTheta()
  {

    return Math.sin(Math.toRadians(yOrTheta));

  }

  public double setRho(){
      return xOrRho;
  }
  public double setTheta(){
      return yOrTheta;
  }
    
    
        @Override
        public String toString() {
            return "PolarCoordinate{radius=" + getRho() + ", angle=" + getTheta() + '}';
        }

        public void convertStorageToCartesian() {
          if (xOrRho < 0) {
              xOrRho = (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
              yOrTheta = Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
          }
        }
}
