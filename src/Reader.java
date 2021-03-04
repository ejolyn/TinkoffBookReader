import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] arrBooks){
        Random random = new Random();
        return (arrBooks[random.nextInt(arrBooks.length)]);
    }
    public void readBook(Book CurrentBook){
        System.out.println(CurrentBook.toString());
    }
    public void evaluateBook(Book CurrentBook){
        Random random = new Random();
        int result = 0;
        result += (CurrentBook.name == null) ? 0 : CurrentBook.name.length();
        result += (CurrentBook.author == null) ? 0 : CurrentBook.author.length();
        int spaces = 0;
        if (CurrentBook.name != null)
            for (int i = 0; i < CurrentBook.name.length(); i++)
                if (CurrentBook.name.charAt(i) == ' ')
                    spaces++;
        if (CurrentBook.author != null)
            for (int i = 0; i < CurrentBook.author.length(); i++) {
                if (CurrentBook.author.charAt(i) == ' ') {
                    spaces++;
                }
            }
        result -= spaces;
        if (CurrentBook.NumberInSeria > 0)
            result -= CurrentBook.NumberInSeria;
        else
            result -= random.nextInt(50);
        if (CurrentBook.NumberOfPages > 0)
            result += CurrentBook.NumberOfPages;
        else
            result -= random.nextInt(50);
        System.out.println("Оценка книги: " + result + " баллов");
    }
}
