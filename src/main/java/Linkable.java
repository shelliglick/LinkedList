public interface Linkable<T> {

    T getData();

    void setData(T data);

    Linkable getNext();

    void setNext(Linkable next);
}
