import java.util.Scanner;

public class Lab {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();


    
        
        System.out.println(max3(num1, num2, num3));
        System.out.println (min3(num1, num2, num3));
        System.out.println(middle3(num1, num2, num3));

        
        




        
    }
    public static int max3(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }
        else if (num2 > num3 && num2 > num1){
            return num2;

    }
        else{
            return num3;
        }



    

    
        
    }

    public static int min3(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            return num1;
        }
        else if (num2 < num3 && num2 < num1){
            return num2;


    }
        else{
            return num3; 
    }
        

}

    public static int middle3(int num1, int num2, int num3){
        
        int middle = max3(num1, num2, num3) - min3(num1, num2, num3);
          
        return middle;

        
    }

    public static void xor (boolean a, boolean b){
        

        

        }
    }





