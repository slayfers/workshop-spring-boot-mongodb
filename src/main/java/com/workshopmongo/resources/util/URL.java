package com.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

	public static String decodeParam(String text, String enc) {
		try {
			return URLDecoder.decode(text, enc);
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}
