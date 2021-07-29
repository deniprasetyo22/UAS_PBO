public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        pilihpesantiket = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        pilihpesanansaya = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        pilihakunsaya = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        pilihlogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jMenu1.setText("Pesan Tiket");

        pilihpesantiket.setText("Pesan Tiket");
        pilihpesantiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihpesantiket(evt);
            }
        });
        jMenu1.add(pilihpesantiket);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pesanan Saya");

        pilihpesanansaya.setText("Pesanan Saya");
        pilihpesanansaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihpesanansaya(evt);
            }
        });
        jMenu2.add(pilihpesanansaya);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("My Accout");

        pilihakunsaya.setText("My Account");
        pilihakunsaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihakunsaya(evt);
            }
        });
        jMenu3.add(pilihakunsaya);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Log Out");

        pilihlogout.setText("Log Out");
        pilihlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihlogout(evt);
            }
        });
        jMenu4.add(pilihlogout);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

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

    private void pilihpesantiket(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihpesantiket
        new PesanTiket().setVisible(true);
    }//GEN-LAST:event_pilihpesantiket

    private void pilihpesanansaya(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihpesanansaya
        new PesananSaya().setVisible(true);
    }//GEN-LAST:event_pilihpesanansaya

    private void pilihakunsaya(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihakunsaya
        new Account().setVisible(true);
    }//GEN-LAST:event_pilihakunsaya

    private void pilihlogout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihlogout
        this.dispose();
        new LandingPage().setVisible(true);
    }//GEN-LAST:event_pilihlogout

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem pilihakunsaya;
    private javax.swing.JMenuItem pilihlogout;
    private javax.swing.JMenuItem pilihpesanansaya;
    private javax.swing.JMenuItem pilihpesantiket;
    // End of variables declaration//GEN-END:variables
}
