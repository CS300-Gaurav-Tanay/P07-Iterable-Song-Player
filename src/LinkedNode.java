public class LinkedNode<T> {

  private T data; //data field of this linked node
  private LinkedNode<T> prev; //reference to the previous linked node in a list of nodes
  private LinkedNode<T> next; //reference to the next linked node in a list of nodes

  public LinkedNode(LinkedNode<T> prev, T data, LinkedNode<T> next)
      throws IllegalArgumentException {
    if (data == null) {
      throw new IllegalArgumentException("The data parameter is null");
    }
    this.data = data;
    this.setPrev(prev);
    this.setNext(next);
  }

  public LinkedNode<T> getPrev() {
    return this.prev;
  }

  public void setPrev(LinkedNode<T> prev) {
    this.prev = prev;
  }

  public LinkedNode<T> getNext() {
    return this.next;
  }

  public void setNext(LinkedNode<T> next) {
    this.next = next;
  }

  public T getData() {
    return this.data;
  }
}
