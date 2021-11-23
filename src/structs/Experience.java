package structs;

import java.util.LinkedList;
import structs.Category;

public class Experience {
  private String name, location, jobTitle, startDate, endDate;
  private boolean partTime, present;
  private LinkedList<String> description;
  private Category category;

  public Experience(String name, String location, String jobTitle, String startDate, String endDate, boolean partTime,
      LinkedList<String> description) {
    this.name = name;
    this.location = location;
    this.jobTitle = jobTitle;
    this.startDate = startDate;
    this.endDate = endDate;
    this.partTime = partTime;
    this.present = false;
    this.description = description;
  }

  public Experience(String name, String location, String jobTitle, String startDate, boolean present, boolean partTime,
      LinkedList<String> description) {
    this.name = name;
    this.location = location;
    this.jobTitle = jobTitle;
    this.startDate = startDate;
    this.endDate = "";
    this.partTime = partTime;
    this.present = present;
    this.description = description;
  }

  public Experience(String name, String location, String jobTitle, String startDate, String endDate, boolean partTime,
      Category category, LinkedList<String> description) {
    this(name, location, jobTitle, startDate, endDate, partTime, description);
    this.category = category;
  }

  public Experience(String name, String location, String jobTitle, String startDate, boolean present, boolean partTime,
      Category category, LinkedList<String> description) {
    this(name, location, jobTitle, startDate, present, partTime, description);
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public boolean isPartTime() {
    return partTime;
  }

  public void setPartTime(boolean partTime) {
    this.partTime = partTime;
  }

  public boolean isPresent() {
    return present;
  }

  public void setPresent(boolean present) {
    this.present = present;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public LinkedList<String> getDescription() {
    return description;
  }

  public void setDescription(LinkedList<String> description) {
    this.description = description;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
    result = prime * result + ((location == null) ? 0 : location.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Experience other = (Experience) obj;
    if (jobTitle == null) {
      if (other.jobTitle != null)
        return false;
    } else if (!jobTitle.equals(other.jobTitle))
      return false;
    if (location == null) {
      if (other.location != null)
        return false;
    } else if (!location.equals(other.location))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();

    s.append("<div style='color: black; '>");
    s.append("<b>");
    s.append(name);
    s.append("</b>, ");
    s.append(location);
    s.append(" - ");
    s.append("<i>");
    s.append(jobTitle);
    s.append("</i>\n<br />\n");
    s.append("</div>\n");
    s.append("<span style=\"color: #656665; \">\n");
    if (partTime) {
      s.append("PART TIME; ");
    }
    s.append(startDate);
    s.append(" - ");
    if (present) {
      s.append("PRESENT");
    } else {
      s.append(endDate);
    }
    s.append("\n<br />\n");
    s.append("<ul style='padding-left: 20'>");
    for (String l : description) {
      s.append("<li>");
      s.append(l);
      s.append("</li>\n");
    }
    s.append("</ul>\n");
    // s.append("<br />");

    return s.toString();
  }

}