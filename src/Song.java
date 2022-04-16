public class Song {
  // Declaring data fields
  private String songName; // name or title of the song
  private String artist; // artist of the song
  private String duration; // duration of the song

  // Constructor
  public Song(String songName, String artist, String duration) throws IllegalArgumentException {
    /*
    Things to check for (exceptional cases):
    1. songName, artist or duration is null or blank
    2. If the duration is not formatted as mm:ss where both mm and ss are in the 0..59 range
     */
    // Checking and throwing exception
    boolean checkDuration = true;
    if ((songName == null || songName.isBlank()) || (artist == null || artist.isBlank()) || (
        duration == null || duration.isBlank())) {
      throw new IllegalArgumentException("One of the parameters passed is blank or null");
    }
    if (!duration.contains(":")) {
      throw new IllegalArgumentException("Duration not formatted properly. Doesn't have a colon");
    }
    duration = duration.trim();
    try {
      int durationMinutes = Integer.parseInt(duration.substring(0, duration.indexOf(':')));
      int durationSeconds = Integer.parseInt(duration.substring(duration.indexOf(':') + 1));

      if (durationMinutes < 0 || durationMinutes > 59) {
        checkDuration = false;
      }

      if (durationSeconds < 0 || durationMinutes > 59) {
        checkDuration = false;
      }
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Duration has characters other than digits");
    }

    if (!checkDuration) {
      throw new IllegalArgumentException("The input parameters to the constructor are not right");
    }

    // Initializing all of the variables
    this.songName = songName;
    this.artist = artist;
    this.duration = duration;

  } // Constructor ends

  // Implementing methods

  public String getSongName() {
    return this.songName;
  }

  public String getArtist() {
    return this.artist;
  }

  public String getDuration() {
    return this.duration;
  }

  @Override public String toString() {
    String returnStr = this.getSongName() + "---" + this.getArtist() + "---" + this.getDuration();
    return returnStr;
  }

  @Override public boolean equals(Object other) {
    // Check if the Object is actually an instance of Song or else return false
    if (!(other instanceof Song || other == null)) {
      // Not an instance of song
      return false;
    }

    // return true if song and name of the two are same and false otherwise (case-insensitive
    // comparison)
    if (!(this.getSongName().equalsIgnoreCase(((Song) other).getSongName()))) {
      // Song name is not the same
      return false;
    }

    if (!(this.getArtist().equalsIgnoreCase(((Song) other).getArtist()))) {
      // Artist name are not the same
      return false;
    }

    // Both artist name and song name are equal so returning true
    return true;
  }

}
