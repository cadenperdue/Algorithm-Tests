public class WikiEntry {
  private String title;
  private int entryNo;

  public WikiEntry(String title, int entryNo) {
    this.title = title;
    this.entryNo = entryNo;
  }

  public String getTitle() {
    return title;
  }

  public int getEntryNo() {
    return entryNo;
  }
}
