package b3ls.transformer;

public interface Transformer<T, S> {

  T transform(S source);
}
