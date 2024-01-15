package pkg08_Object;

public class Student
{
  private int stuNum, bookCount;
  private String name;
  private Book[] books;
  
  public Student()
  {
    books = new Book[100];
  }

  public Student(int stuNum, String name)
  {
    super();
    this.stuNum = stuNum;
    this.name = name;
    books = new Book[100];
  }

  public int getStuNum()
  {
    return stuNum;
  }
  public void setStuNum(int stuNum)
  {
    this.stuNum = stuNum;
  }

  public int getBookCount()
  {
    return bookCount;
  }
  public void setBookCount(int bookCount)
  {
    this.bookCount = bookCount;
  }

  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }

  public Book[] getBooks()
  {
    return books;
  }
  public void setBooks(Book[] books)
  {
    this.books = books;
  }
  
  // 책 등록
  public void addBook(Book book)
  {
    if(bookCount >= books.length)
    {
      System.out.println("꽉참");
      return;
    }
    
    books[bookCount++] = book;
  }
  public void removeBook(int idx)
  {
    if(idx < 0 || idx >= bookCount)
    {
      System.out.println("잘못된 인덱스");
      return;
    }
    
    System.arraycopy(books, idx + 1, books, idx, bookCount - idx - 1);
    bookCount--;
    books[bookCount] = null;
  }
  
  public void removeBook(Book book)
  {
    if(0 == bookCount)
    {
      System.out.println("잘못된 인덱스");
      return;
    }
    
    for(int i = 0; i < bookCount; i++)
      if(book.equals(books[i]))         // Book 클래스에 Object 클래스의 equals 메소드 오버라이드 해야 함
      {
        System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
        bookCount--;
        books[bookCount] = null;
        break;
      }
  }
  
  // Object 클래스의 equals 메소드 오버라이드
  // stuNum 필드 값이 일치하면 true 반환
  
  @Override
  public boolean equals(Object obj)
  {
    return this.stuNum == ((Student)obj).getStuNum();
  }
  
  @Override
  public String toString()
  {
    return this.stuNum + this.name;
  }
}
