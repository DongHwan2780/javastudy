package practice03_Member;

public class Member
{
  private String id;
  private Contact contact;
  private Address address;
  
  public Member()
  {
    // TODO Auto-generated constructor stub
  }
  public Member(String id, Contact contact, Address address)
  {
    super();
    this.id = id;
    this.contact = contact;
    this.address = address;
  }
  
  public String getId()
  {
    return id;
  }
  public void setId(String id)
  {
    this.id = id;
  }
  
  public Contact getContact()
  {
    return contact;
  }
  public void setContact(Contact contact)
  {
    this.contact = contact;
  }
  
  public Address getAddress()
  {
    return address;
  }
  public void setAddress(Address address)
  {
    this.address = address;
  }
  
  public void allInfo()
  {
    System.out.println(address.getPostCode() + address.getRoadAddress() + address.getJibunAddress()
    + address.getDetailAddress() + address.getExtraAddress() + address.isBasicAddress());
    System.out.println(contact.getTel() + contact.getMobile());
  }
  
}
