package PROJE;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EserAyrintiFrame extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    public static String eserAdcomment;

    public EserAyrintiFrame() {
        initComponents();
        setIcon();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNotVer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnNotVer = new javax.swing.JButton();
        btnYorumKayit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtYorum = new javax.swing.JTextArea();
        btnKapaAyrinti = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblEserAd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNotOrt = new javax.swing.JLabel();
        btnYorumGoster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eser");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(30, 139, 195));

        commentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(commentTable);

        jPanel2.setBackground(new java.awt.Color(184, 27, 66));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Not Ver:");

        btnNotVer.setBackground(new java.awt.Color(255, 255, 255));
        btnNotVer.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        btnNotVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-good-quality-40.png"))); // NOI18N
        btnNotVer.setText("Not Vermek için Tıkla");
        btnNotVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotVerActionPerformed(evt);
            }
        });

        btnYorumKayit.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        btnYorumKayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-topic-40.png"))); // NOI18N
        btnYorumKayit.setText("Yorum Yap");
        btnYorumKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYorumKayitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Yorum Yap:");

        txtYorum.setColumns(20);
        txtYorum.setRows(5);
        jScrollPane1.setViewportView(txtYorum);

        btnKapaAyrinti.setBackground(new java.awt.Color(220, 198, 224));
        btnKapaAyrinti.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        btnKapaAyrinti.setForeground(new java.awt.Color(214, 69, 65));
        btnKapaAyrinti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-back-40.png"))); // NOI18N
        btnKapaAyrinti.setText("Geri Dön");
        btnKapaAyrinti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapaAyrintiActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(242, 120, 75));

        lblEserAd.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        lblEserAd.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel2.setText("Şuanki Not Ortalaması:");

        lblNotOrt.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        lblNotOrt.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEserAd, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(lblNotOrt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblEserAd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNotOrt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNotVer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNotVer))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(btnYorumKayit)))
                        .addGap(40, 40, 40)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnKapaAyrinti)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNotVer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNotVer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnYorumKayit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnKapaAyrinti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        btnYorumGoster.setBackground(new java.awt.Color(0, 230, 64));
        btnYorumGoster.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        btnYorumGoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-checklist-40.png"))); // NOI18N
        btnYorumGoster.setText("Yorumları Göster");
        btnYorumGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYorumGosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnYorumGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnYorumGoster, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        eserAdcomment = lblEserAd.getText();
//        lblNotOrt.setText(new GirisYap().notOrtGetir(lblEserAd.getText()));
    }//GEN-LAST:event_formWindowActivated

    private void btnYorumGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYorumGosterActionPerformed
        commentItems();
    }//GEN-LAST:event_btnYorumGosterActionPerformed

    private void btnKapaAyrintiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapaAyrintiActionPerformed
        dispose();
        new User().setVisible(true);
    }//GEN-LAST:event_btnKapaAyrintiActionPerformed

    private void btnYorumKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYorumKayitActionPerformed
        if (!txtYorum.getText().isEmpty()) {
            new GirisYap().yorumKayit(txtYorum.getText(), lblEserAd.getText());
            JOptionPane.showMessageDialog(this, "İşlem Başarılı");
        } else {
            JOptionPane.showMessageDialog(this, "Boş Mesaj Girilemez");
        }
    }//GEN-LAST:event_btnYorumKayitActionPerformed

    private void btnNotVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotVerActionPerformed
        if (new EserOner().notSayiKontrol(txtNotVer.getText()) == -1) {
            JOptionPane.showMessageDialog(this, "Boşluk ya da harf girilemez");
        }
        if (new EserOner().notSayiKontrol(txtNotVer.getText()) == -2) {
            JOptionPane.showMessageDialog(this, "Lütfen 0 ile 10 arasında bir sayı giriniz.");
        }
        if (new EserOner().notSayiKontrol(txtNotVer.getText()) == -3) {
            if (new GirisYap().notVerdiColumnKontrol(lblEserAd.getText()) == false) {
                int notu = Integer.parseInt(txtNotVer.getText());
                int notSayisi = new GirisYap().notVer(notu, lblEserAd.getText());
                if (notSayisi > 0) {
                    new GirisYap().notVerildiIsareti(lblEserAd.getText(), 1);
                    int notOrt = new GirisYap().notVerDevam(lblEserAd.getText(), notSayisi);
                    if (notOrt > 0) {
                        new GirisYap().notOrtKayit(lblEserAd.getText(), notOrt);
                        lblNotOrt.setText(Integer.toString(notOrt));

                    }
                }

                JOptionPane.showMessageDialog(this, "Not Verildi");
            } else {
                JOptionPane.showMessageDialog(this, "DAHA ÖNCE NOT VERİLDİ...!!!");
            }

        }
    }//GEN-LAST:event_btnNotVerActionPerformed
    public void commentItems() {
        ArrayList<YorumTableData> users = new GirisYap().showComment();
        model.setColumnIdentifiers(new Object[]{"Sahibi", "Yorum"});
        Object[] row = new Object[2];

        for (int i = 0; i < users.size(); i++) {
            row[0] = users.get(i).getYorum();
            row[1] = users.get(i).getYorumPaylasan();
            model.addRow(row);
        }

        commentTable.setModel(model);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EserAyrintiFrame().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnKapaAyrinti;
    public javax.swing.JButton btnNotVer;
    private javax.swing.JButton btnYorumGoster;
    public javax.swing.JButton btnYorumKayit;
    public javax.swing.JTable commentTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblEserAd;
    public javax.swing.JLabel lblNotOrt;
    public javax.swing.JTextField txtNotVer;
    public javax.swing.JTextArea txtYorum;
    // End of variables declaration//GEN-END:variables
}
