

public class book {
    public String title;
    public String author;
    public String yearpublished;
    public String getDetails(){
        return "title :"+title+"\nauthot"+author+"\nyearpublished"+yearpublished;
    }
    public static void main(String[] args){
        book book1 = new book();
        book1.title="lord of rings";
        book1.author="i dont know";
        book1.yearpublished="1996";
        //String result=book1.getDetails() 
        System.out.println(book1.getDetails());
        
    }
}