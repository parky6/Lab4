package LabFour;

/**
 * This class is for faculty data and it overriding getName() method in Employee class.
 */
public class Faculty extends Employee implements Rules{
    private String courses[];

    /**
     * This is default constructor with some parameters.
     * @param name
     * @param salary
     * @param firstCourses
     */
    public Faculty(String name, int salary, String[]firstCourses){
        setName(name);
        setSalary(salary);
        courses=new String[firstCourses.length];
        for(int a=0;a<firstCourses.length;a++){
            courses[a] = firstCourses[a];
        }

    } //Notice that name and salary can be initialized using the constructor of the superclass.  Notice that the input parameter courses is plural.

    /**
     * Getting faculty's name from Employee class
     * @return It returns name with word 'professor'
     */
    public String getName(){
        String profName = "Professor "+name;
        return profName; // 이렇게 professor이름 넣으라는건지 ....모르겠당.
    }

    /**
     * This method makes new String array, and then copies all words in String array
     * @return a string reference.
     */
    public String[] getCourses(){
        String copyCourses[] = new String[courses.length];
        for(int a=0; a<courses.length ; a++){
            copyCourses[a]=courses[a];
        }
        return copyCourses;
    }

    /**
     * This method gather all courses name to a String.
     * @return a String included all courses name.
     */
    public String getCourseNames(){
        //It has a public accessor getCourseNames that gets all of the course names as a string.  ??? 모든 이름을 합치라는 건가..
        String allCourses = courses[0];
        for(int b=1;b<courses.length;b++){
            allCourses+=String.format(" "+courses[b]);
        }
        return allCourses;
    }

    /**
     * Extending the String array and adding all courses with new courses.
     * @param addCourses
     */
    public void setCourses(String[] addCourses) {
        if(courses ==null){
            courses = new String[2];
        }else{
            String[] temp = new String[(addCourses.length)+courses.length];
            for(int p=0;p<courses.length;p++){
                temp[p] = courses[p];
            }
            for(int cd= courses.length; cd< (addCourses.length+courses.length);cd++)
                temp[cd] = addCourses[cd-courses.length];
            courses = temp;
        }
    }

    /**
     * This method is to show a faculty's information.
     * @return a String included faculty's name and courses.
     */
    public String toString(){
        String infoF = String.format("Faculty name: %s, Falculty courses: %s",getName(),getCourseNames());
        return infoF;
    }





}
