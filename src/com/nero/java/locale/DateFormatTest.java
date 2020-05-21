package com.nero.java.locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 使用DateFormat和Locale进行日期格式化
 */
public class DateFormatTest {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("zh", "CN"));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("en", "US"));
        System.out.println(df.format(date));
        System.out.println(df2.format(date));
    }
}
