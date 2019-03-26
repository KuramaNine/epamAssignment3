import java.util.*;
import static java.util.stream.Collectors.*;
public class Help_Out_The_Indian_Army {

	public static void main(String args[] ) throws Exception {
        int i,checkpoints;
        long sum=0;
        Scanner scan=new Scanner(System.in);
        checkpoints=scan.nextInt();
        long min_defend[]=new long[checkpoints+2];
        long max_defend[]=new long[checkpoints+2];
        min_defend[0]=scan.nextLong();
        min_defend[1]=scan.nextLong();
        max_defend[0]=min_defend[0];
        max_defend[1]=min_defend[1];
        for(i=2;i<checkpoints+2;i++)
        {
            long position=scan.nextLong();
            long army=scan.nextLong();
            if((min_defend[0]<=position+army)&&(max_defend[1]>=position-army)){
                min_defend[i]=position-army;
                max_defend[i]=position+army;
            }
            else if(min_defend[0]>position+army){
                min_defend[i]=min_defend[0];
                max_defend[i]=min_defend[0];
            }
            else{
                min_defend[i]=min_defend[1];
                max_defend[i]=min_defend[1];
                }
        }
        Arrays.sort(min_defend);
        Arrays.sort(max_defend);
        for(i=1;i<min_defend.length;i++){
            if(min_defend[i]-max_defend[i-1]>0)
                sum+=min_defend[i]-max_defend[i-1];}
          System.out.print(sum);
    } 

}
