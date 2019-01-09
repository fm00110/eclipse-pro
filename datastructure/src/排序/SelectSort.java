package 排序;
/*
 * ѡ������
 * ��ѡ������Ļ���˼�룺�������飺int[] arr={����n������}����1�������ڴ���������arr[1]~arr[n]��ѡ����С����
 * �ݣ�������arrr[1]��������2�ˣ��ڴ���������arr[2]~arr[n]��ѡ����С�����ݣ�������r[2]�������Դ����ƣ���i���ڴ�������
 * ��arr[i]~arr[n]��ѡ����С�����ݣ�������r[i]������ֱ��ȫ��������ɡ�
 */
public class SelectSort {
	/*
	 * �������ʱѡ����������ķ���ʱ�Լ�д��
	 */
	public void sort(int[] arr){
		//kΪ��Сֵ���ڵĽڵ��±�
		int k = 0;
		int temp;
		for(int i = 0;i<arr.length-1;i++){
			k=i;
			for(int j = i;j<arr.length;j++){  //jΪ��ǰֵ���±꣬�����ǰֵ��k��ֵС���ͽ���
				if(arr[j] < arr[k]){
					k = j;    //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
				}
			}
			 //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
	/*
	 * �����ַ��������Ĵ���̫��
	 */
	public void sort1(int[] arr){
		//kΪ��Сֵ���ڵĽڵ��±�
		int k = 0;
		int temp;
		for(int i = 0;i<arr.length;i++){
			k=i;
			for(int j = i;j<arr.length;j++){
				if(arr[j] < arr[k]){  //jΪ��ǰֵ���±꣬�����ǰֵ��k��ֵ�±�С���ͽ���
					temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
				}
			}
			/*temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;*/
		}
	}
	
	public static void main(String[] args) {
		SelectSort ss= new SelectSort();
		int[] arr = {3,6,7,5,15,17,9,4};
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		ss.sort1(arr);
		//ss.sort1(arr);
		for(int i = 0;i<arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort2(int[] arr) {
		int k = 0;
		int temp;
		for(int i = 0;i<arr.length;i++) {
			k = i;
			for(int j = i;j<arr.length;j++) {
				if(arr[j] < arr[k]) {
					k=j;
				}
			}
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
}
