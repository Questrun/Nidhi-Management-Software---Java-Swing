/*
* Author - Reebal Javed Khan a.k.a. @Zokemore
* Freelancer
* Officially used Zeta Tech
* Created in December 2017
*
*/
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

class nidhi extends JFrame
{
    String name;
    String universal;
    int c;
    JLabel qw;
    JLabel qw2;
    String s;
    String d;
    String q;
    String dy;
    String ty;
    File pla;
    File f;//records
    File fi;//folder
    File log;
    File un;//universal
    File info;
    JFrame inf;
    JTextField acc;//accessor
    JTextField cn;//companyname
    JTextField br;//branch
    JTextField add;//address
    JTextField lf;//logofile
    JTextField pan;//pan
    JTextField tan;//tan
    JTextField gstin;//gstin
    JTextField jtf;//form filing
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JTextField jtf5;
    JTextField jtf6;
    JTextField jtf7;
    JTextField jtf8;
    JTextField jtf9;
    JTextField jtf10;
    JTextField jtf11;
    JTextField jtf12;
    JTextField jtf13;
    JTextField jtf14;
    JTextField jtf15;
    JTextField jtf16;
    JTextField jtf17;
    JTextField jtf18;
    JTextField jtf19;
    JTextField jtf20;
    JTextField jtf21;
    JTextField jtf22;
    JTextField jtf23;//-----till here
    JScrollPane jsp1;
    JComboBox jcb;//jcombobox
    JComboBox jcb1;
    JComboBox jcb2;
    JComboBox jcb3;
    JComboBox jcb4;
    JComboBox jcb5;
    JComboBox jbc6;
    JComboBox jbc7;//--till here
    JFrame sho1;//detailed record editor
    JPanel sho;
    JScrollPane jsp4;
    JFrame jf4;
    JFrame fd;
    JFrame i1;
    JFrame o1;
    JFrame a1;
    JFrame h1;
    JFrame d1;
    JFrame ab1;
    JFrame jf1;
    JFrame jf2;
    JFrame jf3;
    JFrame ui;
    JPanel j;
    JPanel jp11;
    JLabel h;
    JTable yu;
    JTable sh;
    JButton t;
    JButton rt;
    JButton ft;
    JLabel us;
    JLabel ps;
    JLabel l;
    JLabel al1;
    JLabel al2;
    JLabel al3;
    JLabel jl;//form filling
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4;
    JLabel jl5;
    JLabel jl6;
    JLabel jl7;
    JLabel jl8;
    JLabel jl9;
    JLabel jl10;
    JLabel jl11;
    JLabel jl12;
    JLabel jl13;
    JLabel jl14;
    JLabel jl15;
    JLabel jl16;
    JLabel jl17;
    JLabel jl18;
    JLabel jl19;
    JLabel jl20;
    JLabel jl21;
    JLabel jl22;
    JLabel jl23;
    JLabel jl24;
    JLabel jl25;
    JLabel jl26;
    JLabel jl27;
    JLabel jl28;
    JLabel jl29;
    JLabel jl30;//----till here
    JButton jb1;//next
    JButton jb2;//ok
    JButton jb3;//cancel
    JMenuBar jmb;//main menu bar
    JMenu jm;//Administration menu
    JMenuItem jm1;//defaulter
    JMenu jm2;//Options Menu
    JMenu jm3;//More Menu
    JMenuItem fil;
    JMenuItem fil1;
    JMenuItem fil2;
    JMenuItem fil3;
    JMenuItem ed;
    JMenuItem ed1;
    JMenuItem ed2;
    JMenuItem ed3;
    JMenuItem op;
    JMenuItem op1;
    JMenuItem op2;
    JMenuItem op3;
    JMenuItem hel1;
    JMenuItem hel2;
    public nidhi()
    {
        try{
			String oo="0";
        int index=0;
        String store="";
	File fio2=new File("lfi");
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        fi = new File("c:\\users\\public\\gopher");
        name="c:\\users\\public\\gopher\\record";
        log=new File("c:\\users\\public\\gopher\\log");
        universal="c:\\users\\public\\gopher\\";
        info=new File("c:\\users\\public\\gopher\\info");
        if(!(fi.exists()&&fi.isDirectory())) { fi.mkdir(); }
        for(int i=0;i<36;i++)
        {
		f=new File(name+ch[i]);
		if(!f.exists())
		{
		f.createNewFile();
		}
		}
		if(!info.exists())
		{
		info.createNewFile();
		}
		int gtk=0;
for(int y=0;y<36;y++)
{
	File fio=new File(name+ch[y]);
		if(!fio.exists())
		{ 
			fio.createNewFile();
			}
		BufferedReader dis12=new BufferedReader(new FileReader(fio));
		String tk[][] = new String[5000][16];
		for(int j = 0; j < 5000; j++)
		{ 
	    for(int l = 0; l < 16; l++)
	    {  
	    s=dis12.readLine();
		if(s==null)
		{ 
		
		if(gtk==0)
	{ dis12.close();
                   gtk=1;
		index=j;
		oo=""+ch[y];
		if(!fio2.exists())
		{ fio2.createNewFile(); }
		PrintWriter dis=new PrintWriter(new BufferedWriter(new FileWriter(fio2)));
		dis.println(oo);
       if(store.equals("")){  dis.println(); } else{ dis.println(store); }
		dis.println(Integer.toString(index));
		dis.close(); break;
	}
		}
		else
		{ 
		tk[j][l]=s; 
		if(l==13)
		{ 
	    store=tk[j][l]; 
	    } 
	    }  
	    } 
		if(gtk==1)
		{
		break;
		}
		}
		/*if(gtk==1)
		{
		if(!fio2.exists())
		{ fio2.createNewFile(); }
		PrintWriter dis=new PrintWriter(new BufferedWriter(new FileWriter(fio2)));
		dis.print(oo+"\n");
		dis.print(store+"\n");
		dis.print(Integer.toString(index)+"\n");
		dis.close();
		}*/
		}
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void normal()
        throws IOException
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        char ch1[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String plan[]={"None"}; //add plan string names here
        String regtype[]={"Client","Agent"};
        String planno[]={"None"}; // add subplan numbers here
        String mode[]={"None","Monthly","Quarterly","Half-Yearly","Yearly","Once"};
        String gender[]={"Female","Male"};
       String trans[]={"None","Cash","Cheque","Electronic Payment"};
        fd = new JFrame("LML IMSystem by Zeta Tech");
        fd.setDefaultCloseOperation(3);
        fd.setSize(500, 500);
        h = new JLabel("<html><head><style> body{font:Lucida Sans 20px black;}</style><h1>Welcome</h1></head><hr/><br/><br/><br/><p>Snippet rights with developer.<br/>All software language and binary rights with Oracle Corporation.<br/>Usable under Proprietary Agreement.</p></html>");
        j = new JPanel();
        j.add(h);
        jmb = new JMenuBar();
        jm = new JMenu("Administration");
        jm1 = new JMenuItem("Generate Network Map");
        jm2 = new JMenu("Options");
        jm3 = new JMenu("More");
        fil = new JMenuItem("Open Main Records");
        fil1 = new JMenuItem("Company Information");
        fil2 = new JMenuItem("Credential Change");
        fil3 = new JMenuItem("Exit the Application");
        //ed = new JMenuItem("Merged Records");
        //ed1 = new JMenuItem("Merged Slips");
        ed2 = new JMenuItem("View Detailed Record");
        op = new JMenuItem("New Registration");
        op1 = new JMenuItem("Generate Installment Slip");
        op2 = new JMenuItem("Generate Agreement");
        //op3 = new JMenuItem("Generate Merger Bond");
        hel1 = new JMenuItem("Merger Registration");
        hel2 = new JMenuItem("About this");
        ActionListener actionlistener = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
                try
                {
                    c=0;
                    String z=JOptionPane.showInputDialog(null, "Enter any character 0-9 or A-Z to open correspoding file");
                    for(int io=0;io<36;io++) { if(ch1[io]==(z.toUpperCase()).charAt(0)) {
                    
                    File file1=new File(name+ch1[io]);
                    
o1 = new JFrame("Main Records");
c++;              o1.setSize(600, 600);
                    String as[][] = new String[5000][16];
                    BufferedReader bufferedreader=new BufferedReader(new FileReader(file1));
                    for(int i = 0; i < 5000; i++) { for(int k = 0; k < 16; k++) { s=bufferedreader.readLine(); if(s!=null) { as[i][k]=s; } } }
                    bufferedreader.close();
                    Object aobj[] = {
                        "Reg. Code", "Reg.Type", "Plan Type", "Plan No.", "Mode", "Ref.Code", "PAN", "Name", "Address", 
                        "DOB", "Gender", "Phone", "Reg. Date", "Agent Code", "Bond No.",  "Last Deposit"
                    };
                    yu = new JTable(as, aobj);
                    o1.setDefaultCloseOperation(0);
                    JScrollPane jscrollpane = new JScrollPane(yu);
                    o1.addWindowListener(new WindowAdapter() {

                        @Override

                        public void windowClosing(WindowEvent windowevent)
                        {
                           try
                           {
                                int j1 = JOptionPane.showConfirmDialog(null, this, "Close Main Records?", 1, 0);
                                if(j1 == 0)
                                {
                                 o1.setVisible(false);
                              }
                            }
                            catch(Exception ioexception1)
                            {
                                ioexception1.printStackTrace();
                            }
                        }
                        });
                    o1.add(jscrollpane, null);
                    o1.show();
                } }
                if(c==0)
                {
                JOptionPane.showMessageDialog(null, "Invalid Input");
                }
                }
                catch(IOException ioexception) { ioexception.printStackTrace(); } } };
        ActionListener actionlistener1 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
                try
                {
					inf=new JFrame("Company Information");
                    JPanel jpanel = new JPanel();
                    JLabel jlabel = new JLabel("Company Name:");
                    JLabel jlabel5 = new JLabel("Logo File:");
                    JLabel jlabel6 = new JLabel("Address:");
                    JLabel jlabel1 = new JLabel("Branch:");
                    JLabel jlabel2 = new JLabel("Accessor:");
                    JLabel jlabel7 = new JLabel("GSTIN");
                    JLabel jlabel3 = new JLabel("PAN:");
                    JLabel jlabel4 = new JLabel("TAN:");
                    cn = new JTextField(52);
                    lf = new JTextField(52);
                    add = new JTextField(52);
                    br = new JTextField(52);
                    acc = new JTextField(52);
                    pan = new JTextField(52);
                    tan = new JTextField(52);
                    gstin = new JTextField(52);
                    cn.setText("");
                    lf.setText("");
                    add.setText("");
                    br.setText("");
                    acc.setText("");
                    pan.setText("");
                    tan.setText("");
                    gstin.setText("");
                    try
                    {
File info1=new File("c:\\users\\public\\gopher\\info");
                    BufferedReader bufferedr=new BufferedReader(new FileReader(info1));
                    s="";
                    s=bufferedr.readLine();
                    if(s!=null)
                    {
                        cn.setText(s);
                        s = bufferedr.readLine();
                        lf.setText(s);
                        s = bufferedr.readLine();
                        add.setText(s);
                        s = bufferedr.readLine();
                        br.setText(s);
                        s = bufferedr.readLine();
                        acc.setText(s);
                        s = bufferedr.readLine();
                        gstin.setText(s);
                        s = bufferedr.readLine();
                        pan.setText(s);
                        s = bufferedr.readLine();
                        tan.setText(s);
                    }
                    bufferedr.close();
				}
				catch(IOException nie)
				{ nie.printStackTrace();
					}
                     jpanel.setLayout(new BoxLayout(jpanel,BoxLayout.Y_AXIS));
                    jpanel.add(jlabel);
                    jpanel.add(cn);
                    jpanel.add(jlabel5);
                    jpanel.add(lf);
                    jpanel.add(jlabel6);
                    jpanel.add(add);
                    jpanel.add(jlabel1);
                    jpanel.add(br);
                    jpanel.add(jlabel2);
                    jpanel.add(acc);
                    jpanel.add(jlabel7);
                    jpanel.add(gstin);
                    jpanel.add(jlabel3);
                    jpanel.add(pan);
                    jpanel.add(jlabel4);
                    jpanel.add(tan);
                    inf.add(jpanel);
                inf.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
							 int kiopo = JOptionPane.showConfirmDialog(null, this, "Save?", 1, 0);
                 if(kiopo==0)
                 {  try
                            {
                                PrintWriter dos=new PrintWriter(new BufferedWriter(new FileWriter(info)));
                                s = cn.getText();
                                if(s != null)
                                {
                                    dos.print(s);
                                }
                                s = lf.getText();
                                if(s != null)
                                {
                                    dos.println(s);
                                }
                                s = add.getText();
                                if(s != null)
                                {
                                    dos.println(s);
                                }
                                s = br.getText();
                                if(s != null)
                                {
                                    dos.println(s);
                                }
                                s = acc.getText();
                                if(s != null)
                                {
                                    dos.println(s);
                                }
                                s = gstin.getText();
                                if(s != null)
                                {
                                    dos.println(s);
                                }
                                s = pan.getText();
                                if(s != null)
                                {
                                    dos.println(s);
                                }
                                s = tan.getText();
                                if(s != null)
                                {
                                    dos.println(s);
                                }
                                dos.close();
                            }
                            catch(IOException ioexception1)
                            {
                                ioexception1.printStackTrace();
                            }
					 }
					 inf.setVisible(false);
			} });
                    inf.setSize(600, 600);
                    inf.setResizable(true);
                    inf.setVisible(true);
                }
                catch(Exception ioexception)
                {
                    ioexception.printStackTrace();
                }
            }
        };
        ActionListener actionlistener2 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
                try
                {
                    File lic=new File("c:\\users\\public\\login");
                    BufferedReader fr=new BufferedReader(new FileReader(lic));
                    d = JOptionPane.showInputDialog(null, "Enter Current Password");
                    s = fr.readLine();
                    s = fr.readLine();
                    fr.close();
                    if(d.equals(s))
                    {
                        String s1 = JOptionPane.showInputDialog(null, "Enter New Username");
                        String s2 = JOptionPane.showInputDialog(null, "Enter New Password");
                        PrintWriter pw = new PrintWriter(new FileWriter(lic));
                        pw.print(s1);
                        pw.print("\n"+s2);
                        pw.close();
                        JOptionPane.showMessageDialog(null, "The Login Credentials are chaged now.");
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "The password is incorrect!");
                    }
                }
                catch(IOException ioexception)
                {
                    ioexception.printStackTrace();
                }
            }
        };
        ActionListener actionlistener3 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
                int i = JOptionPane.showConfirmDialog(null, this, "Do you want to Exit?", 1, 0);
                if(i == 0)
                {
                    System.exit(0);
                }
            }
        };
        ActionListener actionlistener4 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
                try
                {
    JTextField jtf;//form filing
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JTextField jtf5;
    JTextField jtf6;
    JTextField jtf7;
    JTextField jtf8;
    JTextField jtf9;
    JTextField jtf10;
    JTextField jtf11;
    JTextField jtf12;
    JTextField jtf13;
    JTextField jtf14;
    JTextField jtf15;
    JTextField jtf16;
    JTextField jtf17;
    JTextField jtf18;
    JTextField jtf19;
    JTextField jtf20;
    JTextField jtf21;
    JTextField jtf22;
    JTextField jtf23;//-----till here
    JScrollPane jsp1;
    JComboBox jcb;//jcombobox
    JComboBox jcb1;
    JComboBox jcb2;
    JComboBox jcb3;
    JComboBox jcb4;
    JComboBox jcb5;
    JComboBox jcb6;
    JLabel jl;//form filling
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4;
    JLabel jl5;
    JLabel jl6;
    JLabel jl7;
    JLabel jl8;
    JLabel jl9;
    JLabel jl10;
    JLabel jl11;
    JLabel jl12;
    JLabel jl13;
    JLabel jl14;
    JLabel jl15;
    JLabel jl16;
    JLabel jl17;
    JLabel jl18;
    JLabel jl19;
    JLabel jl20;
    JLabel jl21;
    JLabel jl22;
    JLabel jl23;
    JLabel jl24;
    JLabel jl25;
    JLabel jl26;
    JLabel jl27;
    JLabel jl28;
    JLabel jl29;
    JLabel jl30;//----till here
    jf4=new JFrame("Detailed Records");
                String rdno=JOptionPane.showInputDialog(null, "Enter Registration Code");
                File un=new File(universal+rdno);
                if(un.exists())
                {
                BufferedReader dis1=new BufferedReader(new FileReader(un));
                sho=new JPanel();
                sho.setLayout(new BoxLayout(sho,BoxLayout.Y_AXIS));
                jl=new JLabel("Branch");
                jl30=new JLabel("Branch Code");
                jl1=new JLabel("Reg. Type");
                jl2=new JLabel("Plan Type");
                jl3=new JLabel("Plan Number");
                jl4=new JLabel("Mode");
                //jl5=new JLabel("Tenure");
                jl6=new JLabel("Reference Code");
                jl7=new JLabel("Name");
                jl8=new JLabel("Aadhaar No.");
                jl9=new JLabel("PAN");
                jl10=new JLabel("Address");
                jl11=new JLabel("City");
                jl12=new JLabel("Pincode");
                jl13=new JLabel("Date Of Birth");
                jl14=new JLabel("Gender");
                jl15=new JLabel("Phone");
                jl16=new JLabel("Nominee");
                jl17=new JLabel("Relation");
                jl18=new JLabel("Aadhaar No.");
                jl19=new JLabel("PAN");
                jl20=new JLabel("Address");
                jl21=new JLabel("City");
                jl22=new JLabel("Pincode");
                jl23=new JLabel("Date of Birth");
                jl24=new JLabel("Gender");
                jl25=new JLabel("Phone");
                jl26=new JLabel("Day");
                jl27=new JLabel("Month");
                jl28=new JLabel("Year");
                jl29=new JLabel("Transaction by");
                jcb=new JComboBox(regtype);
                jcb1=new JComboBox(plan);
                jcb2=new JComboBox(planno);
                jcb3=new JComboBox(mode);
                jcb4=new JComboBox(gender);
                jcb5=new JComboBox(gender);
                jcb6=new JComboBox(trans);
                jtf=new JTextField(20);
                jtf1=new JTextField(20);
                jtf2=new JTextField(20);
                jtf3=new JTextField(20);
                jtf4=new JTextField(20);
                jtf5=new JTextField(20);
                jtf6=new JTextField(20);
                jtf7=new JTextField(20);
                jtf8=new JTextField(20);
                jtf9=new JTextField(20);
                jtf10=new JTextField(20);
                jtf11=new JTextField(20);
                jtf12=new JTextField(20);
                jtf13=new JTextField(20);
                jtf14=new JTextField(20);
                jtf15=new JTextField(20);
                jtf16=new JTextField(20);
                jtf17=new JTextField(20);
                jtf18=new JTextField(20);
                jtf19=new JTextField(20);
                jtf20=new JTextField(20);
                jtf21=new JTextField(20);
                jtf22=new JTextField(20);
                jtf23=new JTextField(20);
                jtf.setText(dis1.readLine());
                jtf23.setText(dis1.readLine());
                jcb.setSelectedItem(dis1.readLine());
                jcb1.setSelectedItem(dis1.readLine());
                jcb2.setSelectedItem(dis1.readLine());
                jcb3.setSelectedItem(dis1.readLine());
                jtf1.setText(dis1.readLine());
                jtf2.setText(dis1.readLine());
                jtf3.setText(dis1.readLine());
                jtf4.setText(dis1.readLine());
                jtf5.setText(dis1.readLine());
                jtf6.setText(dis1.readLine());
                jtf7.setText(dis1.readLine());
                jtf8.setText(dis1.readLine());
                jcb4.setSelectedItem(dis1.readLine());
                jtf9.setText(dis1.readLine());
                jtf10.setText(dis1.readLine());
                jtf11.setText(dis1.readLine());
                jtf12.setText(dis1.readLine());
                jtf13.setText(dis1.readLine());
                jtf14.setText(dis1.readLine());
                jtf15.setText(dis1.readLine());
                jtf16.setText(dis1.readLine());
                jtf17.setText(dis1.readLine());
                jcb5.setSelectedItem(dis1.readLine());
                jtf18.setText(dis1.readLine());
                jtf19.setText(dis1.readLine());
                jtf20.setText(dis1.readLine());
                jtf21.setText(dis1.readLine());
                jcb6.setSelectedItem(dis1.readLine());
                dis1.close();
                sho.add(jl);
                sho.add(jtf);
                sho.add(jl30);
                sho.add(jtf23);
                sho.add(jl1);
                sho.add(jcb);
                sho.add(jl2);
                sho.add(jcb1);
                sho.add(jl3);
                sho.add(jcb2);
                sho.add(jl4);
                sho.add(jcb3);
                //sho.add(jl5);
                sho.add(jl6);
                sho.add(jtf1);
                sho.add(jl7);
                sho.add(jtf2);
                sho.add(jl8);
                sho.add(jtf3);
                sho.add(jl9);
                sho.add(jtf4);
                sho.add(jl10);
                sho.add(jtf5);
                sho.add(jl11);
                sho.add(jtf6);
                sho.add(jl12);
                sho.add(jtf7);
                sho.add(jl13);
                sho.add(jtf8);
                sho.add(jl14);
                sho.add(jcb4);
                sho.add(jl15);
                sho.add(jtf9);
                sho.add(jl16);
                sho.add(jtf10);
                sho.add(jl17);
                sho.add(jtf11);
                sho.add(jl18);
                sho.add(jtf12);
                sho.add(jl19);
                sho.add(jtf13);
                sho.add(jl20);
                sho.add(jtf14);
                sho.add(jl21);
                sho.add(jtf15);
                sho.add(jl22);
                sho.add(jtf16);
                sho.add(jl23);
                sho.add(jtf17);
                sho.add(jl24);
                sho.add(jcb5);
                sho.add(jl25);
                sho.add(jtf18);
                sho.add(jl26);
                sho.add(jtf19);
                sho.add(jl27);
                sho.add(jtf20);
                sho.add(jl28);
                sho.add(jtf21);
                sho.add(jl29);
                sho.add(jcb6);
                //sho.add(jb1);
                //sho.add(jb2);
               JScrollPane jsp4=new JScrollPane(sho);
                jsp4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                jsp4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                jf4.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
                                int k = JOptionPane.showConfirmDialog(null, this, "Close?", 1, 0);
                                if(k==0)
                                {
									jf4.setVisible(false);
									}
                         }
                    });
                    
                jf4.add(jsp4);
                jf4.setSize(600,600);
                jf4.setVisible(true);
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Invalid Registration Number");
                }
                }
                catch(IOException ioexception)
                {
                    ioexception.printStackTrace();
                }
                return;
            }

        };
        ActionListener actionlistener5 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
                try{
					nidhi opoo=new nidhi();
    JTextField jtf;//form filing
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JTextField jtf5;
    JTextField jtf6;
    JTextField jtf7;
    JTextField jtf8;
    JTextField jtf9;
    JTextField jtf10;
    JTextField jtf11;
    JTextField jtf12;
    JTextField jtf13;
    JTextField jtf14;
    JTextField jtf15;
    JTextField jtf16;
    JTextField jtf17;
    JTextField jtf18;
    JTextField jtf19;
    JTextField jtf20;
    JTextField jtf21;
    JTextField jtf22;
    JTextField jtf23;//-----till here
    JScrollPane jsp1;
    JComboBox jcb;//jcombobox
    JComboBox jcb1;
    JComboBox jcb2;
    JComboBox jcb3;
    JComboBox jcb4;
    JComboBox jcb5;
    JComboBox jcb6;
    JLabel jl;//form filling
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4;
    JLabel jl5;
    JLabel jl6;
    JLabel jl7;
    JLabel jl8;
    JLabel jl9;
    JLabel jl10;
    JLabel jl11;
    JLabel jl12;
    JLabel jl13;
    JLabel jl14;
    JLabel jl15;
    JLabel jl16;
    JLabel jl17;
    JLabel jl18;
    JLabel jl19;
    JLabel jl20;
    JLabel jl21;
    JLabel jl22;
    JLabel jl23;
    JLabel jl24;
    JLabel jl25;
    JLabel jl26;
    JLabel jl27;
    JLabel jl28;
    JLabel jl29;
    JLabel jl30;//----till here
   JFrame jf5=new JFrame("New Registration");
              JPanel sho=new JPanel();
              sho.setLayout(new BoxLayout(sho,BoxLayout.Y_AXIS));
                jl=new JLabel("Branch");
                jl30=new JLabel("Branch Code");
                jl1=new JLabel("Reg. Type");
                jl2=new JLabel("Plan Type");
                jl3=new JLabel("Plan Number");
                jl4=new JLabel("Mode");
                //jl5=new JLabel("Tenure");
                jl6=new JLabel("Reference Code");
                jl7=new JLabel("Name");
                jl8=new JLabel("Aadhaar No.");
                jl9=new JLabel("PAN");
                jl10=new JLabel("Address");
                jl11=new JLabel("City");
                jl12=new JLabel("Pincode");
                jl13=new JLabel("Date Of Birth");
                jl14=new JLabel("Gender");
                jl15=new JLabel("Phone");
                jl16=new JLabel("Nominee");
                jl17=new JLabel("Relation");
                jl18=new JLabel("Aadhaar No.");
                jl19=new JLabel("PAN");
                jl20=new JLabel("Address");
                jl21=new JLabel("City");
                jl22=new JLabel("Pincode");
                jl23=new JLabel("Date of Birth");
                jl24=new JLabel("Gender");
                jl25=new JLabel("Phone");
                jl26=new JLabel("Day");
                jl27=new JLabel("Month");
                jl28=new JLabel("Year");
                jl29=new JLabel("Transaction by");
                jcb=new JComboBox(regtype);
                jcb1=new JComboBox(plan);
                jcb2=new JComboBox(planno);
                jcb3=new JComboBox(mode);
                jcb4=new JComboBox(gender);
                jcb5=new JComboBox(gender);
                jcb6=new JComboBox(trans);
                jtf=new JTextField(20);
                jtf1=new JTextField(20);
                jtf2=new JTextField(20);
                jtf3=new JTextField(20);
                jtf4=new JTextField(20);
                jtf5=new JTextField(20);
                jtf6=new JTextField(20);
                jtf7=new JTextField(20);
                jtf8=new JTextField(20);
                jtf9=new JTextField(20);
                jtf10=new JTextField(20);
                jtf11=new JTextField(20);
                jtf12=new JTextField(20);
                jtf13=new JTextField(20);
                jtf14=new JTextField(20);
                jtf15=new JTextField(20);
                jtf16=new JTextField(20);
                jtf17=new JTextField(20);
                jtf18=new JTextField(20);
                jtf19=new JTextField(20);
                jtf20=new JTextField(20);
                jtf21=new JTextField(20);
                jtf22=new JTextField(20);
                jtf23=new JTextField(20);
                sho.add(jl);
                sho.add(jtf);
                sho.add(jl30);
                sho.add(jtf23);
                sho.add(jl1);
                sho.add(jcb);
                sho.add(jl2);
                sho.add(jcb1);
                sho.add(jl3);
                sho.add(jcb2);
                sho.add(jl4);
                sho.add(jcb3);
                //sho.add(jl5);
                sho.add(jl6);
                sho.add(jtf1);
                sho.add(jl7);
                sho.add(jtf2);
                sho.add(jl8);
                sho.add(jtf3);
                sho.add(jl9);
                sho.add(jtf4);
                sho.add(jl10);
                sho.add(jtf5);
                sho.add(jl11);
                sho.add(jtf6);
                sho.add(jl12);
                sho.add(jtf7);
                sho.add(jl13);
                sho.add(jtf8);
                sho.add(jl14);
                sho.add(jcb4);
                sho.add(jl15);
                sho.add(jtf9);
                sho.add(jl16);
                sho.add(jtf10);
                sho.add(jl17);
                sho.add(jtf11);
                sho.add(jl18);
                sho.add(jtf12);
                sho.add(jl19);
                sho.add(jtf13);
                sho.add(jl20);
                sho.add(jtf14);
                sho.add(jl21);
                sho.add(jtf15);
                sho.add(jl22);
                sho.add(jtf16);
                sho.add(jl23);
                sho.add(jtf17);
                sho.add(jl24);
                sho.add(jcb5);
                sho.add(jl25);
                sho.add(jtf18);
                sho.add(jl26);
                sho.add(jtf19);
                sho.add(jl27);
                sho.add(jtf20);
                sho.add(jl28);
                sho.add(jtf21);
                sho.add(jl29);
                sho.add(jcb6);
              JScrollPane jsp5=new JScrollPane(sho);
                jsp5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                jsp5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                jf5.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
                                int k = JOptionPane.showConfirmDialog(null, this, "Submit?", 1, 0);
                                if(k == 0)
                                {
														 try{
int greenflag=1; int colu,row;
						 String agentcode="";
						 String lfistr[]=new String[3];
                  File filelfi=new File("lfi");
                  BufferedReader b=new BufferedReader(new FileReader(filelfi));
                  lfistr[0]=b.readLine();
                  File fw=new File(name+(lfistr[0]));
                  BufferedReader br112=new BufferedReader(new FileReader(fw));
                  lfistr[1]=b.readLine();
                  lfistr[2]=b.readLine();
                  String rec[][]=new String[5000][16];
                  for(colu=0;colu<5000;colu++)
                  {
					  for(row=0;row<16;row++)
					  {   
						  s=br112.readLine();
						  if(s!=null)
						  {
						  rec[colu][row]=s;
					      }
				      }
				 }
                 br112.close();
                 String regcode=lfistr[0]+(jtf23.getText())+(jtf1.getText());
				 int ind=Integer.valueOf(lfistr[2]);
				 int counter=3;
		char uci[]=new char[4];
		uci[0]=uci[1]=uci[2]=uci[3]='0';
		char chd='0';
		String jiko="";
while(ind>0)
{
int h=ind%16;
switch(h)
{
	case 0: chd='0'; break;
	case 1: chd='1'; break;
	case 2: chd='2'; break;
	case 3: chd='3'; break;
	case 4: chd='4'; break;
    case 5: chd='5'; break;
	case 6: chd='6'; break;
	case 7: chd='7'; break;
	case 8: chd='8'; break;
	case 9: chd='9'; break;
	case 10: chd='A'; break;
	case 11: chd='B'; break;
	case 12: chd='C'; break;
	case 13: chd='D'; break;
	case 14: chd='E'; break;
	case 15: chd='F'; break;
}
uci[counter]=chd;
ind=ind/16;
counter--;
}
jiko=new String(uci);
regcode=regcode+jiko;
                  if(jcb.getItemAt(jcb.getSelectedIndex())=="Agent")
{
	agentcode=lfistr[1];
if(!agentcode.equals("")){
int alarm=1;
char df[]=agentcode.toCharArray();
for(ind=2;ind>=1;ind--)
{
	if(alarm==1)
	{
	switch(df[ind])
	{
    case '0': df[ind]='1'; alarm=0; break;
	case '1': df[ind]='2'; alarm=0; break;
	case '2': df[ind]='3'; alarm=0; break;
	case '3': df[ind]='4'; alarm=0; break;
	case '4': df[ind]='5'; alarm=0; break;
	case '5': df[ind]='6'; alarm=0; break;
	case '6': df[ind]='7'; alarm=0; break;
	case '7': df[ind]='8'; alarm=0; break;
	case '8': df[ind]='9'; alarm=0; break;
	case '9': df[ind]='A'; alarm=0; break;
	case 'A': df[ind]='B'; alarm=0; break;
	case 'B': df[ind]='C'; alarm=0; break;
	case 'C': df[ind]='D'; alarm=0; break;
	case 'D': df[ind]='E'; alarm=0; break;
	case 'E': df[ind]='F'; alarm=0; break;
	case 'F': df[ind]='G'; alarm=0; break;
	case 'G': df[ind]='H'; alarm=0; break;
	case 'H': df[ind]='I'; alarm=0; break;
	case 'I': df[ind]='J'; alarm=0; break;
	case 'J': df[ind]='K'; alarm=0; break;
	case 'K': df[ind]='L'; alarm=0; break;
	case 'L': df[ind]='M'; alarm=0; break;
	case 'M': df[ind]='N'; alarm=0; break;
	case 'N': df[ind]='O'; alarm=0; break;
	case 'O': df[ind]='P'; alarm=0; break;
	case 'P': df[ind]='Q'; alarm=0; break;
	case 'Q':df[ind]='R'; alarm=0; break;
	case 'R': df[ind]='S'; alarm=0; break;
	case 'S': df[ind]='T'; alarm=0; break;
	case 'T': df[ind]='U'; alarm=0; break;
	case 'U': df[ind]='V'; alarm=0; break;
	case 'V': df[ind]='W'; alarm=0; break;
case 'W': df[ind]='X'; alarm=0; break;
case 'X': df[ind]='Y'; alarm=0; break;
case 'Y': df[ind]='Z'; alarm=0; break;
case 'Z': df[ind]='0'; alarm=1; break;
}
}
}
agentcode=new String(df); 
}
else { agentcode=lfistr[0]+"00"; }
					  
			     }
			     else
			     {
				 if((jcb1.getItemAt(jcb1.getSelectedIndex())!="None")&&(jcb2.getItemAt(jcb2.getSelectedIndex())!="None")&&(jcb3.getItemAt(jcb3.getSelectedIndex())!="None")&&(jcb6.getItemAt(jcb6.getSelectedIndex())!="None"))
				 {
					agentcode="";
			     }
				 else
				 {
				 JOptionPane.showMessageDialog(null, "Invalid Registration Form!");
                  greenflag=0;
			     }
			     }
		 

if(greenflag==1)
{//saving code
ind=Integer.valueOf(lfistr[2]);
rec[ind][0]=regcode;
rec[ind][1]=(String)jcb.getItemAt(jcb.getSelectedIndex());
rec[ind][2]=(String)jcb1.getItemAt(jcb1.getSelectedIndex());
rec[ind][3]=(String)jcb2.getItemAt(jcb2.getSelectedIndex());
rec[ind][4]=(String)jcb3.getItemAt(jcb3.getSelectedIndex());
rec[ind][5]=jtf1.getText();
rec[ind][6]=jtf4.getText();
rec[ind][7]=jtf2.getText();
rec[ind][8]=(jtf5.getText()+" "+jtf6.getText());
rec[ind][9]=jtf8.getText();
rec[ind][10]=(String)jcb4.getItemAt(jcb4.getSelectedIndex());
rec[ind][11]=jtf9.getText();
rec[ind][13]=agentcode;
rec[ind][14]=lfistr[0]+jtf23.getText()+jtf7.getText()+jiko;
rec[ind][12]=(jtf19.getText()+"/"+jtf20.getText()+"/"+jtf21.getText());
rec[ind][15]=(jtf19.getText()+"/"+jtf20.getText()+"/"+jtf21.getText());
PrintWriter prw=new PrintWriter(new BufferedWriter(new FileWriter(name+lfistr[0])));
for(colu=0;colu<5000;colu++)
                  {
					  for(row=0;row<16;row++)
					  {
						  if(rec[colu][row]!=null)
						  {
						  prw.print(rec[colu][row]);
					       prw.println();
					   }
				      }
				 }
prw.close();
String doc[]=new String[30];
File recordfile=new File(universal+regcode);
if(recordfile.exists())
{
	JOptionPane.showMessageDialog(null,"Serious Bug.... Shutting down the applicaton");
	System.exit(0);
	}
else
{
recordfile.createNewFile();
PrintWriter pwr=new PrintWriter(new BufferedWriter(new FileWriter(recordfile)));
doc[0]=jtf.getText();
doc[1]=jtf23.getText();
doc[2]=(String)jcb.getItemAt(jcb.getSelectedIndex());
doc[3]=(String)jcb1.getItemAt(jcb1.getSelectedIndex());
doc[4]=(String)jcb2.getItemAt(jcb2.getSelectedIndex());
doc[5]=(String)jcb3.getItemAt(jcb3.getSelectedIndex());
doc[6]=jtf1.getText();
doc[7]=jtf2.getText();
doc[8]=jtf3.getText();
doc[9]=jtf4.getText();
doc[10]=jtf5.getText();
doc[11]=jtf6.getText();
doc[12]=jtf7.getText();
doc[13]=jtf8.getText();
doc[14]=(String)jcb4.getItemAt(jcb4.getSelectedIndex());
doc[15]=jtf9.getText();
doc[16]=jtf10.getText();
doc[17]=jtf11.getText();
doc[18]=jtf12.getText();
doc[19]=jtf13.getText();
doc[20]=jtf14.getText();
doc[21]=jtf15.getText();
doc[22]=jtf16.getText();
doc[23]=jtf17.getText();
doc[24]=(String)jcb5.getItemAt(jcb5.getSelectedIndex());
doc[25]=jtf18.getText();
doc[26]=jtf19.getText();
doc[27]=jtf20.getText();
doc[28]=jtf21.getText();
doc[29]=(String)jcb6.getItemAt(jcb6.getSelectedIndex());
for(ind=0;ind<30;ind++)
{
	pwr.print(doc[ind]);
	pwr.println();
}
pwr.close();
File install=new File(universal+regcode+"install");
File pk=new File(Integer.toString(jcb.getSelectedIndex())+Integer.toString(jcb1.getSelectedIndex())+Integer.toString(jcb2.getSelectedIndex())+Integer.toString(jcb3.getSelectedIndex()));
if(pk.exists())
{
BufferedReader brt=new BufferedReader(new FileReader(pk));
install.createNewFile();
PrintWriter pww=new PrintWriter(new BufferedWriter(new FileWriter(install)));
String prob=brt.readLine();
pww.print(prob);
pww.println();
s=brt.readLine();
int ff=1;
pww.println(s);
pww.println(Integer.toString(ff));
brt.close();
pww.println(jtf19.getText()+"/"+jtf20.getText()+"/"+jtf21.getText());
pww.close();
File recieved=new File(universal+regcode+"rec");
PrintWriter prec=new PrintWriter(new BufferedWriter(new FileWriter(recieved)));
prec.print(prob);
prec.println();
prec.close();
int ddnat;
int hjy;
String compvar;
if((Integer.valueOf(s)-ff)>0)
{
File fre=new File(universal+regcode+"due");
PrintWriter prrt=new PrintWriter(new BufferedWriter(new FileWriter(fre)));
int ghy=jcb3.getSelectedIndex();
switch(ghy)
{
case 1: s=jtf20.getText(); ddnat=Integer.valueOf(s); ddnat++; if(ddnat>12){ hjy=Integer.valueOf(jtf21.getText()); hjy++; s=Integer.toString(hjy); ddnat-=12;   }
        compvar=Integer.toString(ddnat); if(compvar.length()==1){compvar="0"+compvar; } prrt.print(jtf19.getText()+"/"+compvar+"/"+s); break;
case 2: s=jtf20.getText(); ddnat=Integer.valueOf(s); ddnat+=3; if(ddnat>12){ hjy=Integer.valueOf(jtf21.getText()); hjy++;  s=Integer.toString(hjy); ddnat-=12;   }
       compvar=Integer.toString(ddnat); if(compvar.length()==1){ compvar="0"+compvar; } prrt.print(jtf19.getText()+"/"+compvar+"/"+s); break;
case 3: s=jtf20.getText(); ddnat=Integer.valueOf(s); ddnat+=6; if(ddnat>12){ hjy=Integer.valueOf(jtf21.getText()); hjy++; s=Integer.toString(hjy); ddnat-=12;   }
       compvar=Integer.toString(ddnat); if(compvar.length()==1){ compvar="0"+compvar; } prrt.print(jtf19.getText()+"/"+compvar+"/"+s); break;
case 4: s=jtf21.getText(); ddnat=Integer.valueOf(s); ddnat++; prrt.print(jtf19.getText()+"/"+jtf20.getText()+"/"+Integer.toString(ddnat)); break;

default: prrt.print("N/A"); }
prrt.println();
//switch ends
prrt.close();
}
File expir=new File(universal+regcode+"expiry");
PrintWriter pexpir=new PrintWriter(new BufferedWriter(new FileWriter(expir)));
int expiryvariable=jcb1.getSelectedIndex();
switch(expiryvariable)
{
	case 1:s=jtf21.getText(); ddnat=Integer.valueOf(s);  ddnat+=5; pexpir.print(jtf19.getText()+"/"+jtf20.getText()+"/"+Integer.toString(ddnat)); break;
	case 2:s=jtf21.getText(); ddnat=Integer.valueOf(s);  ddnat+=3; pexpir.print(jtf19.getText()+"/"+jtf20.getText()+"/"+Integer.toString(ddnat)); break;
	case 3:s=jtf21.getText(); ddnat=Integer.valueOf(s);  ddnat+=6; pexpir.print(jtf19.getText()+"/"+jtf20.getText()+"/"+Integer.toString(ddnat)); break;
	case 4:s=jtf20.getText(); ddnat=Integer.valueOf(s);  ddnat+=15; while(ddnat>12){ hjy=Integer.valueOf(jtf21.getText()); hjy++; s=Integer.toString(hjy); ddnat-=12;   } compvar=Integer.toString(ddnat); if(compvar.length()==1){ compvar="0"+compvar; } pexpir.print(jtf19.getText()+"/"+compvar+"/"+s); break;
	case 5:s=jtf20.getText(); ddnat=Integer.valueOf(s);  ddnat+=72; while(ddnat>12){ hjy=Integer.valueOf(jtf21.getText()); hjy++; s=Integer.toString(hjy); ddnat-=12;   } compvar=Integer.toString(ddnat); if(compvar.length()==1){ compvar="0"+compvar; } pexpir.print(jtf19.getText()+"/"+compvar+"/"+s); break;
	case 6:s=jtf21.getText(); ddnat=Integer.valueOf(s);  ddnat+=5; pexpir.print(jtf19.getText()+"/"+jtf20.getText()+"/"+Integer.toString(ddnat)); break;
	case 7:s=jtf21.getText(); ddnat=Integer.valueOf(s);  ddnat+=7; pexpir.print(jtf19.getText()+"/"+jtf20.getText()+"/"+Integer.toString(ddnat)); break;
default: pexpir.print("N/A");
}
pexpir.println();
pexpir.close();
File consid=new File(Integer.toString(jcb.getSelectedIndex())+Integer.toString(jcb1.getSelectedIndex())+Integer.toString(jcb2.getSelectedIndex())+"consideration");
File recordconsid=new File(universal+regcode+"consideration");
BufferedReader brconsid=new BufferedReader(new FileReader(consid));
PrintWriter pconsid=new PrintWriter(new BufferedWriter(new FileWriter(recordconsid)));
s=brconsid.readLine();
pconsid.print(s);
pconsid.println();
pconsid.close();
brconsid.close();
File repayf=new File(Integer.toString(jcb.getSelectedIndex())+Integer.toString(jcb1.getSelectedIndex())+Integer.toString(jcb2.getSelectedIndex())+"repay");
File recorrepay=new File(universal+regcode+"repay");
BufferedReader brrepay=new BufferedReader(new FileReader(repayf));
PrintWriter prepay=new PrintWriter(new BufferedWriter(new FileWriter(recorrepay)));
s=brrepay.readLine();
prepay.print(s);
prepay.println();
prepay.close();
brrepay.close();
JOptionPane.showMessageDialog(null,"Registration Done Successfully!\n");
if(jcb.getSelectedIndex()==1)
{
	JOptionPane.showMessageDialog(null,"The Registration Code is "+regcode+"\n The Agent Code is "+agentcode+".");
}
else
{
JOptionPane.showMessageDialog(null,"The Registration Code is "+regcode);	
}
jf5.setVisible(false);
}
else
{
	if((jcb1.getItemAt(jcb1.getSelectedIndex())=="None")&&(jcb2.getItemAt(jcb2.getSelectedIndex())=="None")&&(jcb3.getItemAt(jcb3.getSelectedIndex())=="None")&&(jcb6.getItemAt(jcb6.getSelectedIndex())=="None"))
	{
if(jcb.getSelectedIndex()==1)
{
	JOptionPane.showMessageDialog(null,"The Registration Code is "+regcode+"\n The Agent Code is "+agentcode+".");
}
		}
		else{
JOptionPane.showMessageDialog(null,"Wrong choices! Program Crashed!");
System.exit(0); }
	}
}
}//greenflag ends here
jf5.setVisible(false);
}//try ends here
             catch(IOException ioe12)
			 {
				 ioe12.printStackTrace();
				 }
}
   else{ jf5.setVisible(false);                                       }     }
                    });
