/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9storybook;

/**
 *
 * @author ana pathak
 * @version 9
 */
public class EndFrame extends javax.swing.JFrame {
    private StoryBookModel myModel;

    /**
     * Creates new form EndFrame
     */
    public EndFrame() {
        initComponents();
    }

    EndFrame(StoryBookModel myModel) {
       this.myModel = myModel;
       initComponents();
       welcomeLabel.setText("Welcome, " + myModel.getUserName() + ".");
       crimeLabel.setText("You have been accused of " + myModel.getCrime() + ".");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        crimeLabel = new javax.swing.JLabel();
        instructionLabel = new javax.swing.JLabel();
        leftDoorButton = new javax.swing.JButton();
        rightDoorButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        nextTrialButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("WELCOME!");

        instructionLabel.setText("Pick a door to determine your verdict.");

        leftDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/StoryBookGIFs/Door.GIF"))); // NOI18N
        leftDoorButton.setBorder(null);
        leftDoorButton.setBorderPainted(false);
        leftDoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftDoorButtonActionPerformed(evt);
            }
        });

        rightDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/StoryBookGIFs/Door.GIF"))); // NOI18N
        rightDoorButton.setBorder(null);
        rightDoorButton.setBorderPainted(false);
        rightDoorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightDoorButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit Tribunal");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        nextTrialButton.setText("Next Trial--->");
        nextTrialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTrialButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instructionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(leftDoorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(rightDoorButton)
                        .addGap(60, 60, 60))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextTrialButton)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(leftDoorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightDoorButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(nextTrialButton))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftDoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftDoorButtonActionPerformed
        // TODO add your handling code here:
         leftDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/StoryBookGIFs/Tiger.GIF")));
         instructionLabel.setText("You are GUILTY! prepare to be eaten!");
         rightDoorButton.setEnabled(false);
         
    }//GEN-LAST:event_leftDoorButtonActionPerformed

    private void rightDoorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightDoorButtonActionPerformed
        // TODO add your handling code here:
        rightDoorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab9storybook/StoryBookGIFs/Lady.GIF")));
        instructionLabel.setText("You are INNOCENT! Sorry about that. Please accept this lady.");
         leftDoorButton.setEnabled(false);
    }//GEN-LAST:event_rightDoorButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void nextTrialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTrialButtonActionPerformed
        // TODO add your handling code here:
        StartFrame myStartFrame = new StartFrame(myModel);
        myStartFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextTrialButtonActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel crimeLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JButton leftDoorButton;
    private javax.swing.JButton nextTrialButton;
    private javax.swing.JButton rightDoorButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
