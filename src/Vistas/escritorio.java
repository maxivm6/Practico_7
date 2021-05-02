package Vistas;
import Entidades.Alumno;
import Entidades.Materia;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class escritorio extends javax.swing.JFrame {

    protected HashSet<Materia> materias = new HashSet();
    protected HashSet<Alumno> alumnos = new HashSet();
    public escritorio() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jbMenu = new javax.swing.JMenu();
        jbAltaMaterias = new javax.swing.JMenuItem();
        jbAltaAlumnos = new javax.swing.JMenuItem();
        jbFormInscripcion = new javax.swing.JMenuItem();
        jbSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1235, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(30, 25));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(53, 45));

        jbMenu.setText("Menu");
        jbMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jbAltaMaterias.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbAltaMaterias.setText("Alta de materias");
        jbAltaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaMateriasActionPerformed(evt);
            }
        });
        jbMenu.add(jbAltaMaterias);

        jbAltaAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbAltaAlumnos.setText("Alta de alumnos");
        jbAltaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaAlumnosActionPerformed(evt);
            }
        });
        jbMenu.add(jbAltaAlumnos);

        jbFormInscripcion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbFormInscripcion.setText("Formulario inscripcion");
        jbFormInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFormInscripcionActionPerformed(evt);
            }
        });
        jbMenu.add(jbFormInscripcion);

        jbSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jbMenu.add(jbSalir);

        jMenuBar1.add(jbMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAltaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaMateriasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ViewAltaMaterias nuevo = new ViewAltaMaterias(materias);
        nuevo.setVisible(true);
        escritorio.add(nuevo);
        escritorio.moveToFront(nuevo);
    }//GEN-LAST:event_jbAltaMateriasActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Esta seguro que desea salir?", "Salir", 2, 3);
        if (opcion==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAltaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaAlumnosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ViewAltaAlumnos nuevo = new ViewAltaAlumnos(alumnos);
        nuevo.setVisible(true);
        escritorio.add(nuevo);
        escritorio.moveToFront(nuevo);
    }//GEN-LAST:event_jbAltaAlumnosActionPerformed

    private void jbFormInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFormInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ViewFormInscripcion nuevo = new ViewFormInscripcion(alumnos,materias);
        nuevo.setVisible(true);
        escritorio.add(nuevo);
        escritorio.moveToFront(nuevo);
    }//GEN-LAST:event_jbFormInscripcionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jbAltaAlumnos;
    private javax.swing.JMenuItem jbAltaMaterias;
    private javax.swing.JMenuItem jbFormInscripcion;
    private javax.swing.JMenu jbMenu;
    private javax.swing.JMenuItem jbSalir;
    // End of variables declaration//GEN-END:variables
}
