package test.algorithm;

import java.util.Scanner;
/**
 * ͳ����ĸ�����֡��ո�ȵĸ���
 * @author zhaohe
 *2016/09/10
 */
public class ComputeCharacterNum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ַ�����");
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int HNum=0;
		int ZNum=0;
		int ENum=0;
		String pattern="[\u4e00-\u9fa5]";//Unicode���ַ�Χ
		String pattern2="[a-zA-Z]";
		//char[] arrChar=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(str.substring(i, i+1).matches(pattern)){
				HNum++;
			}
			else if(str.substring(i, i+1).matches(pattern2)){
				ZNum++;
			}
			else{
				ENum++;
			}
		}
		System.out.println("���ֵĸ���:"+HNum);
		System.out.println("��ĸ�ĸ���:"+ZNum);
		System.out.println("�����ַ��ĸ���:"+ENum);
	}

}
