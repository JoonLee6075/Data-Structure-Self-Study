    import java.util.Scanner;

    public class ConnectingDigits {
        //https://www.acmicpc.net/problem/1748


        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int num = Integer.parseInt(sc.nextLine());
            int temp = num;
            int count = 0;
            int answer = 0;

            if(num < 10){
                for(int i = 0; i < num; i++){
                    answer++;
                    

                }
                System.out.print(answer);
            }
            if(num <= 99 && num > 10){
                for(int i = 10; i <= num; i++){
                    answer+= 2;
                    

                }
                System.out.print(answer + 9);
            }
            if(num > 99){
            while(temp > 0){
                
                temp = temp / 10;
                count++;
            }
            int highNum = (int)Math.pow(10, count - 1);
            answer = ((num - highNum + 1 ) * count);
        

            for(int i = count - 1; i > 0; i--){
                
                if(i == 1){
                    answer += 9;
                }
                else{
                answer += (9 * (int)Math.pow(10 , i- 1) ) * i;
                System.out.println(answer);
                }
            }
                
            System.out.println(answer);

            }
        
        }



        
        
    }

