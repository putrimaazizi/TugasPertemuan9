package cobamvc;

import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ViewPraktikum extends JFrame{
    
    JTextField jtsearch = new JTextField();
    JButton jbsearch = new JButton("Cari NIM");
    
    JLabel jlnim = new JLabel("Nim : ");
    JTextField jtnim = new JTextField();
    JLabel jlnama = new JLabel("Nama : ");
    JTextField jtnama = new JTextField();
    JLabel jlalamat = new JLabel("Alamat : ");
    JTextField jtalamat = new JTextField();
    
    JButton jbtambah = new JButton("Tambah");
    JButton jbupdate = new JButton("Update");
    JButton jbreset = new JButton("Reset");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Nim", "Nama", "Alamat"};
    
    public ViewPraktikum(){
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(750,400); // x , y
        
        add(scrollPane);
        scrollPane.setBounds(20, 40, 470, 300);
        
        // SEARCH ==============================================================
        add(jtsearch);
        jtsearch.setBounds(20, 10, 380, 20);
        add(jbsearch);
        jbsearch.setBounds(400, 10, 90, 20);
        
        // NIM =================================================================
        add(jlnim);
        jlnim.setBounds(510, 20, 90, 20);
        add(jtnim);
        jtnim.setBounds(510, 40, 120, 20);
        
        // NAMA ================================================================
        add(jlnama);
        jlnama.setBounds(510, 60, 90, 20);
        add(jtnama);
        jtnama.setBounds(510, 80, 120, 20);
        
        // ALAMAT ==============================================================
        add(jlalamat);
        jlalamat.setBounds(510, 100, 90, 20);
        add(jtalamat);
        jtalamat.setBounds(510, 120, 120, 20);
        
        
        // BUTTON ==============================================================
        add(jbtambah);
        jbtambah.setBounds(510, 160, 90, 20);
        
        add(jbupdate);
        jbupdate.setBounds(510, 200, 90, 20);
        
        add(jbreset);
        jbreset.setBounds(510, 240, 90, 20);
    }
    
    
    //Buat ngambil data texfield
    public String getNim(){
        return jtnim.getText();
    }
    
    public String getNama(){
        return jtnama.getText();
    }
    
    public String getAlamat(){
        return jtalamat.getText();
    }
    
    public String getSearch(){
        return jtsearch.getText();
    }
}

