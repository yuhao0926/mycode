package test.yuhao.baffle.util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class DesUtil {
	public static final String ALGORITHM_3DES = "DESede";
	private String algorithm = "";
	private byte[] key = null;
	
	public DesUtil(byte[] bytes, String algorithm3des) {
		key = bytes;
		algorithm = algorithm3des;
	}

	

	public byte[] encrpt(byte[] bytes, String algorithm3des) {
		byte[] ret = null;
		try {
			SecretKey deskey = new SecretKeySpec(key, algorithm);
			Cipher c1 = Cipher.getInstance(algorithm);
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			ret = c1.doFinal(bytes);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ret;
	}
}
