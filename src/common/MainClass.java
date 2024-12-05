package common;

import java.util.Base64;
import java.util.Date;

public class MainClass {
    {
        System.out.println("init block!");
    }

    static {
        System.out.println("static block!");
    }

    public static void main(String[] args) {

        /*int n = 9;
        //int[] a = {10,1,2,8,4,5};
        List<Integer> a = Arrays.asList(10, 1, 2, 8, 4, 5);

        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= n) {
                count += 1;
            }
        }
        System.out.println(count);*/

        //String string = "28-07-2014 23:00:00";
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm:ss", Locale.ENGLISH);
        //LocalDateTime date = LocalDateTime.parse(string, formatter);
        //System.out.println(date);

        Date date1 = new Date((long) 1722187800 * 1000);
        System.out.println(date1);

        Date date2 = new Date((long) 1722256200 * 1000 + (5 * 60 * 60 * 1000));
        System.out.println(date2);

        //Base-64 Encoder
        String strToEncode = "abc@xyz.coma:Abcd@1234";
        String encodedString = Base64.getEncoder().withoutPadding().encodeToString(strToEncode.getBytes());
        System.out.println(encodedString);

        //Base-64 Decoder
        String strToDecode = "YWJjQHh5ei5jb206QWJjZEAxMjM0";
        byte[] decodedBytes = Base64.getDecoder().decode(strToDecode);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
        String[] arrOfDecodedString = decodedString.split(":");
        String username = arrOfDecodedString[0];
        String password = arrOfDecodedString[1];
        System.out.println(username);
        System.out.println(password);
    }
}