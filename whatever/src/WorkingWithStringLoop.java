
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "ningsuree";
        System.out.println(name.substring(0, 1));
        for (int i = 0; i < name.length(); i++) {
        
            System.out.println(name.substring(0,1));     
        }
            while (name.length()>0) {
                System.out.println(name.substring(0, 1));
                name = name.substring(1);
                
                
                
            }
    }

}
