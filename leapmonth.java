/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Etob media
 */
public class leapmonth {
  public static void main(String[] args) {
        // Example usage
        int year = 2010;
        int month = 4; // February

        boolean leapmonth = leapmonth(year, month);
        if (leapmonth) {
            System.out.println(month + "/" + year + " is a leap month.");
        } else {
            System.out.println(month + "/" + year + " is not a leap month.");
        }
    }
// February is the only leap month in the Gregorian calendar
    public static boolean leapmonth(int year, int month) {
        boolean leapyear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        return leapyear && month == 4; 
    }
}  

