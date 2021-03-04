public class Book {

    String  name;
    String  author;
    int     NumberInSeria;
    int     NumberOfPages;

    Book(String name, String author, int NumberInSeria, int NumberOfPages){
        this.name = name;
        this.author = author;
        if (NumberInSeria > 0 && NumberOfPages > 0) {
            this.NumberInSeria = NumberInSeria;
            this.NumberOfPages = NumberOfPages;
        }
    }
    Book(String name, String author, int NumberOfPages){
        this.name = name;
        this.author = author;
        this.NumberInSeria = -1;
        if (NumberOfPages > 0)
            this.NumberOfPages = NumberOfPages;
    }
    Book(String name, String author){
        this.name = name;
        this.author = author;
        this.NumberInSeria = -1;
        this.NumberOfPages = -1;
    }

    @Override
    public String toString() {
        if (this.NumberInSeria <= 0 && this.NumberOfPages > 0) {
            return ("Автор: '" + this.author + "'\n" + "Название книги: '" +
                    this.name + "'\n" + "Порядковый номер в серии: Неизвестно" +
                    "\n" + "Количество страниц: " + this.NumberOfPages);
        }
        else if (this.NumberInSeria <= 0 && this.NumberOfPages <= 0) {
            return ("Автор: '" + this.author + "'\n" + "Название книги: '" +
                    this.name + "'\n" + "Порядковый номер в серии: Неизвестно" +
                        "\n" + "Количество страниц: Неизвестно");
        }
        else
            return ("Автор: '" + this.author + "'\n" + "Название книги: '" +
                    this.name + "'\n" + "Порядковый номер в серии: " +
                    this.NumberInSeria + "\n" + "Количество страниц: " + this.NumberOfPages);
    }
}
