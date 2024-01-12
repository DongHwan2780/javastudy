package practice03_Member;

public class Address
{
  private String postCode, roadAddress, jibunAddress, detailAddress, extraAddress;
  private boolean basicAddress;
  
  public Address()
  {
    
  }
  public Address(String postCode, String roadAddress, String jibunAddress, String detailAddress, String extraAddress,
      boolean basicAddress)
  {
    super();
    this.postCode = postCode;
    this.roadAddress = roadAddress;
    this.jibunAddress = jibunAddress;
    this.detailAddress = detailAddress;
    this.extraAddress = extraAddress;
    this.basicAddress = basicAddress;
  }

  public String getPostCode()
  {
    return postCode;
  }
  public void setPostCode(String postCode)
  {
    this.postCode = postCode;
  }

  public String getRoadAddress()
  {
    return roadAddress;
  }
  public void setRoadAddress(String roadAddress)
  {
    this.roadAddress = roadAddress;
  }

  public String getJibunAddress()
  {
    return jibunAddress;
  }
  public void setJibunAddress(String jibunAddress)
  {
    this.jibunAddress = jibunAddress;
  }

  public String getDetailAddress()
  {
    return detailAddress;
  }
  public void setDetailAddress(String detailAddress)
  {
    this.detailAddress = detailAddress;
  }

  public String getExtraAddress()
  {
    return extraAddress;
  }
  public void setExtraAddress(String extraAddress)
  {
    this.extraAddress = extraAddress;
  }



  
  public boolean isBasicAddress()
  {
    return basicAddress;
  }



  public void setBasicAddress(boolean basicAddress)
  {
    this.basicAddress = basicAddress;
  }
  
  
  
}
