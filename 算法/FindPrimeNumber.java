package test.algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import test.exception.MyFirstException;

/**
 * �ж�101-200֮���ж��ٸ��������������������
 * �������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ����������������������������֮��������
 * @author zhaohe
 *2016��8��14�� ����11:38:30
 */
public class FindPrimeNumber{
	public List<Integer> SearchPrime(int from,int to) throws Exception{
		List<Integer> list=new ArrayList<Integer>();
		if((to-from)<0){
			throw new MyFirstException("�������ڱ�������");
		}
		try{
			for(int i=0;i<(to-from+1);i++){
				if(isPrime(from+i)){
					list.add(Integer.valueOf(from+i));
				}
			}
		}catch(MyFirstException e){
			e.printStackTrace();
			e.getMessage();
		}
		return list;
	}
	public boolean isPrime(int current) throws Exception{
		if(current<=0){
			throw new MyFirstException("��������С�ڻ����0��");
		}
		if(current==1){
			throw new MyFirstException("1�Ȳ�������Ҳ���Ǻ�����");
		}
		for(int i=2;i<=Math.sqrt(current);i++){
			if((current%i)==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		FindPrimeNumber fp=new FindPrimeNumber();
		System.out.println("������from:\t");
		int from=0;
		int to=0;
		if(in.hasNext()){
			from=in.nextInt();
		}
		System.out.println("������to:\t");
		if(in.hasNext()){
			to=in.nextInt();
		}
		System.out.println(from+"��"+to+"֮��������:");
		try {
			List<Integer> list=fp.SearchPrime(from, to);
			Iterator<Integer> it=list.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.exit(1);
		}

	}
}
