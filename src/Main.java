import com.wy.transfer.ArabicToRoman;

public class Main {
//    罗马数字采用七个罗马字母作数字、即Ⅰ（1）、X（10）、C（100）、M（1000）、V（5）、L（50）、D（500）。记数的方法：
//    相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
//    小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
//    小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9；
//    在一个数的上面画一条横线，表示这个数增值 1,000 倍
    public static void main(String[] args) {
        ArabicToRoman atrCal = new ArabicToRoman();
        String ran = ""+((int)(1+Math.random()*(100000)));
        String arabicnum = atrCal.araToRom(ran);
        System.out.println(ran + ":" + arabicnum);
    }
}
