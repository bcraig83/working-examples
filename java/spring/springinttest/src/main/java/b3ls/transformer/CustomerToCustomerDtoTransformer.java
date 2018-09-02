package b3ls.transformer;

import b3ls.domain.Address;
import b3ls.domain.Customer;
import b3ls.dto.AddressDTO;
import b3ls.dto.CustomerDTO;
import b3ls.dto.NameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerToCustomerDtoTransformer implements Transformer<CustomerDTO, Customer> {

  private Transformer<AddressDTO, Address> addressDTOAddressTransformer;
  private Transformer<NameDTO, Customer> nameDTOCustomerTransformer;

  @Autowired
  public CustomerToCustomerDtoTransformer(
      Transformer<AddressDTO, Address> addressDTOAddressTransformer,
      Transformer<NameDTO, Customer> nameDTOCustomerTransformer) {
    this.addressDTOAddressTransformer = addressDTOAddressTransformer;
    this.nameDTOCustomerTransformer = nameDTOCustomerTransformer;
  }

  @Override
  public CustomerDTO transform(Customer source) {

    CustomerDTO result = new CustomerDTO();

    result.setAddress(addressDTOAddressTransformer.transform(source.getAddress()));

    result.setAge(source.getAge());
    result.setEmail(source.getEmail());
    result.setName(nameDTOCustomerTransformer.transform(source));

    return result;
  }
}
