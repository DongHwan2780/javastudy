package pkg08_Object;

public class MainClass
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    Object obj = new Book("979-11", "혼공자");
    
    System.out.println(((Book)obj).getIsbn());
    System.out.println(((Book)obj).getTitle());
    
    
    Book book = new Book("979-11", "혼공자");
    System.out.println(obj.equals(book)); // 객체 obj와 객체 book이 동일하면 true
    System.out.println(book.toString());  // "객체명@참조값" 을 반환
    System.out.println(book);             // toString() 메소드 호출은 생략 가능
    
    
    
    Student student1 = new Student(10101, "고길동");
    Student student2 = new Student(10101, "고길동");
    
    System.out.println(student1.equals(student2));
    System.out.println(student1);
    
    
    student1.addBook(new Book("979-11", "혼공자"));
    student1.addBook(new Book("979-12", "혼공부"));
    student1.addBook(new Book("979-13", "혼공대"));
    student1.addBook(new Book("979-14", "혼공실"));
    student1.addBook(new Book("979-15", "혼공포"));
    
    for(Book books : student1.getBooks())
      if(books != null)
        System.out.println(books);
    
    
    System.out.println();
    
    student1.removeBook(new Book("979-11", "혼공자"));
    for(Book books : student1.getBooks())
      if(books != null)
        System.out.println(books);
    
  }
}
