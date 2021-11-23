package users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import structs.Education;
import structs.Experience;
import structs.Project;
import structs.Resume;
import structs.VolunteerWork;
import structs.Category;

public class Edward extends User {

  private final Resume resume;

  public Edward() {
    super(new Resume("Edward Rees"));
    this.resume = new Resume("Edward Rees");
  }

  public Edward(Resume resume) {
    this.resume = resume;
  }

  @Override
  public Resume getResume() {
    return this.resume;
  }

  @Override
  public void setResumeComponents() {

    resume.setName("Edward Rees");

    resume.setContact(new HashMap<String, String>() {
      {
        put("Street Address", "222 North Willard Street");
        put("City", "San Francisco, CA 94118");
        put("Phone Number", "+1 (415) 917-7833, +852 9574 7948");
        // put("Street Address", "S Plus Group Limited<br />Unit 1507, 15th Floor<br
        // />Chai Wan Industrial City Phase 2<br/>70 Wing Tai Road");
        // put("City", "Chai Wan, Hong Kong SAR");
        // put("Phone Number", "+852 9574-7948");

        put("Email", "erees.hk@gmail.com");
      }
    });

    resume.setSkills(new LinkedList<String>() {
      {
        add("Strong listening, communication, and collaboration capability");
        add("Clear understanding of Web Development");
        add("Project execution skills including planning and programming logic");
      }
    });

    resume.setEducation(new LinkedList<Education>() {
      {
        // add(new Education("University of San Francisco", "USA", "MAY 2023", "M.A.
        // Education", true));
        add(new Education("University of San Francisco", "USA", "MAY 2022",
            "B.S. Computer Science, Minor Psychology<br>Concurrently pursuing a Masters of Arts in Teacher's Education",
            true)
        // new ArrayList<String>() {
        // {
        // add("Introduction to Computer Science I");
        // add("Introduction to Computer Science II");
        // add("Data Structures and Algorithms");
        // add("C and Systems Programming");
        // add("Software Development");
        // add("Calculus I");
        // add("Biological Psychology");
        // add("Social Psychology");
        // add("Written Communications I");
        // add("Written Communications II");
        // add("European Civilizations");
        // }
        );
        add(new Education("Hong Kong International School", "Hong Kong", "JUN 2018", "High School Diploma", false
        // new ArrayList<String>() {
        // // {
        // // add("AP Computer Science A");
        // // add("AP Psychology");
        // // add("AP Calculus AB");
        // // add("AP English Language and Composition");
        // // }
        // }
        ));
      }
    });

    resume.setProgrammingLanguages(new LinkedHashMap<String, LinkedList<String>>() {
      {
        put("Languages: Proficient", new LinkedList<String>() {
          {
            add("JavaScript");
            add("TypeScript");
            add("Java");
            add("Python");
            add("HTML/CSS");
          }
        });
        put("Languages: Familiar", new LinkedList<String>() {
          {
            add("C");
            add("C++");
            add("PHP");
            add("SQL");
          }
        });
        put("Frameworks/Libraries: Proficient", new LinkedList<String>() {
          {
            add("React.js");
            add("Bootstrap");
            add("jQuery");
            add("React Native");
          }
        });
        put("Frameworks/Libraries: Familiar", new LinkedList<String>() {
          {
            add("Express.JS");
            add("MongoDB");
            add("Vue.js");
            add("Node.js");
            add("WordPress");
          }
        });
      }
    });

    resume.setInterests(new LinkedList<String>() {
      {
        add("Sailing: Level 1-3 Certification and base keelboat Certification,");
        add("Drumming,");
        add("Teaching,");
        add("International Travel; 19 countries");
      }
    });

    resume.setVolunteerWork(new LinkedList<VolunteerWork>() {
      {
        // add(new VolunteerWork("Gateway Middle School", "AUG 2021 - DEC 2021", "Served
        // as a mentee teacher; Supported students in small groups; Taught a lesson at
        // the end of the semester"));
        add(new VolunteerWork("STEMChats", "JAN 2020 - MAR 2020", "Created lesson plans using Google Drive services"));
        add(new VolunteerWork("Hong Kong International School Sailing Club", "2014-2018",
            "Established and led 24 student sailing club"));
        add(new VolunteerWork("Peer to Peer", "2016-2018",
            "Participated in student led Social Peer Counseling group with 15 students"));
      }
    });

    resume.setLanguages(new LinkedList<String>() {
      {
        add("English - Native");
        add("Cantonese - Limited Working");
        add("Mandarin - Limited Working");
      }
    });
    resume.addExperience(new Experience("University of San Francisco", "San Francisco", "TA and WebMaster", "JAN 2021",
        true, false, Category.TEACHING, new LinkedList<String>() {
          {
            add("Updated and maintained the website for the CS221 Introduction to C and Systems Programming course");
            add("Graded Labs, Projects, and Assignments");
            add("Tutored students on topics of C");
          }
        }));
    resume.addExperience(new Experience("Gateway Middle School", "San Francisco", "Teacher Mentee", "AUG 2021",
        "DEC 2021", true, Category.TEACHING, new LinkedList<String>() {
          {
            add("Provided support with small group work in a 7th Grade Mathematics Classroom");
          }
        }));
    resume.addExperience(new Experience("University of San Francisco", "San Francisco", "Tutor", "SEP 2020", "JAN 2021",
        false, Category.TEACHING, new LinkedList<String>() {
          {
            add("Tutored students in lower division undergraduate Computer Science classes");
            add("Tutored students in USF classes: CS110, CS112, CS212, CS221, CS245");
            add("Taught students how to debug their code");
          }
        }));
    resume.addExperience(new Experience("The Coder School", "San Francisco", "Coding Coach", "SEP 2019", true, true,
        Category.TEACHING, new LinkedList<String>() {
          {
            add("Taught students aged 8-18 programming in Scratch, HTML, CSS, Python, JavaScript, C++, and ReactJS.");
            add("Helped a student develop a mobile application using React Native");
            add("Taught a student data structures in Python");
            add("Taught a student how to create an autocorrect system using Python and a Trie data structure");
            add("Taught Test Driven Development");
          }
        }));
    resume.addExperience(new Experience("MAST Education", "Hong Kong", "Tutor and Mentor", "AUG 2020", "AUG 2021", true,
        Category.TEACHING, new LinkedList<String>() {
          {
            add("Tutored students taking AP classes in High School");
            add("Mentored students looking at University and seeking guidance on their future academic paths");
          }
        }));
    resume.addExperience(new Experience("Hong Kong International School", "Hong Kong", "Summer Intern", "JUN 2021",
        "JUL 2021", false, Category.PROGRAMMING, new LinkedList<String>() {
          {
            add("Updated school information system (PowerSchool) to better serve the community by implementing new search functionality, new pages to better view information, and updating the main page to utilize updated functionality built by PowerSchool.");
            add("Created a service to simplify and contain the previous system of keeping notes on meetings between Students, Counselors, and Teachers, transitioning the previous system from a 200+ sheet spreadsheet into a single system, with a cleaner means to view and access data.");
            add("Using a Fuzzy string matching system, created a system to help filter through 10000 user addresses, removing duplicates and similar addresses, in order to find distinct addresses paired with individual users.");
          }
        }));
    resume.addExperience(new Experience("Kactus Limited", "Hong Kong", "Coding Intern", "JUN 2020", "JUN 2020", false,
        Category.PROGRAMMING, new LinkedList<String>() {
          {
            add("Helped transition a website for a Hotel from their current design to a new WordPress website using PHP.");
          }
        }));

    resume.addExperience(new Experience("myFlexi", "San Francisco", "Lead Mobile Developer", "MAY 2019", "AUG 2020",
        false, Category.PROGRAMMING, new LinkedList<String>() {
          {
            add("Using React Native, adapted a purely iOS application to a cross platform mobile application.");
          }
        }));
    resume.addExperience(new Experience("S Plus Group Limited", "Hong Kong", "Chief Technology Officer", "OCT. 2015",
        true, true, Category.PROGRAMMING, new LinkedList<String>() {
          {
            add("Using React.js, developed the front-end website, utilizing Firebase Hosting to host");
            add("Advised and managed technology throughout the office");
          }
        }));
    resume.addExperience(new Experience("PBI Health", "Remote Work", "Technology Lead", "MAR. 2019", "DEC. 2019", false,
        Category.PROGRAMMING, new LinkedList<String>() {
          {
            add("Researched technology solutions");
            add("Developed the front-end website for their platform using ReactJS");
          }
        }));
    resume.addExperience(new Experience("Share My Hub", "Remote Work", "Front End Web Developer", "APR. 2018",
        "SEP. 2019", true, Category.PROGRAMMING, new LinkedList<String>() {
          {
            add("Provided design and functioning advice");
            add("Using Vue.js, helped develop the front-end website for their platform");
          }
        }));
    resume.addExperience(new Experience("Chain Dimenxxion", "Remote Work", "Front End Web Developer", "JAN. 2019",
        "MAR. 2019", false, Category.PROGRAMMING, new LinkedList<String>() {
          {
            add("Provided design and functioning advice");
            add("Developed the front-end website for their platform using HTML5, CSS3, and jQuery");
          }
        }));
    resume.addExperience(new Experience("Foodie Magazine", "Hong Kong", "Event Staff", "SEP. 2015", "AUG. 2018", true,
        Category.OTHER, new LinkedList<String>() {
          {
            add("Worked events including setting up and customer service");
          }
        }));
    resume.addProject(new Project("College Selector", "Mobile Application, Personal Project",
        "Used <b>React Native JavaScript</b> and <b>Google's Firebase</b> to create a mobile application helping university applicants to graphically understand their target schools using personally weighted criteria and individual school scores for comparison. Available on Google Play and Apple App stores."));
    resume.addProject(new Project("Search Engine", "Full Stack Search Engine, School Project",
        "Created a full stack multi-threaded search engine in Java using an Inverted Index to store data scraped from a seed url, served to a Jetty Web Server. Soon to be available to try online."));
    resume.addProject(new Project("Gratitude Journal App", "Mobile Application, Personal Project",
        "Used <b>React Native JavaScript</b> to create a mobile application to aid in the process of becoming more mindful and present by allowing the user to take note of three to five things they are grateful for every day. Soon to be available on Google Play and Apple App stores."));

    resume.removeExperience(resume.getExperienceByName("S Plus Group Limited"));
    resume.removeProject(resume.getProjectByName("Search Engine"));

    resume.hideCategory(Category.TEACHING);
    // resume.hideCategory(Category.PROGRAMMING);
    resume.hideCategory(Category.OTHER);
  }

}