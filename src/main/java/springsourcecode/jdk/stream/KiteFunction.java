package springsourcecode.jdk.stream;

@FunctionalInterface
public interface KiteFunction<T,R,S> {

    /**
     *
     * @param t
     * @param s
     * @return
     */
    R run(S t,T s);

}
