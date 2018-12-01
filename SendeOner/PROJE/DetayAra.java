package PROJE;

import PROJE.TableDatas;
import PROJE.GirisYap;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class DetayAra extends javax.swing.JFrame {

    GirisYap girisyap = new GirisYap();
    EserAyrintiFrame eserayrinti = new EserAyrintiFrame();

    public DetayAra() {
        initComponents();
        LineBorder lineBorder = new LineBorder(new Color(236,236,236), 2, true);
        btnAra.setBorder(lineBorder);
        detayAraText.setBorder(lineBorder);
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDetay = new javax.swing.JTable();
        btnKapa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        detayAraText = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detaylı Arama");

        jPanel1.setBackground(new java.awt.Color(43, 62, 116));

        tableDetay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableDetay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDetayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDetay);

        btnKapa.setBackground(new java.awt.Color(220, 198, 224));
        btnKapa.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnKapa.setForeground(new java.awt.Color(214, 69, 65));
        btnKapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-back-40.png"))); // NOI18N
        btnKapa.setText("Kapat");
        btnKapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(246, 36, 89));

        btnAra.setBackground(new java.awt.Color(30, 139, 195));
        btnAra.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnAra.setForeground(new java.awt.Color(204, 204, 204));
        btnAra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserIcons/icons8-search-40.png"))); // NOI18N
        btnAra.setText("Ara");
        btnAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(detayAraText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detayAraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnKapa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnKapa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapaActionPerformed
        dispose();
        new User().setVisible(true);
    }//GEN-LAST:event_btnKapaActionPerformed

    private void btnAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraActionPerformed
        findItems();
    }//GEN-LAST:event_btnAraActionPerformed

    private void tableDetayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDetayMouseClicked
        DefaultTableModel model2 = (DefaultTableModel) tableDetay.getModel();
        int selectedRow = tableDetay.getSelectedRow();
        eserayrinti.lblEserAd.setText(model2.getValueAt(selectedRow,0).toString());
        eserayrinti.lblNotOrt.setText(model2.getValueAt(selectedRow,3).toString());
        eserayrinti.setVisible(true);
        dispose();
    }//GEN-LAST:event_tableDetayMouseClicked
    public void findItems() {
        ArrayList<TableDatas> users = girisyap.ListUsers(detayAraText.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Ad", "Tür", "Paylaşan", "Not Ortalaması"});
        Object[] row = new Object[4];

        for (int i = 0; i < users.size(); i++) {
            row[0] = users.get(i).getAdi();
            row[1] = users.get(i).getTur();
            row[2] = users.get(i).getPaylasan();
            row[3] = users.get(i).getNotu();
            model.addRow(row);
        }
        tableDetay.setModel(model);
    }
            private void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetayAra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnKapa;
    private javax.swing.JTextField detayAraText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDetay;
    // End of variables declaration//GEN-END:variables
}
