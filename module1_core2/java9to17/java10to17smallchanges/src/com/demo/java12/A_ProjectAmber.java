package com.demo.java12;

import java.time.LocalDate;
enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class A_ProjectAmber {
    public static void main(String[] args) {
        //ProjectAmber: small changes in java
        /*
        * Pattern Matching for instanceof
        * Switch Expressions
        * Text Blocks , New Methods in String Class for Text Blocks
        * Helpful NullPointerExceptions
        * Records
        * Sealed Classes
        * Hidden Classes
         */


        //Pattern Matching for instanceof
        /*
         gettting rid of typecasting
         preview in java 14
         */
//        Object data="it is a string";
//        if(data instanceof String){
//            String tempData= (String) data;
//        }

        Object data= "it is a string!!";
//        if(data instanceof String tempData  && tempData.length()>10){
//            System.out.println(tempData.toLowerCase());
//        }else {
//            System.out.println("it is not a string");
//        }

//        if(data instanceof String tempData  || tempData.length()>10){
//            System.out.println(tempData.toLowerCase());
//        }else {
//            System.out.println("it is not a string");
//        }

        //Switch Expressions
        //java 1.4: only int and longs and char
        //java 5: enum
        //java 7: string
//        WeekDay day = WeekDay.MONDAY;
//        switch (day) {
//            case MONDAY:
//                System.out.println("Let's meet!");
//                break;
//            case TUESDAY:
//                System.out.println("no meeting!");
//                break;
//            case WEDNESDAY:
//                System.out.println("Let's meet!");
//                break;
//            case THURSDAY:
//                System.out.println("no meeting!");
//                break;
//            case FRIDAY:
//                System.out.println("Let's meet!");
//                break;
//            case SATURDAY:
//                System.out.println("no meeting!");
//                break;
//            case SUNDAY:
//                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//                break;
//            default:
//                System.out.println("Do I really need this?!");
//                break;
//        }

        //imporvement 1: case : Mon, wed

//        WeekDay day = WeekDay.MONDAY;
//        switch (day) {
//            case MONDAY,WEDNESDAY,FRIDAY:
//                System.out.println("Let's meet!");
//                break;
//            case TUESDAY,THURSDAY,SATURDAY:
//                System.out.println("no meeting!");
//                break;
//            case SUNDAY:
//                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//                break;
//        }


        //imporvement 2 : replaced with ->, no fall through behavioural

//        WeekDay day = WeekDay.MONDAY;
//        switch (day) {
//            case MONDAY,WEDNESDAY,FRIDAY->
//                System.out.println("Let's meet!");
//
//            case TUESDAY,THURSDAY,SATURDAY->
//                System.out.println("no meeting!");
//
//            case SUNDAY-> {
//                System.out.println("Let's meet (although Sunday should be a free day, man!)!");
//            }
//        }


        //imporvement 3: statement vs expression

//        WeekDay day = WeekDay.SUNDAY;
//
//        String message= switch (day) {
//            case MONDAY,WEDNESDAY,FRIDAY->"let meet";
//
//            case TUESDAY,THURSDAY,SATURDAY->"no meeting";
//            case SUNDAY-> {
//                String date= LocalDate.now().toString();
//                yield  "let sleep "+ date;
//            }
//        };
//        System.out.println(message);


//        int day=7;
//        String message= switch (day) {
//            case 1,3,5->"let meet";
//
//            case 2,4,6->"no meeting";
//            case 7-> {
//                String date= LocalDate.now().toString();
//                yield  "let sleep "+ date;
//            }
//            default -> {
//                throw  new IllegalArgumentException("hey man put right choice");
//            }
//        };
//        System.out.println(message);

    //text block vs backtick of ES6=> Quries hold

//        String dataTextBlock= """
//                this is india
//                this is an another text
//                """;
//
//        System.out.println(dataTextBlock);

        String sql = """
            SELECT new com.thorben.janssen.BookAuthorReviewCount(
                            b.title, 
                            concat(a.firstName, ' ', a.lastName), 
                            size(b.reviews)
                        ) 
            FROM Book b 
                JOIN b.author a 
            GROUP BY b.title, a.firstName, a.lastName
            """;
    }
}
