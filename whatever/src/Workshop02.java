class Space3D {
    private  static final int EXPONET_TWO = 2;
    
    double การคำนวนระยะทางระหว่างจุด (Point3D startPoint,Point3D endPoint) {
        double x = Math.pow((startPoint.x-endPoint.x),EXPONET_TWO);
        double y = Math.pow((startPoint.y-endPoint.y),EXPONET_TWO);
        double z = Math.pow((startPoint.z-endPoint.z),EXPONET_TWO);
        double distance = Math.sqrt(x + y + z);
        
        return distance;
    }
}
class Point3D{
    
    public Point3D(int x, int y, int z) {
       
        this.x = x;
        this.y = y;
        this.z = z;
    }
    int x;
    int y;
    int z;
    
}



public class Workshop02 {
    
    

    public static void main(String[] args) {
        int  x1 = 2 , x2= 0;
        int  y1 = 1,  y2= 0;
        int  z1 = 3,  z2= 6;
        Space3D space3d = new Space3D();
        Point3D startPoint = new Point3D(2,1,3);
        Point3D endPoint  = new Point3D(0,0,6);
     
        double distance=space3d.การคำนวนระยะทางระหว่างจุด(startPoint , endPoint);
              
        System.out.print(distance);

    }

}


