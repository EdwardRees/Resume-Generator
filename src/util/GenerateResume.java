package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import structs.Education;
import structs.Experience;
import structs.Project;
import structs.Resume;
import structs.VolunteerWork;
import users.User;

public class GenerateResume {

    private Resume resume;
    private User user;

    public GenerateResume(User user){
      this.user = user;
      this.resume = user.getResume();
    }
    private String template(String body) {
        StringBuilder s = new StringBuilder();
        s.append("<html>\n");
        s.append("<head>\n");
        s.append("<link rel=\"stylesheet\" href=\"/static/css/bootstrap.min.css\">\n");
        s.append("<script src=\"/static/js/jquery-3.3.1.slim.min.js\"></script>\n");
        s.append("<script src=\"/static/js/popper.min.js\"></script>\n");
        s.append("<script src=\"/static/js/bootstrap.min.js\"></script>\n");
        s.append("<style>\n");
        s.append("body { padding: 40; width: 595; height: 842; } \n");
        s.append("h1 { font-weight: bold; height: 150%; padding-bottom: 30; text-align-vertical: center }\n");
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
            s.append("<br />");
            s.append("<br />");
        }
        s.delete(s.length() - "<br /><br />".length(), s.length());
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
        user.setResumeComponents();
        resume = user.getResume();

        StringBuilder s = new StringBuilder();
        s.append("<div class='container-fluid'>\n");
        s.append("<div class='row'>");
        s.append("<div class='col-sm-8'>");
        s.append("<h1>" + resume.getName() + "</h1>");
        s.append("</div>");
        s.append("<div class='col-sm-4'>");
        s.append(getContact());
        s.append("<br />");
        s.append("</div>");
        s.append("</div>");
        s.append("<div class='row'>");
        s.append("<div class='col-sm-8'>");
        s.append("<span class='header'>\n");
        s.append("Experience");
        s.append("</span>\n");
        s.append(getExperience());
        s.append("<span class='header'>\n");
        s.append("Education");
        s.append("</span>\n");
        s.append(getEducation());
        s.append("\n<br /><br />\n");
        s.append("<span class='header'>\n");
        s.append("Projects");
        s.append("</span>\n");
        s.append(getProjects());
        s.append("\n\n");
        s.append("<span class='header'>\n");
        s.append("Volunteer Work");
        s.append("</span>\n");
        s.append(getVolunteerWork());
        s.append("\n<br/><br />\n");
        s.append("</div>");


        s.append("<div class='col-sm-4'>");
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

    public void write(Path path){
      this.resume = user.getResume();
      try(BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
        writer.write(generate());
        System.out.printf("File located at %s%n", path.toAbsolutePath());
      } catch(IOException e){
        System.out.println("Invalid file address");
      } 
    }

    public void write() {
        // String directory = System.getProperty("user.dir");
        // File defaultDir = new File(directory + "/../public");

        // File file = new File(defaultDir, "index.html");
        // FileWriter writer = null;
        // try {
        //     writer = new FileWriter(file);
        //     writer.write(generate());
        // } catch (IOException e) {
        //     e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
        // } finally {
        //     if (writer != null)
        //         try {
        //             writer.close();
        //         } catch (IOException ignore) {
        //         }
        // }
        // System.out.printf("File is located at %s%n", file.getAbsolutePath());
        write(Path.of(".", "public").resolve("index.html").toAbsolutePath().normalize());

    }

}