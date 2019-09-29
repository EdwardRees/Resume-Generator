import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GenerateResume {

    private Resume resume;

    public GenerateResume(Resume resume) {
        this.resume = resume;
    }

    public GenerateResume() {
        this(new Resume());
    }

    public void setResumeComponents() {
        resume.addExperience(new Experience("The Coder School", "San Francisco", "Coding Coach", "SEP 2019", true, true,
                new LinkedList<String>() {
                    {
                        add("Taught students aged 8-18 programming in Scratch, Python, and JavaScript.");
                    }
                }));
        resume.addExperience(new Experience("PBI Health", "Remote Work", "Technology Lead", "MAR. 2019", true, false,
                new LinkedList<String>() {
                    {
                        add("Research technology solutions");
                        add("Developed the front-end website for their platform using ReactJS");
                    }
                }));
        resume.addExperience(new Experience("S Plus Group Limited", "Hong Kong", "Chief Technology Officer",
                "OCT. 2015", true, true, new LinkedList<String>() {
                    {
                        add("Using React.js, developed the front-end website, utilizing Firebase Hosting to host");
                        add("Advised and managed technology throughout the office");
                    }
                }));
        resume.addExperience(new Experience("Share My Hub", "Remote Work", "Front End Web Developer", "APR. 2018",
                "SEP. 2019", true, new LinkedList<String>() {
                    {
                        add("Provided design and functioning advice");
                        add("Using Vue.js, helped develop the front-end website for their platform");
                    }
                }));
        resume.addExperience(new Experience("Chain Dimenxxion", "Remote Work", "Front End Web Developer", "JAN. 2019",
                "MAR. 2019", false, new LinkedList<String>() {
                    {
                        add("Provided design and functioning advice");
                        add("Developed the front-end website for their platform using HTML5, CSS3, and jQuery");
                    }
                }));
        resume.addExperience(new Experience("Foodie Magazine", "Hong Kong", "Event Staff", "SEP. 2015", "AUG. 2018",
                true, new LinkedList<String>() {
                    {
                        add("Worked events including setting up and customer service");
                    }
                }));
        resume.addProject(new Project("College Selector", "Mobile Application, Personal Project",
                "Used <b>React Native JavaScript</b> to create a mobile application helping university applicants to graphically understand their target schools using personally weighted criteria and individual school scores for comparison.  Available on Google Play and Apple App stores."));

    }

    private String template(String body) {
        StringBuilder s = new StringBuilder();
        s.append("<html>\n");
        s.append("<head>\n");
        s.append(
                "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
        s.append("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
        s.append(
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
        s.append("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
        s.append("<style>\n");
        s.append("body { padding: 20; width: 595; height: 842; } \n");
        s.append("h1 { font-weight: bold; height: 150%; padding-bottom: 30 }\n");
        s.append(
                ".header { color: #2079C7; text-transform: uppercase;  font-weight: bold; padding-top: 10; padding-bottom: 10; }\n");

        s.append("</style>\n");

        s.append("</head>\n");

        s.append("<body>\n");
        s.append(body);
        s.append("\n</body>\n");
        s.append("</html>\n");

        return s.toString();
    }

    private String getContact() {
        HashMap<String, String> contact = resume.getContact();
        StringBuilder s = new StringBuilder();
        s.append("<div class='contact'>");
        s.append(contact.get("Street Address"));
        s.append("\n<br />\n");
        s.append(contact.get("City"));
        s.append("\n<br />\n");
        s.append("<b>\n");
        s.append(contact.get("Phone Number"));
        s.append("\n<br />\n");
        s.append(contact.get("Email"));
        s.append("\n</b>\n");
        s.append("</div>\n");
        return s.toString();
    }

    private String getExperience() {
        StringBuilder s = new StringBuilder();

        for (Experience e : resume.getExperiences()) {
            s.append(e.toString());
        }

        return s.toString();
    }

    private String getEducation() {
        StringBuilder s = new StringBuilder();
        for (Education e : resume.getEducation()) {
            s.append(e.toString());
        }
        return s.toString();
    }

    private String getProjects() {
        StringBuilder s = new StringBuilder();
        for (Project e : resume.getProjects()) {
            s.append(e.toString());
        }
        return s.toString();
    }

    private String getVolunteerWork() {
        StringBuilder s = new StringBuilder();
        for (VolunteerWork e : resume.getVolunteerWork()) {
            s.append(e.toString());
        }
        return s.toString();
    }

    private String getSkills() {
        StringBuilder s = new StringBuilder();
        for (String e : resume.getSkills()) {
            s.append("<span style='color: #656665;'>");
            s.append("- ");
            s.append(e);
            s.append("</span>\n<br/>\n");
        }
        return s.toString();
    }

    private String getLanguages() {
        StringBuilder s = new StringBuilder();
        for (String e : resume.getLanguages()) {
            s.append("<span style='color: #656665;'>");
            s.append("");
            s.append(e);
            s.append("</span>\n<br />\n");
        }
        return s.toString();
    }

    private String getProgrammingLanguages() {
        StringBuilder s = new StringBuilder();
        LinkedHashMap<String, LinkedList<String>> l = resume.getProgrammingLanguages();
        for (String key : l.keySet()) {
            s.append("<b style='color: black'>");
            s.append(key);
            s.append("</b>\n<br/>");
            s.append("<span style='color: #656665'>");
            for (String lang : l.get(key)) {
                s.append(lang);
                s.append(", ");
            }
            s.append("</span>\n<br />\n");
        }
        return s.toString();
    }

    private String getInterests() {
        StringBuilder s = new StringBuilder();

        for (String str : resume.getInterests()) {
            s.append("<span style='color: #656665'>");
            s.append(str);
            s.append("</span>\n<br />\n");
        }
        return s.toString();
    }

    public String generate() {
        setResumeComponents();

        // resume.removeExperience(new Experience("S Plus Group Limited", "Hong Kong", "Chief Technology Officer",
        //         "OCT. 2015", true, true, new LinkedList<>()));
        StringBuilder s = new StringBuilder();
        s.append("<div class='container-fluid'>\n");
        s.append("<div class='row'>");
        s.append("<div class='col-sm-8'>");
        s.append("<h1>" + resume.getName() + "</h1>");
        s.append("</div>");
        s.append("<div class='col-sm-1'></div>");
        s.append("<div class='col-sm-3'>");
        s.append(getContact());
        s.append("<br />");
        s.append("</div>");
        s.append("</div>");
        s.append("<div class='row'>");
        s.append("<div class='col-sm-8'>");
        // s.append("<h1>" + resume.getName() + "</h1>");
        s.append("<span class='header'>\n");
        s.append("Experience");
        s.append("</span>\n");
        // s.append("\n<br /><br />\n");
        s.append(getExperience());
        s.append("<span class='header'>\n");
        s.append("Education");
        s.append("</span>\n");
        // s.append("\n<br/>\n");
        s.append(getEducation());
        s.append("\n<br /><br />\n");
        s.append("<span class='header'>\n");
        s.append("Projects");
        s.append("</span>\n");
        // s.append("\n<br/><br />\n");
        s.append(getProjects());
        s.append("\n<br/><br />\n");
        s.append("<span class='header'>\n");
        s.append("Volunteer Work");
        s.append("</span>\n");
        // s.append("\n<br/><br />\n");
        s.append(getVolunteerWork());
        s.append("\n<br/><br />\n");
        s.append("</div>");
        s.append("<div class='col-sm-1'></div>");

        s.append("<div class='col-sm-3'>");
        s.append("<span class='header'>\n");
        s.append("Skills");
        s.append("</span>\n");
        s.append("\n<br/>\n");
        s.append(getSkills());
        s.append("\n<br/>\n");
        s.append("<span class='header'>\n");
        s.append("Languages");
        s.append("</span>\n");
        s.append("\n<br/>\n");
        s.append(getLanguages());
        s.append("\n<br/>\n");

        s.append("<span class='header'>\n");
        s.append("Programming");
        s.append("</span>\n");
        s.append("\n<br/>\n");
        s.append(getProgrammingLanguages());
        s.append("\n<br/>\n");

        s.append("<span class='header'>\n");
        s.append("Interests");
        s.append("</span>\n");
        s.append("\n<br/>\n");
        s.append(getInterests());
        s.append("\n<br/><br />\n");

        s.append("\n</div>\n");
        s.append("</div>");
        s.append("</div>");

        String file = this.template(s.toString());
        return file;
    }

    public void write() {

        File defaultDir = new File("/Users/edwardrees/Projects/Resume Generator/");

        File file = new File(defaultDir, "index.html");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write(generate());
        } catch (IOException e) {
            e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
        } finally {
            if (writer != null)
                try {
                    writer.close();
                } catch (IOException ignore) {
                }
        }
        System.out.printf("File is located at %s%n", file.getAbsolutePath());

    }

    public static void main(String[] args) {
        GenerateResume r = new GenerateResume();
        r.write();
    }
}