import java.util.*;

public class Rod_Cutting_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int test=sc.nextInt();
for(int i=0;i<test;i++) {
int n=sc.nextInt();
int specialRods=0;
int specialRodLength=3;
while(specialRodLength<=n) {
	specialRods++;
	specialRodLength=specialRodLength*2+1;
}
System.out.println(specialRods);
	}

}}