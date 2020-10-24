import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class coinchange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();
        if(sc.hasNext())
        {
            int v = sc.nextInt();
            int[] deno = {1,2,5,10,20,50,100};
            for(int i = deno.length-1;i>=0;i--)
            {
                while(v>=deno[i])
            {
                v = v - deno[i];
                ans.add(deno[i]);
            }
          
            }
            System.out.print(ans);
            sc.close();
        
        }
    }
}