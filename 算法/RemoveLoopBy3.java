package test.algorithm;
/**
 * ��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������������3�����˳�Ȧ�ӣ�
 * ��������µ���ԭ���ڼ��ŵ���λ��
 * @author zhaohe
 *2016��9��30�� ����4:57:53
 */
public class RemoveLoopBy3 {
	public void loopBy3(int n){
		boolean[] isRemoved=new boolean[n];
		//��ʼ������ʼʱ����Ȧ��
		for(int i=0;i<isRemoved.length;i++){
			isRemoved[i]=false;
		}
		int startCall=0;//��ǰλ��
		int count=0;//��¼���Ĵ�����
		int removeNum=0;//��¼��Ȧ�ĸ�����
		
		while(removeNum<n){
			if(!isRemoved[startCall]){
				count++;
			}
			startCall++;
			startCall=startCall%n;
			//��������&&(!isRemoved[startCall])�����٣�����������ȷ��������������
			if(count==2&&(!isRemoved[startCall])){
				isRemoved[startCall]=true;
				System.out.println("��"+(startCall)+"��Ȧ��");
				count=0;
				removeNum++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveLoopBy3 rl=new RemoveLoopBy3();
		rl.loopBy3(1);
		System.out.println("\n");
		rl.loopBy3(2);
		System.out.println("\n");
		rl.loopBy3(3);
		System.out.println("\n");
		rl.loopBy3(8);
		System.out.println("\n");
		rl.loopBy3(9);
		System.out.println("\n");
		rl.loopBy3(10);
	}

}