jf5.add(jsp5);                    
                  jf5.setSize(600,600);
                  jf5.setResizable(true);
                  jf5.setVisible(true);  
                }
                catch(Exception ioexception)
                {
                    ioexception.printStackTrace();
                }
            }
        };
        ActionListener actionlistener7 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
 try                {
	 JFrame jf7=new JFrame("Installment Slip Generator");
	 JPanel jp7=new JPanel();
	 JPanel jp71=new JPanel();
     JLabel jl71=new JLabel("Registraion Code");
     JLabel jl72=new JLabel("Date(dd/mm/yyyy)");
     JLabel jl75=new JLabel("Number of Installments to print");
     JLabel jl73=new JLabel("Other Charges");
     JLabel jl74=new JLabel("Amount in words");
                JTextField jtf71=new JTextField(20);
                JTextField jtf72=new JTextField(20);
                JTextField jtf73=new JTextField(20);
                JTextField jtf74=new JTextField(20);
                JTextField jtf75=new JTextField(20);
                jp7.setLayout(new BoxLayout(jp7,BoxLayout.Y_AXIS));
                jp71.setLayout(new BoxLayout(jp71,BoxLayout.Y_AXIS));
                jf7.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
             try {                  int k = JOptionPane.showConfirmDialog(null, this, "Continue?", 1, 0);
                                if(k == 0)
                                {
									s=jtf71.getText();

	 JFrame jf71=new JFrame("Installment Slip Generator");
									File fileinstall=new File(universal+s+"install");
									if(!fileinstall.exists()){ JOptionPane.showMessageDialog(null,"No installment procedure for this registration!"); return;}
									BufferedReader brrtinst=new BufferedReader(new FileReader(fileinstall));
									String str[]=new String[4];
									str[0]=brrtinst.readLine();
									str[1]=brrtinst.readLine();
									str[2]=brrtinst.readLine();
									str[3]=brrtinst.readLine();
									brrtinst.close();
								    if(str[1].equals(str[2])){JOptionPane.showMessageDialog(null,"No more installments . If illogical contact Programmer!"); return; }
								    JOptionPane.showMessageDialog(null,"Please Note for further reference :\n The amount of installment is  Rs. "+str[0]+" .\n The last date of deposit is "+str[3]+" .");
									jp71.add(jl75);
									jp71.add(jtf75);
									jp71.add(jl73);
									jp71.add(jtf73);
									jp71.add(jl74);
								    jp71.add(jtf74);
									jf71.add(jp71);
									jf71.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
                                int k1 = JOptionPane.showConfirmDialog(null, this, "Submit?", 1, 0);
                                if(k1 == 0)
                                {    try{
String strrecord[]=new String[30];									
File filereco=new File(universal+s);
									BufferedReader brrtrecord=new BufferedReader(new FileReader(filereco));
									
									for(int hho=0;hho<30;hho++)
									{
										strrecord[hho]=brrtrecord.readLine();
										}
										brrtrecord.close();
										int convert1=Integer.valueOf(str[2]);
									File filedue=new File(universal+s+"due");
									BufferedReader brrtdue=new BufferedReader(new FileReader(filedue));
									String strdue=brrtdue.readLine();
									brrtdue.close();
									File inqexpir=new File(universal+s+"expiry");
									BufferedReader brrtexp=new BufferedReader(new FileReader(inqexpir));
									String strexp=brrtexp.readLine();
									brrtexp.close();
									File inqconsid=new File(universal+s+"consideration");
BufferedReader brrtconsid=new BufferedReader(new FileReader(inqconsid));
String consdvar=brrtconsid.readLine();
brrtconsid.close();
									File inqrec=new File(universal+s+"rec");
									BufferedReader brrtrec=new BufferedReader(new FileReader(inqrec));
									String strrec=brrtrec.readLine();
									brrtrec.close();

	String header="<html><body style=\"background:#FF9933;width:99%;\">";
									String footer="</body></html>";
									String ssn="";
									String nxtdueda="";
									int devb;
devb=Integer.valueOf(strrec);									
for(int ii=1;ii<=Integer.valueOf(jtf75.getText());ii++)
									{
										devb+=Integer.valueOf(str[0]);
										convert1++;
int dd=Integer.valueOf(strdue.substring(0,2));
										int mm=Integer.valueOf(strdue.substring(3,5));
										int yyyy=Integer.valueOf(strdue.charAt(6)+""+strdue.charAt(7)+""+strdue.charAt(8)+""+strdue.charAt(9));
										if(strrecord[5].equals("Monthly"))
										{
											mm++; if(mm>12){ yyyy++; mm-=12; }
											}
											else if(strrecord[5].equals("Quarterly"))
											{
												mm+=3; if(mm>12){ yyyy++; mm-=12; }
												}
												else if(strrecord[5].equals("Half-Yearly")){ mm+=6; if(mm>12){ yyyy++; mm-=12; } }
												else if(strrecord[5].equals("Yearly")){ yyyy++; }
												else{						    JOptionPane.showMessageDialog(null,"Malfunction! Debug soon"); System.exit(0);}
									
String ddvarcon,mmvarcon,yyyyvarcon;
ddvarcon=Integer.toString(dd); if(ddvarcon.length()==1){ddvarcon="0"+ddvarcon;}
mmvarcon=Integer.toString(mm); if(mmvarcon.length()==1){mmvarcon="0"+mmvarcon;}
yyyyvarcon=Integer.toString(yyyy);
String nextdu=ddvarcon+"/"+mmvarcon+"/"+yyyyvarcon;
									String slip="<div style=\"width:99.4%;height:33%\"><table width=\"100%\" height=\"10%\"><tr><th width=\"10%\"><img src=\"logo.png\"  height=\"85px\" padding=\"0px\"></th><th><center style=\"color:#0F0FFF;font-size:20px\">Trulife India</center></th></tr></table><style type=\"text/css\"> #fou tr td{color:white;background-color:blue;width:33%}</style><div style=\"width:100%\" id=\"fou\"><table style=\"width:100%\"><tr><td>Branch: "+strrecord[0]+"</td><td>Installement No: "+Integer.toString(convert1)+"</td><td>Due Date:"+strdue+"</td></tr><tr><td>Branch Code:"+strrecord[1]+"</td><td>Reference Code:"+strrecord[6]+"</td><td>Next Due-Date:"+nextdu+"</td></tr><tr><td>Reg. Code:"+jtf71.getText()+"</td><td>Date of Reciept:"+jtf72.getText()+"</td><td>Expiry Date:"+strexp+"</td></tr></table></div><style type=\"text/css\"> #gou tr td{color:white;background-color:green;width:33%}</style><div style=\"border:thin blue solid;color:white;width:100%\" id=\"gou\"><table width=\"100%\"><tr><td>Plan Type:"+strrecord[3]+"</td><td>Date of Commencement:"+strrecord[26]+"/"+strrecord[27]+"/"+strrecord[28]+"</td><td>Name & Address:</td></tr><tr><td>Plan Number:"+strrecord[4]+"</td><td>Amount of Consederation:"+consdvar+" Rs</td><td>"+strrecord[7]+"</td></tr><tr><td>Installment Amount:"+str[0]+" Rs</td><td>Amount Recieved Yet:"+devb+" Rs</td><td>"+strrecord[10]+"<br/>"+strrecord[11]+"<br/>"+strrecord[12]+"</td></tr><tr><td>Mode:"+strrecord[5]+"</td><td>Other Charges:"+jtf73.getText()+"</td><td>Amount in Words:<br/>"+jtf74.getText()+"</td></tr></table></div><div style=\"color:black;text-align:right;margin-top:1%\">Authorized Signatory</div></div>";
									ssn=ssn+slip;
									if(ii<Integer.valueOf(jtf75.getText())){ssn=ssn+"<hr/>";} 
									nxtdueda=nextdu;
									strdue=nextdu;
									}
									String finsss=header+ssn+footer;
									File sefpr=new File("Slip.html");
									if(!sefpr.exists())
									{ sefpr.createNewFile(); }
									PrintWriter pwwmain=new PrintWriter(new BufferedWriter(new FileWriter(sefpr)));
									pwwmain.print(finsss);
									pwwmain.println();
									pwwmain.close();
									PrintWriter pwwmain1=new PrintWriter(new BufferedWriter(new FileWriter(fileinstall)));
									pwwmain1.print(str[0]);
pwwmain1.println();
									pwwmain1.println(str[1]);
									pwwmain1.println(Integer.toString(convert1));
									pwwmain1.println(jtf72.getText());
									pwwmain1.close();
									PrintWriter pwwmain2=new PrintWriter(new BufferedWriter(new FileWriter(filedue)));
									pwwmain2.print(nxtdueda);
									pwwmain2.println();
									pwwmain2.close();
									PrintWriter pwwmain3=new PrintWriter(new BufferedWriter(new FileWriter(inqrec)));
									pwwmain3.print(Integer.toString(devb));
									pwwmain3.println();
									pwwmain3.close();
					File recopiu=new File(universal+"record"+s.charAt(0));					
	if(s.length()==11){
									recopiu=new File(universal+"record"+s.charAt(1));
								}
							
								String asdd[][]=new String[5000][16];
int brelement=0;
									BufferedReader brrtrec1=new BufferedReader(new FileReader(recopiu));
									for(int i=0;i<5000;i++){ for(int j=0;j<16;j++){ String nnatr=brrtrec1.readLine(); if(nnatr!=null){ asdd[i][j]=nnatr; } else{ brelement=1; break;  } }
										if(asdd[i][0]!=null){ if(asdd[i][0].equals(s)){ asdd[i][15]=jtf72.getText();  } }
	if(brelement==1){ break; } }
                                                                       brrtrec1.close();                 	 					   
									PrintWriter pwwmain4=new PrintWriter(new BufferedWriter(new FileWriter(recopiu)));
									for(int k=0;k<5000;k++){for(int l=0;l<16;l++){ if(asdd[k][l]!=null){pwwmain4.print(asdd[k][l]); pwwmain4.println();}}}
									pwwmain4.close();
									Runtime rnd12=Runtime.getRuntime();
									Process process=rnd12.exec("firefox Slip.html");
jf7.setVisible(false);									
jf71.setVisible(false); 
} catch(IOException iiie){iiie.printStackTrace(); }
}}});
									jf71.setSize(200,200);
									jf71.setVisible(true);
}
                                } catch(IOException iiiie){iiiie.printStackTrace();}
                                }});
                jp7.add(jl71);
                jp7.add(jtf71);
                jp7.add(jl72);
                jp7.add(jtf72);
                jf7.add(jp7);
                jf7.setSize(200,200);
                jf7.setVisible(true);
                }
                catch(Exception ioexception)
                {
                    ioexception.printStackTrace();
                }
            }
        };
        ActionListener actionlistener8 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
                try
                {
      JFrame jf8=new JFrame("Agreement Generator");
JPanel jp8=new JPanel();
	 JPanel jp81=new JPanel();
     JLabel jl81=new JLabel("Registraion Code");
     JLabel jl82=new JLabel("Date(dd/mm/yyyy)");
     JLabel jl85=new JLabel("Age of Lender");
     JLabel jl86=new JLabel("Age of Nominee");
     JLabel jl83=new JLabel("Other Charges");
     JLabel jl84=new JLabel("Amount in words");
                JTextField jtf81=new JTextField(20);
                JTextField jtf82=new JTextField(20);
                JTextField jtf83=new JTextField(20);
                JTextField jtf84=new JTextField(20);
                JTextField jtf85=new JTextField(20);
                JTextField jtf86=new JTextField(20);
                jp8.setLayout(new BoxLayout(jp8,BoxLayout.Y_AXIS));
                jp81.setLayout(new BoxLayout(jp81,BoxLayout.Y_AXIS));
                jf8.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
             try {                  int k = JOptionPane.showConfirmDialog(null, this, "Continue?", 1, 0);
                                if(k == 0)
                                {

s=jtf81.getText();
	 JFrame jf81=new JFrame("Agreement Generator");
									File fileinstall=new File(universal+s+"install");
									if(!fileinstall.exists()){ JOptionPane.showMessageDialog(null,"Contact Developer!"); return;}
									BufferedReader brrtinst=new BufferedReader(new FileReader(fileinstall));
									String str[]=new String[4];
									str[0]=brrtinst.readLine();
									str[1]=brrtinst.readLine();
									str[2]=brrtinst.readLine();
									str[3]=brrtinst.readLine();
									brrtinst.close();
String strrecord[]=new String[30];									
File filereco=new File(universal+s);
									BufferedReader brrtrecord=new BufferedReader(new FileReader(filereco));
									for(int hho=0;hho<30;hho++)
									{
										strrecord[hho]=brrtrecord.readLine();
										}
										brrtrecord.close();
								    JOptionPane.showMessageDialog(null,"Please Note for further reference :\n The amount of installment is  Rs. "+str[0]+" .\n DOB lender:"+strrecord[13]+" \nDOB nominee: "+strrecord[23]+".");
									jp81.add(jl85);
									jp81.add(jtf85);
									jp81.add(jl86);
									jp81.add(jtf86);
									jp81.add(jl83);
									jp81.add(jtf83);
									jp81.add(jl84);
								    jp81.add(jtf84);
									jf81.add(jp81);
									jf81.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
                                int k1 = JOptionPane.showConfirmDialog(null, this, "Submit?", 1, 0);
                                if(k1 == 0)
                                {    try{
									 
									File filedue=new File(universal+s+"due");
									BufferedReader brrtdue=new BufferedReader(new FileReader(filedue));
									String strdue=brrtdue.readLine();
									brrtdue.close();
									File inqexpir=new File(universal+s+"expiry");
									BufferedReader brrtexp=new BufferedReader(new FileReader(inqexpir));
									String strexp=brrtexp.readLine();
									brrtexp.close();
									File inqconsid=new File(universal+s+"consideration");
BufferedReader brrtconsid=new BufferedReader(new FileReader(inqconsid));
String consdvar=brrtconsid.readLine();
brrtconsid.close();
					File repayf=new File(universal+s+"repay");
BufferedReader brrtrepay=new BufferedReader(new FileReader(repayf));
String repayvar=brrtrepay.readLine();
brrtrepay.close();
String posix="";
posix=s.substring(0,4)+strrecord[12]+s.charAt(6)+""+s.charAt(7)+""+s.charAt(8)+""+s.charAt(9);
if(s.length()==11){
posix=s.substring(0,4)+strrecord[12]+s.charAt(7)+""+s.charAt(8)+""+s.charAt(9)+""+s.charAt(10);	
	}
	//tenure finding code
	String tenure112="";
	 	if(strrecord[3].equals("Yearly Installment Plan")||strrecord[3].equals("5 Years Installment Plan"))
										{
								tenure112="60";		
											}
											else if(strrecord[3].equals("3 Years Single Installment Plan"))
											{ 
												tenure112="36";
																							}
												else if(strrecord[3].equals("6 Years Single Installment Plan")||strrecord[3].equals("72 Months Installment Plan")){ 
													tenure112="72";
													 }
												else if(strrecord[3].equals("15 Months Installment Plan")){ tenure112="15";  }
												else if(strrecord[3].equals("7 Years Installment Plan")){tenure112="84"; }
												else{ File teng=new File(universal+s+"tenure");
BufferedReader brrten=new BufferedReader(new FileReader(teng));  tenure112=brrten.readLine(); brrten.close();  }
String prvar1="<html><body style=\"width:99%;background-color:#FF9933\"><div height=\"67%\"><div><table width=\"100%\" height=\"10%\"><tr><td width=\"10%\"><img src=\"logo.png\" height=\"85px\"/></td><td><center style=\"font-size:45px;color:#0F0FFF\"><i>Trulife India</i><br/><sup style=\"font-size:13px;\" >Registered Office: House Number 75, Village and Post Assa, Meerut 250401</sup></center></td></tr></table></div><center style=\"font-size:30px\"><b>AGREEMENT</b></center><div style=\"font-size:13px;text-align:center\">This is to certify or acknowledge the payment recieved from or in name of person herein mentioned,by Trulife India on sole trust. The payment of a particular sum is done in uniform method herein specified in installments or once by the person, as unsecured loan to firm or company Trulife India for selected tenure to claim wholesum amount specified after completion of tenure, entitling the reciever to utilize the funds to operate it's legally registered business in India. The funds so obtained shall be treated as debt and the person is not entitled to stake ownership. The agreement symbolizes that the person has accepted the terms and conditions imposed by Trulife India and is not being mislead anyway. She/he shall be sole responsible for this decision. The fund recieving entity is responsible for repayment to the lending entity in all cases.</div><style>#tou td{outline:solid thin black;width:25%;background-color:red;font-size:14px} #pou td{outline:none;width:33%;font:14px}</style><br/><div id=\"tou\"><table width=\"99.5%\"><tr><td>Registration Code:</td><td>"+s+"</td><td>Agreement Code:</td><td>"+posix+"</td></tr><tr><td>Name:</td><td>"+strrecord[7]+"</td><td>Address:</td><td>"+strrecord[10]+"<br/>"+strrecord[11]+"<br/>"+strrecord[12]+"</td></tr><tr><td>Nominee Name:</td><td>"+strrecord[16]+"</td><td>Relation:</td><td>"+strrecord[17]+"</td></tr><tr><td>Age of lender:(years)</td><td>"+jtf85.getText()+"</td><td>Age of nominee:(years)</td><td>"+jtf86.getText()+"</td></tr><tr><td>Amount of Consideration /Funds recieved:</td><td>Rs "+consdvar+"</td><td>For Tenure(in months):</td><td>"+tenure112+"</td></tr><tr><td>Installment Amount:</td><td>Rs "+str[0]+"</td><td>Mode:</td><td>"+strrecord[5]+"</td></tr><tr><td>Date of Commencement:</td><td>"+strrecord[26]+"/"+strrecord[27]+"/"+strrecord[28]+"</td><td>Date of Expiry:</td><td>"+strexp+"</td></tr><tr><td>Amount to repay:</td><td>Rs "+repayvar+"</td><td>PAN</td><td>"+strrecord[9]+"</td></tr></table></div><div id=\"pou\" style=\"font-size:13px;\"><i>The wholesum amount will be payed back by company or firm only after completion of tenure. Withdrawal before completion of tenure is not permitted in any case. The amount shall be payed back to lender within period of 30 days from date of expiry. All disputes shall be subjected to Jurisdiction of Court in Meerut City.</i><br/><br/><br/><br/><br/><table width=\"100%\"><tr><td>Date:"+jtf82.getText()+"</td><td style=\"text-align:center\">Authorized Signatory</td><td style=\"text-align:right\">Managing Director</td></tr></table></div></div></div><hr/><div style=\" width:99.4%;height:33%\"><table width=\"100%\" height=\"8%\"><tr><th width=\"10%\"><img src=\"logo.png\"  height=\"85px\" padding=\"0px\"></th><th><center style=\"color:#0F0FFF;font-size:20px\"><i>Trulife India</i><br/><sup style=\"font-size:9px;\">Registered Office: House number 75, Village and Post Assa, Meerut 250401</sup></center></th></tr></table><style type=\"text/css\"> #fou tr td{color:white;background-color:blue;width:33%;font-size:14px}</style><div style=\"width:100%\" id=\"fou\"><table style=\"width:100%\"><tr><td>Branch:"+strrecord[0]+"</td><td>Installement No:1</td><td>Due Date:"+strrecord[26]+"/"+strrecord[27]+"/"+strrecord[28]+"</td></tr><tr><td>Branch Code:"+strrecord[1]+"</td><td>Reference Code:"+strrecord[6]+"</td><td>Next Due-Date:"+strdue+"</td></tr><tr><td>Reg. Code:"+s+"</td><td>Date of Reciept:"+jtf82.getText()+"</td><td>Expiry Date:"+strexp+"</td></tr></table></div><style type=\"text/css\"> #gou tr td{color:white;background-color:green;width:33%;font-size:14px}</style><div style=\"border:thin blue solid;color:white;width:100%\" id=\"gou\"><table width=\"100%\"><tr><td>Plan Type:"+strrecord[3]+"</td><td>Date of Commencement:"+strrecord[26]+"/"+strrecord[27]+"/"+strrecord[28]+"</td><td>Name & Address:</td></tr><tr><td>Plan Number:"+strrecord[4]+"</td><td>Amount of Consederation:"+consdvar+" Rs</td><td>"+strrecord[7]+"</td></tr><tr><td>Installment Amount:"+str[0]+" Rs</td><td>Amount Recieved Yet:"+str[0]+" Rs</td><td>"+strrecord[10]+"<br/>"+strrecord[11]+"<br/>"+strrecord[12]+"</td></tr><tr><td>Mode:"+strrecord[5]+"</td><td>Other Charges:"+jtf83.getText()+"</td><td>Amount in Words:<br/>"+jtf84.getText()+"</td></tr></table></div><div style=\"color:black;text-align:right;margin-top:1%\">Authorized Signatory</div></div></body></html>";
File ffrb=new File("Bond.html");
if(!ffrb.exists()){ ffrb.createNewFile(); }
PrintWriter pwbond=new PrintWriter(new BufferedWriter(new FileWriter(ffrb)));
pwbond.print(prvar1);
pwbond.println();
pwbond.close();									
								Runtime rnd13=Runtime.getRuntime();
									Process process=rnd13.exec("firefox Bond.html");
									} catch(IOException ioer){ ioer.printStackTrace(); } }       jf8.setVisible(false);								
	jf81.setVisible(false); }});
