import org.apache.thrift.TException;
import service.Service;
import service.StudentService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View{

    int i = 0;
    int y= 40;
    int startnumber = 0;
    int endnumber =1;
    JFrame jFrame;
    JPanel jPanel;
    JTextArea jTextArea;
    JButton jButtonDel;
    JButton jButtonAdd;
    JTextField jTextField;
    JLabel jLabel;
    JTextField jTextFieldname;
    JTextField jTextFieldsurname;
    JTextField jTextFieldgroup;
    JTextField jTextFieldfakultet;
    JTextField jTextFieldsrbal;
    JTextField jTextFieldnumber;
    JTextField jTextFieldspec;
    JTextField jTextFieldNameUnivercsity;
    JTextField jTextFieldUnivercsitySpher;
    JTextField jTextFieldSearch;
    JButton jButtonAddStudent;
    JButton jButtonDeleteStudent;
    JButton jButtonFindStudent;





    String deleteStudent;
    StudentService.Client client;

    boolean deleteButon =true;
    public View(final StudentService.Client client) throws TException{
        this.client  =client;


        jFrame = new JFrame();

        jFrame.setSize(1360,700);
        jFrame.setLayout(null);
        jLabel = new JLabel();
        jLabel.setBounds(0,0,100,50);
        jFrame.add(jLabel);
        jTextFieldname =new JTextField("");
        jTextFieldname.setBounds(1000,50,200,40);
        jFrame.add(jTextFieldname);
        JLabel jLabelname = new JLabel("NAME");
        jLabelname.setBounds(900,50,100,40);
        jFrame.add(jLabelname);
        jTextFieldsurname =new JTextField("");
        jTextFieldsurname.setBounds(1000,100,200,40);
        jFrame.add(jTextFieldsurname);
        JLabel jLabelsurname = new JLabel("SURNAME");
        jLabelsurname.setBounds(900,100,100,40);
        jFrame.add(jLabelsurname);

        jTextFieldgroup =new JTextField("");
        jTextFieldgroup.setBounds(1000,150,200,40);
        jFrame.add(jTextFieldgroup);

        JLabel jLabelgroup = new JLabel("GROUP");
        jLabelgroup.setBounds(900,150,100,40);
        jFrame.add(jLabelgroup);

        JLabel jLabelspec = new JLabel("SPEC.");
        jLabelspec.setBounds(900,250,100,40);
        jFrame.add(jLabelspec);
        JLabel jLabeluniver = new JLabel("UNIVER.");
        jLabeluniver.setBounds(900,300,100,40);
        jFrame.add(jLabeluniver);
        JLabel jLabelspher = new JLabel("SPHERE");
        jLabelspher.setBounds(900,350,100,40);
        jFrame.add(jLabelspher);
        JLabel jLabelsrbal = new JLabel("AV.SCORE");
        jLabelsrbal.setBounds(900,400,100,40);
        jFrame.add(jLabelsrbal);
        JLabel jLabelNumber = new JLabel("NUMBER");
        jLabelNumber.setBounds(900,450,100,40);
        jFrame.add(jLabelNumber);

        JLabel jLabelFacult = new JLabel("FACULT");
        jLabelFacult.setBounds(900,200,100,40);
        jFrame.add(jLabelFacult);


        jTextFieldfakultet =new JTextField("");
        jTextFieldfakultet.setBounds(1000,200,200,40);
        jFrame.add(jTextFieldfakultet);

        jTextFieldspec =new JTextField("");
        jTextFieldspec.setBounds(1000,250,200,40);
        jFrame.add(jTextFieldspec);

        jTextFieldNameUnivercsity =new JTextField("");
        jTextFieldNameUnivercsity.setBounds(1000,300,200,40);
        jFrame.add(jTextFieldNameUnivercsity);

        jTextFieldUnivercsitySpher =new JTextField("");
        jTextFieldUnivercsitySpher.setBounds(1000,350,200,40);
        jFrame.add(jTextFieldUnivercsitySpher);


        jTextFieldsrbal =new JTextField("");
        jTextFieldsrbal.setBounds(1000,400,200,40);
        jFrame.add(jTextFieldsrbal);

        jTextFieldnumber =new JTextField("");
        jTextFieldnumber.setBounds(1000,450,200,40);
        jFrame.add(jTextFieldnumber);
        jButtonAddStudent =new JButton("Добавить студента");
        jButtonAddStudent.setBounds(1000,550,200,40);
        jFrame.add(jButtonAddStudent);

        jButtonFindStudent =new JButton("Найти студента");
        jButtonFindStudent.setBounds(600,550,200,40);
        jFrame.add(jButtonFindStudent);

        JLabel jLabelfind = new JLabel("Search");
         jTextFieldSearch  = new JTextField();
        jTextFieldSearch.setBounds(600,500,200,40);
        jFrame.add(jTextFieldSearch);

        jLabelfind.setBounds(600,450,200,40);
        jFrame.add(jLabelfind);

        jButtonFindStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findStudent(jTextFieldSearch.getText());
            }
        });

        jButtonDeleteStudent =new JButton("Удалить студента");
        jButtonDeleteStudent.setBounds(800,550,200,40);
        jFrame.add(jButtonDeleteStudent);

        jButtonDeleteStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    client.delStudent("D:\\students\\"+deleteStudent);
                    updateStudentGui();

                }
                catch (TException te)
                {}


            }
        });

        jButtonAddStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("lol");
                    Service service = new Service();
                    client.createStud(service.setStudent(jTextFieldname.getText(),jTextFieldsurname.getText(),jTextFieldgroup.getText(),jTextFieldfakultet.getText(),jTextFieldsrbal.getText(),jTextFieldnumber.getText(),jTextFieldNameUnivercsity.getText(),jTextFieldUnivercsitySpher.getText(),jTextFieldspec.getText()));
                    updateStudentGui();
                }
                catch (TException e1){

                }
            }
        });




        jButtonDel =new JButton("←");
        jButtonDel.setBounds(0,50,50,50);
        jButtonAdd =new JButton("→");
        jButtonAdd.setBounds(50,50,50,50);
   /*     jTextField = new JTextField();
        jTextField.setBounds(40,350,100,50);
        jFrame.add(jTextField)*/;

        jFrame.add(jButtonAdd);
        jFrame.add(jButtonDel);
       /* jTextFieldNameFile = new JTextField();
        jTextFieldNameFile.setBounds(500,40,100,50);
        jFrame.add(jTextFieldNameFile);*/
        jFrame.repaint();
        jFrame.revalidate();
        ;

        jButtonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*deleteStudentFromGui();
                updateStudentGui();*/
                if(startnumber==0)
                {
                    System.out.println("Первая страница");

                }
                else {
                    try {
                        startnumber--;
                        endnumber--;
                        updateStudentGui();
                    }
                    catch (TException te){

                    }

                }

            }
        });
        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            /*    createStudent(jTextField.getText());
                updateStudentGui()*/;
                try {
                    strplus();
                }
                catch (TException te){}


            }
        });
        generateButton();
        jTextArea = new JTextArea();
        jTextArea.setBounds(150,40,300,400);
        jFrame.add(jTextArea);
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        jFrame.setVisible(true);
    }

    public void updateStudentGui() throws TException{
        jPanel.removeAll();
        jPanel.updateUI();
        jFrame.remove(jPanel);
        jFrame.revalidate();
        jFrame.repaint();
        generateButton();
    }


    public void findStudent(String name){
        try {
            jTextArea.setText(client.readfile(name+".txt"));
        }
        catch (TException te){}



    }
    public void generateButton() throws TException{
        int bounds = 1;
        jPanel= new JPanel();
        jPanel.setLayout(null);
        int y =startnumber*6;
        int x = endnumber * 6;
        if (x>client.getfilepath().size())
            x = client.getfilepath().size();
        jPanel.setBounds(410,-5,200,400);
        for(int i =y; i <x;i++){

            int length  = client.getfilename().get(i).length();
            JButton jButton = new JButton(client.getfilename().get(i).substring(0,length -4));
            final String name = client.getfilename().get(i);
            final String path = client.getfilename().get(i);
            jButton.setBounds(40,bounds*50,150,50);
            jPanel.add(jButton);
            bounds++;
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)  {
                    // jLabel.setText(path);
                    try {
                        jTextArea.setText(client.readfile(path));
                        deleteStudent  = path;


                    }
                    catch (TException te){}




                }
            });
        }


        jFrame.add(jPanel);
        jPanel.setVisible(true);
        jPanel.repaint();
        jPanel.revalidate();
        i=0;


    }

    public void strplus () throws TException
    {
        if(((endnumber)*6)>=client.getfilepath().size())
        {
            System.out.println("Последняя страницы");
        }
        else {
            startnumber++;
            endnumber++;
            updateStudentGui();
        }
    }



}
