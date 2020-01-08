package br.com.brlima.springmongo.util;

import java.net.URLDecoder;

public class URLUtils {

    public static String decodeParam(String param) {
        try {
            return URLDecoder.decode(param, "UTF-8");
        } catch (Exception e) {
            return "";
        }
    }
}