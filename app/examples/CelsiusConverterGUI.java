package app.examples;
import javax.swing.*;
// https://docs.oracle.com/javase/tutorial/uiswing/
// https://docs.oracle.com/javase/tutorial/uiswing/learn/index.html
public class CelsiusConverterGUI extends javax.swing.JFrame{


    private javax.swing.JTextField  tempTextField;
    private javax.swing.JLabel  celsiusLabel;
    private javax.swing.JButton  convertButton;
    private javax.swing.JLabel fahrenheitLabel;

    public CelsiusConverterGUI(){
        initComponents();
    }

    private void initComponents(){
        tempTextField = new javax.swing.JTextField();
        celsiusLabel = new javax.swing.JLabel();
        convertButton = new javax.swing.JButton();
        fahrenheitLabel = new javax.swing.JLabel();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Celsius Converter");
 
        celsiusLabel.setText("Celsius");
 
        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });
 
        fahrenheitLabel.setText("Fahrenheit");
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celsiusLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(convertButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fahrenheitLabel)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
 
        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {convertButton, tempTextField});
 
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celsiusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertButton)
                    .addComponent(fahrenheitLabel))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pack();
    }
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //Parse degrees Celsius as a double and convert to Fahrenheit
                int tempFahr = (int)((Double.parseDouble(tempTextField.getText()))
                    * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
             
            /**
             * @param args the command line arguments
             */
            public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CelsiusConverterGUI().setVisible(true);
                    }
                });
            }
}