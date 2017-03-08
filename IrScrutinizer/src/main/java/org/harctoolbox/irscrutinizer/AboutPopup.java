/*
Copyright (C) 2013 Bengt Martensson.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or (at
your option) any later version.

This program is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License along with
this program. If not, see http://www.gnu.org/licenses/.
*/

package org.harctoolbox.irscrutinizer;

import java.net.URI;
import java.net.URISyntaxException;
import org.harctoolbox.IrpMaster.DecodeIR;
import org.harctoolbox.guicomponents.GuiUtils;

/**
 * The mandatory about popup ;-).
 *
 */
public class AboutPopup extends javax.swing.JDialog {

    private GuiUtils guiUtils;
    private String decodeIRVersion;

   /**
     * Creates the obligatory About popup.
     *
     * @param parent Parent frame
     * @param modal Modality of the popup.
     */
    public AboutPopup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        if (!(parent instanceof GuiMain))
            throw new RuntimeException("Programming error");

        guiUtils = ((GuiMain) parent).getGuiUtils();
        try {
            decodeIRVersion = "DecodeIR version " + DecodeIR.getVersion();
        } catch (UnsatisfiedLinkError ex) {
            System.err.println(ex.getMessage());
            decodeIRVersion = "DecodeIR not found.";
        }
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        versionLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        licenseText = new javax.swing.JTextArea();
        versionLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        thirdPartyLicenseText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About IrScrutinizer"); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(Version.appName + " \u2014 an IR signal program");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        versionLabel.setText(Version.versionString + "; " + org.harctoolbox.IrpMaster.Version.versionString);

        authorLabel.setFont(new java.awt.Font("Lucida Bright", 2, 14)); // NOI18N
        authorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        authorLabel.setText("Author: Bengt Martensson");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        licenseText.setEditable(false);
        licenseText.setColumns(20);
        licenseText.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        licenseText.setLineWrap(true);
        licenseText.setRows(4);
        licenseText.setText(Version.licenseString);
        licenseText.setToolTipText("License conditions for the current program");
        licenseText.setWrapStyleWord(true);
        licenseText.setCaretPosition(0);
        licenseText.setFocusable(false);
        licenseText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(licenseText);

        versionLabel2.setText(decodeIRVersion);

        jLabel1.setText("Java: " + System.getProperty("java.vendor") + " " + System.getProperty("java.version") + " " + System.getProperty("os.name") + "-" + System.getProperty("os.arch"));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        thirdPartyLicenseText.setEditable(false);
        thirdPartyLicenseText.setColumns(20);
        thirdPartyLicenseText.setLineWrap(true);
        thirdPartyLicenseText.setRows(5);
        thirdPartyLicenseText.setText(Version.thirdPartyString);
        thirdPartyLicenseText.setToolTipText("License conditions for third-party components.");
        thirdPartyLicenseText.setWrapStyleWord(true);
        thirdPartyLicenseText.setCaretPosition(0);
        thirdPartyLicenseText.setFocusable(false);
        thirdPartyLicenseText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(thirdPartyLicenseText);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crystal-Clear/64x64/apps/babelfish.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Crystal-Clear/22x22/apps/browser.png"))); // NOI18N
        jButton1.setText("Project Web Site");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(versionLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(versionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorLabel)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(7, 7, 7)
                .addComponent(versionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(versionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, versionLabel, versionLabel2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        dispose();
    }//GEN-LAST:event_formMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            guiUtils.browse(new URI(Version.homepageUrl));
        } catch (URISyntaxException ex) {
            guiUtils.error(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   /**
    * Normally not used; just for debugging.
    *
    * @param args Not used.
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            AboutPopup dialog = new AboutPopup(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea licenseText;
    private javax.swing.JTextArea thirdPartyLicenseText;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JLabel versionLabel2;
    // End of variables declaration//GEN-END:variables
}
