/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vista;

import controlador.ControladorEstudiante;
import datos.modelo.Estudiante;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Nescob18
 */
public class ListadoEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form ListadoEstudiantes
     */
    public ListadoEstudiantes() {
        initComponents();
        jTableListado.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTableListado.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTableListado.getColumnModel().getColumn(2).setPreferredWidth(300);
        jButtonActualizar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jButtonAtras.setEnabled(false);
        labelConfirmacion.setVisible(false);
        refrescarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListado = new javax.swing.JTable();
        tituloPagina = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelNacimiento = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        labelAno = new javax.swing.JLabel();
        labelMes = new javax.swing.JLabel();
        labelDia = new javax.swing.JLabel();
        jBoxAno = new javax.swing.JComboBox<>();
        jBoxMes = new javax.swing.JComboBox<>();
        jBoxDia = new javax.swing.JComboBox<>();
        jButtonActualizar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        labelConfirmacion = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListado);

        tituloPagina.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloPagina.setText("    Administracion de Estudiantes");
        tituloPagina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelCodigo.setText("Codigo:");

        labelNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNombre.setText("Nombre:");

        labelApellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelApellido.setText("Apellido:");

        labelNacimiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNacimiento.setText("Fecha de Nacimiento:");

        txtCodigo.setEditable(false);
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        labelAno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelAno.setText("Año:");

        labelMes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelMes.setText("Mes:");

        labelDia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelDia.setText("Dia:");

        jBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975" }));

        jBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01" }));

        jBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15", "14", "13", "12", "11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01" }));

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonRegistrar.setText("Registar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        labelConfirmacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelConfirmacion.setForeground(new java.awt.Color(255, 0, 0));
        labelConfirmacion.setText("No se pudo registrar el estudiante");

        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPagina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellido))
                    .addComponent(labelConfirmacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAtras)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonActualizar)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(labelMes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelNacimiento))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(labelNacimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelAno)
                            .addComponent(labelMes)
                            .addComponent(labelDia)
                            .addComponent(jBoxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(labelConfirmacion)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEliminar)
                            .addComponent(jButtonActualizar)
                            .addComponent(jButtonRegistrar)
                            .addComponent(jButtonAtras)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        String fechaNacimiento = (String)jBoxAno.getSelectedItem() + "/" + (String)jBoxMes.getSelectedItem()
                + "/" + (String)jBoxDia.getSelectedItem();
        Estudiante estudiante = new Estudiante(txtNombre.getText(), txtApellido.getText(), fechaNacimiento);
        estudiante.setCodigo(Long.parseLong(txtCodigo.getText()));
        if(ControladorEstudiante.actualizar(estudiante)){
            refrescarLista();
            labelConfirmacion.setForeground(Color.GREEN);
            labelConfirmacion.setText("Se ha Actualizado EXITOSAMENTE");
        }else{
            labelConfirmacion.setForeground(Color.RED);
            labelConfirmacion.setText("No se logro actualizar el estudiante");
        }
        labelConfirmacion.setVisible(true);
        txtNombre.setText("");
        txtApellido.setText("");
        txtCodigo.setText("");
        jBoxAno.setSelectedIndex(0);
        jBoxMes.setSelectedIndex(0);
        jBoxDia.setSelectedIndex(0);
        
        jButtonActualizar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jButtonAtras.setEnabled(false);
        jButtonRegistrar.setEnabled(true);
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String fechaNacimiento = (String)jBoxAno.getSelectedItem() + "/" + (String)jBoxMes.getSelectedItem()
                + "/" + (String)jBoxDia.getSelectedItem();
        System.out.println(txtNombre.getText());
        Estudiante estudiante = new Estudiante(txtNombre.getText(), txtApellido.getText(), fechaNacimiento);
        if(ControladorEstudiante.registrar(estudiante)){
            refrescarLista();
            labelConfirmacion.setVisible(false);
            txtNombre.setText("");
            txtApellido.setText(""); 
        }else{
            labelConfirmacion.setVisible(true);
            labelConfirmacion.setForeground(Color.RED);
            labelConfirmacion.setText("Error registrando el usuario en la Base de Datos");
        }
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        String fechaNacimiento = (String)jBoxAno.getSelectedItem() + "/" + (String)jBoxMes.getSelectedItem()
                + "/" + (String)jBoxDia.getSelectedItem();
        Estudiante estudiante = new Estudiante(txtNombre.getText(), txtApellido.getText(), fechaNacimiento);
        estudiante.setCodigo(Long.parseLong(txtCodigo.getText()));
        if(ControladorEstudiante.eliminar(estudiante)){
            refrescarLista();
            labelConfirmacion.setForeground(Color.GREEN);
            labelConfirmacion.setText("Se ha eliminado EXITOSAMENTE");
        }else{
            labelConfirmacion.setForeground(Color.RED);
            labelConfirmacion.setText("No se logro eliminar el estudiante");
        }
        labelConfirmacion.setVisible(true);
        txtNombre.setText("");
        txtApellido.setText("");
        txtCodigo.setText("");
        jBoxAno.setSelectedIndex(0);
        jBoxMes.setSelectedIndex(0);
        jBoxDia.setSelectedIndex(0);
        
        jButtonActualizar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jButtonAtras.setEnabled(false);
        jButtonRegistrar.setEnabled(true);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTableListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadoMouseClicked
        labelConfirmacion.setVisible(false);
        int row = jTableListado.getSelectedRow();
        TableModel tableModel = jTableListado.getModel();
        Estudiante estudiante = new Estudiante();
        estudiante.setCodigo((long)tableModel.getValueAt(row, 0));
        estudiante.setNombre((String) tableModel.getValueAt(row,1));
        estudiante.setApellidos((String) tableModel.getValueAt(row, 2));
        estudiante = ControladorEstudiante.verUnEstudiante(estudiante);
        txtCodigo.setText(Long.toString(estudiante.getCodigo()));
        txtNombre.setText(estudiante.getNombre());
        txtApellido.setText(estudiante.getApellidos());
        
        String[] datosFecha = estudiante.getFechaNacimiento().split("-");
        jBoxAno.setSelectedItem(datosFecha[0]);
        jBoxMes.setSelectedItem(datosFecha[1]);
        jBoxDia.setSelectedItem(datosFecha[2]);
        
        jButtonActualizar.setEnabled(true);
        jButtonEliminar.setEnabled(true);
        jButtonAtras.setEnabled(true);
        jButtonRegistrar.setEnabled(false);
    }//GEN-LAST:event_jTableListadoMouseClicked

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        labelConfirmacion.setVisible(false);
        txtNombre.setText("");
        txtApellido.setText("");
        txtCodigo.setText("");
        jBoxAno.setSelectedIndex(0);
        jBoxMes.setSelectedIndex(0);
        jBoxDia.setSelectedIndex(0);
        
        jButtonActualizar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jButtonAtras.setEnabled(false);
        jButtonRegistrar.setEnabled(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void refrescarLista(){
        List<Estudiante> estudiantes;
        estudiantes = ControladorEstudiante.verTodosEstudiantes();
        DefaultTableModel model = (DefaultTableModel) jTableListado.getModel();          
        model.setRowCount(0);
        for(Estudiante estudiante : estudiantes){
            model.addRow(new Object[]{estudiante.getCodigo(),estudiante.getNombre(),estudiante.getApellidos()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBoxAno;
    private javax.swing.JComboBox<String> jBoxDia;
    private javax.swing.JComboBox<String> jBoxMes;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JToggleButton jButtonAtras;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListado;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelConfirmacion;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelNacimiento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel tituloPagina;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}