jf81.setSize(200,200);
jf81.setVisible(true);
}
}catch(IOException ioer){ ioer.printStackTrace();  }
}

});
   jp8.add(jl81);
   jp8.add(jtf81);
   jp8.add(jl82);
   jp8.add(jtf82);
   jf8.add(jp8);
                jf8.setSize(200,200);
                jf8.setVisible(true);  
                }
                catch(Exception ioexception)
                {
                    ioexception.printStackTrace();
                }
            }

        };
        ActionListener actionlistener11 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
    try{
		nidhi jiio=new nidhi();
    JTextField jtf;//form filing
    JTextField jtf1;
    JTextField jtf2;
    JTextField jtf3;
    JTextField jtf4;
    JTextField jtf5;
    JTextField jtf6;
    JTextField jtf7;
    JTextField jtf8;
    JTextField jtf9;
    JTextField jtf10;
    JTextField jtf11;
    JTextField jtf12;
    JTextField jtf13;
    JTextField jtf14;
    JTextField jtf15;
    JTextField jtf16;
    JTextField jtf17;
    JTextField jtf18;
    JTextField jtf19;
    JTextField jtf20;
    JTextField jtf21;
    JTextField jtf22;
    JTextField jtf23;
    JTextField jtf24;
    JTextField jtf25;
    JTextField jtf26;
    JTextField jtf27;
    JTextField jtf28;
    JTextField jtf29;
    JTextField jtf30;
    //-----till here
    JScrollPane jsp1;
    JComboBox jcb;//jcombobox
    JComboBox jcb1;
    JComboBox jcb2;
    JComboBox jcb3;
    JComboBox jcb4;
    JComboBox jcb5;
    JComboBox jcb6;
    JLabel jl;//form filling
    JLabel jl1;
    JLabel jl2;
    JLabel jl3;
    JLabel jl4;
    JLabel jl5;
    JLabel jl6;
    JLabel jl7;
    JLabel jl8;
    JLabel jl9;
    JLabel jl10;
    JLabel jl11;
    JLabel jl12;
    JLabel jl13;
    JLabel jl14;
    JLabel jl15;
    JLabel jl16;
    JLabel jl17;
    JLabel jl18;
    JLabel jl19;
    JLabel jl20;
    JLabel jl21;
    JLabel jl22;
    JLabel jl23;
    JLabel jl24;
    JLabel jl25;
    JLabel jl26;
    JLabel jl27;
    JLabel jl28;
    JLabel jl29;
    JLabel jl30;
    JLabel jl31;
    JLabel jl32;
    JLabel jl33;
    JLabel jl34;
    JLabel jl35;
    JLabel jl36;//----till here
   JFrame jf11=new JFrame("New Merger Registration");
              JPanel sho11=new JPanel();
              sho11.setLayout(new BoxLayout(sho11,BoxLayout.Y_AXIS));
                jl=new JLabel("Branch");
                jl30=new JLabel("Branch Code");
                jl1=new JLabel("Reg. Type");
                jl2=new JLabel("Plan Type");
                jl3=new JLabel("Plan Number");
                jl4=new JLabel("Mode");
                jl5=new JLabel("Tenure");
                jl6=new JLabel("Reference Code");
                jl7=new JLabel("Name");
                jl8=new JLabel("Aadhaar No.");
                jl9=new JLabel("PAN");
                jl10=new JLabel("Address");
                jl11=new JLabel("City");
                jl12=new JLabel("Pincode");
                jl13=new JLabel("Date Of Birth");
                jl14=new JLabel("Gender");
                jl15=new JLabel("Phone");
                jl16=new JLabel("Nominee");
                jl17=new JLabel("Relation");
                jl18=new JLabel("Aadhaar No.");
                jl19=new JLabel("PAN");
                jl20=new JLabel("Address");
                jl21=new JLabel("City");
                jl22=new JLabel("Pincode");
                jl23=new JLabel("Date of Birth");
                jl24=new JLabel("Gender");
                jl25=new JLabel("Phone");
                jl26=new JLabel("Day");
                jl27=new JLabel("Month");
                jl28=new JLabel("Year");
                jl29=new JLabel("Transaction by");
                jl31=new JLabel("Claimable Amount");
                jl32=new JLabel("Installment Amount");
                jl33=new JLabel("Total Number of Installments");
                jl34=new JLabel("Installments Left");
                jl35=new JLabel("Account Merged from");
                jl36=new JLabel("Expiry date of Agreement(dd/mm/yyy)");
                //jcb=new JComboBox(regtype);
                //jcb1=new JComboBox(plan);
                //jcb2=new JComboBox(planno);
                jcb3=new JComboBox(mode);
                jcb4=new JComboBox(gender);
                jcb5=new JComboBox(gender);
                jcb6=new JComboBox(trans);
                jtf=new JTextField(20);
                jtf1=new JTextField(20);
                jtf2=new JTextField(20);
                jtf3=new JTextField(20);
                jtf4=new JTextField(20);
                jtf5=new JTextField(20);
                jtf6=new JTextField(20);
                jtf7=new JTextField(20);
                jtf8=new JTextField(20);
                jtf9=new JTextField(20);
                jtf10=new JTextField(20);
                jtf11=new JTextField(20);
                jtf12=new JTextField(20);
                jtf13=new JTextField(20);
                jtf14=new JTextField(20);
                jtf15=new JTextField(20);
                jtf16=new JTextField(20);
                jtf17=new JTextField(20);
                jtf18=new JTextField(20);
                jtf19=new JTextField(20);
                jtf20=new JTextField(20);
                jtf21=new JTextField(20);
                jtf22=new JTextField(20);
                jtf23=new JTextField(20);
                jtf24=new JTextField(20);
                jtf25=new JTextField(20);
                jtf26=new JTextField(20);
                jtf27=new JTextField(20);
                jtf28=new JTextField(20);
                jtf29=new JTextField(20);
                jtf30=new JTextField(20);
                sho11.add(jl);
                sho11.add(jtf);
                sho11.add(jl30);
                sho11.add(jtf23);
                //sho11.add(jl1);
                //sho11.add(jcb);
                //sho11.add(jl2);
                //sho11.add(jcb1);
                //sho11.add(jl3);
                //sho11.add(jcb2);
                sho11.add(jl5);
                sho11.add(jtf24);
                sho11.add(jl31);
                sho11.add(jtf25);
                sho11.add(jl32);
                sho11.add(jtf26);
                sho11.add(jl33);
                sho11.add(jtf27);
                sho11.add(jl34);
                sho11.add(jtf28);
                sho11.add(jl4);
                sho11.add(jcb3);
                sho11.add(jl6);
                sho11.add(jtf1);
                sho11.add(jl7);
                sho11.add(jtf2);
                sho11.add(jl8);
                sho11.add(jtf3);
                sho11.add(jl9);
                sho11.add(jtf4);
                sho11.add(jl10);
                sho11.add(jtf5);
                sho11.add(jl11);
                sho11.add(jtf6);
                sho11.add(jl12);
                sho11.add(jtf7);
                sho11.add(jl13);
                sho11.add(jtf8);
                sho11.add(jl14);
                sho11.add(jcb4);
                sho11.add(jl15);
                sho11.add(jtf9);
                sho11.add(jl16);
                sho11.add(jtf10);
                sho11.add(jl17);
                sho11.add(jtf11);
                sho11.add(jl18);
                sho11.add(jtf12);
                sho11.add(jl19);
                sho11.add(jtf13);
                sho11.add(jl20);
                sho11.add(jtf14);
                sho11.add(jl21);
                sho11.add(jtf15);
                sho11.add(jl22);
                sho11.add(jtf16);
                sho11.add(jl23);
                sho11.add(jtf17);
                sho11.add(jl24);
                sho11.add(jcb5);
                sho11.add(jl25);
                sho11.add(jtf18);
                sho11.add(jl26);
                sho11.add(jtf19);
                sho11.add(jl27);
                sho11.add(jtf20);
                sho11.add(jl28);
                sho11.add(jtf21);
                sho11.add(jl36);
                sho11.add(jtf30);
                sho11.add(jl29);
                sho11.add(jcb6);
              JScrollPane jsp11=new JScrollPane(sho11);
                jsp11.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                jsp11.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                jf11.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
                                int k = JOptionPane.showConfirmDialog(null, this, "Submit?", 1, 0);
                                if(k == 0)
                                {
														 try{
int greenflag=1; int colu,row;
						 String lfistr[]=new String[3];
                  File filelfi=new File("lfi");
                  BufferedReader b=new BufferedReader(new FileReader(filelfi));
                  lfistr[0]=b.readLine();
                  File fw=new File(name+(lfistr[0]));
                  BufferedReader br112=new BufferedReader(new FileReader(fw));
                  lfistr[1]=b.readLine();
                  lfistr[2]=b.readLine();
                  String rec[][]=new String[5000][16];
                  for(colu=0;colu<5000;colu++)
                  {
					  for(row=0;row<16;row++)
					  {   
						  s=br112.readLine();
						  if(s!=null)
						  {
						  rec[colu][row]=s;
					      }
				      }
				 }
                 br112.close();
                 String regcode=lfistr[0]+(jtf23.getText())+(jtf1.getText());
				 int ind=Integer.valueOf(lfistr[2]);
				 int counter=3;
		char uci[]=new char[4];
		uci[0]=uci[1]=uci[2]=uci[3]='0';
		char chd='0';
		String jiko="";
while(ind>0)
{
int h=ind%16;
switch(h)
{
	case 0: chd='0'; break;
	case 1: chd='1'; break;
	case 2: chd='2'; break;
	case 3: chd='3'; break;
	case 4: chd='4'; break;
	case 5: chd='5'; break;
	case 6: chd='6'; break;
	case 7: chd='7'; break;
	case 8: chd='8'; break;
	case 9: chd='9'; break;
	case 10: chd='A'; break;
	case 11: chd='B'; break;
	case 12: chd='C'; break;
	case 13: chd='D'; break;
	case 14: chd='E'; break;
	case 15: chd='F'; break;
}
uci[counter]=chd;
ind=ind/16;
counter--;
}
jiko=new String(uci);
regcode="M"+regcode+jiko;
if(greenflag==1)
{//saving code
ind=Integer.valueOf(lfistr[2]);
rec[ind][0]=regcode;
rec[ind][1]="Client";
rec[ind][2]="Merger";
rec[ind][3]="None";
rec[ind][4]=(String)jcb3.getItemAt(jcb3.getSelectedIndex());
rec[ind][5]=jtf1.getText();
rec[ind][6]=jtf4.getText();
rec[ind][7]=jtf2.getText();
rec[ind][8]=(jtf5.getText()+" "+jtf6.getText());
rec[ind][9]=jtf8.getText();
rec[ind][10]=(String)jcb4.getItemAt(jcb4.getSelectedIndex());
rec[ind][11]=jtf9.getText();
rec[ind][13]="";
rec[ind][14]=lfistr[0]+jtf23.getText()+jtf7.getText()+jiko;
rec[ind][12]=(jtf19.getText()+"/"+jtf20.getText()+"/"+jtf21.getText());
rec[ind][15]=(jtf19.getText()+"/"+jtf20.getText()+"/"+jtf21.getText());
PrintWriter prw=new PrintWriter(new BufferedWriter(new FileWriter(name+lfistr[0])));
for(colu=0;colu<5000;colu++)
                  {
					  for(row=0;row<16;row++)
					  {
						  if(rec[colu][row]!=null)
						  {
						  prw.print(rec[colu][row]);
					       prw.println();
					   }
				      }
				 }
prw.close();
String doc[]=new String[30];
File recordfile=new File(universal+regcode);
if(recordfile.exists())
{
	JOptionPane.showMessageDialog(null,"Serious Bug.... Shutting down the applicaton");
	System.exit(0);
	}
else
{
recordfile.createNewFile();
PrintWriter pwr=new PrintWriter(new BufferedWriter(new FileWriter(recordfile)));
doc[0]=jtf.getText();
doc[1]=jtf23.getText();
doc[2]="Client";
doc[3]="Merger";
doc[4]="None";
doc[5]=(String)jcb3.getItemAt(jcb3.getSelectedIndex());
doc[6]=jtf1.getText();
doc[7]=jtf2.getText();
doc[8]=jtf3.getText();
doc[9]=jtf4.getText();
doc[10]=jtf5.getText();
doc[11]=jtf6.getText();
doc[12]=jtf7.getText();
doc[13]=jtf8.getText();
doc[14]=(String)jcb4.getItemAt(jcb4.getSelectedIndex());
doc[15]=jtf9.getText();
doc[16]=jtf10.getText();
doc[17]=jtf11.getText();
doc[18]=jtf12.getText();
doc[19]=jtf13.getText();
doc[20]=jtf14.getText();
doc[21]=jtf15.getText();
doc[22]=jtf16.getText();
doc[23]=jtf17.getText();
doc[24]=(String)jcb5.getItemAt(jcb5.getSelectedIndex());
doc[25]=jtf18.getText();
doc[26]=jtf19.getText();
doc[27]=jtf20.getText();
doc[28]=jtf21.getText();
doc[29]=(String)jcb6.getItemAt(jcb6.getSelectedIndex());
for(ind=0;ind<30;ind++)
{
	pwr.print(doc[ind]);
	pwr.println();
}
pwr.close();
File install=new File(universal+regcode+"install");
install.createNewFile();
PrintWriter pww=new PrintWriter(new BufferedWriter(new FileWriter(install)));
pww.print(jtf26.getText());
pww.println();
s=jtf27.getText();
pww.println(s);
int ff;
s=jtf28.getText();
int ghiop=Integer.valueOf(jtf27.getText());
ff=ghiop-(Integer.valueOf(s)-1);
pww.println(Integer.toString(ff));
pww.println(jtf19.getText()+"/"+jtf20.getText()+"/"+jtf21.getText());
pww.close();
if((Integer.valueOf(s)-1)>0)
{
File fre=new File(universal+regcode+"due");
PrintWriter prrt=new PrintWriter(new BufferedWriter(new FileWriter(fre)));
int ghy=jcb3.getSelectedIndex();
int ddnat,hjy=0;
String correctionvar;
switch(ghy)
{
case 1: s=jtf20.getText(); ddnat=Integer.valueOf(s); ddnat++; hjy=Integer.valueOf(jtf21.getText()); if(ddnat>12){ hjy++;  ddnat-=12;   }
  s=Integer.toString(hjy);        correctionvar=Integer.toString(ddnat); if(correctionvar.length()==1){ correctionvar="0"+correctionvar; }  prrt.print(jtf19.getText()+"/"+correctionvar+"/"+s); break;
case 2: s=jtf20.getText(); ddnat=Integer.valueOf(s); ddnat+=3; hjy=Integer.valueOf(jtf21.getText()); if(ddnat>12){  hjy++;   ddnat-=12;   } s=Integer.toString(hjy);
       correctionvar=Integer.toString(ddnat); if(correctionvar.length()==1){ correctionvar="0"+correctionvar; } prrt.print(jtf19.getText()+"/"+correctionvar+"/"+s); break;
case 3: s=jtf20.getText(); ddnat=Integer.valueOf(s); ddnat+=6; hjy=Integer.valueOf(jtf21.getText()); if(ddnat>12){  hjy++;  ddnat-=12;   } s=Integer.toString(hjy);
      correctionvar=Integer.toString(ddnat); if(correctionvar.length()==1){ correctionvar="0"+correctionvar; }  prrt.print(jtf19.getText()+"/"+correctionvar+"/"+s); break;
case 4: s=jtf21.getText(); ddnat=Integer.valueOf(s); ddnat++; prrt.print(jtf19.getText()+"/"+jtf20.getText()+"/"+Integer.toString(ddnat)); break;
}
//switch ends
prrt.close();
}
File expir=new File(universal+regcode+"expiry");
PrintWriter pexpir=new PrintWriter(new BufferedWriter(new FileWriter(expir)));
s=jtf30.getText();
pexpir.print(s);
pexpir.println();
pexpir.close();
File tenuref=new File(universal+regcode+"tenure");
PrintWriter pten=new PrintWriter(new BufferedWriter(new FileWriter(tenuref)));
s=jtf24.getText();
pten.print(s);
pten.println();
pten.close();
File recordconsid=new File(universal+regcode+"consideration");
PrintWriter pconsid=new PrintWriter(new BufferedWriter(new FileWriter(recordconsid)));
int cal1=Integer.valueOf(jtf26.getText());
int cal2=Integer.valueOf(jtf28.getText());
int cal3=cal1*cal2;
s=Integer.toString(cal3);
pconsid.print(s);
pconsid.println();
pconsid.close();
File recorrepay=new File(universal+regcode+"repay");
PrintWriter prepay=new PrintWriter(new BufferedWriter(new FileWriter(recorrepay)));
s=jtf25.getText();
prepay.print(s);
prepay.println();
prepay.close();
File recieved=new File(universal+regcode+"rec");
PrintWriter prec=new PrintWriter(new BufferedWriter(new FileWriter(recieved)));
prec.print(jtf26.getText());
prec.println();
prec.close();
JOptionPane.showMessageDialog(null,"Registration Done Successfully!");
JOptionPane.showMessageDialog(null,"The Registration Code is "+regcode);
jf11.setVisible(false);
}
}
//try ends here
jf11.setVisible(false);
}
             catch(IOException ioe12)
			 {
				 ioe12.printStackTrace();
				 }
}
   else{ jf11.setVisible(false);                                       }     }
                    });
