package test.algorithm;

import java.util.Scanner;

/**
 * ˮ�ɻ�����ָһ�� n λ�� ( n��3 )������ÿ��λ�ϵ����ֵ� n ����֮�͵��������������磺1^3 + 5^3+ 3^3 = 153��
 * �ж��Ƿ���ˮ�ɻ���
 * @author zhaohe
 * 2016��9��30�� ����5:41:45
 *
 */
public class IsShuiXianHua {
	public int sumByOrder(int current){
		int yushu=current%10;
		int shang=current/10;
		if(shang==0){
			return current;
		}
		//4321=1+10*2+10*10*3+10*10*10*10*4
		//4321=1+10(2+10(3+10*4))
		return (yushu+10*(sumByOrder(shang)));
	}
	public int ShuiXianHua(int current,int num,int finalData){//�ݹ鵽sumλ��������sumλ����ʼsum=final����finalData�����ʼ���ֵ�λ��
		int yushu=(int) (current/(Math.pow(10, num-1)));//���λ����
		if(num==1){
			return (int) Math.pow(current,finalData);
		}
		return (int)Math.pow(yushu, finalData)+ShuiXianHua((int) (current%(Math.pow(10, num-1))),num-1,finalData);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsShuiXianHua fs=new IsShuiXianHua();
		int sum=fs.sumByOrder(167);
		System.out.println(sum);
		if(153==fs.ShuiXianHua(153, 3, 3)){
			System.out.println("153��ˮ�ɻ���");
		}
		if(1234==fs.ShuiXianHua(1234, 3, 3)){
			System.out.println("153��ˮ�ɻ���");
		}
	}
//4321=1+10*2+10*10*3+10*10*10*10*4
//4321=1+10(2+10(3+10*4))
}
