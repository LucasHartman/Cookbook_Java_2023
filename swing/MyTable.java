import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyTable{
    JFrame f;

    MyTable() {
        f=new JFrame();

        String data[][]={
            {"101", "Amit", "976"},
            {"101", "Amit", "976"}
        };

        String column[]={"ID","NAME","SALARY"};

        JTable jt=new JTable(data,column);
        jt.setBounds(30,50,200,300);

        JScrollPane sp=new JScrollPane(jt);

        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyTable();
    }
}