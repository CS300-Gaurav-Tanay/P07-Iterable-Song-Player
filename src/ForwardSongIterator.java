import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardSongIterator implements Iterator<Song> {
  // Declaring local variables
  private LinkedNode<Song> next; //reference to the next linked node in a list of nodes.

  // Implementing constructor
  public ForwardSongIterator(LinkedNode<Song> first) {
    // Assigning the first LinkedNode to next
    this.next = first;
  }

  // Implementing methods

  @Override
  public boolean hasNext() {
    if (next!= null) {
      return true;
    } else
      return false;
  }

  @Override
  public Song next() throws NoSuchElementException {
    if (!(this.hasNext())) {
      throw new NoSuchElementException("This is the last element in the list. Can't get the "
          + "next song");
    } else {
      Song toReturn = next.getData();
      next = next.getNext();
      return toReturn; // todo: doubtful about this (discuss the write-up with someone)
    }
  }
}
