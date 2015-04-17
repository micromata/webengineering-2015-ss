package com.micromata.webengineering;

/**
 * POJO (plain old java object) for entries.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
public class Entry {
  private Long votes;
  private String title;

  public Long getVotes() {
    return votes;
  }

  public void setVotes(Long votes) {
    this.votes = votes;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
