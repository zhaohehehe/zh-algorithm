package test.algorithm;

import java.util.Random;
/**
 * ����62Ϊ���룬Ȼ����Random��������±�
 * @author zhaohe
 *
 *2016��8��11�� ����10:41:29
 */
public class RandomPassword {
	public String getPasswordList(){
		String password=new String();
		char bWord='A';
		char sWord='a';
		char nWord='0';
		for(int i=0;i<62;i++){
			if(i<26){
				password+=bWord;
				bWord++;
			}
			else if(i<52){
				password+=sWord;
				sWord++;
			}
			else{
				password+=nWord;
				nWord++;
			}
			System.out.println(password.charAt(i));
		}
		System.out.println(password);
		return password;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomPassword rp=new RandomPassword();
		String passwordPattern=rp.getPasswordList();
		String pwd=new String();
		Random r=new Random();
		for(int i=0;i<6;i++){
			int position=r.nextInt(62);
			pwd+=passwordPattern.charAt(position);
		}
		System.out.println(pwd);
		
	}

}