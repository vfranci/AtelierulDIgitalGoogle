package collections.hashmap;

import java.util.Objects;

public class Student {
    private String cnp;
    private String name;

    public Student(String cnp, String name) throws CNPSizeException {
        if(cnp.length() != 10){
            throw new CNPSizeException();
        }
        this.cnp = cnp;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(cnp, student.cnp) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnp);
    }

    public String getCnp() {
        return cnp;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cnp='" + cnp + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static class CNPSizeException extends Throwable {
        public CNPSizeException() {
            super("CNP does not respect size requirements!");
        }
    }
}
