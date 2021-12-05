package com.company;

public class xunhuan_for {
    //输出1-5
//    public static void main(String[] args){
//        for (int i=1;i<=5;i++){
//            System.out.println(i);
//        }
//    }
    //输出5-1
//    public static void main(String[] args){
//        for (int i=5;i>=1;i--){
//            System.out.println(i);
//        }
//    }
    //求1-5的和
//    public static void main(String[] args){
//        int sum = 0;
//        for (int i=1;i<=5;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//    }
    //求偶数和
//    public static void main(String[] args){
//        int sum = 0;
//        for (int i=1;i<=100;i++){
//            if (i%2==0){
//                sum+=i;
//            }
//        }System.out.println(sum);
//    }
    //判断是否是水仙花数
//        public static void main(String[] args){
//        for (int i=100;i<=999;i++){
//            int ge=i%10;
//            int shi=i/10%10;
//            int bai=i/10/10%10;
//            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
//                System.out.println(i);
//            }
//        }
//    }
    //水仙花个数
    public static void main(String[] args){
        int count=0;
        for (int i=100;i<=999;i++){
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/10/10%10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
                count++;
            }
        }System.out.println(count);
    }
}
