
package HitungFibonacci;
import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) 
    {
        String identitas = "SYERLI TRINADYA / XRPL 2 / 33";
        
        int[] nominal = new int [] {5000, 2000, 1000, 500, 100};
        int uang, i,jumlah, n = nominal.length;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang : ");
        uang = scan.nextInt();
        
        

        for (i = 0;i < n; i++) 
        {
            jumlah = uang/nominal[i];
            uang = uang - (nominal[i]*jumlah);
            
            System.out.println("lembar" +nominal[i] + "=" + jumlah);
        }
    }

    
}
