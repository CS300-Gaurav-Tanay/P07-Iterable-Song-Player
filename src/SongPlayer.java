import java.util.Iterator;

public class SongPlayer implements Iterable<Song> {
  // Declaring data fields
  private int size; //size of the list
  private LinkedNode<Song> head; //head of this doubly linked list
  private LinkedNode<Song> tail; //tail of this doubly linked list
  private boolean playingBackward; //true if this song player is reading the list backward

  // Implementing the methods
  public void add(int index, Song oneSong)
      throws NullPointerException, IndexOutOfBoundsException {
    int i; //loop control variable

    // Checking if the index is within the 0 to size range
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index out of Bounds for the Dong being added.");
    }

    // Checking if the song parameter is null
    if (oneSong == null) {
      throw new NullPointerException("oneSong is null so it cannot be added to the song list.");
    }

    // If the list is empty
    if (this.isEmpty()) {
      // Setting head to a new node with oneSong and tail to the same song
      head = new LinkedNode<Song>(null, oneSong, null);
      tail = head;
    } else if (index == 0) {
      // If index 0, call addFirst
      addFirst(oneSong);
    } else if (index == size()) {
      // If Index is size(), call addLast
      addLast(oneSong);
    } else {
      //else just do the add at a specific index process
      // finding the right place where I can put the node object
      LinkedNode<Song> curr = head;
      //Iterating through a for loop to make sure that curr is now the node after which the new
      // node will be placed
      for (i = 0; i < index - 1; i++) {
        curr = curr.getNext();
      }
      // Updating all of the references
      // Creating the new node with the song and setting the previous node to curr and the next
      // node to the node after curr
      LinkedNode<Song> nodeToInsert = new LinkedNode<Song>(curr, oneSong, curr.getNext());
      // Setting curr's next value to this node
      curr.setNext(nodeToInsert);
      // setting the node which was originally after curr 's previous node value to the new node
      curr.getNext().setPrev(nodeToInsert);
    }
    // Incrementing size
    size++;
  }

  public void addFirst(Song oneSong) throws NullPointerException {
    // Checks if the song passed in is null
    if (oneSong == null) {
      throw new NullPointerException(
          "Invalid Input: The song passed in to the addFirst method " + "is null");
    }
    // if the list is empty
    if (isEmpty()) {
      // Setting head to a new node with oneSong and tail to the same song
      head = new LinkedNode<Song>(null, oneSong, null);
      tail = head;
    } else {
      LinkedNode<Song> nodeToInsert = new LinkedNode<Song>(null, oneSong, head);
      // Setting the head node's previous pointer to the new node
      head.setPrev(nodeToInsert);
      //Setting head to the ned node
      head = nodeToInsert;
    }
    size++;
  }

  public void addLast(Song oneSong) {

    if (isEmpty()) {
      // Setting head to a new node with oneSong and tail to the same song
      head = new LinkedNode<Song>(null, oneSong, null);
      tail = head;
    } else {
      // Creating a new node first
      LinkedNode<Song> nodeToInsert = new LinkedNode<>(tail, oneSong, null);
      // Setting the tail's next node to the new node
      tail.setNext(nodeToInsert);
      // Setting tail to the new node
      tail = nodeToInsert;
    }
    size++;
  }

  public void clear() {
    size = 0;
  }

  public boolean contains(Song o) {
    // Iterating through the linked list
    return false;
  }

  public Song get(int index) {
    // checking for exception
    if (index < 0 || index > this.size() - 1) {
      throw new IndexOutOfBoundsException(
          "Value of Index passed to the get() method is out of " + "bounds");
    }

    int i = 0; // loop control variable
    LinkedNode<Song> tempPointer = this.head;
    while (i != index) {
      if (index == i) {
        return tempPointer.getData();
      }
      tempPointer = tempPointer.getNext();
      i++;
    }
    return null; //todo: doubtful
  }

  public Song getFirst() {
    return this.head.getData();
  }

  public Song getLast() {
    return this.tail.getData();
  }

  public boolean isEmpty() {
    return (size == 0 && head == null && tail == null);
  }

  public Iterator<Song> iterator() {
    if (playingBackward) {
      return new BackwardSongIterator(this.tail);
    } else
      return new ForwardSongIterator(this.head);
  }

  public String play() {
    return null;
  }

  public Song remove(int index) {
    int i; // loop control variable
    // finding the right place where I can put the node object
    LinkedNode<Song> curr = head;
    //Iterating through a for loop to make sure that curr is now the node after which the new
    // node will be placed
    for (i = 0; i < index - 1; i++) {
      curr = curr.getNext();
    }
    LinkedNode<Song> nodeToReturn = curr.getNext();
    curr.getNext().getNext().setPrev(curr);
    curr.setNext(curr.getNext().getNext());
    size--;

    return nodeToReturn.getData();
  }

  public Song removeFirst() {
    LinkedNode<Song> nodeToReturn;
    nodeToReturn = head;
    if (size == 2) {
      nodeToReturn = head;
      this.head.getNext().setPrev(null);
      this.head = this.head.getNext();
      this.tail = this.head;
      --size;
      return nodeToReturn.getData();
    }

    if (this.size == 1) {
      nodeToReturn = head;
      head = null;
      tail = null;
      size--;
      return nodeToReturn.getData();
    }
    this.head.getNext().setPrev(null);
    head = head.getNext();
    size--;
    return nodeToReturn.getData();
  }

  public Song removeLast() {
    LinkedNode<Song> nodeToReturn;
    nodeToReturn = tail;

    tail.getPrev().setNext(null);
    tail = tail.getPrev();
    size--;
    return nodeToReturn.getData();
  }

  public int size() {
    return size;
  }

  public void switchPlayingDirection() {

  }
}
