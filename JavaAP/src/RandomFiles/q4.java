class Student{
  private int ID;
  private String name;

  public Student(int anID, String aName){
    ID = anID;
    name = aName;
  }
  
  public int getID(){
    return ID;
  }
  public String getName(){
    return name; 
  }
}

class Classroom{
  private String teacherName;
  private Student[] studentList;
  
  public Classroom(String aTeacherName, Student[] aStudentList){
    teacherName = aTeacherName;
    studentList = aStudentList;
  }
  
  public Student[] getStudents(){
    return studentList;
  }
  public String getTeacherName(){
    return teacherName;
  }
}

class School{
  private Classroom[] classroomList;

  public School(Classroom[] c){
    classroomList = c;
  }

  public String findStudent(String teacherName, int ID){
    Student[] studentList;
    
    for(Classroom i : classroomList){
      if (i.getTeacherName().equals(teacherName)){
        studentList = i.getStudents();
        String name = getStudentName(studentList, 0, studentList.length-1, ID);
        return name;
      } 
    }return null;
  }

  public String getStudentName(Student students[], int l, int r, int targetID){
    if (r >= l) {
      int mid = (r - l) / 2;
      Student s = students[mid];
      int pivotID = s.getID();
        if (pivotID == targetID)
          return s.getName();
        if (pivotID > targetID)
          return getStudentName(students, l, mid - 1, targetID);
 
        return getStudentName(students, mid + 1, r, targetID);
    }
    return "Student Not Found";
  }
}
