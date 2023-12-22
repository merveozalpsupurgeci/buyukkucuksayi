import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int min=0, max=0, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int again = input.nextInt();

        for(int count =1;count<=again;count++){
            
            System.out.print(count + ". Sayıyı giriniz: ");
            number = input.nextInt();

            if (count == 1){
                max = number;
                min = number;
            }
            else{
                if(number < min){
                    min = number;
                }
                else if(number > max){
                    max = number;
                }
            }

        }
        System.out.println("Girilen en küçük sayı: " + min);
        System.out.println("Girilen en büyük sayı: " + max);
    }
}
