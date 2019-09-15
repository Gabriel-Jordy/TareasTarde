 
package calculadora;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Matrices extends javax.swing.JFrame {

   DefaultTableModel modelo = new DefaultTableModel();
    Boolean ban = false;
    int num; //Declaracion de la varible num

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    public Matrices() {
        initComponents();
         this.setLocationRelativeTo(null);  
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatriz = new javax.swing.JTextField();
        cmdAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdDatos = new javax.swing.JTable();
        cmdResolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        cmdLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese El Numero De La Matriz");

        cmdAceptar.setText("ACEPTAR");
        cmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });

        grdDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X"
            }
        ));
        jScrollPane1.setViewportView(grdDatos);

        cmdResolver.setText("RESOLVER MATRIZ");
        cmdResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdResolverActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        cmdLimpiar.setText("LIMPIAR PANTALLA");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(cmdAceptar)))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdResolver)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdAceptar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdResolver)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdLimpiar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void cmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptarActionPerformed
        try{
           
            this.setNum(Integer.parseInt(txtMatriz.getText())); //Aqui se obtiene el numero de la Matriz
          num= this.getNum();
            if (num<=1){
               throw new Exception("Dato Invalido");  //Al producirce el Error Enviara este mensaje
           }
           
           Object columnas[] = new Object[num+1];      // Al ingresar el numero de la matriz 
           for(int i=0; i<num+1; i++){                // Nos generara las filas y columnas de nuestra matriz
               if(i<num){                            
                   columnas[i] = "X"+(i+1);
               }else{
                   columnas[i] = "Z";
               }
           }
           modelo = new DefaultTableModel(columnas, num);   // filas y columnas en la tabla
           grdDatos.setModel(modelo);
           
           
        }catch(Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage()); // Al ingresar un dato invalido generara un Error
        }      
    }//GEN-LAST:event_cmdAceptarActionPerformed

  
    
    private void cmdResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdResolverActionPerformed
         
      try{
            int num = this.getNum();
            double m[][] = new double[num][num];  // Almacena los valores de X
            double r[] = new double[num];        // Almacena el valor de Z
            
            for(int i = 0; i<num; i++){
                for (int j = 0; j<num; j++){
                    m[i][j]= Double.parseDouble(String.valueOf(grdDatos.getValueAt(i,j)));
                    
                }
                r[i] = Double.parseDouble(String.valueOf(grdDatos.getValueAt(i,num)));

            }
            
            r = this.resolver(m,r);
            
            for (int i=0; i<num; i++){
                    jTextArea.append(" x" + (i+1) + " = " + r[i] + "\n");
                }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error en los datos");
        }   
    }//GEN-LAST:event_cmdResolverActionPerformed

    
     
    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
       jTextArea.setText("");
       
       txtMatriz.setText("");
        
        
    }//GEN-LAST:event_cmdLimpiarActionPerformed

   
    public static void main(String args[]) {
        
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAceptar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdResolver;
    private javax.swing.JTable grdDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField txtMatriz;
    // End of variables declaration//GEN-END:variables

  private double[] resolver(double[][] m, double[] r) {
        
        int num = this.getNum();
        
        for(int i = 0; i<num; i++){
            double d,c=0;
            d = m[i][i];                                                        //Seleccionamos el pivote
            jTextArea.append(Double.toString(1/d)+ "*Fila" + (i+1) + "\n");     // Muestra el Pivote seleccionado
            for(int j=0; j<num; j++){                                           //Pasamos a convertir en 1 al pivote seleccionado
                m[i][j] = ((m[i][j])/d);
              
            }
            r[i] = ((r[i])/d);
            
            for (int j=0; j<num; j++){
                for (int k = 0; k<num; k++){
               jTextArea.append(Double.toString(m[j][k])+ "\t");
            }
             jTextArea.append("|\t" + Double.toString(r[j]) + "\n");
            }
            jTextArea.append("\n\n");
            
            
            for(int x=0; x<num; x++){
                if(i != x){
                    c = m[x][i];
                    jTextArea.append("-" + Double.toString(c) + " * fila"+ (i+1) + "+ fila" + (x+1) + "\n");
                    for(int y=0; y<num; y++){                                   // comvertir a ceros todos los elementos de la columnas
                        m[x][y] = m[x][y] - c * m[i][y];
                    }
                    r[x] = r[x] - c * r[i];
                    
                    for(int j=0; j<num; j++){
                        for (int k=0; k<num; k++){
                            jTextArea.append(Double.toString(m[j][k]) + "\t");
                        }
                        jTextArea.append("|\t" + Double.toString(r[j]) + "\n");
                    }
                    jTextArea.append("\n\n");
                }
            }   
        }
        return r;                                                               //retorna la solucion 1
    }

}
