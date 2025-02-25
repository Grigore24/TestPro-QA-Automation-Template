package Homeworks;

public class Homework9main {
    public static void main(String[] args) {
        Book9 gregBook = new Book9();
        gregBook.setWriter("Jack London");
        System.out.println(gregBook.getWriter());

        gregBook.setCountry("United Kingdom");
        System.out.println(gregBook.getCountry());

        gregBook.setYear(2023);
        System.out.println(gregBook.getYear());

        NoteBook9 gregNoteBook = new NoteBook9("MacBook","PRO",2024);
        System.out.println(gregNoteBook.getName());
        System.out.println(gregNoteBook.getModel());

        Monitor9 gregMonitor = new Monitor9("Samsung",17,2023);
        System.out.println(gregMonitor.getName());
        gregMonitor.printInfo();




    }
}
