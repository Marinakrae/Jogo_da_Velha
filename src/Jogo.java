
import javax.swing.JOptionPane;

public class Jogo extends javax.swing.JFrame {

    boolean Jogador1Ativo = true; //O jogador 1 sempre vai começar
    boolean Jogador2Ativo = false;
    
    String m[][] = new String[3][3]; //matriz para ir marcando as casas do jogo
    
    int cont_empates=0;
    int vencedor=0;
    
    public Jogo() {
        initComponents(); 
    }

    //métodos
    
    //1
    public void Jogada(javax.swing.JButton botao){ //Colocar X ou 0 nos quadrados 
        cont_empates++;
        if (Jogador1Ativo == true) {
            if (botao.getText().equals("")) { //se é a vez do Jogador 1 e o botão não está preenchido
                botao.setText("X"); //colocar X pois é o Jogador 1
                Matriz_teste(botao);
                JogadorAtivo(); //chama o metodo para trocar a vez do jogador
            }
        } else if (botao.getText().equals("")) { //Se não, e se estiver vazio, colocar o 0 do Jogador 2
            botao.setText("0");
            Matriz_teste(botao);
            JogadorAtivo();
        }
    }
    
    //2
    public void Matriz_teste (javax.swing.JButton botao){ //vai colocar X ou 0 na posição da matriz. 
        //Depois fazer outro metodo para testar se tem 3 em sequencia e aí chamar o metodo do vencedor
        if (botao==B1){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[0][0]="X"; //coloca X na posicao x
            } else
                m[0][0]="0";
        }
        if (botao==B2){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[0][1]="X"; //coloca X na posicao x
            } else
                m[0][1]="0";
        }
        if (botao==B3){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[0][2]="X"; //coloca X na posicao x
            } else
                m[0][2]="0";
        }
        if (botao==B4){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[1][0]="X"; //coloca X na posicao x
            } else
                m[1][0]="0";
        }
        if (botao==B5){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[1][1]="X"; //coloca X na posicao x
            } else
                m[1][1]="0";
        }
        if (botao==B6){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[1][2]="X"; //coloca X na posicao x
            } else
                m[1][2]="0";
        }
        if (botao==B7){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[2][0]="X"; //coloca X na posicao x
            } else
                 m[2][0]="0";
        }
        if (botao==B8){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[2][1]="X"; //coloca X na posicao x
            } else
                m[2][1]="0";
        }
        if (botao==B9){ //se for o botao x
           if (Jogador1Ativo==true){ //e a vez do j1
                m[2][2]="X"; //coloca X na posicao x
            } else
                m[2][2]="0";
        }
        Teste_Jogador_Vencedor();

    }       
    
    //3
    public void JogadorAtivo() { //Se está na vez do jogador 1, muda ele para falso e da true ao j2
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else { //o contrário
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }

    }
    
    //4
    public void Teste_Jogador_Vencedor (){     
         
        //Jogador 1
        
        //linhas
        if (m[0][0].equals("X") && m[0][1].equals("X") && m[0][2].equals("X")){
            vencedor=1;
            JogadorVencedor(vencedor);
        } else if (m[1][0].equals("X") && m[1][1].equals("X") && m[1][2].equals("X")){
            vencedor=1;
            JogadorVencedor(vencedor);
        } else if (m[2][0].equals("X") && m[2][1].equals("X") && m[2][2].equals("X")){
            vencedor=1;
            JogadorVencedor(vencedor);
        } 
        
        //colunas
        if (m[0][0].equals("X") && m[1][0].equals("X") && m[2][0].equals("X")){
            vencedor=1;
            JogadorVencedor(vencedor);
        } else if (m[0][1].equals("X") && m[1][1].equals("X") && m[2][1].equals("X")){
           vencedor=1;
            JogadorVencedor(vencedor);
        } else if (m[0][2].equals("X") && m[1][2].equals("X") && m[2][2].equals("X")){
            vencedor=1;
            JogadorVencedor(vencedor);
       } 
        
        //diagonais
        if (m[0][0].equals("X") && m[1][1].equals("X") && m[2][2].equals("X")){
            vencedor=1;
            JogadorVencedor(vencedor);
        } else if (m[0][2].equals("X") && m[1][1].equals("X") && m[2][0].equals("X")){
            vencedor=1;
            JogadorVencedor(vencedor);
        } 
        
        //Jogador 2
        
        //linhas
        if (m[0][0].equals("0") && m[0][1].equals("0") && m[0][2].equals("0")){
            vencedor=2;
            JogadorVencedor(vencedor);
        } else if (m[1][0].equals("0") && m[1][1].equals("0") && m[1][2].equals("0")){
            vencedor=2;
            JogadorVencedor(vencedor);
        } else if (m[2][0].equals("0") && m[2][1].equals("0") && m[2][2].equals("0")){
            vencedor=2;
            JogadorVencedor(vencedor);
        } 
        
        //colunas
        if (m[0][0].equals("0") && m[1][0].equals("0") && m[2][0].equals("0")){
            vencedor=2;
            JogadorVencedor(vencedor);
        } else if (m[0][1].equals("0") && m[1][1].equals("0") && m[2][1].equals("0")){
            vencedor=2;
            JogadorVencedor(vencedor);
        } else if (m[0][2].equals("0") && m[1][2].equals("0") && m[2][2].equals("0")){
            vencedor=2;
            JogadorVencedor(vencedor);
        } 
        
        //diagonais
        if (m[0][0].equals("0") && m[1][1].equals("0") && m[2][2].equals("0")){
            vencedor=2;
            JogadorVencedor(vencedor);
        } else if (m[0][2].equals("0") && m[1][1].equals("0") && m[2][0].equals("0")){
            vencedor=2;
            JogadorVencedor(vencedor);
        } 
        
        if (vencedor==0){
            JogadorVencedor(vencedor);
        }
        
    }
    
    //5
    public void JogadorVencedor(int vencedor) { //Testa quem ganha
        if (vencedor==1){
            JOptionPane.showMessageDialog(null, "Jogador 1 venceu. ");
        } else if (vencedor==2){
            JOptionPane.showMessageDialog(null, "Jogador 2 venceu. ");            
        } else {
            Empate();
        }
    }

    //6
    public void Empate(){
        if (cont_empates>=9){ 
           JOptionPane.showMessageDialog(null, "Deu velha!"); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SairJogo = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 1000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 0)));

        B1.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(B8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(B5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(B2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B3))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(B7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2)
                            .addComponent(B3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B5)
                            .addComponent(B6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B8)
                            .addComponent(B9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B4)
                        .addGap(18, 18, 18)
                        .addComponent(B7)))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setText("Jogador 1       Símbolo: X");

        jLabel3.setText("Jogador 2      Símbolo: 0");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles do jogo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N

        NovoJogo.setText("Novo jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        SairJogo.setText("Sair");
        SairJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SairJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(NovoJogo)
                .addGap(18, 18, 18)
                .addComponent(SairJogo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("Controle do jogo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(674, 391));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
       Jogada(B4);
    }//GEN-LAST:event_B4ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        Jogada(B7);        
    }//GEN-LAST:event_B7ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        Jogada(B9);       
    }//GEN-LAST:event_B9ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        Jogada(B1);        
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        Jogada(B2);        
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        Jogada(B3);        
    }//GEN-LAST:event_B3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        Jogada(B5);      
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        Jogada(B6);        
    }//GEN-LAST:event_B6ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        Jogada(B8);        
    }//GEN-LAST:event_B8ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        Jogo transicao = new Jogo();
        transicao.setVisible(true);
        dispose();
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(int x=0; x<3; x++){
            for(int y=0; y<3; y++){
                m[x][y]="";
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void SairJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairJogoActionPerformed
        Menu transicao = new Menu();
        transicao.setVisible(true);
        dispose();
    }//GEN-LAST:event_SairJogoActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JButton SairJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
