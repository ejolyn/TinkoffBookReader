public class Main {

    public static void main(String[] args) {
	Book[] arrBook = new Book[8];
	arrBook[0] = new Book("Дюна", "Герберт Фрэнк", 1, 300);
	arrBook[1] = new Book("Сто лет одиночества", "Габриэль Гарсиа Маркес", 234);
	arrBook[2] = new Book(null, null, 1,234);
	arrBook[3] = new Book("По ком звонит колокол", "Эрнест Хэмингуэй");
	arrBook[4] = new Book("Игра Эндера", "Орсон Скотт Кард", 1, 431);
	arrBook[5] = new Book("Голос тех, кого нет", "Орсон Скотт Кард", 2, 390);
	arrBook[6] = new Book("Темный лес", "Лю Цысинь", 2, 420);
	arrBook[7] = new Book("На западном фронте без перемен", "Эрих Мария Ремарк");
	Reader reader = new Reader();
	Book CurrentBook = reader.choiceBook(arrBook);
	reader.readBook(CurrentBook);
	reader.evaluateBook(CurrentBook);
    }
}
