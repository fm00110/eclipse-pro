import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Test {

	public static void sort(int[] num){
		for(int i=0;i<num.length;i++){
			for(int j=i;j<num.length;j++){
				if(num[i]>num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int s : num){
			System.out.print(s);
			System.out.println('\t');
		}
	}
	public static void main(String[] args) {
		int[] num = {5,2,8,6,4};
		Test.sort(num);
	}
	

}
