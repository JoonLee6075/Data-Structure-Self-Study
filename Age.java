import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Throwable;
import java.lang.Exception;
//authors: Eli Sun, Peng Guo, Joon Lee
public class Age {

    public static class AgeOutOfRangeException extends Exception { 
        public AgeOutOfRangeException(String errorMessage) {
            super(errorMessage);
        }
    }
    public static class MultipleInputException extends Exception { 
        public MultipleInputException(String errorMessage) {
            super(errorMessage);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int num = -1;
        System.out.println("Enter your age (a positive integer): ");
        try 
		{ 
            num = in.nextInt();
            if(in.findInLine(" ")!=null){
                throw new MultipleInputException("test");
            }
            if(num>120){
                throw new AgeOutOfRangeException("test");
            }else if(num<0){
                throw new AgeOutOfRangeException("test");
            } 
            
		}  
		catch (InputMismatchException e)  
		{ 
			System.out.println("Input is not an integer.");
            System.exit(0);
		}
        catch(AgeOutOfRangeException a){
            System.out.println("Age is out of range");
            System.exit(0);
        }
        catch(MultipleInputException m){
            System.out.println("Too many inputs");
            System.exit(0);
        }
        in.nextLine();
        String name = "";
        try{
            System.out.println("Enter your name: "); 
            name = in.nextLine();
            for(int i=0;i<name.length();i++){
                if(Character.isDigit(name.charAt(i))){
                    throw new InputMismatchException("wrong");
                }
            }

        }
        catch(InputMismatchException e){
            System.out.println("Invalid Name");
            System.exit(0);
        }
        
        System.out.println(name + " is  " + num + " years old." );
        in.close();
        }
        
}

/*
Problems:
For ages:
group1: (1,2: int out of range)  -->>> FIXED
group2: (3,4: input not int)    -->>> FIXED
group3: (5: multiple input) 
group4: (5: clear input before entering name)  -->>> FIXED
1. int too small
2. int too large
3. number in enlish not int
4. input is float not int
5. multiple int input
For name:
1. name has number in it
*/