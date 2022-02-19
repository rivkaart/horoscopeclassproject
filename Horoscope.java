/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horoscope;
import java.util.Scanner;

/**
 *
 * @author Becky Scheff
 */
//Aries Dates: March 21-April 19
//Taurus Dates: April 20-May 20
//Gemini Dates: May 21-June 20
//Cancer Dates: June 21-July 22
//Leo Dates: July 23-August 22
//Virgo Dates: August 23-September 22
//Libra Dates: September 23-October 22
//Scorpio Dates: October 23-November 21
//Sagittarius Dates: November 22-December 21
//Capricorn Dates: December 21-January 20
//Aquarius Dates: January 21-February 18
//Pisces Dates: February 19-March 20
public class Horoscope {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //month
    int month;
    //day of month
    int day;
    String dog;
    

        // TODO code application logic here
        System.out.print("Enter your birth month >> ");
        month = sc.nextInt();
        System.out.print("Enter birth day >> ");
        day = sc.nextInt();
//January        
        if (month == 1)
        {
            if (day >= 21 && day <= 31)
            {
                System.out.printf("You are an Aquarius");
            }
            else if (day < 21 && day > 1)
            {
              System.out.printf("You are a Capricorn");
            }
            else if (day == 1)
            {
                System.out.print("Happy New Years mr/ms/mx Capricorn");
            }
            else
            {
                System.out.printf("You are either lying or an immortal being without a birthday");
            }
        }
//February        
        else if (month == 2)
            {
            if (day >= 19 && day <= 28)
            {
                System.out.printf("You are a Pisces");
            }
            else if (day < 19 && day > 0)
            {
                System.out.printf("You are an Aquarius");
            }
            else if (day == 29)
            {
                System.out.printf("Your zodiac is a Leap Frog. Dont look this up or tell anyone- they will all deny it. They are lying.");
            }
            else
            {
                System.out.printf("uggh, you're one of THOSE PEOPLE");
            }
            }
//March        
        else if (month == 3)
            {
            if (day >= 21 && day <= 31)
            {
                System.out.printf("You are an Aries");
            }
            else if (day < 21 && day > 0 && day != 5 && day != 14)
            {
                System.out.printf("You are a Pisces");
            }
            else if (day == 5)
            {
                System.out.printf("You are a Pisces. The Boston Massacre happened on your birthday in 1770.");
            }
            else if (day ==14)
                System.out.print("Eat pie at 26sexonds after 1:59am. You are a Pisces");
            else
            {
                System.out.printf("Dont you know your own birthday?!?! *scoffs*");
            }
            }
//April        
        else if (month == 4)
            {
            if (day >= 20 && day <= 30)
            {
                System.out.printf("You are a Taurus");
            }
            else if (day < 20 && day > 0 && day != 1)
            {
                System.out.printf("You are an Aries");
            }
            else if (day == 1)
            {
                System.out.printf("I wrote this program on a typewriter and now it wont run. I think you are a foolus");
            }
            else
            {
                System.out.printf("You are either lying or an immortal being without a birthday");
            }
            }
//May        
        else if (month == 5)
            {
            if (day != 8 && day != 5)
            {  System.out.println("April flowers bring May showers. Wait....I think I mixed that up. ");
                
                 if (day >= 21 && day <= 31)
            {
                     System.out.printf("You are an Gemini");
            }
                else if (day < 21 && day > 0 && day != 8 && day != 5)
            {
                    System.out.println("You are a tourist...torches....tortallini....Taurus!!!");
            }
            }
            else if (day == 8)
            {
                System.out.printf("Your mother must really hate you for being born on mother's day. Stealing attention from your own mother. Shameful.");
            }
            else if (day == 5)
            {
                System.out.printf("Have a Tamale! Happy Cinco de Mayo! You are a Taurus.");
            }
            else
            {
                System.out.printf("May has 31 days. Your birthday does not exist, and therefore YOU dont exist");
            }
            }
//June        
        else if (month == 6)
            {
                System.out.print("");
                
            if (day >= 21 && day <= 30)
            {
                System.out.printf("You have zodiac Cancer. Its very serious. ");
            }
            else if (day < 21 && day > 0 && day != 6 && day != 19)
            {
                System.out.printf("You are a Gemini");
            }
            else if (day == 6)
            {
                System.out.printf("You were born on D Day. You are a Gemini");
            }
            else if (day == 19)
            {
                System.out.printf("Support a Black-owned business today and do some research on African American slavery. You were born on Juneteeth. You are a Gemini.");
            }
            else
            {
                System.out.printf("Learn how to count");
            }
            }
//July        
        else if (month == 7)
            {
                System.out.print("");
                
            if (day >= 23 && day <= 31)
            {
                if (day == 28)
                {
                System.out.print("You are a Leo and were born the same day as Becky Scheff-Famous gerbil overlord. You should celebrate by getting her more gerbils.");
                }
                else
                {
                System.out.printf("You are a very big cat with fancy hair. Leo.");
                }
            }
            else if (day < 23 && day > 0 && day != 1 && day != 4)
            {
                System.out.printf("You have zodiac Cancer. It is very serious.");
            }
            else if (day == 1)
            {
                System.out.printf("O' Canada..... Happy Canada Day! You are a Cancer.");
            }
            else if (day == 4)
            {
                System.out.printf("You are a Cancer. Today is 4th of July, honoring the US's independence from Britain. You should visit Lincoln or Concord, MA today!");
            }
            else
            {
                System.out.printf("Bad move. Im getting rid of your birthday since you don't know when it is anyway.");
            }
            }
//August        
        else if (month == 8)
            {
                System.out.print("");
                
            if (day >= 23 && day <= 31)
            {
                if (day == 26)
                {
                System.out.print("You are a Virgo. You were born on National Dog Day. What is your favourite dog breed?>>");
                dog = sc.nextLine();
                dog = dog.toLowerCase();
                    if (dog != "lowland polish sheepdog")
                    {
                        System.out.print("I like Lowland Polish Sheepdogs Better");
                    }
                    else
                        System.out.print("You got it correct! Good dog.");
                
                }
                else
                {
                System.out.printf("You are a Virgo");
                }
            }
            else if (day < 23 && day > 0 && day != 4)
            {
                System.out.printf("You are a very big cat with fancy hair. Leo.");
            }
            
            else if (day == 4)
            {
                System.out.printf("Here kitty kitty kitty! Today is national Black Cat Appreciation day! You are a Leo.");
            }
            else
            {
                System.out.printf("You are the only person to ever have existed with this birthday. Congrats. Weirdo");
            }
            }//end of august
//September        
        else if(month == 9)
            {
                System.out.print("");
                
            if (day >= 23 && day <= 30)
            {
                if (day == 25)
                {
                
                System.out.print("Shanah Tova! Happy Rosh Hashanah! You are a Libra.");
                    }
                
                else
                {
                System.out.printf("You are a Libra Zebra");
                }
            }
            else if (day < 23 && day > 0 && day != 5)
            {
                System.out.printf("You are a Virgo");
            }
            else if (day == 5)
            {
                System.out.printf("Your mother was in labor ON LABOR DAY. you are a Virgo.");
            }
            
            else
            {
                System.out.printf("... try getting your own birthday correct");
            }
            } //end of September
//October        
        else if(month == 10)
            {
              
            if (day ==31)
            {
             System.out.print("Happy Halloween!!!! You are a Scorpio.");   
            }
                
            else if (day >= 23 && day <= 30)
            {   
                System.out.printf("You are a Scorpio");
             
            }
            else if (day < 23 && day > 0)
            {
                System.out.printf("You are a Virgo");
            }
            
            else
            {
                System.out.printf("YOU GOT YOUR BIRTHDAY WRONG");
            }
            } //end of October
//November        
        else if(month == 11)
            {
            if (day == 11)
            {
             System.out.print("Happy Veterens Day! You are a Scorpio.");   
            }
            if (day == 24)
            {
             System.out.print("You are a turkey. Deal with it. You are a Saggitarius.");   
            }
                
            else if (day >= 21 && day <= 30 && day != 24)
            {
                
                System.out.printf("You are a Saggitarius");
             
            }
            else if (day < 22 && day > 0 && day != 11)
            {
                System.out.printf("You are a Scorpio");
            }
            
            else
            {
                System.out.printf("uggh");
            }
            } //end of November. Im getting tired of typing
//December        
        else if(month == 12)
            {
                System.out.print("");
            if (day == 31)
            {
             System.out.print("You were so close to being born next year..... You are a Capricorn");   
            }
            if (day == 25)
            {
             System.out.print("Im not telling you until you give me gifts.");   
            }
                
            else if (day >= 21 && day <= 30 && day != 25)
            {
                
                System.out.printf("You are a Capricorn");
             
            }
            else if (day < 22 && day > 0)
            {
                System.out.printf("You are a Saggitarius");
            }
            
            else
            {
                System.out.printf("You probably dont exist since you dont have a REAL birthday");
            }
            } //end of December
        
    }   
        
    }
    


