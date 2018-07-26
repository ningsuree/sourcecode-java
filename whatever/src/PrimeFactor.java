
public class PrimeFactor {

    public String of(int number) {
        /*
         * 4 => 22
         * 4%2 == 0 -> 2
         * 42 => 2
         * 2%2 = 0 -> 2
        */
        String result = "";
        if(number%2 == 0) {
            result = result + 2;
            number = number/2;   
        }
        if (number%2 == 0) {
            result = result + 2;
            number =number/2;     
        }
        
        
        
        
        return "2";
    }

    
    
    
}
