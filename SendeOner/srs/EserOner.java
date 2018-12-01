package PROJE;

import PROJE.User;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class EserOner extends javax.swing.JFrame {

    public static int notkontrol;
    public static String kontrolNot;
    public static String kontrolAd;
    public EserOner() {
        initComponents();
        eserTurLbl.setText(User.eserTurAdi);
        setIcon();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textEserAdi = new javax.swing.JTextField();
        eserTurLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textEserNot = new javax.swing.JTextField();
        btnGeridon = new javax.swing.JButton();
        btnEserKayit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sen de Öner");

        jPanel1.setBackground(new java.awt.Color(247, 202, 24));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel1.setText("Paylaşacağınız eserin adı");

        textEserAdi.setBackground(new java.awt.Color(247, 202, 24));
        textEserAdi.setBorder(null);

        eserTurLbl.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        eserTurLbl.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel2.setText("Türünde bir eser paylaşıyorsunuz.");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel3.setText("Notunuz");

        textEserNot.setBackground(new java.awt.Color(247, 202, 24));
        textEserNot.setBorder(null);
        textEserNot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEserNotMouseClicked(evt);
            }
        });

        btnGeridon.setBackground(new java.awt.Color(220, 198, 224));
        btnGeridon.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        btnGeridon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-back-40.png"))); // NOI18N
        btnGeridon.setText("Başka bir eser önermek için tıklayın");
        btnGeridon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeridonActionPerformed(evt);
            }
        });

        btnEserKayit.setBackground(new java.awt.Color(3, 201, 169));
        btnEserKayit.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        btnEserKayit.setForeground(new java.awt.Color(255, 255, 255));
        btnEserKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-add-new-40.png"))); // NOI18N
        btnEserKayit.setText("Kaydet");
        btnEserKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEserKayitActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textEserAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eserTurLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textEserNot, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEserKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnGeridon, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eserTurLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEserAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textEserNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(btnGeridon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEserKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void btnGeridonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeridonActionPerformed
        dispose();
        new User().setVisible(true);
    }//GEN-LAST:event_btnGeridonActionPerformed

    private void textEserNotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEserNotMouseClicked
        JOptionPane.showMessageDialog(this,"0 ile 10 arasında bir sayı giriniz.");
    }//GEN-LAST:event_textEserNotMouseClicked

    private void btnEserKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEserKayitActionPerformed
        kontrolNot = textEserNot.getText();
        kontrolAd = textEserAdi.getText();
        if (new GirisYap().isimCakismaKontrol(kontrolAd) == true)
        {
        JOptionPane.showMessageDialog(this,"Önermeye çalıştığınız eser önceden önerilmiş :)");
        }
        if (notSayiKontrol(kontrolNot)== -1)
        {
        JOptionPane.showMessageDialog(this,"Boşluk ya da harf girilemez"); 
        }
        if (notSayiKontrol(kontrolNot)== -2)       
        {
            JOptionPane.showMessageDialog(this,"Lütfen 0 ile 10 arasında bir sayı giriniz.");             
        }
        if(notSayiKontrol(kontrolNot)== -3 && stringKontrol(kontrolAd) == false && new GirisYap().isimCakismaKontrol(kontrolAd)== false)
        {
        new GirisYap().yeniKayit();
        JOptionPane.showMessageDialog(this,"İşleminiz başarıyla tamamlandı..");
        new GirisYap().notKontrolIsareti(1);
        dispose();
        new User().setVisible(true);
        }
    }//GEN-LAST:event_btnEserKayitActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EserOner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EserOner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EserOner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EserOner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EserOner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEserKayit;
    public javax.swing.JButton btnGeridon;
    public javax.swing.JLabel eserTurLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField textEserAdi;
    public javax.swing.JTextField textEserNot;
    // End of variables declaration//GEN-END:variables

public int notSayiKontrol(String kontrolText)
{
try{
notkontrol = Integer.parseInt(kontrolText);
}
catch(NumberFormatException numberFormatException)
{
return -1;
}
if (notkontrol >= 0 && notkontrol <= 10)
{
return -3;
}
else
{
    return -2;
}}
public boolean stringKontrol(String empty)
{
 return empty.isEmpty();
}
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));

    }


}
