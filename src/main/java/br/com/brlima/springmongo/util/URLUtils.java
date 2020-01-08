package br.com.brlima.springmongo.util;

import java.net.URLDecoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class URLUtils {

    public static String decodeParam(String param) {
        try {
            return URLDecoder.decode(param, "UTF-8");
        } catch (Exception e) {
            return "";
        }
    }

    public static LocalDate toLocalDate(String dateStr, LocalDate defaultValue) {
        try {
            return LocalDate.from(DateTimeFormatter.ofPattern("yyyy-MM-dd").parse(dateStr));
        } catch (Exception e) {
            return defaultValue;
        }
    }
}