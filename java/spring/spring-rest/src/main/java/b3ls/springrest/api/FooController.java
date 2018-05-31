package b3ls.springrest.api;

import b3ls.springrest.service.IFooService;
import com.google.common.base.Preconditions;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/foos")
class FooController {

  private final IFooService service;

  @Autowired
  public FooController(IFooService service) {
    this.service = service;
  }

  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public List<Foo> findAll() {
    return service.findAll();
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.CREATED)
  @ResponseBody
  public Long create(@RequestBody Foo resource) {
    Preconditions.checkNotNull(resource);
    return service.create(resource);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  @ResponseStatus(HttpStatus.OK)
  public void update(@PathVariable("id") Long id, @RequestBody Foo resource) {
    Preconditions.checkNotNull(resource);
    RestPreconditions.checkFound(service.getById(resource.getId()));
    service.update(resource);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  @ResponseStatus(HttpStatus.OK)
  public void delete(@PathVariable("id") Long id) {
    service.deleteById(id);
  }
}
