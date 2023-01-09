package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        Date myDate = new Date();

        System.out.println(myDate); // Sat Jan 07 21:43:22 CET 2023
        System.out.println(myDate.getTime()); //1673124202560

        //Icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now()); //2023-01-07
        System.out.println(LocalTime.now());//21:45:31.870063900


        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now()); //2023-01-07T21:45:31.870063900
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Berlin"))); //2023-01-07T21:45:31.870063900
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-08T05:45:31.870063900

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35)); //2030-07-12

        //Geriye bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)); //2018-10-05

        //Ileri bir zamana nasil gidilir?
        System.out.println(LocalTime.now().plusHours(3)); //00:56:18.095907500

        // Geri bir tarihe nasil gidilir?
        System.out.println(LocalTime.now().minusMinutes(45)); //21:13:34.753057900

        //Zamanda belli bir bölümü nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute()); //22:1

        // Tarihte belli bir bölümü nasil aliriz?
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth()); //1:7

        // Iki traih nasil karsilastirilir?
        // 02.13.2005 - 03.01.2007
      boolean result = LocalDate.of(2005, 02, 13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result); //true

        //Traihlerin formatlari nasil degistirilir?
        //M--> Tek rakamla ay no'sunu yazar - MM --> Iki rakamla ay no sunu yazar
        //MMM-->Ay isminin ilk uc harfini yazar - MMMM-->Ay isminin tamamini yazar.

        //d-->Tek rakamla gun no sunu yazar - dd--> Iki rakamla gun no sunu yazar

        //yy -->Yilin son iki rakamini yazar - yyyy-->Yilin tamamini yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yy");

        System.out.println(dtf.format(LocalDate.now())); // 07/Jan./23
    }
}
