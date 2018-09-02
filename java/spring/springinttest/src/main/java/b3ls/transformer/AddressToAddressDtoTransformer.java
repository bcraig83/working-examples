package b3ls.transformer;

import b3ls.domain.Address;
import b3ls.dto.AddressDTO;
import org.springframework.stereotype.Component;

@Component
public class AddressToAddressDtoTransformer implements Transformer<AddressDTO, Address> {

  public AddressDTO transform(Address source) {

    AddressDTO result = new AddressDTO();
    result.setFullAddress(source.getAddressLineOne() + " " + source.getAddressLineTwo());

    return result;
  }
}