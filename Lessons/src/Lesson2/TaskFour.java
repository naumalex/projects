package Lesson2;

public class TaskFour {
    public static void main (String[] args) {
        int TotalNumberOfAmoebas = 1;
        for (int i = 3; i <=24; i += 3) {
            TotalNumberOfAmoebas = TotalNumberOfAmoebas * 2;
            System.out.printf ("Total Number of Amebs in %d hours is %d%n",
                    i, TotalNumberOfAmoebas);
        }
    }
}
