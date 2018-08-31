package b3ls.transformer;

import static org.junit.Assert.assertNotNull;

import b3ls.domain.Address;
import b3ls.domain.Customer;
import b3ls.dto.CustomerDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TransformerConfig.class)
public class CustomerToCustomerDtoTransformerTest {

  @Autowired
  private Transformer<CustomerDTO, Customer> fixture;

  private Customer input;
  private CustomerDTO output;

  @Before
  public void setUp() {
    input = null;
    output = null;
  }

  @Test
  public void shouldNotReturnNull() {
    Address address = new Address();
    address.setAddressLineOne("Some Street");
    address.setAddressLineTwo("Some Town");

    input = new Customer();
    input.setAddress(address);
    input.setAge(24);
    input.setEmail("someone@somewhere.com");
    input.setGiven("Jimmy");
    input.setSurname("McJimmy");

    output = fixture.transform(input);

    assertNotNull(output);
  }

}