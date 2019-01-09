package javaSort;

public class HanoTower {
	/*
	 * �ƶ�����
	 * from������ʼ����
	 * inter�����м�����
	 * toĿ������
	 */
	public static void doTower(int n, char from, char inter, char to){
		if(n == 1){
			System.out.println("����1����"+from+"������"+to+"����");
		}else{
			doTower(n-1, from, to, inter);
			System.out.println("����"+n+",��"+from+"������"+to+"����");
			doTower(n-1, inter, from, to);
		}
	}
	public static void main(String[] args) {
		//doTower(3, 'A', 'B', 'C');
		doSecond(3, 'A', 'B', 'C');
	}
	
	
	public static void doSecond(int topN, char from, char middle, char to){
		if(topN == 1){
			System.out.println("����1����"+from+"�����ƶ���"+to+"����");
		}else{
			doSecond(topN-1,from,to,middle);
			System.out.println("����"+topN+"��"+from+"�������ƶ���"+to+"����");
			doSecond(topN-1,middle, from, to);
		}
	}


}

/*
����1����A������C����     	
����2,��A������B����
����1����C������B����
����3,��A������C����
����1����B������A����
����2,��B������C����
����1����A������C����
*/

/*
 * ����1����A�����ƶ���C����
����2��A�������ƶ���B����
����1����C�����ƶ���B����
����3��A�������ƶ���C����
����1����B�����ƶ���A����
����2��B�������ƶ���C����
����1����A�����ƶ���C����

 */
