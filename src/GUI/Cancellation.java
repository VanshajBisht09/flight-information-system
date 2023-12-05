
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Senarathna
 */
public class Cancellation extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cancellation
     */
    public Cancellation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtReservationID = new javax.swing.JTextField();
        btnCancelReservation = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cancel a Reservation");

        jLabel1.setText("To cancel a reservation please enter the particular Reservation Number");

        txtReservationID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationIDActionPerformed(evt);
            }
        });

        btnCancelReservation.setText("Cancel the reservation");
        btnCancelReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelReservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtReservationID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelReservation)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReservationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelReservation))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtReservationIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservationIDActionPerformed

    private void btnCancelReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReservationActionPerformed
       String ObjButtons[] = {"Yes","No"};
        int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to cancel this reservation?","Fly With Us",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(PromptResult==JOptionPane.YES_OPTION)
        {
            try
            {
            MainForm.manager.cancelReservation(Integer.parseInt(txtReservationID.getText()));
            }
            catch (Exception ex)
            {
                    JOptionPane.showMessageDialog(null, "Couldn't find any reservation with the provided ID. Please check and try again.");
            }
        }
    }//GEN-LAST:event_btnCancelReservationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelReservation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtReservationID;
    // End of variables declaration//GEN-END:variables
}
