package b3ls.springrest.service;

import b3ls.springrest.api.Foo;
import java.util.List;

public interface IFooService {

  List<Foo> findAll();

  Object findOne(Long id);

  Long create(Foo resource);

  void update(Foo resource);

  Object getById(long id);

  void deleteById(Long id);
}
