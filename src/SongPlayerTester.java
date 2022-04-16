// File header comes here
/**
 * This class implements unit test methods to check the correctness of Song, LinkedNode, SongPlayer
 * ForwardSongIterator and BackwardSongIterator classes in P07 Iterable Song Player assignment.
 *
 */
public class SongPlayerTester {
  /**
   * This method test and make use of the Song constructor, an accessor (getter) method,
   * overridden method toString() and equal() method defined in the Song class.
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testSong() {
    return validInputTesterTestSong() && invalidInputTesterTestSong();
  }

  /**
   * This method test and make use of the LinkedNode constructor, an accessor
   * (getter) method, and a mutator (setter) method defined in the LinkedCart class.
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testLinkedNode() {
    return false;
  }

  /**
   * This method checks for the correctness of addFirst(), addLast() and add(int index)
   * method in SongPlayer class
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testSongPlayerAdd() {
    return false;
  }

  /**
   * This method checks for the correctness of getFirst(), getLast() and get(int index)
   * method in SongPlayer class
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testSongPlayerGet() {
    return false;
  }

  /**
   * This method checks for the correctness of removeFirst(), removeLast() and remove(int index)
   * method in SongPlayer class
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testSongPlayerRemove() {
    return false;
  }

  /**
   * This method checks for the correctness of iterator(), switchPlayingDirection() and String play()
   * method in SongPlayer class
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testSongPlayerIterator() {
    return false;
  }

  /**
   * This method checks for the correctness of contains(Object song), clear(),
   * isEmpty()and size() method in SongPlayer class
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testSongPlayerCommonMethod() {
    return false;
  }

  /**
   * This method checks for the correctness of ForwardSongIterator class
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testForwardSongIterator() {
    return false;
  }

  /**
   * This method checks for the correctness of BackwardSongIterator class
   *
   * @return true when this test verifies a correct functionality, and false otherwise
   */
  public static boolean testBackwardSongIterator() {
    return false;
  }

  /**
   * This method calls all the test methods defined and implemented in your SongPlayerTester
   * class.
   *
   * @return true if all the test methods defined in this class pass, and false otherwise.
   */
  public static boolean runAllTests() {
    return false;
  }

  // Implementing private tester methods
  private static boolean validInputTesterTestSong() {
    // Declaring local variables

    // Define test cases
    // Testing the constructor


    // Testing the equals method

    // Testing the toString() method

    // Testing the getArtist() method

    // Testing the getDuration() method

    // Testing the getSongName() method

    return false;
  }

  private static boolean invalidInputTesterTestSong() {
    // Declaring local variables

    // Define test cases
    // Testing the constructor


    // Testing the equals method

    // Testing the toString() method

    // Testing the getArtist() method

    // Testing the getDuration() method

    // Testing the getSongName() method
    return false;
  }

  /**
   * Driver method defined in this SongPlayerTester class
   *
   * @param args input arguments if any.
   */
  public static void main(String[] args) {

  }
}
