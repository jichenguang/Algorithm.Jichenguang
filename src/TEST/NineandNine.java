package TEST;

public class NineandNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        for(int i=1;i<=9;i++) {
		            for(int j=1;j<=i;j++) {
		                System.out.print(i+"×"+j+"="+i*j+"\t");// \t 跳到下一个TAB位置
		            }
		            System.out.println();
		        }			
	}
}
