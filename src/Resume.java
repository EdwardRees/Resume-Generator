import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.HashMap;

public class Resume {
    private final String NAME = "Edward Rees";
    private HashMap<String, String> contact;

    private LinkedList<Experience> experiences;
    private LinkedList<String> skills;
    private LinkedList<Education> education;
    private LinkedList<Project> projects;
    private LinkedHashMap<String, LinkedList<String>> programmingLanguages;
    private LinkedList<String> interests;
    private LinkedList<VolunteerWork> volunteerWork;
    private LinkedList<String> languages;

    public Resume() {
        this.contact = new HashMap<String, String>() {
            {
                put("Street Address", "563 41st Avenue");
                put("City", "San Francisco, CA 94121");
                put("Phone Number", "(415) 917-7833");
                put("Email", "erees.hk@gmail.com");
            }
        };
        this.experiences = new LinkedList<Experience>();
        this.skills = new LinkedList<String>() {
            {
                add("Strong listening, communication, and collaboration capability");
                add("Clear understanding of Web Development");
                add("Project execution skills including planning and programming logic");
            }
        };
        this.education = new LinkedList<Education>() {
            {
                add(new Education("University of San Francisco", "USA", "MAY 2022",
                        "B.S. Computer Science, Minor Psychology", true));
            }
        };
        this.projects = new LinkedList<Project>();
        this.programmingLanguages = new LinkedHashMap<String, LinkedList<String>>() {
            {
                put("Languages: Proficient", new LinkedList<String>() {
                    {
                        add("JavaScript");
                        add("Java");
                        add("Python");
                        add("HTML/CSS");
                    }
                });
                put("Languages: Familiar", new LinkedList<String>() {
                    {
                        add("TypeScript");
                    }
                });
                put("Frameworks: Proficient", new LinkedList<String>() {
                    {
                        add("React.js");
                        add("Bootstrap");
                        add("jQuery");
                    }
                });
                put("Frameworks: Familiar", new LinkedList<String>() {
                    {
                        add("React Native");
                        add("Vue.js");
                        add("Node.js");
                    }
                });
            }
        };
        this.interests = new LinkedList<String>() {
            {
                add("Sailing: Level 1-3 and keelboat");
                add("Drumming");
                add("Teaching");
                add("International Travel; 18 countries");
            }
        };
        this.volunteerWork = new LinkedList<VolunteerWork>() {
            {
                add(new VolunteerWork("Hong Kong International School Sailing Club", "2014-2018",
                        "Established and led 24 student sailing club"));
                add(new VolunteerWork("Peer to Peer", "2016-2018",
                        "Participated in student led Social Peer Counseling group with 15 students"));
            }
        };
        this.languages = new LinkedList<String>() {
            {
                add("English - Native");
                add("Cantonese - Limited Working");
                add("Mandarin - Limited Working");
            }
        };
    }

    public boolean addExperience(Experience e) {
        if (experiences.contains(e)) {
            return false;
        }
        experiences.add(e);
        return true;
    }

    public boolean removeExperience(Experience e) {
        if (!experiences.contains(e)) {
            return false;
        }
        experiences.remove(e);
        return true;
    }


    public boolean editContact(String key, String value) {
        if (contact.containsKey(key)) {
            contact.put(key, value);
            return true;
        }
        return false;
    }

    public boolean addSkill(String skill) {
        if (skills.contains(skill)) {
            return false;
        }
        skills.add(skill);
        return true;
    }

    public boolean removeSkill(String skill) {
        if (!skills.contains(skill)) {
            return false;
        }
        skills.remove(skill);
        return true;
    }

    public boolean addProgrammingLanguage(boolean proficient, String name) {
        String category = proficient ? "Languages: Proficient" : "Languages: Familiar";
        if (programmingLanguages.containsKey(category)) {
            return false;
        } else {
            programmingLanguages.get(category).add(name);
            return true;
        }

    }

    public boolean addProgrammingFramework(boolean proficient, String name) {
        String category = proficient ? "Frameworks: Proficient" : "Frameworks: Familiar";
        if (programmingLanguages.containsKey(category)) {
            return false;
        } else {
            programmingLanguages.get(category).add(name);
            return true;
        }

    }
    public boolean addVolunteerWork(VolunteerWork v){
        if(volunteerWork.contains(v)){
            return false;
        }
        volunteerWork.add(v);
        return true;
    }
    public boolean addProject(Project p){
        if(projects.contains(p)){
            return false;
        }
        projects.add(p);
        return true;
    }

    public String getName() {
        return NAME;
    }

    public HashMap<String, String> getContact() {
        return contact;
    }

    public void setContact(HashMap<String, String> contact) {
        this.contact = contact;
    }

    public LinkedList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(LinkedList<Experience> experiences) {
        this.experiences = experiences;
    }

    public LinkedList<String> getSkills() {
        return skills;
    }

    public void setSkills(LinkedList<String> skills) {
        this.skills = skills;
    }

    public LinkedList<Education> getEducation() {
        return education;
    }

    public void setEducation(LinkedList<Education> education) {
        this.education = education;
    }

    public LinkedList<Project> getProjects() {
        return projects;
    }

    public void setProjects(LinkedList<Project> projects) {
        this.projects = projects;
    }

    public LinkedHashMap<String, LinkedList<String>> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(LinkedHashMap<String, LinkedList<String>> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public LinkedList<String> getInterests() {
        return interests;
    }

    public void setInterests(LinkedList<String> interests) {
        this.interests = interests;
    }

    public LinkedList<VolunteerWork> getVolunteerWork() {
        return volunteerWork;
    }

    public void setVolunteerWork(LinkedList<VolunteerWork> volunteerWork) {
        this.volunteerWork = volunteerWork;
    }

    public LinkedList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(LinkedList<String> languages) {
        this.languages = languages;
    }

    

}