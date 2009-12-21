package org.openoffice.gdocs.ui.dialogs;

import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.openoffice.gdocs.configuration.Configuration;
import org.openoffice.gdocs.util.Util;


public class ConfigDialog extends javax.swing.JFrame {
    
    /** Creates new form ConfigDialog */
    public ConfigDialog(java.awt.Frame parent, boolean modal) {
        super("Configuration");
        initComponents();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        jComboBox1.setModel(Configuration.getLanguagesModel());
        jComboBox2.setModel(Configuration.getLooksAndFeelsModel());
        proxyCheckBox.setSelected(Configuration.isUseProxy());        
        proxyServer.setText(Configuration.getProxyServer());
        proxyPort.setText(Configuration.getProxyPort());
        authProxyLabel.setSelected(Configuration.isProxyAuth());
        authProxyUser.setText(Configuration.getProxyUser());
        authProxyPassword.setText(Configuration.getProxyPassword());
        defaultAutoupdateCheckbox.setSelected(Configuration.isDefaultAutoUpdate());
        setEnableForProxy(Configuration.isUseProxy());
        jLabel11.setText("version: "+Configuration.getVersionStr());
        jButton4.setVisible(false);
        configureDirectoryToSaveUI();
    }

    private void configureDirectoryToSaveUI() {
        String directory = Configuration.getPathToDirectoryToStorefiles();
        overwritteCheckBox.setSelected(Configuration.getOverwritteFlag());
        if ("?".equals(directory)) {
            jRadioButton1.setSelected(false);
            overwritteCheckBox.setEnabled(false);
            jRadioButton2.setSelected(true);

        } else {
            jRadioButton1.setSelected(true);
            overwritteCheckBox.setEnabled(true);
            jRadioButton2.setSelected(false);
        }
        enableProperLineForDirectoryToSave();
    }
    
