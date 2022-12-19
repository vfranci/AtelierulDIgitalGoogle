package collections.hashmap;

import java.util.HashMap;
import java.util.List;

public class StudentDataBase {
    private HashMap<String, Student> students = new HashMap<>();
    public StudentDataBase(List<Student> students){
        students.forEach(currentStudent-> this.students.put(currentStudent.getCnp(), currentStudent));
    }
    public String findStudentName(String cnp) throws Student.CNPSizeException {
        if(cnp.length()!=10)
            throw new Student.CNPSizeException();
        Student s = students.get(cnp);
        if(s==null) return null;
        return s.getName();
    }
}
