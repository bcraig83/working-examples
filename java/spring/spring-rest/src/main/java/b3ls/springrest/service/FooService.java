package b3ls.springrest.service;

import b3ls.springrest.api.Foo;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class FooService implements IFooService {

  @Override
  public List<Foo> findAll() {
    return null;
  }

  @Override
  public Object findOne(Long id) {
    return null;
  }

  @Override
  public Long create(Foo resource) {
    return null;
  }

  @Override
  public void update(Foo resource) {
  }

  @Override
  public Object getById(long id) {
    return null;
  }

  @Override
  public void deleteById(Long id) {

  }
}
