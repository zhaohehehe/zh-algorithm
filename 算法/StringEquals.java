package test.algorithm;
/**
 * String�Ƕ����ַ���/������ÿ�ζ���Ҫ���´�������
 * StringBuilder�ǿɱ䳤�ȵ��ַ������ַ����ġ�+������һ�㶼��ͨ��StringBuilderִ�С�
 * @author zhaohe
 *
 */
/**
 * ���ж��ַ������ʱ�����˫�����Ǳ�������equals()�����������ǣ���Ҳ������"=="
 * ʹ��equals()ʱ��˫��������null��������������ֿ�ָ�����
 * @author zhaohe
 * 2016��8��17�� ����10:46:06
 *
 */
public class StringEquals {
	public void Test(){
		String pwdPattern="123";
		String pwdPattern2="123";
		String pwdlist=new String("12");//��������
		String pwdlist1="12";//����
		final String pwdlist2="3";//����
		String pwdlist3=pwdlist+"3";//����StringBuilder
		String pwdlist4=pwdlist1+"3";//����StringBuilder
		String pwdlist5=pwdlist+pwdlist1;
		String pwdlist6=pwdlist+pwdlist2;
		/*ֻ������final+"string"ʱ������Ҫ����StringBuilder*/
		String pwdlist7="12"+pwdlist2;//����Ҫ����StringBuilder
		String pwdlist8=pwdlist1+pwdlist2;//����StringBuilder
		
		System.out.println(pwdPattern==pwdPattern2);//��ʵ��һ������
		System.out.println(pwdlist3==pwdPattern);//f
		System.out.println(pwdlist4==pwdPattern);//f?
		System.out.println(pwdlist5==pwdPattern);//f
		System.out.println(pwdlist6==pwdPattern);//f
		System.out.println(pwdlist7==pwdPattern);//T
		System.out.println(pwdlist8==pwdPattern);//f
		
		System.out.println(pwdlist3==pwdlist4);//f
		System.out.println(pwdlist3.equals(pwdlist4));//T
		System.out.println(pwdlist7==pwdlist4);//f
		System.out.println(pwdlist2=="3");//T
		System.out.println(pwdlist2==new String("3"));//f
		System.out.println(pwdlist1=="12");//T
		System.out.println(pwdlist=="12");//f
		System.out.println(pwdlist.equals("12"));//T
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringEquals rp=new StringEquals();
		rp.Test();
	}
}
