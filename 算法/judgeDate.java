package test.algorithm;

import java.util.Scanner;
/**
 * 2016��9��17�� ����12:32:25
 * @author zhaohe
 *
 */
public class judgeDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, month, day;
	       int days = 0;
	       int dayCount = 0;
	       Scanner sc;
	       boolean isTrue = false;
	       do {
	           isTrue = false;
	           System.out.println("��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿");
	           System.out.print("�����������գ��м��Կո������");
	           sc = new Scanner(System.in);
	           year = sc.nextInt();
	           //System.out.print("�������£�");
	           //sc = new Scanner(System.in);
	           month = sc.nextInt();
	           //System.out.print("�������գ�");
	           //sc = new Scanner(System.in);
	           day = sc.nextInt();
	           // �жϷǷ�����
	           if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > 31) {
	              System.out.println("����������������룡");
	              isTrue = true;
	           }
	       } while(isTrue);
	       for (int i = 0; i < month; i++ ) {
	           switch (i) {
	           case 1:
	           case 3:
	           case 5:
	           case 7:
	           case 8:
	           case 10:
	           case 12:
	              days = 31;
	              break;
	           case 4:
	           case 6:
	           case 9:
	           case 11:
	              days = 30;
	              break;
	           case 2:
	              if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	                  days = 29;
	              } else{
	                  days = 28;
	              }
	              break;
	           }
	           dayCount += days;
	       }
	       System.out.println(year + "��" + month + "��" + day + "������һ��ĵ�"
	               + (dayCount + day) + "�졣");
	}

}
