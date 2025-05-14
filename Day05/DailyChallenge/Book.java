package Day05.DailyChallenge;
//Create a class Book with constructors, getters, and a method to display info
public class Book {
    int id;
    String name;
    String genre;
    String status;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getStatus() {
        return status;
    }




    public Book(int id, String name, String genre, String status){
        this.id = id;
        this.name=name;
        this.genre = genre;
        this.status= status;

    }

    public static void DisplayInfo(int id, String name, String genre, String status){
        System.out.println("ID     : "+id);
        System.out.println("name   : "+name);
        System.out.println("genre  : "+genre);
        System.out.println("status : "+status);
    }

    public static void main(String[] args) {
        int id = 10;
        String name="Ikigai";
        String genre = "general";
        String status = "Available";

        Book book = new Book(id, name, genre, status);
        DisplayInfo(id, name, genre, status);
    }
}
