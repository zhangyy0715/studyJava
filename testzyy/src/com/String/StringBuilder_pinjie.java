package com.String;

public class StringBuilder_pinjie {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = pinjieString(arr);
        System.out.println("shuchu:" + s);
    }

    public static String pinjieString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
