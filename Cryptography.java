/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author tynang
 */
public class Cryptography {
    public static void main(String args[]) {               
        int arrayR = 5;
        int arrayC = 5;
        String msg = "";
        String msg2 = "";
        String msg3 = "";
        int lowcaseLower = 97;
        int lowcaseUpper = 122;
        int upcaseLower = 65;
        double randRand = 0;
        int upcaseUpper = 90;
        char randInst = 0;
        char arrayVowel[] = {'a','e','i','o','u','A','E','I','O','U'};
        char arrayPeriod[][] = new char[arrayR][arrayC];
        char arrayChar[][] = new char [arrayR][arrayC];
        
    for (int len = 0; len < arrayR; len++)
    {
        for (int w = 0; w < arrayC; w++)
        {
            arrayPeriod[len][w] = '.';
        }//end period width
    }//end period length   
     for (int len = 0; len < arrayR; len++)
    {
        for (int w = 0; w < arrayC; w++)
        {
             for (int i = 0; i < arrayChar.length;i++){
                 randRand = Math.random();
        if (randRand > 0.5){
        randInst = (char)((Math.random()*(char)((upcaseUpper - upcaseLower) + 1) + upcaseLower));
        }//end rand if
        else {
        randInst = (char)((Math.random()*(char)((lowcaseUpper - lowcaseLower) + 1) + lowcaseLower));
        }//end rand else
    }//end rand for
            arrayChar[len][w] = randInst;
        }//end width for
    }// end length for     
    for (int len = 0; len < arrayR; len++)
    {
        for (int w = 0; w < arrayC; w++)
        {
            msg = msg + String.format("%4c",arrayChar[len][w]);
        }//end width for
msg = msg + "\n";
    }// end length for
    System.out.println("Original Array");
        System.out.println("");
    for (int z = 0; z < arrayChar.length;z++){
    System.out.println(Arrays.toString(arrayChar[z]));
    }
System.out.println(msg);//TAKE OUT THE SLASHES TO PRINT THE FULL CHAR ARRAY
for (int len = 0; len < arrayR; len++)
    {
        for (int w = 0; w < arrayC; w++)
        {
            for (int v = 0; v < arrayVowel.length; v++){
                if (arrayVowel[v] == arrayChar[len][w]){
                    arrayPeriod[len][w] = arrayChar[len][w];                    
                }//end vowel if                   
            }//end vowel for
        }//end width for
    }// end length for
 for (int len = 0; len < arrayR; len++)
    {
        for (int w = 0; w < arrayC; w++)
        {
            msg3 = msg3 + String.format("%4c",arrayPeriod[len][w]);
        }//end width for
msg3 = msg3 + "\n";
    }// end length for 
 for (int q = 0; q < arrayPeriod.length;q++)     
     System.out.println(Arrays.toString(arrayPeriod[q]));
System.out.println(msg3);
for (int len = 0; len < arrayR; len++)
    {
        for (int w = 0; w < arrayC; w++)
        {
            for (int v = 0; v < arrayVowel.length; v++){
                if (arrayVowel[v] == arrayChar[len][w]){
                    System.out.println("Location [" + len + ", " + w + "] contains " + arrayChar[len][w]);
                }//end vowel if                   
            }//end vowel for
        }//end width for
    }// end length for
/////////////////////////////////////////////////////////////////
     int minLower = 97;
        int maxLower = 122;
        int arrayRow = 6;
        int arrayCol = 6;
        int lenIns = 0;
        int widIns = 0;
        msg = "";
        msg2 = "";
        char arrayCryp[][] = new char[arrayRow][arrayCol];
        String strHide = "hello";
        char arrayHide[] = strHide.toCharArray();
        String strInsert = "abcdefghijklmnopqrstuvwxyz";
        char arrayLetters[] = strInsert.toCharArray();
        for (int print = 0; print < 2; print++){
            msg = "";
            msg2 = "";
        for (int len = 0; len < arrayCol; len++)
            for (int w = 0; w < arrayRow; w++)
                arrayCryp[len][w] = '?';
        for (int i = 0; i < arrayLetters.length;){
            lenIns = (int)(Math.random()*arrayCol);
            widIns = (int)(Math.random()*arrayRow);
            if (arrayCryp[widIns][lenIns] == '?')
            {
                arrayCryp[widIns][lenIns] = arrayLetters[i];
                i = i + 1;
            }//end checking if
        }//end random for
        for (int len = 0; len < arrayRow; len++)
    {
        for (int w = 0; w < arrayCol; w++)
        {
            msg = msg + String.format("%4c",arrayCryp[len][w]);
        }//end width for
msg = msg + "\n";
    }//end length for
         for (int s = 0; s < arrayHide.length; s++)
                for (int len = 0; len < arrayRow; len++)
    {
        for (int w = 0; w < arrayCol; w++)
        {
                if (arrayCryp[len][w] == arrayHide[s]){
                msg2 = msg2 + String.format("%1d",w,".%1d",len);
                msg2 = msg2 + String.format(".%1d",len);
                }
        }//end width for
    }//end length for
        System.out.println(msg);
        System.out.println("Encryption--->  " + msg2);        
        }//end print
        }//end main    
}//end Class