    private void enableProperLineForDirectoryToSave() {
        String directory = Configuration.getPathToDirectoryToStorefiles();
        if (jRadioButton1.isSelected()) {
            if ("?".equals(directory)) {
                directory = Configuration.getWorkingPath();
            }
            saveDirectoryTextField.setText(directory);            
            saveDirectoryTextField.setEnabled(true);
            browseButton.setEnabled(true);            
        } else {
            saveDirectoryTextField.setText("");
            saveDirectoryTextField.setEnabled(false);
            browseButton.setEnabled(false);            
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        proxyCheckBox = new javax.swing.JCheckBox();
        proxyServerLabel = new javax.swing.JLabel();
        proxyServer = new javax.swing.JTextField();
        proxyPortLabel = new javax.swing.JLabel();
        proxyPort = new javax.swing.JTextField();
        authProxyLabel = new javax.swing.JCheckBox();
        authProxyUserLabel = new javax.swing.JLabel();
        authProxyUser = new javax.swing.JTextField();
        authProxyPasswordLabel = new javax.swing.JLabel();
        authProxyPassword = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        saveDirectoryTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        overwritteCheckBox = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        defaultAutoupdateCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuration");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setText("Language:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Code: Przemyslaw Rumik ");

        jLabel2.setText("<html><font color=\"blue\"><u>My Page</u></font> / ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel5.setText("<html><font color=\"blue\"><u>My Blog");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel4.setText("Translation:");

        jLabel6.setText("German: Pascal Herbert");

        jLabel7.setText("Bulgarian: Stefan Kolarov");

        jLabel8.setText("Stefan Kolarov");

        jLabel9.setText("Polish: Przemyslaw Rumik");

        jLabel10.setText("Russian: Nikita aka Kolobok");

        jLabel12.setText("Spanish: Enrique Ros Carrión");

        jLabel13.setText("Icons created by Simone Di Somma");

        jLabel15.setText("Italian: Simone Di Somma");

        jLabel16.setText("Portuguese (Brazilian): leroma");

        jLabel17.setText("Chinese (Simplified): Steven (YoUZoU)");

        jLabel18.setText("French: Benjamin Cantele");

        jLabel20.setText("Czech: Vlastimil Ott");

        jLabel21.setText("Hungarian: Kálmán „KAMI” Szalai");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel10))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel7))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel6))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel9))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(44, 44, 44)
                        .add(jLabel8))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel12))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel3)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 59, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel13)
                    .add(jLabel16)
                    .add(jLabel17)
                    .add(jLabel18)
                    .add(jLabel20)
                    .add(jLabel21))
                .add(95, 95, 95))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel15)
                .addContainerGap(356, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jLabel13))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel9)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel6))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jLabel16)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel17)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel10))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel18)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel20)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel15))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel21)
                        .addContainerGap())))
        );

        proxyCheckBox.setText("Use proxy");
        proxyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxyCheckBoxActionPerformed(evt);
            }
        });

        proxyServerLabel.setText("Proxy server:");
        proxyServerLabel.setEnabled(false);

        proxyServer.setEnabled(false);

        proxyPortLabel.setText("Proxy port:");
        proxyPortLabel.setEnabled(false);

        proxyPort.setEnabled(false);

        authProxyLabel.setText("Login to proxy server");
        authProxyLabel.setEnabled(false);
        authProxyLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authProxyLabelActionPerformed(evt);
            }
        });

        authProxyUserLabel.setText("User:");
        authProxyUserLabel.setEnabled(false);

        authProxyUser.setEnabled(false);
        authProxyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authProxyUserActionPerformed(evt);
            }
        });

        authProxyPasswordLabel.setText("Password:");
        authProxyPasswordLabel.setEnabled(false);

        authProxyPassword.setEnabled(false);

        jButton3.setText("Error Log");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText("version:");

        jLabel14.setText("About:");

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Downloaded files save to:");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Ask, where save downloaded file");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        saveDirectoryTextField.setEditable(false);

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        jButton4.setText("More languages");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        overwritteCheckBox.setText("If file with given name exists try to overwrite it");

        jLabel19.setText("Look & Feel:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        defaultAutoupdateCheckbox.setText("Default autoupdate");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(proxyServer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 374, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(proxyServerLabel))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(proxyPort)
                                    .add(proxyPortLabel)))
                            .add(authProxyLabel)
                            .add(layout.createSequentialGroup()
                                .add(authProxyUserLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(authProxyUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(authProxyPasswordLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(authProxyPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(jRadioButton1)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(saveDirectoryTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 218, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(overwritteCheckBox)
                                    .add(jRadioButton2))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, browseButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(proxyCheckBox)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel1)
                                            .add(jLabel19))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jComboBox2, 0, 427, Short.MAX_VALUE)
                                            .add(jComboBox1, 0, 427, Short.MAX_VALUE))))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 6, Short.MAX_VALUE))
                            .add(defaultAutoupdateCheckbox)
                            .add(jLabel14))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(93, 93, 93)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 128, Short.MAX_VALUE)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 82, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(110, 110, 110))
                    .add(layout.createSequentialGroup()
                        .add(jLabel11)
                        .addContainerGap(457, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel19)
                    .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(proxyCheckBox)
                    .add(jButton4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(proxyServerLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(proxyPortLabel))
                .add(2, 2, 2)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(proxyServer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(proxyPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(authProxyLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(authProxyUserLabel)
                    .add(authProxyUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(authProxyPasswordLabel)
                    .add(authProxyPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioButton1)
                    .add(saveDirectoryTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(overwritteCheckBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRadioButton2))
                    .add(jButton3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(defaultAutoupdateCheckbox)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel14)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
//            Desktop.getDesktop().browse(new URI("http://przemelek.googlepages.com"));
            Util.openBrowserForURL(this, "http://www.przemelek.pl");
        } catch (Exception e) {
            // Not crucial, so we may ignore it ;-)
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
//            Desktop.getDesktop().browse(new URI("http://przemelek.blogspot.com"));
            Util.openBrowserForURL(this, "http://przemelek.blogspot.com");
        } catch (Exception e) {
            // Not crucial, so we may ignore it ;-)
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Configuration.setLang((String)jComboBox1.getSelectedItem());
        Configuration.setUseProxy(proxyCheckBox.isSelected());
        Configuration.setProxyServer(proxyServer.getText());
        Configuration.setProxyPort(proxyPort.getText());        
        Configuration.setProxyAuth(authProxyLabel.isSelected());
        Configuration.setProxyUser(authProxyUser.getText());
        Configuration.setProxyPassword(new String(authProxyPassword.getPassword()));
        if (jRadioButton1.isSelected()) {
            Configuration.setDirectoryToStoreFiles(saveDirectoryTextField.getText());
        } else {
            Configuration.setDirectoryToStoreFiles("?");
        }
        Configuration.setOverwritteFlag(overwritteCheckBox.isSelected());
        Configuration.setLookAndFeel((String)jComboBox2.getSelectedItem());
        Configuration.setDefaultAutoUpdate(defaultAutoupdateCheckbox.isSelected());
        Configuration.store();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setEnableForProxy(boolean enable) {
        JComponent components[] = {proxyServerLabel,proxyServer,proxyPortLabel,proxyPort,authProxyLabel};
        for (JComponent component:components) {
            component.setVisible(enable);
            component.setEnabled(enable);
        }
        boolean authProxyEnable = authProxyLabel.isSelected() && enable;
        JComponent components2[] = {authProxyUserLabel,authProxyUser,authProxyPasswordLabel,authProxyPassword};
        for (JComponent component:components2) {
            component.setVisible(authProxyEnable);
            component.setEnabled(authProxyEnable);
        }
        pack();
    }
    
    private void proxyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxyCheckBoxActionPerformed
        setEnableForProxy(proxyCheckBox.isSelected()); 
}//GEN-LAST:event_proxyCheckBoxActionPerformed

    private void authProxyLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authProxyLabelActionPerformed
         setEnableForProxy(proxyCheckBox.isSelected());
}//GEN-LAST:event_authProxyLabelActionPerformed

    private void authProxyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authProxyUserActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_authProxyUserActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            JFrame logFrame = new JFrame();
            JTextArea textArea = new JTextArea();
            logFrame.add(new JScrollPane(textArea));
            logFrame.setSize(500,500);
            logFrame.setVisible(true);
            List<String> list = Configuration.getLog();
            StringBuilder sb = new StringBuilder();
            for (String str:list) {
                sb.append(str).append("\n");
            }            
            textArea.setText(sb.toString());
}//GEN-LAST:event_jButton3ActionPerformed

private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    enableProperLineForDirectoryToSave();
}//GEN-LAST:event_jRadioButton1ActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    enableProperLineForDirectoryToSave();
}//GEN-LAST:event_jRadioButton2ActionPerformed

private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
    String directory = Configuration.getPathToDirectoryToStorefiles();
    JFileChooser fileChooser;
    if ("?".equals(directory)) {
        fileChooser = new JFileChooser(Configuration.getWorkingPath());
    } else {
        fileChooser = new JFileChooser(directory);
    }
    fileChooser.setDialogType(JFileChooser.DIRECTORIES_ONLY);
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    if (fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) {
        saveDirectoryTextField.setText(fileChooser.getSelectedFile().getAbsolutePath());
    }
}//GEN-LAST:event_browseButtonActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
}//GEN-LAST:event_jButton4ActionPerformed

private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    Configuration.changeLookAndFeel((String)jComboBox2.getSelectedItem());
}//GEN-LAST:event_jComboBox2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigDialog(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox authProxyLabel;
    private javax.swing.JPasswordField authProxyPassword;
    private javax.swing.JLabel authProxyPasswordLabel;
    private javax.swing.JTextField authProxyUser;
    private javax.swing.JLabel authProxyUserLabel;
    private javax.swing.JButton browseButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox defaultAutoupdateCheckbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JCheckBox overwritteCheckBox;
    private javax.swing.JCheckBox proxyCheckBox;
    private javax.swing.JTextField proxyPort;
    private javax.swing.JLabel proxyPortLabel;
    private javax.swing.JTextField proxyServer;
    private javax.swing.JLabel proxyServerLabel;
    private javax.swing.JTextField saveDirectoryTextField;
    // End of variables declaration//GEN-END:variables
    
}
