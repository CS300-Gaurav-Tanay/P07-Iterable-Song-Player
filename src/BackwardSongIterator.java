import java.util.Iterator;
import java.util.NoSuchElementException;

public class BackwardSongIterator implements Iterator<Song> {
  // Declaring data fields
  private LinkedNode<Song> next; //reference to the next linked node in a list of nodes

  // Implementing Constructor
  public BackwardSongIterator(LinkedNode<Song> last) {
    this.next = last;
  }

  // Implementing the methods
  @Override public boolean hasNext() {
    if (next != null) {
      return true;
    } else {
      return false;
    }
  }

  @Override public Song next() throws NoSuchElementException {
    if (!(this.hasNext())) {
      throw new NoSuchElementException(
          "No previous element exists. Reached the start of the " + "list");
    } else {
      Song toReturn = next.getData();
      next = next.getPrev();
      return toReturn;
    }
  }
}
