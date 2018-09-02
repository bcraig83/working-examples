package b3ls.dto;

public class CustomerDTO {

  private NameDTO name;
  private int age;
  private String email;
  private AddressDTO address;

  public NameDTO getName() {
    return name;
  }

  public void setName(NameDTO name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddressDTO getAddress() {
    return address;
  }

  public void setAddress(AddressDTO address) {
    this.address = address;
  }
}
