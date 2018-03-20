package test.java;


import org.junit.*;
import org.junit.Ignore;
import  static org.junit.Assert.*;

public class SimpleTest {
    Person person;
    School school;

    @Before
    public void open() {
        person = new Person();
        school = new School();
    }
    @After
    public void closer(){
        person =  null;
        school = null;
    }
    @Test
    public void test1(){
        System.out.print("Test one");
    }

    @Test
    public void Test2(){
        person.setName("Sisa");
        Assert.assertNotNull(person.getName());
    }

    @Test
    public void Test3(){
        school.setSchoolName("Nongeke");
        Assert.assertNotNull(school.getSchoolName());
    }

    @Test
    public void Test4(){
        person.setName("Sisa");
        school.setSchoolName("NMU");
        Assert.assertNotSame(person.getName(),school.getSchoolName());
    }
}
