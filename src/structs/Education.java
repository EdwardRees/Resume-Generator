package structs;

import java.util.ArrayList;
import java.util.List;

public class Education {
  private String name, location, graduationDate, information;
  private boolean ongoing;
  private ArrayList<String> courseWork;

  public Education(String name, String location, String graduationDate, String information, boolean ongoing,
      ArrayList<String> courseWork) {
    this.name = name;
    this.location = location;
    this.graduationDate = graduationDate;
    this.information = information;
    this.ongoing = ongoing;
    this.courseWork = courseWork;
  }

  public Education(String name, String location, String graduationDate, String information, boolean ongoing) {
    this(name, location, graduationDate, information, ongoing, null);
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

  public String getGraduationDate() {
    return graduationDate;
  }

  public void setGraduationDate(String graduationDate) {
    this.graduationDate = graduationDate;
  }

  public String getInformation() {
    return information;
  }

  public void setInformation(String information) {
    this.information = information;
  }

  public boolean getOngoing() {
    return ongoing;
  }

  public void setOngoing(boolean ongoing) {
    this.ongoing = ongoing;
  }

  public void setCourseWork(ArrayList<String> courseWork) {
    this.courseWork = courseWork;
  }

  public ArrayList<String> getCourseWork() {
    return this.courseWork;
  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("<div style='color: black'>\n");
    s.append("<b>");
    s.append(name);
    s.append("</b>");
    s.append(", ");
    s.append(location);
    s.append("\n<br />\n");
    s.append("</div>\n");
    s.append("<span style=\"color: #656665\">\n");
    if (ongoing) {
      s.append("INTENDED GRADUATION - ");
    }
    s.append(graduationDate);
    s.append("\n<br />\n");
    s.append(information);
    s.append("\n");
    if (courseWork != null) {
      s.append("<br>\n");
      s.append("<span style=\"font-weight: 700\"> Relevant Course Work: <span style=\"font-weight: 500\">");
      courseWork.forEach(work -> {
        s.append(String.format("%s, ", work));
      });
      s.deleteCharAt(s.length() - 2);
      s.append("</span>");
      s.append("</span>");
    }
    s.append("</span>");
    return s.toString();
  }

}