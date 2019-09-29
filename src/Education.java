import java.lang.StringBuilder;

public class Education {
    private String name, location, graduationDate, information;
    private boolean past;


    public Education(String name, String location, String graduationDate, String information, boolean past) {
        this.name = name;
        this.location = location;
        this.graduationDate = graduationDate;
        this.information = information;
        this.past = past;
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

    public boolean getPast() {
        return past;
    }

    public void setPast(boolean past) {
        this.past = past;
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
        if(past){
            s.append("INTENDED GRADUATION - ");
        }
        s.append(graduationDate);
        s.append("\n<br />\n");
        s.append(information);
        s.append("\n</span>");
        return s.toString();
    }

}