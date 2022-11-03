import java.util.*;

public class OTPgenerator{
	static char[] OTP(int length){
	    
		System.out.print("YourOTP is: ");
		String numbers = "0123456789";
		Random rnad = new Random();
		char[] otp = new char[length];
		for(int i = 0; i < length; i++){
			otp[i] = numbers.charAt(rand.nextInt(otp.length);//.nextInt(array.length);
		}
		return otp;
	}
	public static void main(String[] args){
		int otp_length = 4;
		System.out.println(OTP(otp_length));
	}

}