package controller;

import java.util.regex.Pattern;

public class RegExpController {
    //dd-ddd
    public boolean checkPostalCode(String postalCode){
        String template = "^\\d{2}-\\d{3}$";
        return Pattern.matches(template, postalCode);
    }


    public static void main(String[] args) {
        RegExpController rec = new RegExpController();
        System.out.println(rec.checkPostalCode("03-032"));
        System.out.println(rec.checkPostalCode("0X-032"));
        System.out.println(rec.checkPostalCode("03032"));
        System.out.println(rec.checkPostalCode(" 03-032"));
    }
}
