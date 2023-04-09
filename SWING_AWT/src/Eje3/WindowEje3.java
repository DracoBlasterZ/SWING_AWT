package Eje3;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
 
public class WindowEje3 extends javax.swing.JFrame {
	
	//creamos las variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JCheckBox administracion;
    private javax.swing.JCheckBox diseno;
    private javax.swing.JCheckBox programacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel horasRegistradas;
    private javax.swing.JRadioButton sisLinux;
    private javax.swing.JRadioButton sisMac;
    private javax.swing.JRadioButton sisWindows;
    private javax.swing.JSlider sldHoras;           
 
    /**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
    public WindowEje3() {
        initComponents();
         

        ButtonGroup btg=new ButtonGroup();
         

        btg.add(sisWindows);
        btg.add(sisLinux);
        btg.add(sisMac);
         
    }
 
     
    @SuppressWarnings("unchecked")                 
    private void initComponents() {
 
        sisWindows = new javax.swing.JRadioButton();
        sisLinux = new javax.swing.JRadioButton();
        sisMac = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        programacion = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        diseno = new javax.swing.JCheckBox();
        administracion = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        btnGenerar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        sldHoras = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        horasRegistradas = new javax.swing.JLabel();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema");
 
        sisWindows.setText("Windows");
 
        sisLinux.setText("Linux");
 
        sisMac.setText("Mac");
 
        jLabel1.setText("Elige un sistema operativo");
 
        programacion.setText("Programación");
 
        jLabel2.setText("Elige tu especialidad");
 
        diseno.setText("Diseño gráfico");
 
        administracion.setText("Administración");
 
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
 
        sldHoras.setMaximum(10);
        sldHoras.setValue(0);
        sldHoras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldHorasStateChanged(evt);
            }
        });
 
        jLabel3.setText("Horas que dedicas en el ordenador");
 
        horasRegistradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horasRegistradas.setText("0");
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(programacion)
                            .addComponent(jLabel2)
                            .addComponent(administracion)
                            .addComponent(diseno)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(sisLinux)
                            .addComponent(sisMac)
                            .addComponent(sisWindows)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(horasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnGenerar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(sisWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sisLinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sisMac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(programacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diseno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(administracion)
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(horasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnGenerar)
                .addContainerGap(21, Short.MAX_VALUE))
        );
 
        pack();
    }                      
 
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        String informacion="Tu sistema operativo preferido es ";
         
        
        JRadioButton[] rdbs={sisWindows, sisLinux, sisMac};
         
        for(int i=0;i<rdbs.length;i++){

            if(rdbs[i].isSelected()){
                informacion+=rdbs[i].getText();
            }
             
        }

        JCheckBox[] ckbs={programacion, diseno, administracion};
         
        informacion+=", \ntus especialidades son ";
         
        for(int i=0;i<ckbs.length;i++){
             
            if(ckbs[i].isSelected()){
                informacion+=ckbs[i].getText()+" "; 
            }
             
        }
         
        informacion+=" \ny el numero de horas dedicadas al ordenador son "+sldHoras.getValue();
         
        JOptionPane.showMessageDialog(this, informacion, "Muestra de datos", JOptionPane.INFORMATION_MESSAGE);
         
    }                                          
 
    private void sldHorasStateChanged(javax.swing.event.ChangeEvent evt) {                                      
         
        horasRegistradas.setText(String.valueOf(sldHoras.getValue()));
         
    }                                     
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowEje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowEje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowEje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowEje3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowEje3().setVisible(true);
            }
        });
    }
 
          
}