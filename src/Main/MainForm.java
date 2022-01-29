package Main;

import Main.Champs.Champs;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author alexis
 */


/*
  ,--./,-.
 / #      \
|          |
 \        /
  `._,._,'
*/
public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }
    File file = new File("src/Main/Champs/champs.txt");
    Champs champion;
    ArrayList<Champs> champs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblChampList = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstChamps = new javax.swing.JList<>();
        lblImage = new javax.swing.JLabel();
        btnRandom = new javax.swing.JButton();
        txtSecret = new javax.swing.JTextField();
        btnSecret = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemSupp = new javax.swing.JMenuItem();
        ItemAdc = new javax.swing.JMenuItem();
        ItemPain = new javax.swing.JMenuItem();
        itemGame = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Champs Randomizer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblChampList.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblChampList.setText("CHAMPIONS");

        lstChamps.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lstChamps.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstChamps.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstChampsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstChamps);

        btnRandom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRandom.setText("Random Pick");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        txtSecret.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnSecret.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSecret.setText("???");
        btnSecret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecretActionPerformed(evt);
            }
        });

        jMenu1.setText("Utilities");

        ItemSupp.setText("Supp");
        ItemSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSuppActionPerformed(evt);
            }
        });
        jMenu1.add(ItemSupp);

        ItemAdc.setText("Adc");
        ItemAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAdcActionPerformed(evt);
            }
        });
        jMenu1.add(ItemAdc);

        ItemPain.setText("PainBuilder");
        ItemPain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPainActionPerformed(evt);
            }
        });
        jMenu1.add(ItemPain);

        itemGame.setText("RandomGame");
        itemGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGameActionPerformed(evt);
            }
        });
        jMenu1.add(itemGame);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblChampList, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSecret, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSecret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btnRandom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChampList)
                    .addComponent(txtSecret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSecret))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnRandom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        // TODO add your handling code here:
        
        Random randomizer = new Random();
        int position = randomizer.nextInt(champs.size());
        
        if (champs.get(position).getName().equals(champs.get(position).getName())){
            try {
                readImages(champs.get(position).getImage());
            } 
            catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRandomActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            
            BufferedReader bf = new BufferedReader(new FileReader(file));
            champs = new ArrayList<>();
            
            while(bf.ready()){
                
                String linea = bf.readLine();
                String[] lineas = linea.split("/");
                champion = new Champs(lineas[0], lineas[1], lineas[2]);
                champs.add(champion);
            }
            DefaultListModel list = new DefaultListModel();
            for(Champs c: champs) {
                list.addElement(c.getName());
            }
            lstChamps.setModel(list);
            }
            catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
            } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void lstChampsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstChampsValueChanged
        // TODO add your handling code here:
        
        String champ = lstChamps.getSelectedValue();
        for(int i = 0; i<champs.size(); i++)
            if (champ.equals(champs.get(i).getName())){
                try {
                    readImages(champs.get(i).getImage());
                } 
                catch (IOException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_lstChampsValueChanged

    private void ItemAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAdcActionPerformed
        // TODO add your handling code here:
        AdcDialog ad = new AdcDialog(this, true);
        ad.setVisible(true);
    }//GEN-LAST:event_ItemAdcActionPerformed

    private void ItemSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSuppActionPerformed
        // TODO add your handling code here:
        SuppDialog sd = new SuppDialog(this, true);
        sd.setVisible(true);
    }//GEN-LAST:event_ItemSuppActionPerformed

    private void ItemPainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPainActionPerformed
        // TODO add your handling code here:
        
        PainDialog pd = new PainDialog(this, true);
        pd.setVisible(true);
    }//GEN-LAST:event_ItemPainActionPerformed

    private void btnSecretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecretActionPerformed
        // TODO add your handling code here:
        
        if(txtSecret.getText().equals("Xerath") || txtSecret.getText().equals("xerath")){
            try {
                readImages("xer.jpg");
                lblChampList.setForeground(Color.blue);
                lblChampList.setText("ASCENSION");
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(txtSecret.getText().equals("Win") || txtSecret.getText().equals("win")){
            try {
              Desktop desktop = java.awt.Desktop.getDesktop();
              URI oURL = new URI("https://www.youtube.com/watch?v=w8C01Vpz8I4&ab_channel=JennyMusic");
              desktop.browse(oURL);
            } catch (Exception e) {
              e.printStackTrace();
            }
        }
        
        if(txtSecret.getText().equals("Leo") || txtSecret.getText().equals("leo")){
            try {
              Desktop desktop = java.awt.Desktop.getDesktop();
              URI oURL = new URI("https://images-na.ssl-images-amazon.com/images/I/61Bc4WsEsEL.jpg");
              desktop.browse(oURL);
            } catch (Exception e) {
              e.printStackTrace();
            }
        }
        if(txtSecret.getText().equals("I feel") || txtSecret.getText().equals("i feel")){
            CutieDialog cd = new CutieDialog(this, true);
            cd.setVisible(true);
        }
        if(txtSecret.getText().equals("FFXIV") || txtSecret.getText().equals("ffxiv")){
            try {
                readImages("unknown.jpg");
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(txtSecret.getText().equals("MUDA") || txtSecret.getText().equals("muda")){
            try {
              Desktop desktop = java.awt.Desktop.getDesktop();
              URI oURL = new URI("https://www.youtube.com/watch?v=N0U9SEAGyFI&ab_channel=BruceLee%E2%9C%93");
              desktop.browse(oURL);
            } catch (Exception e) {
              e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSecretActionPerformed

    private void itemGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGameActionPerformed
        // TODO add your handling code here:
        
        RandomGameDialog rgd = new RandomGameDialog(this, true);
        rgd.setVisible(true);
    }//GEN-LAST:event_itemGameActionPerformed

    public void readImages(String imageName) throws IOException{
        File imagesFolder = new File("src/Main/Images");
        File[] imageFiles = imagesFolder.listFiles();

        for(int i = 0; i < imageFiles.length; i++){
            if (imageName.equals(imageFiles[i].getName())){
                BufferedImage bufferedImage = ImageIO.read(imageFiles[i]);
                ImageIcon imageChampion = resizeImageIcon(bufferedImage, lblImage.getWidth(), lblImage.getHeight());
                lblImage.setIcon(imageChampion);
            }
        }
    }
    
    public ImageIcon resizeImageIcon (BufferedImage originalImage, int desiredWidth, int desiredHeight) {
        int newHeight = 0;    
        int newWidth = 0;
        float aspectRatio = (float)originalImage.getWidth() / originalImage.getHeight();
        if (originalImage.getWidth() > originalImage.getHeight()) {
            newWidth = desiredWidth;
            newHeight = Math.round( desiredWidth / aspectRatio);    
        }
        else {
            newHeight = desiredHeight;
            newWidth = Math.round(desiredHeight * aspectRatio);
        }
        Image resultingImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        ImageIcon imageIcon = new ImageIcon(outputImage);
        return imageIcon;
    }
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemAdc;
    private javax.swing.JMenuItem ItemPain;
    private javax.swing.JMenuItem ItemSupp;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnSecret;
    private javax.swing.JMenuItem itemGame;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChampList;
    private javax.swing.JLabel lblImage;
    private javax.swing.JList<String> lstChamps;
    private javax.swing.JTextField txtSecret;
    // End of variables declaration//GEN-END:variables

// I love you <3
}