jf11.add(jsp11);                    
                  jf11.setSize(600,600);
                  jf11.setResizable(true);
                  jf11.setVisible(true);  
                }
                catch(Exception ioexception)
                {
                    ioexception.printStackTrace();
                }
            
            }

        };
        ActionListener actionlistener12 = new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent actionevent)
            {
                JFrame jframe = new JFrame("About");
               jframe.setSize(600, 600);
                JPanel jpanel = new JPanel();
                JLabel jlabel = new JLabel();
                jlabel.setText("<html><h1>Nidhi Management System</h1><p><br/>Nidhi Investment management " +
"software is a jdk1.7 based java software<br/>including all neccessary features requi" +
"red for digitally<br/>handling a nidhi based investment office popular throughout the country.<br/> We provide support to this software/snippets on susbscription/single paid basis.<br/> Your feedback is welcomed at zetatechcc@gmail.com.</p><p>We provide many other services,<br/>to get a note of them access https://zetatech.ml<p/><br/><p>Sincerely,</p>" +
" <h4>Reebal Javed Khan a.k.a. @Zokemore<br/>@ Zeta Tech</h4></html>"
);
                jpanel.add(jlabel);
                jframe.add(jpanel);
                jframe.setVisible(true);
            }

        };
      ActionListener actionlistener13 = new ActionListener() {
               @Override
                 public void actionPerformed(ActionEvent actionevent)
                 {
        try{
			String agc=JOptionPane.showInputDialog(null,"Please Enter the Registration Code of Agent");
			if(agc.equals("")){ JOptionPane.showMessageDialog(null,"Invalid Input"); return; }
			String agc1;
String ftr[]=new String[30];			
			File filepst=new File(universal+agc);
BufferedReader brrpst=new BufferedReader(new FileReader(filepst));
int jji;
for(jji=0;jji<=29;jji++){ ftr[jji]=brrpst.readLine();	}	brrpst.close();
			JFrame jf13=new JFrame("Agent's Network Map/Work Report");
			JOptionPane.showMessageDialog(null,"Agent Name: "+ftr[7]);
int countr=0,countc=0;
int gff=0;
			String asd[][]=new String[10000][3];
			String asd1[][]=new String[5000][16];
			System.out.println(agc);
		String agc2=agc.substring(3,6);
			for(jji=0;jji<=35;jji++){ File foo=new File(universal+"record"+ch1[jji]); BufferedReader brrist=new BufferedReader(new FileReader(foo)); for(int iij=0;iij<5000;iij++){ for(int iik=0;iik<=15;iik++){ agc1=brrist.readLine(); if(agc1!=null){  asd1[iij][iik]=agc1; System.out.println(agc1); } else{ gff++; break;  }      }   if(gff==1){ break; }  if(asd1[iij][5].equals(agc2)){ asd[countr][countc]=asd1[iij][0]; countc++; asd[countr][countc]=asd1[iij][7]; countc++; asd[countr][countc]=asd1[iij][12]; countc=0; countr++; } }  if(gff==1) {  break;  } }
			        Object aobj[] = { "Reg. Code", "Name", "Reg. Date" };
                    JTable yu13 = new JTable(asd, aobj);
                    JScrollPane jsp13 = new JScrollPane(yu13);
                    jf13.addWindowListener(new WindowAdapter() {

                        public void windowClosing(WindowEvent windowevent)
                        {
                                int k = JOptionPane.showConfirmDialog(null, this, "Print?", 1, 0);
                                if(k==0)
                                {   

try{
String prvar1;
prvar1="<html><body><h1>Agent's Work Report</h1><br/><p style=\"font-size:20px\">Agent Name: "+ftr[7]+"<br/>Agent Code: "+agc+"</p><style> td{outline:thin solid black;} tr{outline:thin solid black;}</style><div><table width=\"100%\"><tr><th>Registration Code</th><th>Name</th><th>Registration Date</th></tr>";
									String ppp="";
									int coir=0,coic=0;
									boolean ytr=true;
									while(ytr)
									{
										if(asd[coir][coic]!=null)
										{
										ppp=ppp+"<tr><td>"+asd[coir][coic]+"</td><td>"+asd[coir][++coic]+"</td><td>"+asd[coir][++coic]+"</td></tr>";
										coic=0;
										coir++;
									}
									else{
										ytr=false;
										}
										}
									String finastr=prvar1+ppp+"</table></div></body></html>";
									File finafil=new File("Agent.html");
									if(!finafil.exists()){
									finafil.createNewFile();
								}
PrintWriter pwyr=new PrintWriter(new BufferedWriter(new FileWriter(finafil)));
pwyr.print(finastr);
pwyr.println();
pwyr.close();
									Runtime rnd121=Runtime.getRuntime();
									Process process1=rnd121.exec("firefox Agent.html");
									 }    catch(IOException yuiop){ yuiop.printStackTrace();  }       }  jf13.setVisible(false); }});
jf13.add(jsp13);            
jf13.setSize(600,600);
			jf13.setVisible(true);
			} catch(IOException iioe){ iioe.printStackTrace(); }         
             }
              }; 
       /* if(!log.exists())
        {
        String uuid=JOptionPane.showInputDialog(null,"Please assign uuid for extra security");
	    if(uuid!="")
	    {
		PrintWriter dods=new PrintWriter(new FileWriter(log));
		dods.println(uuid);
		dods.close();
		}
		else
		{
		JOption.showMessageDialog(null,"You have chosen to decrease security level.");
		}
	    } */
        fil.addActionListener(actionlistener);
        fil1.addActionListener(actionlistener1);
        fil2.addActionListener(actionlistener2);
        fil3.addActionListener(actionlistener3);
        //ed.addActionListener(actionlistener6);
        //ed1.addActionListener(actionlistener10);
        ed2.addActionListener(actionlistener4);
        op.addActionListener(actionlistener5);
        op1.addActionListener(actionlistener7);
        op2.addActionListener(actionlistener8);
        //op3.addActionListener(actionlistener9);
        hel1.addActionListener(actionlistener11);
        hel2.addActionListener(actionlistener12);
        jm1.addActionListener(actionlistener13);
        jm.add(fil);
        jm.add(fil1);
        //jm.add(ed1);
        jm.add(ed2);
        jm.add(fil2);
        //jm.add(ed);
        jm.add(fil3);
        jm2.add(op);
        jm2.add(hel1);
        jm2.add(op1);
        jm2.add(op2);
        //jm2.add(op3);
        jm2.add(jm1);
        jm3.add(hel2);
        jmb.add(jm);
        jmb.add(jm2);
        jmb.add(jm3);
        fd.setJMenuBar(jmb);
        fd.getContentPane().add(j);
        fd.show();
    }
    public static void main(String args[])
        throws Exception
    {
        File file = new File("c:\\users\\public\\login");
        nidhi fink1 = new nidhi();
        long l1 = System.currentTimeMillis() + 3000L;
        final JFrame jframe1 = new JFrame();
        nidhi fink2 = new nidhi();
        final JLabel jlk=new JLabel();
        jlk.setText("<html><body style=\"background-color:black;width:400px;height:155px\" ><font face=\"Lucida Sans\" color=\"#FFFFFF\"><center><font size=\"7\">https://zetatech.ml   Author: @Zokemore - Reebal Javed Khan</font><br/><br/><p>Nidhi  System</p>Java 1.7 based<br/>Usable under GNU GPLv3</font></body></center></html>");
        //final JPanel ki=new JPanel();
        jlk.setSize(500,200);
         //ki.add(jlk);
        jframe1.add(jlk);
        jframe1.setSize(500, 200);
        jframe1.setLocation(100, 40);
        jframe1.setUndecorated(true);
        jframe1.setDefaultCloseOperation(3);
        jframe1.setVisible(true);
        while(System.currentTimeMillis() < l1) ;
        final JFrame jframe = new JFrame("Login");
        jframe.setDefaultCloseOperation(3);
        JPanel jpanel = new JPanel();
        JLabel jlabel = new JLabel("Username");
        final JTextField jtextfield = new JTextField(40);
        JLabel jlabel1 = new JLabel("Password");
        final JPasswordField jpasswordfield = new JPasswordField(40);
        JButton jbutton = new JButton("Login");
        JButton jbutton1 = new JButton("Cancel");
        jpanel.add(jlabel);
        jpanel.add(jtextfield);
        jpanel.add(jlabel1);
        jpanel.add(jpasswordfield);
        ActionListener actionlistener = new ActionListener() {
@Override
            public void actionPerformed(ActionEvent actionevent)
            {
                try
                {
                    nidhi fink3 = new nidhi();
                    File file1 = new File("c:\\users\\public\\login");
                    BufferedReader bufferedreader = new BufferedReader(new FileReader(file1));
                    String s3 = bufferedreader.readLine();
                    String s5 = jtextfield.getText();
                    jframe1.setVisible(false);
                    if(s5.equals(s3))
                    {
                        String s4 = bufferedreader.readLine();
                        String s6 = jpasswordfield.getText();
                        if(s6.equals(s4))
                        {
                            JOptionPane.showMessageDialog(null, "Login complete");
                            JPanel jpanel1 = new JPanel();
                            fink3.normal();
                            jframe.setVisible(false);
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "The password is wrong!");
                            System.exit(0);
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "The username is wrong!");
                        System.exit(0);
                    }
                    bufferedreader.close();
                }
                catch(IOException ioexception)
                {
                    ioexception.printStackTrace();
                }
            }

        };
        ActionListener actionlistener1 = new ActionListener() {

            public void actionPerformed(ActionEvent actionevent)
            {
                System.exit(0);
            }

        };
        jbutton.addActionListener(actionlistener);
        jbutton1.addActionListener(actionlistener1);
        jpanel.add(jbutton);
        jpanel.add(jbutton1);
        jframe.add(jpanel);
        jframe.setSize(550, 200);
        jframe.setLocation(200, 270);
        if(!file.exists())
        {
            file.createNewFile();
            JOptionPane.showMessageDialog(null, "Hi,You are not registered yet");
            String s1 = JOptionPane.showInputDialog(null, "Enter username");
            String s2 = JOptionPane.showInputDialog(null, "Enter password");
            String s3 = JOptionPane.showInputDialog(null,"Confirm password");
            if(s3.equals(s2))
            {
			jframe1.setVisible(false);
            PrintWriter ods=new PrintWriter(new BufferedWriter(new FileWriter(file)));
            ods.print(s1);
            ods.print("\n"+s2); 
            ods.close();
		    JOptionPane.showMessageDialog(null,"User registration sucessful.");
		    }
            else
            {
			JOptionPane.showMessageDialog(null,"Password verification failed! Try Again.");
			}
            }
        jframe.setVisible(true);
    }
}
