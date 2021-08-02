import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Vector;


//app1.java:

public class app1 {
    public static void main(String args[])
    {
        Bankergui b = new Bankergui();
    }
}


//Bankergui.java

class Bankergui extends JFrame implements ActionListener
{
    JPanel jp;
    JLabel lbltitle,lblnoofres,lblnoofpro;
    JRadioButton b1,b2,b3,b4,b5,a1,a2,a3,a4,a5;
    JButton submitBtn, cancelBtn;
    ButtonGroup bg;
    Vector<String> selection;
    Container c;
    Bankergui()
    {
        jp=new JPanel();
        jp.setBounds(20,10,750,800);
        jp.setLayout(null);

        lbltitle =new  JLabel("Implementation of Banker's Algorithm");
        lbltitle.setForeground(java.awt.Color.RED);
        lbltitle.setBounds(75,30,800,50);
        lbltitle.setFont(new Font("Courier New", Font.BOLD,30));
        jp.add(lbltitle);

        lblnoofres =new  JLabel("Choose the number of resources");
        lblnoofres.setForeground(java.awt.Color.RED);
        lblnoofres.setBounds(20,50,400,100);
        lblnoofres.setFont(new Font("ARIAL", Font.BOLD,20));
        jp.add(lblnoofres);

        b1=new JRadioButton("1");
        b2=new JRadioButton("2");
        b3=new JRadioButton("3");
        b4=new JRadioButton("4");
        b5=new JRadioButton("5");

        b1.setBounds(50,125,100,30);
        b2.setBounds(50,155,100,30);
        b3.setBounds(50,185,100,30);
        b4.setBounds(50,215,100,30);
        b5.setBounds(50,245,100,30);

        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);

        lblnoofpro =new  JLabel("Choose the number of processes");
        lblnoofpro.setForeground(java.awt.Color.RED);
        lblnoofpro.setBounds(20,260,400,100);
        lblnoofpro.setFont(new Font("ARIAL", Font.BOLD,20));
        jp.add(lblnoofpro);

        a1=new JRadioButton("1");
        a2=new JRadioButton("2");
        a3=new JRadioButton("3");
        a4=new JRadioButton("4");
        a5=new JRadioButton("5");

        a1.setBounds(50,320,100,30);
        a2.setBounds(50,350,100,30);
        a3.setBounds(50,380,100,30);
        a4.setBounds(50,410,100,30);
        a5.setBounds(50,440,100,30);

        a1.setBackground(Color.WHITE);
        a2.setBackground(Color.WHITE);
        a3.setBackground(Color.WHITE);
        a4.setBackground(Color.WHITE);
        a5.setBackground(Color.WHITE);

        submitBtn = new JButton("Submit");
        cancelBtn = new JButton("Cancel");
        submitBtn.setBounds(250,500,100,20);
        cancelBtn.setBounds(400,500,100,20);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        jp.add(b4);
        jp.add(b5);
        jp.add(a1);
        jp.add(a2);
        jp.add(a3);
        jp.add(a4);
        jp.add(a5);
        jp.add(submitBtn);
        jp.add(cancelBtn);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
        a5.addActionListener(this);

        selection=new Vector<String>(10,5);
        submitBtn.addActionListener(this);
        cancelBtn.addActionListener(this);
        setLayout(null);
        setSize(800,600);
        add(jp);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
        jp.setBackground(Color.white);

        setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {	selection.insertElementAt(b1.getText(),0);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);

        }
        if(e.getSource()==b2)
        {
            selection.insertElementAt(b2.getText(),0);
            b1.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);

        }
        if(e.getSource()==b3)
        {
            selection.insertElementAt(b3.getText(),0);
            b2.setEnabled(false);
            b1.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);

        }
        if(e.getSource()==b4)
        {
            selection.insertElementAt(b4.getText(),0);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b1.setEnabled(false);
            b5.setEnabled(false);

        }
        if(e.getSource()==b5)
        {
            selection.insertElementAt(b5.getText(),0);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b1.setEnabled(false);

        }
        if(e.getSource()==a1)
        {	selection.insertElementAt(a1.getText(),1);
            a2.setEnabled(false);
            a3.setEnabled(false);
            a4.setEnabled(false);
            a5.setEnabled(false);

        }
        if(e.getSource()==a2)
        {
            selection.insertElementAt(a2.getText(),1);
            a1.setEnabled(false);
            a3.setEnabled(false);
            a4.setEnabled(false);
            a5.setEnabled(false);

        }
        if(e.getSource()==a3)
        {
            selection.insertElementAt(a3.getText(),1);
            a2.setEnabled(false);
            a1.setEnabled(false);
            a4.setEnabled(false);
            a5.setEnabled(false);

        }
        if(e.getSource()==a4)
        {
            selection.insertElementAt(a4.getText(),1);
            a2.setEnabled(false);
            a3.setEnabled(false);
            a1.setEnabled(false);
            a5.setEnabled(false);

        }
        if(e.getSource()==a5)
        {
            selection.insertElementAt(a5.getText(),1);
            a2.setEnabled(false);
            a3.setEnabled(false);
            a4.setEnabled(false);
            a1.setEnabled(false);

        }
        if(e.getSource() == submitBtn)
        {
            setState(JFrame.ICONIFIED);
            Bankerinp bb= new Bankerinp(selection);
            System.exit(0);
        }
        else if(e.getSource() == cancelBtn)
        {
            JOptionPane.showMessageDialog(null, "Process Terminated");
            System.exit(0);
        }
    }

}



