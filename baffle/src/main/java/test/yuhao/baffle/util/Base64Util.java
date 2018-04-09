package test.yuhao.baffle.util;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {

	public static byte[] decodeBase64(byte[] bytes) {
		return Base64.decodeBase64(bytes);
	}

	public static String encodeBase64String(byte[] densByte) {

		return new String(Base64.encodeBase64(densByte));
	}

	public static byte[] decodeBase64(String encodeBase64String) {
		return Base64.decodeBase64(encodeBase64String.getBytes());
	}

}
