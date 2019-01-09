package 排序;

public class HanoTower {

	public static void doTower(int topN, char from, char middle, char to){
		if(topN == 1){
			System.out.println("������"+topN+"��"+from+"�������ƶ���"+to+"����");
		} else{
			doTower(topN-1,from,to,middle);
			System.out.println("������"+topN+"��"+from+"�������ƶ���"+to+"����");
			doTower(topN-1,middle,from,to);
		}
	}
	
	public static void main(String[] args) {
		doTower(3,'A','B','C');
	}
}
