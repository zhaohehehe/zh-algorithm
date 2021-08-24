package test.algorithm;

import java.util.Scanner;

import test.exception.MyFirstException;

/**
 * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ������ĸ��º�ÿ��������һ�����ӣ��������Ӷ��� ������ÿ���µ���������Ϊ���٣�
 * ʱ�临�Ӷ�ΪO(2^n);
 * 
 * @author zhaohe 2016��8��13�� ����7:02:22
 *         �����Ƿ�returnλ�����ģ����ս�������finally������д������λ����ò�д������
 */
public class FibonacciSequence_O2n {
	public int fiboImpl(int month) throws Exception {
		if (month <= 0) {
			throw new MyFirstException("�·�С�ڻ����0��");
		}
		if (month == 1 || month == 2) {
			return 1;
		}
		return fiboImpl(month - 1) + fiboImpl(month - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		FibonacciSequence_O2n fs = new FibonacciSequence_O2n();
		int number = 0;
		int month = 0;
		if (in.hasNext()) {
			try {
				// in.nextInt(int radix);�����ǽ�������Ĭ��ʮ����
				month = in.nextInt();
				number = fs.fiboImpl(month);
				// �׳��쳣��"(���1)"����ִ��
				// System.out.println("��"+month+"���µ�������"+number+"�ԣ�"+"(���1)");
				return;
				// ��return�����û���쳣��"(���3)"��ִ��
				// ��return��������쳣��"(���1)"��ִ��
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				// �����Ƿ��׳��쳣��finally"(���2)"����ִ��
				System.out.println("��" + month + "���µ�������" + number + "�ԣ�" + "(���2)");
			}
			// �����Ƿ��׳��쳣��"(���3)"����ִ��
			// System.out.println("��"+month+"���µ�������"+number+"�ԣ�"+"(���3)");
		}

	}

}
