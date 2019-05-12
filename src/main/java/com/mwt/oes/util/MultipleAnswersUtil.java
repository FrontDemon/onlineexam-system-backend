package com.mwt.oes.util;

import java.util.Arrays;

public class MultipleAnswersUtil {
    public static String ASCIISort(String str) {
        char[] test = new char[str.length()];
        StringBuilder sb = new StringBuilder();
        while (true) {
            String a = str;//直接读取这行当中的字符串。
            for (int i = 0; i < str.length(); i++) {
                test[i] = a.charAt(i);//字符串处理每次读取一位。
            }
            Arrays.sort(test);
            for (int i = 0; i < test.length; i++) {
                sb.append(test[i]);
            }
            String trim = sb.toString().trim();
            return trim;
        }
    }
}
