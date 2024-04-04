// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Poster poster = new Poster();

        poster.name = "Александр";
        poster.passport = "4444 № 444444";
        poster.patronymic = "Боков";
        poster.phone = "+7 (999)-999-99-99";
        poster.surname = "Александрович";
        poster.subscription = true;

        FormDate date = new FormDate();
        date.day = 13;
        date.month = 2;
        date.year = 1990;

    }
}