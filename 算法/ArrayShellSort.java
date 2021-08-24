package test.algorithm;
/**
 * ʱ�临�Ӷ�����ȡ�á����������еĺ�����Ŀǰû�кܺõ���������nΪ������ʱ��ʱ�临�Ӷ�Ϊn*pow(log2(n),2)
 * @author zhaohe 
 * 2016/10/01
 *
 */
public class ArrayShellSort {
	//ֱ�Ӳ�������InsertSort01�ȼ���InsertSort02
	public static void InsertSort01(int[] a){
		int i,j,temp;
		for(i=1;i<a.length;i++){
			if(a[i]<a[i-1]){
				temp=a[i];//�ݴ浱ǰa[i]
				a[i]=a[i-1];
				j=i-2;
				while(a[i]<a[j]&&j>=0){
					//�ƶ���¼
					a[j+1]=a[j];
					j--;
				}
				a[j]=temp;
				//j<0����a[i]<a[j]����ѭ��
			}
		}
	}
	public static void InsertSort02(int a[],int n)
	{
		int i,j;
		int temp;
		for(i=1;i<n;i++)
		{
			temp=a[i];
			for(j=i-1;j>=0;j--)
			{
				if(temp<a[j])
					a[j+1]=a[j];
				else
					break;
			}
			a[j+1]=temp;
		}
	}
	//ϣ������������ֱ�Ӳ�������Ļ�����
	public static void shellInsert(int[] a,int dk){
		int temp;
		//��a[dk]��ʼ�����κ���֮ǰdkλ�õ�ֵ���в�������
		for(int i=dk;i<a.length;i++){
			if(a[i]<a[i-dk]){
				temp=a[i];
				int j;
				for(j=i-dk;j>=0&&a[j]>temp;j-=dk){
		//j>=0&&a[j]>temp˳���ܵߵ��������˳��ߵ������������Խ��������
		//��Ϊ&&�߼����㣬�����߲������Ͳ���ִ���ұߣ��Ͳ�����j<0���������a[j]Խ��
					a[j+dk]=a[j];
				}
				a[j+dk]=temp;
			}
		}
		
		/*0,1,2,3,4,5,6,7;
		 *dk=4;
		 *  0-4
		 */	
	} 
	public static void shellSort(int[] a,int[] dk){
		//dk[] Ϊ��������,dk.length��ֱ�Ӳ�������
		for(int i=0;i<dk.length;i++){
			shellInsert(a, dk[i]);
		}
	}
	public static void main(String[] args) {
		int[] a=new int[]{-5,3,9,0,9,6};
		int[] b=new int[]{-5,3,9,0,9,6};
		int[] c=new int[]{-5,3,9,0,9,6};
		int[] dk=new int[]{3,1};//n/2
		shellSort(a, dk);
		InsertSort01(b);
		InsertSort02(a,a.length);
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		for(int i=0;i<b.length;i++){
			System.out.println(a[i]);
		}
		for(int i=0;i<c.length;i++){
			System.out.println(a[i]);
		}
	}

}
