package com.pactera.parseDemo.util;

/**
 * 
 ************类说明**************
 * 类名：ByteUtil
 * 建类时间：2018年9月21日 下午2:31:50
 * 类描述：字节工具类
 */
public class ByteUtil {

	 private static final char[] DIGITS =
         { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static String toBinaryString(final byte b)
	{
	return toUnsignedString(b, 1);
	}
	
	public static String toHexString(final byte b)
	{
	return toUnsignedString(b, 4);
	}
	
	/**
	* Convert the integer to an unsigned number.
	*/
	private static String toUnsignedString(final byte b, final int shift)
	{
	int i = b & 0xFF;
	final char[] buf = new char[8];
	int charPos = 8;
	final int radix = 1 << shift;
	final int mask = radix - 1;
	
	do
	{
	buf[--charPos] = DIGITS[i & mask];
	i >>>= shift;
	} while (i != 0);
	
	while ((8 - charPos) < (8 / shift))
	{
	buf[--charPos] = DIGITS[0];
	}
	
	return new String(buf, charPos, (8 - charPos));
	}
	
	private ByteUtil()
	{
	}
		
	}
