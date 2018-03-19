package service;

import entity.Facultet;
import entity.Student;
import entity.Univer;

public class Service {
    public Student setStudent(String name, String surname, String group, String facultet, String srbal, String number, String university, String sphere, String spec){
        Student student = new Student();
        Facultet facultet1 = new Facultet();
        Univer univercity = new Univer();
        facultet1.setGroup(group);
        facultet1.setNamefacultet(facultet);
        facultet1.setNamespeciality(spec);
        univercity.setFacultet(facultet1);
        univercity.setName(university);
        univercity.setSphere(sphere);
        student.setUnivercity(univercity);
        student.setName(name);
        student.setSurname(surname);

        student.setSrbal(srbal);
        student.setNumber(number);
        return  student;


    }
}
