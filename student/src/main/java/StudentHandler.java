import org.apache.thrift.TException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentHandler implements StudentService.Iface {

    @Override
    public void delStudent(String name) throws TException {
        File file = new File(name);
        file.delete();
    }


    @Override
    public void createStud(Student student) throws TException {
        System.out.println("lol");
        File file = new File("D:\\students\\"+student.getSurname() + ".txt");
        try
        {
            System.out.println("ghbdtn");
            // открываем поток для записи
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            // пишем данные
            bw.write("Name: " + student.getName() + "\n");
            bw.write("Family: " + student.getSurname() + "\n");

            bw.write("Univercity" + student.getUnivercity().getName()+"\n");
            bw.write("Sphere" + student.getUnivercity().getSphere()+"\n");
            bw.write("Group: " + student.getUnivercity().getFacultet().getGroup() + "\n");
            bw.write("Facultet: " + student.getUnivercity().getFacultet().getNamefacultet() + "\n");
            bw.write("Speciality: " + student.getUnivercity().getFacultet().getNamespeciality() + "\n");

            bw.write("Sr.Bal: " + student.getSrbal() + "\n");
            bw.write("Tel.Number: " + student.getNumber() + "\n");


            // закрываем поток
            bw.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getfilename() throws TException {
        List namefile = new ArrayList();

        File file = new File("D:\\students");
        File files[] = file.listFiles();
        for (File file1:files)
        {
            namefile.add(file1.getName());
        }

        return namefile;
    }

    @Override
    public List<String> getfilepath() throws TException {
        List namefile = new ArrayList();

        File file = new File("D:\\students");
        File files[] = file.listFiles();
        for (File file1:files)
        {
            namefile.add(file1.getPath());
        }

        return namefile;
    }

    @Override
    public String readfile(String filename) throws TException {
        String path = "D:\\students\\"+filename;
        try ( BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path), "UTF8"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            return everything;

        } catch (IOException io) {

            return "Файл не найден";
        }

    }
}