//Bankeralgo.java:

class Bankeralgo{

    public void print(int countofp,int countofr,int available[][],int allocation[][],int max[][],int need[][]) {

        int j, i ;

        System.out.println("\nThe given data are:");
        System.out.println("\nTotal resources in system :\n");

        for (i = 0; i < countofr; i++)
            System.out.print("\tR[" + i + "]  ");
        System.out.println("\n");

        for (j = 0; j < countofr; j++)
            System.out.print("\t" + available[0][j]);
        System.out.println("\n");


        System.out.println("\n\tAllocation matrix\n");

        for (j = 0; j < countofr; j++)
            System.out.print("\tR[" + j + "]");
        System.out.println("\n");

        for (i = 0; i < countofp; i++) {
            System.out.print("\tP[" + i + "]");
            for (j = 0; j < countofr; j++)
                System.out.print("\t" + allocation[i][j]);
            System.out.println("\n");
        }


        System.out.println("\n\tMax matrix \n");
        for (j = 0; j < countofr; j++)
            System.out.print("\tR[" + j + "]");
        System.out.println("\n");

        for (i = 0; i < countofp; i++) {
            System.out.print("\tP[" + i + "]");
            for (j = 0; j < countofr; j++)
                System.out.print("\t" + max[i][j]);
            System.out.println("\n");
        }

        System.out.println("\n\tNeed matrix\n");
        for (j = 0; j < countofr; j++)
            System.out.print("\tR[" + j + "]");
        System.out.println("\n");

        for (i = 0; i < countofp; i++) {
            System.out.print("\tP[" + i + "]");
            for (j = 0; j < countofr; j++)
                System.out.print("\t" + need[i][j]);
            System.out.println("\n");
        }
    }


    // Check if by fulfilling the resource request the system remains in safe state
    public void isSafe(int countofp,int countofr,int available[][],int max[][],int need[][]){
        boolean done[]=new boolean[countofp];
        int j=0; int s=0;
        int sequence[] = new int[5];

        while(j<countofp){  //loop until all process allocated
            boolean allocated=false;
            for(int i=0; i<countofp; i++)
                if(!done[i] && check(i, available, need, countofr)){  //trying to allocate
                    for(int k=0; k<countofr; k++)
                        available[0][k]=available[0][k]-need[i][k]+max[i][k];

                    allocated=done[i]=true;
                    sequence[s++]=i;
                    j++;
                    System.out.println("\n\nRunning process P["+i+"]");
                    System.out.println("\nTotal resources now available:\n");

                    for(i=0; i<countofr; i++)
                        System.out.print("\tR["+i+"]");
                    System.out.println("\n");
                    for(i=0; i<countofr; i++)
                        System.out.print("\t"+available[0][i]+"\t");
                }
            if(!allocated) break;  //if no allocation
        }

        if(j==countofp) { //if all processes are allocated
            System.out.println("\n\nThe System is in safe state");
            System.out.println("\nSafe sequence is:");
            for (int i = 0; i < countofp - 1; i++) {
                System.out.print("P[" + sequence[i] + "]-->");
            }
            System.out.print("P[" + sequence[countofp - 1] + "]" +"\n");
        }
        else
            System.err.println("\nAll process can't be allocated safely!");
    }

    private boolean check(int i, int available[][], int need[][], int countofr ){   //checking if all resources for it^(h) process can be allocated

        for(int j=0; j<countofr; j++) {
            if(available[0][j] < need[i][j]) {
                return false;
            }
        }
        return true;
    }

}


// Bankerinp.java

class Bankerinp {

    static int instance[]=new int[5];
    static int available[][]=new int[5][5];
    static int allocation[][]=new int[10][5];
    static int max[][]=new int[10][5];
    static int need[][]=new int[10][5];
    static int countofr,countofp,i,j;

    Bankerinp(Vector<String> v)
    {
        countofr=Integer.parseInt(v.get(0));
        countofp=Integer.parseInt(v.get(1));
        cal();                 // function call to input the available allocation and max matrix
    }

    public static void cal() {

        Scanner s=new Scanner(System.in);
        Bankeralgo b= new Bankeralgo();

        for(i=0;i<countofr;i++){
            System.out.println("Enter the available resource R["+i+"]:");
            instance[i]=Integer.parseInt(s.nextLine());
            available[0][i]=instance[i];
        }

        System.out.println("Enter the allocation matrix\n");

        for(i=0;i<countofp;i++){
            System.out.println("For the Process: P["+i+"]\n");
            for(j=0;j<countofr;j++){
                System.out.println("Allocation of resource R["+j+"]:");
                allocation[i][j]=Integer.parseInt(s.nextLine());
            }
        }

        System.out.println("\nEnter the Max matrix\n\n");

        for(i=0;i<countofp;i++){
            System.out.println("For the process P["+i+"]\n");
            for(j=0;j<countofr;j++){
                System.out.println("Max demand of resource R["+j+"] is:");
                max[i][j]=Integer.parseInt(s.nextLine());

            }
        }

        for(i=0;i<countofp;i++){
            for(j=0;j<countofr;j++){
                need[i][j] = max[i][j]-allocation[i][j];
            }
        }
        b.print(countofp,countofr,available,allocation,max,need);           //used to print the initial no of available allocation max and need matrix
        b.isSafe(countofp,countofr,available,max,need);                     //try to allocate the resources to the process.
    }
}