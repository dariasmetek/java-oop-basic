package controller;

import java.util.regex.Pattern;

public class RegExpController {
    //dd-ddd
    public boolean checkPostalCode(String postalCode){
        String template = "^\\d{2}-\\d{3}$";
        return Pattern.matches(template, postalCode);
    }

//ddddddddd
    public boolean checkPesel(String pesel){
        String template = "\\d{11}";
        return Pattern.matches(template, pesel);
    }
    //+[dd][ddd] -ddd-ddd-ddd lub 321-321-321
    public boolean checkPhoneNo(String phone_no) {
        String template1 = "^[+]{1}\\d{2,3}-\\d{3}-\\d{3}-\\d{3}";
        String template2 = "\\d{3}-\\d{3}-\\d{3}";
        return Pattern.matches(template1 + "|" + template2, phone_no);
    }

    public static void main(String[] args) {
        RegExpController rec = new RegExpController();
        System.out.println(rec.checkPostalCode("03-032"));
        System.out.println(rec.checkPostalCode("0X-032"));
        System.out.println(rec.checkPostalCode("03032"));
        System.out.println(rec.checkPostalCode(" 03-032"));
        System.out.println(rec.checkPesel("81072506104"));
        System.out.println(rec.checkPesel("81d72506104"));
        System.out.println("phone");
        System.out.println(rec.checkPhoneNo("+48-534-528-162"));
        System.out.println(rec.checkPhoneNo("534-528-162"));
    }
}
