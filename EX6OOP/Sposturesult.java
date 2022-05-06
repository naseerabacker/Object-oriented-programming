/* Create interfaces Student and Sports. Create a class Result implements Student and Sports.Display the academic and sports score of a student */


import java.util.*;
interface Student      //student interface
{
    int score=10;
    void displayScore();
}

interface Sports  //sports interface
{
    int score=25;
    void displaySportsScore();
}

class Result implements Student,Sports  //class
{
    public void displayScore()
    {
        System.out.println("Academic score:" + Student.score);
    }
    public void displaySportsScore()
    {
        System.out.println("Sports score:" + Sports.score);
    }
}
public class Sposturesult   //main class
{
    public static void main(String[] args)
    {
        Result r = new Result();
        r.displayScore();
        r.displaySportsScore();
    }
}

/*
Academic score:10
Sports score:25
*/
