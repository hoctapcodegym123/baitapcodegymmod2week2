package AutomatedTesting9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày");
        SimpleDateFormat dr = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dr.parse(scanner.nextLine());
        System.out.println(date);
        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }

    public static String nextDay(int day, int month, int year) {
        if (checkDate(day, month, year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 6:
                case 8:
                case 10:
                case 12:
                    if (day < 31) {
                        day++;
                    } else if (day == 31 && month != 12) {
                        day = 1;
                        month++;
                    } else {
                        day = 1;
                        month = 1;
                        year++;
                    }
                    break;
                case 4:
                case 7:
                case 9:
                case 11:
                    if (day < 30) {
                        day++;
                    } else {
                        day = 1;
                        month++;
                    }
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        if (day < 29) {
                            day++;
                        } else {
                            day = 1;
                            month++;
                        }
                    } else {
                        if (day < 28) {
                            day++;
                        }else {
                            day=1;
                            month++;
                        }
                    }
                    break;
            }

        }else {
            return ("Nhập sai ngày");
        }
        return ("Day: " + day + ", Month: " + month + ", Year: " + year);
    }

    public static boolean checkDate(int day, int month, int year) {
        boolean check = false;
        if (month > 0 && month < 13) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 6:
                case 8:
                case 10:
                case 12:
                    if (day > 0 && day < 32) {
                        check = true;
                    }
                    break;
                case 4:
                case 7:
                case 9:
                case 11:
                    if (day > 0 && day < 31) {
                        check = true;
                    }
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        if (day > 0 && day < 30) {
                            check = true;
                        }
                    } else {
                        if (day > 0 && day < 29) {
                            check = true;
                        }
                    }
                    break;
            }
        }
        return check;
    }

    public static boolean isLeapYear(int year) {
        boolean check = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                }
            } else {
                check = true;
            }

        }
        return check;
    }
}