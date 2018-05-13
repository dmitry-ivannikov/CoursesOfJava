package ee.cdi;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@WebServlet("/diExample")
public class DependencyInjectionExample extends HttpServlet{
     //first variant
    //Student student;
   @Inject
//   @StudentAnotation
    Person student;

//    //second variant
//    @Inject
//    public DependencyInjectionExample(Student student){
//        this.student = student;
//    }

//    @Inject //thed wariant
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(student.getName());
    }
}

//@Qualifier
//@Retention(RUNTIME)
//@Target({FIELD, TYPE, METHOD})
//@interface StudentAnotation{}

interface Person{
    String getName();
}

//@StudentAnotation

@Alternative
class Student implements Person{
    private String name;

    public String getName() {
        name = "Student";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Worker implements Person{
    @Override
    public String getName() {
        return "worker";
    }
}