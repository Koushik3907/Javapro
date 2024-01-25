package extra;

import java.io.*;
import java.util.*;

public class Captcha {
	public static void main(String[] args)  throws IOException{
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the number of digit of captcha to be printed");
		
		int n = (int)(Math.random()*5)+3;
		//(math.random()*5)+3 is used to generate in specific range
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String sam =genratecaptcha(n);
    System.out.println(sam);
    System.out.println("Enter the above captcha");
    String user_captcha=br.readLine();
    if(checkcaptcha(user_captcha, sam)) {
    	System.out.println("Captcha Matched ");
    }
    else {
    	System.out.println("Captcha Not Matched");
    }
	}
	static String genratecaptcha(int n) {
		String cap="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random(62);
		String captcha="";
		while(n-->0) {
			int index = (int)(Math.random()*62);
			captcha+=cap.charAt(index);
		}
		return captcha;
	}
	
	static boolean checkcaptcha (String chap, String  name) {
		return chap.equals(name);
	}
}
