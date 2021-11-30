
package calculadorafinal;


public class Calculadora extends javax.swing.JFrame {
    
    Calculo calculo = new Calculo();
    
    String res;
    boolean sinalsoma;
    boolean sinalsub;
    boolean sinalmult;
    boolean sinaldiv;
    boolean sinalporc;
    boolean sinaligual;
    boolean confirmarOP;
    boolean ponto;
    
    public Calculadora() {
        
        initComponents();
        setLocationRelativeTo(null);
        
        res = "";
        sinalsoma = false;
        sinalsub = false;
        sinalmult = false;
        sinaldiv = false;
        sinaligual = false;
        ponto = false;
        sinalporc = false;
        confirmarOP = false;
        
    }

    public void LimparCampos(){
        lbl_Operacao.setText("");
        calculo.setNumero("");
        lbl_Resultado.setText("");
        sinalsoma = false;
        sinalsub = false;
        sinalmult = false;
        sinaldiv = false;
        sinaligual = false;
        sinalporc = false;
        ponto = false;
        confirmarOP = false;
    }
    
    public void AtivarSinais(){
        sinalsoma = true;
        sinalsub = true;
        sinalmult = true;
        sinaldiv = true;
        ponto = false;
        confirmarOP = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Operacao = new javax.swing.JLabel();
        lbl_Resultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_Multiplicacao = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_Ponto = new javax.swing.JButton();
        btn_Divisao = new javax.swing.JButton();
        btn_Soma = new javax.swing.JButton();
        btn_Subtracao = new javax.swing.JButton();
        btn_Porcentagem = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_Igualdade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("v1.0.0");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(245, 520));
        setPreferredSize(new java.awt.Dimension(245, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(240, 511));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 35, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Operacao.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbl_Operacao.setForeground(new java.awt.Color(76, 79, 88));
        lbl_Operacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lbl_Operacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 220, 26));

        lbl_Resultado.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        lbl_Resultado.setForeground(new java.awt.Color(240, 255, 255));
        lbl_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lbl_Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, 220, 52));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 140));

        jPanel2.setBackground(new java.awt.Color(147, 128, 253));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(33, 35, 39));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Multiplicacao.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Multiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        btn_Multiplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Multiplicacao.setText("X");
        btn_Multiplicacao.setFocusPainted(false);
        btn_Multiplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Multiplicacao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Multiplicacao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2.png"))); // NOI18N
        btn_Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicacaoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Multiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 40, 40));
        btn_Multiplicacao.getAccessibleContext().setAccessibleName("C");

        btn_7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 40, 40));

        btn_C.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        btn_C.setForeground(new java.awt.Color(255, 255, 255));
        btn_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_C.setText("C");
        btn_C.setFocusPainted(false);
        btn_C.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_C.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2.png"))); // NOI18N
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        jPanel3.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 40));

        btn_Ponto.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Ponto.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ponto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Ponto.setText(".");
        btn_Ponto.setFocusPainted(false);
        btn_Ponto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Ponto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Ponto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2.png"))); // NOI18N
        btn_Ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PontoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Ponto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, 40));

        btn_Divisao.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Divisao.setForeground(new java.awt.Color(255, 255, 255));
        btn_Divisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Divisao.setText("/");
        btn_Divisao.setFocusPainted(false);
        btn_Divisao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Divisao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Divisao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2.png"))); // NOI18N
        btn_Divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisaoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Divisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 40));

        btn_Soma.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Soma.setForeground(new java.awt.Color(255, 255, 255));
        btn_Soma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Soma.setText("+");
        btn_Soma.setFocusPainted(false);
        btn_Soma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Soma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Soma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2.png"))); // NOI18N
        btn_Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SomaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Soma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 40, 40));

        btn_Subtracao.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Subtracao.setForeground(new java.awt.Color(255, 255, 255));
        btn_Subtracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Subtracao.setText("-");
        btn_Subtracao.setFocusPainted(false);
        btn_Subtracao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Subtracao.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Subtracao.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2.png"))); // NOI18N
        btn_Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubtracaoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Subtracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 40, 40));

        btn_Porcentagem.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btn_Porcentagem.setForeground(new java.awt.Color(255, 255, 255));
        btn_Porcentagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Porcentagem.setText("%");
        btn_Porcentagem.setFocusPainted(false);
        btn_Porcentagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Porcentagem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Porcentagem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2.png"))); // NOI18N
        btn_Porcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PorcentagemActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Porcentagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 40, 40));

        btn_9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 40, 40));

        btn_8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 40, 40));

        btn_4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 40, 40));

        btn_5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 40, 40));

        btn_6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 40, 40));

        btn_3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 40, 40));

        btn_0.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 40, 40));

        btn_1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 40, 40));

        btn_2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bnt_1_p.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 40, 40));

        btn_Igualdade.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_Igualdade.setForeground(new java.awt.Color(255, 255, 255));
        btn_Igualdade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Igualdade.setText("=");
        btn_Igualdade.setFocusPainted(false);
        btn_Igualdade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Igualdade.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2_p.png"))); // NOI18N
        btn_Igualdade.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_2.png"))); // NOI18N
        btn_Igualdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IgualdadeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Igualdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 40, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 240, 340));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btn_CActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("0");
            lbl_Operacao.setText(lbl_Operacao.getText()+"0");
        }
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("1");
            lbl_Operacao.setText(lbl_Operacao.getText()+"1");
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("2");
            lbl_Operacao.setText(lbl_Operacao.getText()+"2");
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("3");
            lbl_Operacao.setText(lbl_Operacao.getText()+"3");
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("4");
            lbl_Operacao.setText(lbl_Operacao.getText()+"4");
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("5");
            lbl_Operacao.setText(lbl_Operacao.getText()+"5");
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("6");
            lbl_Operacao.setText(lbl_Operacao.getText()+"6");
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("7");
            lbl_Operacao.setText(lbl_Operacao.getText()+"7");
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("8");
            lbl_Operacao.setText(lbl_Operacao.getText()+"8");
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        if(sinaligual == false){
            calculo.addNumero("9");
            lbl_Operacao.setText(lbl_Operacao.getText()+"9");
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SomaActionPerformed
        if(lbl_Operacao.getText().isEmpty()){
            return;
        }
        if(sinalsoma == false){
            calculo.Soma(lbl_Operacao.getText());
            lbl_Operacao.setText(lbl_Operacao.getText()+"+"); 
            AtivarSinais();
        }
  
    }//GEN-LAST:event_btn_SomaActionPerformed

    private void btn_SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubtracaoActionPerformed
        if(lbl_Operacao.getText().isEmpty()){
            return;
        }
        if(sinalsub == false){
            calculo.Subtracao(lbl_Operacao.getText());
            lbl_Operacao.setText(lbl_Operacao.getText()+"-");
            AtivarSinais();
        }
    }//GEN-LAST:event_btn_SubtracaoActionPerformed

    private void btn_MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicacaoActionPerformed
        if(lbl_Operacao.getText().isEmpty()){
            return;
        }
        if(sinalmult == false){
            calculo.Multiplicacao(lbl_Operacao.getText());
            lbl_Operacao.setText(lbl_Operacao.getText()+"x");
            AtivarSinais();
        }

    }//GEN-LAST:event_btn_MultiplicacaoActionPerformed

    private void btn_DivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisaoActionPerformed
        if(lbl_Operacao.getText().isEmpty()){
            return;
        }
        if(sinaldiv == false){
            calculo.Divisao(lbl_Operacao.getText());
            lbl_Operacao.setText(lbl_Operacao.getText()+"÷");
            AtivarSinais();
        }
    }//GEN-LAST:event_btn_DivisaoActionPerformed

    private void btn_IgualdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IgualdadeActionPerformed
        if(lbl_Operacao.getText().isEmpty()){
            return;
        }
        if(confirmarOP == true && sinaligual == false){
            if("".equals(calculo.getNumero())){
                calculo.addNumero("0");
                lbl_Operacao.setText(lbl_Operacao.getText()+"0");
                String numero = calculo.getNumero();
                lbl_Operacao.setText(lbl_Operacao.getText()+"=");
                res = calculo.Calcular(numero);
                lbl_Resultado.setText(res);
                sinaligual = true;
            }else{
                String numero = calculo.getNumero();
                lbl_Operacao.setText(lbl_Operacao.getText()+"=");
                res = calculo.Calcular(numero);
                lbl_Resultado.setText(res);
                sinaligual = true;
        }
        }
    }//GEN-LAST:event_btn_IgualdadeActionPerformed

    private void btn_PontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PontoActionPerformed
        if(lbl_Operacao.getText().isEmpty()){
            return;
        }
        if(sinaligual == false){
            if(ponto == false){
                calculo.addNumero(".");
                lbl_Operacao.setText(lbl_Operacao.getText()+".");
                ponto = true;
            }

        }
    }//GEN-LAST:event_btn_PontoActionPerformed

    private void btn_PorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PorcentagemActionPerformed
        if(lbl_Operacao.getText().isEmpty()){
            return;
        }
        if(sinaligual == false){
            if(sinalporc == false){
                if(calculo.subtracao == true){
                    calculo.subporc = true;
                }else if(calculo.soma == true){
                    calculo.somporc = true;
                }else if(calculo.multiplicacao == true){
                    calculo.multporc = true;
                }else if(calculo.divisao == true){
                    calculo.divporc = true;
                }else{
                    calculo.Porcentagem(lbl_Operacao.getText());
                }
            lbl_Operacao.setText(lbl_Operacao.getText()+"%");
            sinalporc = true;
            confirmarOP = true;
            ponto = false;
        }
        }

    }//GEN-LAST:event_btn_PorcentagemActionPerformed


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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_0;
    public javax.swing.JButton btn_1;
    public javax.swing.JButton btn_2;
    public javax.swing.JButton btn_3;
    public javax.swing.JButton btn_4;
    public javax.swing.JButton btn_5;
    public javax.swing.JButton btn_6;
    public javax.swing.JButton btn_7;
    public javax.swing.JButton btn_8;
    public javax.swing.JButton btn_9;
    public javax.swing.JButton btn_C;
    public javax.swing.JButton btn_Divisao;
    public javax.swing.JButton btn_Igualdade;
    public javax.swing.JButton btn_Multiplicacao;
    public javax.swing.JButton btn_Ponto;
    public javax.swing.JButton btn_Porcentagem;
    public javax.swing.JButton btn_Soma;
    public javax.swing.JButton btn_Subtracao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel lbl_Operacao;
    public javax.swing.JLabel lbl_Resultado;
    // End of variables declaration//GEN-END:variables

}
