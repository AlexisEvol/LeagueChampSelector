/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Main;

import Main.Champs.Champs;
import Main.Builds.Build;
import Main.Builds.RulesDialog;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author alexi
 */
public class PainDialog extends javax.swing.JDialog {

    public PainDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    File file = new File("src/Main/Builds/build.txt");
    ArrayList<Build> builds;
    Build build;
    MainForm mf = new MainForm();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblBuild = new javax.swing.JLabel();
        btnRandomizer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBuilds = new javax.swing.JList<>();
        btnRules = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Build Randomizer");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("PAIN BUILDER");
        lblTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTitleMouseClicked(evt);
            }
        });

        lblBuild.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnRandomizer.setText("Get Flamed");
        btnRandomizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomizerActionPerformed(evt);
            }
        });

        lstBuilds.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstBuilds.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstBuildsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstBuilds);

        btnRules.setText("Rules");
        btnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRulesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle)
                                    .addComponent(lblBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnRandomizer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRandomizer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRules))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRandomizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomizerActionPerformed
        // TODO add your handling code here:
        
        Random randomizer = new Random();
        int position = randomizer.nextInt(builds.size());
        
        if (builds.get(position).getName().equals(builds.get(position).getName())){
            try {
                readImages(builds.get(position).getImage());
                lblBuild.setText(builds.get(position).getName());
            } 
            catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRandomizerActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        leeBuild();
        DefaultListModel list = new DefaultListModel();
        for(Build b: builds) {
            list.addElement(b.getName());
        }
        lstBuilds.setModel(list);
    }//GEN-LAST:event_formWindowOpened

    private void lstBuildsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstBuildsValueChanged
        // TODO add your handling code here:
        
        String build = lstBuilds.getSelectedValue();
        for(int i = 0; i<builds.size(); i++)
            if (build.equals(builds.get(i).getName())){
                try {
                    readImages(builds.get(i).getImage());
                    lblBuild.setText(builds.get(i).getName());
                } 
                catch (IOException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }
        } 
        
    }//GEN-LAST:event_lstBuildsValueChanged

    private void lblTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTitleMouseClicked
        // TODO add your handling code here:
        builds.clear();
        lstBuilds.setSelectedValue(null, true);
        leeBuild();
        Build kq = new Build("Killer Queen", "kq.jpg");
        builds.add(kq);
        Build king = new Build("The Fast", "fast.jpg");
        builds.add(king);
        DefaultListModel list = new DefaultListModel();
        for(Build b: builds) {
            list.addElement(b.getName());
        }
        lstBuilds.setModel(list);
        
    }//GEN-LAST:event_lblTitleMouseClicked

    private void btnRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRulesActionPerformed
        // TODO add your handling code here:
        
        RulesDialog rd = new RulesDialog(mf, true);
        rd.setVisible(true);
        
    }//GEN-LAST:event_btnRulesActionPerformed

    public void readImages(String imageName) throws IOException{
        File imagesFolder = new File("src/Main/Images/Build");//Path de la carpeta images
        File[] imageFiles = imagesFolder.listFiles();//Variable para guardar las imagenes en un array 

        for(int i = 0; i < imageFiles.length; i++){//leemos la cantidad de imagenes en la carpeta
            if (imageName.equals(imageFiles[i].getName())){
                BufferedImage bufferedImage = ImageIO.read(imageFiles[i]);//Creamos un buffered reader de la imagen perteneciente a la obra seleccionada
                ImageIcon imageChampion = mf.resizeImageIcon(bufferedImage, lblImage.getWidth(), lblImage.getHeight());
                lblImage.setIcon(imageChampion);
            }
        }
    }  
    
    public void leeBuild(){
        try {
            
            BufferedReader bf = new BufferedReader(new FileReader(file));
            builds = new ArrayList<>();
            
            while(bf.ready()){
                
                String linea = bf.readLine();
                String[] lineas = linea.split("/");
                build = new Build(lineas[0], lineas[1]);
                builds.add(build);
            }
        }
        catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(PainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PainDialog dialog = new PainDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRandomizer;
    private javax.swing.JButton btnRules;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuild;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstBuilds;
    // End of variables declaration//GEN-END:variables
}
