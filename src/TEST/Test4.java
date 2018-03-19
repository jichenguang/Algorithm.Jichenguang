package TEST;

import java.io.*;

public class Test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			char tmp;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			for (; ; ) {
			System.out.print(">");
			String line = in.readLine();
			StringBuffer buf = new StringBuffer(line);
			for (int i = 0; i < buf.length() / 2; i++)
			{
			char c = buf.charAt(i);
			char d = buf.charAt(buf.length() - 1 - i);
			tmp = c;
			buf.setCharAt(i, d);
			buf.setCharAt(buf.length() - 1 - i, tmp);
			}
			if (buf.toString().equals("quit"))
					{
						break;
					}
			System.out.println(buf);
			}
			
	}

}
