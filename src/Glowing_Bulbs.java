import java.util.*;
public class Glowing_Bulbs {

	public static void main(String args[] ) throws Exception {
               Scanner s = new Scanner(System.in);
        long T = Long.parseLong(s.nextLine());
 
        while((T--) > 0){
            String switches = s.nextLine();
            
            long k = Long.parseLong(s.nextLine());
            long ans = solve(switches, k);
            System.out.println(ans);
        }
    }
    
    public static long solve(String switches, long k){
        ArrayList<Integer> turnedOnSwitches = new ArrayList<>();
        long firstSwitch = -1;
        for(int i=0;i<switches.length();i++){
            if(switches.charAt(i) == '1'){
                if(firstSwitch == -1)
                    firstSwitch = i+1;
                turnedOnSwitches.add(i+1);
            }
        }
        
        long sol = 0;
        long l = 1, r=firstSwitch*k;
        
        while(l<=r){
            long mid = (l+r)/2;
            long ans = getMul(mid, turnedOnSwitches);
            if(ans < k)
                l = mid+1;
            else{
                r = mid-1;
                sol = mid;
            }
        }
        return sol;
    }
    
    public static long getMul(long x, ArrayList<Integer> primes){
        long ans = 0;
        for(long i=1;i<(1<<primes.size());i++){
            long p=1;
            long sign = -1;
            for(int j=0;j<primes.size();j++){
                if(((i >> j) & 1) == 1){
                    p*=primes.get(j);
                    sign *= -1;
                }
            }
            
            ans += (x/p)*sign;
        }
        return ans;
    }
}