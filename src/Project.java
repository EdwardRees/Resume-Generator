public class Project {
    private String name, type, information;

    public Project(String name, String type, String information) {
        this.name = name;
        this.type = type;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("<div style='color: black; '>");
        s.append("<b>");
        s.append(name);
        s.append("</b> - ");
        s.append("<i>");
        s.append(type);
        s.append("</i>\n<br />\n");
        s.append("</div>");
        s.append("<span style=\"color: #656665;\">");
        s.append(information);
        s.append("</span>");

        return s.toString();
    }
}