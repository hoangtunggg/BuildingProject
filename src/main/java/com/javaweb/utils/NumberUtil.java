package com.javaweb.utils;

public class NumberUtil {
	public static boolean isNumber(String value) {
		try {
			Long tmp = Long.parseLong(value);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}
}
