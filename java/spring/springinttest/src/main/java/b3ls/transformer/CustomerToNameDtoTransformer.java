package b3ls.transformer;

import b3ls.domain.Customer;
import b3ls.dto.NameDTO;
import org.springframework.stereotype.Component;

@Component
public class CustomerToNameDtoTransformer implements Transformer<NameDTO, Customer> {

  @Override
  public NameDTO transform(Customer source) {
    NameDTO result = new NameDTO();

    result.setGiven(source.getGiven());
    result.setSurname(source.getSurname());

    return result;
  }
}
