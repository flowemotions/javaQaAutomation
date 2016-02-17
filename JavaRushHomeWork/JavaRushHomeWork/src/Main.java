/**
 * Created by Denis on 14.02.2016.
 */
public class Main
{

    public static void main(String[] args)
    {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(10, 1.5));
        System.out.println(convertEurToUsd(22, 1.5));
    }

    public static double convertEurToUsd(int eur, double course)
    {
        return eur * course;
    }
}