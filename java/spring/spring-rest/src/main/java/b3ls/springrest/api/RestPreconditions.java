package b3ls.springrest.api;

import b3ls.springrest.api.exceptions.MyResourceNotFoundException;

public class RestPreconditions {

  public static <T> T checkFound(T resource) {
    if (resource == null) {
      throw new MyResourceNotFoundException();
    }
    return resource;
  }
}
