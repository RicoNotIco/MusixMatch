package backend;

import org.jmusixmatch.entity.lyrics.Lyrics;
import org.jmusixmatch.entity.track.PrimaryGenres;

public class Song {

    private int albumId;
    private String albumName;
    private int artistId;
    private String artistName;
    private int trackId;
    private String trackName;
    private Lyrics lyrics;
    private int trackRating;
    private int trackLength;
    private PrimaryGenres primaryGenres;

    public Song(int albumId, String albumName, int artistId, String artistName, int trackId, String trackName, int trackRating, /*int trackLength,*/ PrimaryGenres primaryGenres) {
        super();
        this.albumId = albumId;
        this.albumName = albumName;
        this.artistId = artistId;
        this.artistName = artistName;
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackRating = trackRating;
        this.trackLength = trackLength;
        this.primaryGenres = primaryGenres;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int aryistId) {
        this.artistId = aryistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public Lyrics getLyrics() {
        return lyrics;
    }

    public void setLyrics(Lyrics lyrics) {
        this.lyrics = lyrics;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Integer getTrackRating() {
        return trackRating;
    }

    public Integer getTrackLength() {
        return trackLength;
    }

    public PrimaryGenres getPrimaryGenres() {
        return primaryGenres;
    }
}
