public class VolunteerWork {
    private String name, duration, information;
    public VolunteerWork(String name, String duration, String information){
        this.name = name;
        this.duration = duration;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("<div style='color: black'>\n");
        s.append("<b>");
        s.append(name);
        s.append("</b>");
        s.append(", ");
        s.append(duration);
        s.append("</div>\n");
        // s.append("\n<br />\n");
        s.append("<span style='color: #656665'>\n");
        s.append(information);
        s.append("<br />\n");
        s.append("</span>\n");

        return s.toString();
    }   
}