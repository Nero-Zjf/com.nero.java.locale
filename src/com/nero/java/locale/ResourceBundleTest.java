package com.nero.java.locale;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 测试ResourceBundle通过加载资源文件来实现国际化
 */
public class ResourceBundleTest {

    public static void main(String[] args) {
        // write your code here
        Locale localeEn = new Locale("en", "US");
        Locale localeZh = new Locale("zh", "CN");

        //getBundle方法第一个参数 baseName需要输入的是资源文件的package路径 + 文件前缀。
        ResourceBundle rbZh = ResourceBundle.getBundle("com.nero.java.locale.msg", localeZh);
        ResourceBundle rbEn = ResourceBundle.getBundle("com.nero.java.locale.msg", localeEn);

        System.out.println("us-US:" + rbEn.getString("hello"));
        System.out.println("us-US:" + rbEn.getString("welcome"));
//        System.out.println("us-US:" + String.format(rbEn.getString("time"), "08:00"));
        System.out.println("zh-CN：" + rbZh.getString("hello"));
        System.out.println("zh-CN：" + rbZh.getString("welcome"));
//        System.out.println("zh-CN：" + String.format(rbZh.getString("time"), "08:00"));


    }
}
