package PROJE;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class KayitOl extends javax.swing.JFrame {

    public static String date;

    public KayitOl() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnKayitOl = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textKayitAd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textKayitSifre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textKayitNick = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textKayitMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt Ol");
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(58, 83, 155));

        btnKayitOl.setBackground(new java.awt.Color(38, 166, 91));
        btnKayitOl.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        btnKayitOl.setForeground(new java.awt.Color(255, 255, 255));
        btnKayitOl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-add-user-male-40.png"))); // NOI18N
        btnKayitOl.setText("Kayıt Ol");
        btnKayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitOlActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(220, 198, 224));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-back-40.png"))); // NOI18N
        jButton2.setText("Geri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kullanıcı Adı");

        textKayitAd.setBackground(new java.awt.Color(58, 83, 155));
        textKayitAd.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        textKayitAd.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Şifre");

        textKayitSifre.setBackground(new java.awt.Color(58, 83, 155));
        textKayitSifre.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        textKayitSifre.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nick");

        textKayitNick.setBackground(new java.awt.Color(58, 83, 155));
        textKayitNick.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        textKayitNick.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-Posta");

        textKayitMail.setBackground(new java.awt.Color(58, 83, 155));
        textKayitMail.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Doğum Tarihi");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textKayitAd, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2)
                        .addComponent(textKayitSifre)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textKayitNick)
                        .addComponent(jSeparator3)
                        .addComponent(textKayitMail)
                        .addComponent(jSeparator4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textKayitAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textKayitSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textKayitNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textKayitMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(btnKayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitOlActionPerformed
        date = ((JTextField) textKayitTarih.getDateEditor().getUiComponent()).getText();
        if (bosKontrol(textKayitAd.getText()) && bosKontrol(textKayitSifre.getText()) && bosKontrol(textKayitNick.getText()) && bosKontrol(textKayitMail.getText()) && bosKontrol(date)) {
            if (!new GirisYap().isimNickCakismaKontrol(textKayitAd.getText(), textKayitNick.getText())) {
                new GirisYap().yeniKullanici(textKayitAd.getText(), textKayitSifre.getText(), textKayitNick.getText(), textKayitMail.getText(), date);
                JOptionPane.showMessageDialog(this, "Kayıt Tamamlandı ;)");
                dispose();
                new Login().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Girmeye Çalıştığınız Kullanıcı adı ya da Nick kullanılmaktadır.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Boş alan bırakılamaz...");
        }
    }//GEN-LAST:event_btnKayitOlActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean bosKontrol(String bos) {
        if (bos.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitOl().setVisible(true);
            }
        });
    }
        private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKayitOl;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField textKayitAd;
    private javax.swing.JTextField textKayitMail;
    public javax.swing.JTextField textKayitNick;
    private javax.swing.JTextField textKayitSifre;
    // End of variables declaration//GEN-END:variables
}
