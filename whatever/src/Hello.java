import org.omg.CORBA.PRIVATE_MEMBER;

public class Hello {

    public static void main(String... args) {

        /*
         * int i=1; Integer i2 = new Integer(i); int i3 = i2 ; i2 = Integer.valueOf(i);
         * System.out.println(i2.MIN_VALUE); System.out.println(i2.MAX_VALUE);
         * System.out.println(i3);
         */
    Hello hello = new Hello();
     hello.say(100);
    }
      private static final int NUMBER_TWO = 2;
      public static int index=1;
      private int number = 3 ;
      
     private void say(int number) {
        int index = 0;
        System.out.println(index);
        System.out.println(this.index); 
        System.out.println(Hello.index);
        System.out.println(number);
        System.out.println(this.number);
        System.out.println(NUMBER_TWO);
       
        
        
        
  

    }

}