package users;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import structs.Education;
import structs.Experience;
import structs.Project;
import structs.Resume;
import structs.VolunteerWork;

public class User {
  private final Resume resume;

  public User(Resume resume) {
    this.resume = resume;
  }

  public User() {
    this(new Resume());
  }

  public Resume getResume() {
    return this.resume;
  }

  public void setResumeComponents() {
    resume.setContact(new HashMap<String, String>(){
      {
        put("Street Address", "");
        put("City", "");
        put("Phone Number", "");
        put("Email", "");
      }
    });

    resume.setSkills(new LinkedList<String>() {
      {
        add("");
      }
    });

    resume.setEducation(new LinkedList<Education>() {
      {
        add(new Education("UNIVERSITY NAME", "COUNTRY", "GRAD DATE", "DEGREE",
            true));
      }
    });

    resume.setProgrammingLanguages(new LinkedHashMap<String, LinkedList<String>>() {
      {
        put("Languages: Proficient", new LinkedList<String>() {
          {
            add("Programming Language");
          }
        });
        put("Languages: Familiar", new LinkedList<String>() {
          {
            add("Programming Language");
            
          }
        });
        put("Frameworks: Proficient", new LinkedList<String>() {
          {
            add("Framework / Library");
          }
        });
        put("Frameworks: Familiar", new LinkedList<String>() {
          {
            add("Framework / Library");
          }
        });
      }
    });

    resume.setInterests(new LinkedList<String>() {
      {
        add("Interest");
      }
    });

    resume.setVolunteerWork(new LinkedList<VolunteerWork>() {
      {
        add(new VolunteerWork("Name of location", "Time frame",
            "Description"));
      }
    });

    resume.setLanguages(new LinkedList<String>() {
      {
        add("Language - Proficiency Level");
      }
    });

    resume.addExperience(new Experience("Job Location", "City Name", "Job Title", "START DATE", true, true,
        new LinkedList<String>() {
          {
            add("Job Description");
          }
        }));
    
    resume.addProject(new Project("Project Name", "Project Type, Project Purpose",
        "Project Description"));
  }
}