package structs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Resume {
  private String NAME;
  private HashMap<String, String> contact;

  private LinkedList<Experience> experiences;
  private LinkedList<String> skills;
  private LinkedList<Education> education;
  private LinkedList<Project> projects;
  private LinkedHashMap<String, LinkedList<String>> programmingLanguages;
  private LinkedList<String> interests;
  private LinkedList<VolunteerWork> volunteerWork;
  private LinkedList<String> languages;
  private HashSet<Category> categories;

  public Resume(String name) {
    this.NAME = name;
    this.contact = new HashMap<>();
    this.experiences = new LinkedList<Experience>();
    this.skills = new LinkedList<String>();
    this.education = new LinkedList<>();
    this.projects = new LinkedList<Project>();
    this.programmingLanguages = new LinkedHashMap<String, LinkedList<String>>();
    this.interests = new LinkedList<String>();
    this.volunteerWork = new LinkedList<VolunteerWork>();
    this.languages = new LinkedList<String>();
    this.categories = new HashSet<Category>();
  }

  public Resume() {
    this("");
  }

  public boolean addExperience(Experience e) {
    if (experiences.contains(e)) {
      return false;
    }
    experiences.add(e);
    this.categories.add(e.getCategory());
    return true;
  }

  public void hideCategory(Category c) {
    this.categories.remove(c);
    LinkedList<Experience> experiences = new LinkedList<Experience>(this.experiences);
    for (Experience e : this.experiences) {
      if (e.getCategory() == c) {
        experiences.remove(e);
      }
    }
    this.experiences = experiences;
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

  public boolean addVolunteerWork(VolunteerWork v) {
    if (volunteerWork.contains(v)) {
      return false;
    }
    volunteerWork.add(v);
    return true;
  }

  public boolean addProject(Project p) {
    if (projects.contains(p)) {
      return false;
    }
    projects.add(p);
    return true;
  }

  public boolean removeProject(Project p) {
    if (!projects.contains(p)) {
      return false;
    }
    projects.remove(p);
    return true;
  }

  public String getName() {
    return NAME;
  }

  public void setName(String name) {
    this.NAME = name;
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

  public Experience getExperienceByName(String name) {
    for (Experience e : this.experiences) {
      if (e.getName().equals(name)) {
        return e;
      }
    }
    return null;
  }

  public Project getProjectByName(String name) {
    for (Project p : this.projects) {
      if (p.getName().equals(name)) {
        return p;
      }
    }
    return null;
  }

}