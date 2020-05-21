package com.nero.java.locale;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 使用NumberFormat和Locale进行数字格式化
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        double num = 123456.78;
        System.out.println("51423.45 Format:");
        System.out.println(String.format("%s : %s", locale.toString(), format.format(num)));
    }
}
