package Vistas;

import Entidades.Alumno;
import Entidades.Materia;
import java.util.HashSet;

public class ViewFormInscripcion extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alumnos;
    private HashSet<Materia> materias;

    
    public ViewFormInscripcion(HashSet<Alumno> alumnos,HashSet<Materia> materias) {
        initComponents();
        this.alumnos=alumnos;
        this.materias=materias;
        cargaAlumnos();
        cargaMaterias();
    }
    
    public void cargaMaterias(){
        for (Materia item:materias){
            cbMateria.addItem(item);
        }
        cbMateria.setSelectedItem(null);
    }
    public void cargaAlumnos(){
        for (Alumno item:alumnos){
            cbAlumno.addItem(item);
        }
        cbAlumno.setSelectedItem(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        cbMateria = new javax.swing.JComboBox<>();
        cbAlumno = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("ELIJA UN ALUMNO:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("ELIJA UNA MATERIA:");

        jbInscribir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbInscribir.setForeground(new java.awt.Color(105, 153, 255));
        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(105, 153, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        cbMateria.setToolTipText("");
        cbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMateriaActionPerformed(evt);
            }
        });

        cbAlumno.setToolTipText("");
        cbAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAlumnoItemStateChanged(evt);
            }
        });
        cbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbInscribir)
                        .addGap(29, 29, 29)
                        .addComponent(jbSalir)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jbInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        Alumno a1 = (Alumno) cbAlumno.getSelectedItem();
        Materia m1 = (Materia)cbMateria.getSelectedItem();
        
        try{
            a1.agregarMateria(m1);
        } catch(NullPointerException n){}
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void cbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMateriaActionPerformed
        
    }//GEN-LAST:event_cbMateriaActionPerformed

    private void cbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnoActionPerformed
        
    }//GEN-LAST:event_cbAlumnoActionPerformed

    private void cbAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAlumnoItemStateChanged
        
    }//GEN-LAST:event_cbAlumnoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbAlumno;
    private javax.swing.JComboBox<Materia> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables
}
