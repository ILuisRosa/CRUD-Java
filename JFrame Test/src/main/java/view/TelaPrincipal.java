/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import java.awt.Color;


import javax.swing.JOptionPane;
import static javax.swing.text.StyleConstants.Bold;




/**
 *
 * @author Luisr
 */
public class TelaPrincipal extends javax.swing.JFrame {

    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainel = new javax.swing.JPanel();
        txtSub = new javax.swing.JLabel();
        txtPrePlantio = new javax.swing.JLabel();
        txt03 = new javax.swing.JLabel();
        txtPosPlantio = new javax.swing.JLabel();
        txtControle = new javax.swing.JLabel();
        txt07 = new javax.swing.JLabel();
        txtPlantio = new javax.swing.JLabel();
        txt06 = new javax.swing.JLabel();
        txt01 = new javax.swing.JLabel();
        txtAdubacao = new javax.swing.JLabel();
        txt04 = new javax.swing.JLabel();
        txt05 = new javax.swing.JLabel();
        txtPreparacao = new javax.swing.JLabel();
        txt02 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtVer = new javax.swing.JLabel();
        txtLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(187, 187, 187));
        setForeground(new java.awt.Color(187, 187, 187));

        jPainel.setBackground(new java.awt.Color(44, 42, 80));
        jPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPainel.setForeground(new java.awt.Color(255, 102, 51));
        jPainel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        txtSub.setBackground(new java.awt.Color(44, 42, 80));
        txtSub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSub.setForeground(new java.awt.Color(0, 0, 0));
        txtSub.setText("Subsolagem");
        txtSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSubMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSubMouseExited(evt);
            }
        });

        txtPrePlantio.setBackground(new java.awt.Color(44, 42, 80));
        txtPrePlantio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrePlantio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrePlantio.setText("Aplicação de Herbicida pré plantio");
        txtPrePlantio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrePlantioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPrePlantioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPrePlantioMouseExited(evt);
            }
        });

        txt03.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt03.setForeground(new java.awt.Color(211, 211, 211));
        txt03.setText("3.");

        txtPosPlantio.setBackground(new java.awt.Color(44, 42, 80));
        txtPosPlantio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPosPlantio.setForeground(new java.awt.Color(0, 0, 0));
        txtPosPlantio.setText("Aplicação de Herbicida pós plantio");
        txtPosPlantio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPosPlantioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPosPlantioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPosPlantioMouseExited(evt);
            }
        });

        txtControle.setBackground(new java.awt.Color(44, 42, 80));
        txtControle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtControle.setForeground(new java.awt.Color(0, 0, 0));
        txtControle.setText("Controle de Formigas");
        txtControle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtControleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtControleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtControleMouseExited(evt);
            }
        });

        txt07.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt07.setForeground(new java.awt.Color(211, 211, 211));
        txt07.setText("7.");

        txtPlantio.setBackground(new java.awt.Color(44, 42, 80));
        txtPlantio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPlantio.setForeground(new java.awt.Color(0, 0, 0));
        txtPlantio.setText("Plantio");
        txtPlantio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPlantioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlantioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlantioMouseExited(evt);
            }
        });

        txt06.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt06.setForeground(new java.awt.Color(211, 211, 211));
        txt06.setText("6.");

        txt01.setBackground(new java.awt.Color(187, 187, 187));
        txt01.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt01.setForeground(new java.awt.Color(211, 211, 211));
        txt01.setText("1.");

        txtAdubacao.setBackground(new java.awt.Color(44, 42, 80));
        txtAdubacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAdubacao.setForeground(new java.awt.Color(0, 0, 0));
        txtAdubacao.setText("Adubagem pós plantio");
        txtAdubacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAdubacaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAdubacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAdubacaoMouseExited(evt);
            }
        });

        txt04.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt04.setForeground(new java.awt.Color(211, 211, 211));
        txt04.setText("4.");

        txt05.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt05.setForeground(new java.awt.Color(211, 211, 211));
        txt05.setText("5.");

        txtPreparacao.setBackground(new java.awt.Color(44, 42, 80));
        txtPreparacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPreparacao.setForeground(new java.awt.Color(0, 0, 0));
        txtPreparacao.setText("Preparação do Solo");
        txtPreparacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPreparacao.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtPreparacao.setOpaque(true);
        txtPreparacao.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtPreparacaoMouseMoved(evt);
            }
        });
        txtPreparacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPreparacaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPreparacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPreparacaoMouseExited(evt);
            }
        });

        txt02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt02.setForeground(new java.awt.Color(211, 211, 211));
        txt02.setText("2.");

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo.setText("Selecione a Fase Atual do Plantio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(txtTitulo)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(txtTitulo)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        txtVer.setBackground(new java.awt.Color(44, 42, 80));
        txtVer.setForeground(new java.awt.Color(255, 255, 255));
        txtVer.setText("Beta 1.0");

        txtLog.setBackground(new java.awt.Color(44, 42, 80));
        txtLog.setForeground(new java.awt.Color(255, 255, 255));
        txtLog.setText("Logout");
        txtLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLogMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPainelLayout = new javax.swing.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(txt02)
                        .addGap(18, 18, 18)
                        .addComponent(txtSub))
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(txt01)
                        .addGap(18, 18, 18)
                        .addComponent(txtPreparacao))
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(txt03)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrePlantio))
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(txt04)
                        .addGap(18, 18, 18)
                        .addComponent(txtPlantio))
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(txt06)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdubacao))
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(txt05)
                        .addGap(18, 18, 18)
                        .addComponent(txtControle))
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(txt07)
                        .addGap(18, 18, 18)
                        .addComponent(txtPosPlantio)))
                .addGap(138, 138, 138))
            .addGroup(jPainelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLog)
                .addGap(45, 45, 45))
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt01)
                    .addComponent(txtPreparacao))
                .addGap(18, 18, 18)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt02)
                    .addComponent(txtSub))
                .addGap(18, 18, 18)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt03)
                    .addComponent(txtPrePlantio))
                .addGap(18, 18, 18)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt04)
                    .addComponent(txtPlantio))
                .addGap(18, 18, 18)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt05)
                    .addComponent(txtControle))
                .addGap(18, 18, 18)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt06)
                    .addComponent(txtAdubacao))
                .addGap(18, 18, 18)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt07)
                    .addComponent(txtPosPlantio))
                .addGap(52, 52, 52)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVer)
                    .addComponent(txtLog))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void txtPreparacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPreparacaoMouseClicked
        
        JOptionPane.showMessageDialog(null ,"Prepare o Solo com Roçadas leves, se a area de plantação for um relevo,"
                    + " considere realizar uma limpeza manual do solo "
                +    " \npriorizando retirar a vegetação mais finas e árvores"
                    + " que estiverem na região que sera plantada."
                    + "\nLogo após a limpeza do solo, use um limpa trilho para demarcar onde as árvores serão plantadas.", "PREPARAÇÃO DO SOLO",ICONIFIED);
    }//GEN-LAST:event_txtPreparacaoMouseClicked

    private void txtPreparacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPreparacaoMouseEntered
        
        txtPreparacao.setOpaque(true);
        txtPreparacao.setForeground(Color.WHITE);
        
        
     
    }//GEN-LAST:event_txtPreparacaoMouseEntered

    private void txtPreparacaoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPreparacaoMouseMoved
      
    }//GEN-LAST:event_txtPreparacaoMouseMoved

    private void txtPreparacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPreparacaoMouseExited
         txtPreparacao.setOpaque(true);
         txtPreparacao.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtPreparacaoMouseExited

    private void txtSubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubMouseEntered
         
         txtSub.setOpaque(true);
         txtSub.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtSubMouseEntered

    private void txtSubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubMouseExited
            txtSub.setOpaque(true);
            txtSub.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtSubMouseExited

    private void txtPrePlantioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrePlantioMouseEntered
         txtPrePlantio.setOpaque(true);
         txtPrePlantio.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtPrePlantioMouseEntered

    private void txtPrePlantioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrePlantioMouseExited
         txtPrePlantio.setOpaque(true);
         txtPrePlantio.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtPrePlantioMouseExited

    private void txtPlantioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlantioMouseEntered
         txtPlantio.setOpaque(true);
         txtPlantio.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtPlantioMouseEntered

    private void txtPlantioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlantioMouseExited
         txtPlantio.setOpaque(true);
         txtPlantio.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtPlantioMouseExited

    private void txtControleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtControleMouseEntered
         txtControle.setOpaque(true);
         txtControle.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtControleMouseEntered

    private void txtControleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtControleMouseExited
         txtControle.setOpaque(true);
         txtControle.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtControleMouseExited

    private void txtAdubacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAdubacaoMouseEntered
         txtAdubacao.setOpaque(true);
         txtAdubacao.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtAdubacaoMouseEntered

    private void txtAdubacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAdubacaoMouseExited
         txtAdubacao.setOpaque(true);
         txtAdubacao.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtAdubacaoMouseExited

    private void txtPosPlantioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosPlantioMouseEntered
         txtPosPlantio.setOpaque(true);
         txtPosPlantio.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtPosPlantioMouseEntered

    private void txtPosPlantioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosPlantioMouseExited
        txtPosPlantio.setOpaque(true);
         txtPosPlantio.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtPosPlantioMouseExited

    private void txtSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSubMouseClicked
       
        
        JOptionPane.showMessageDialog(null, "Realize a Subsolagem entre as linhas de terra feitas pelo Limpa Trilho ","SUBSOLAGEM", ICONIFIED);
    }//GEN-LAST:event_txtSubMouseClicked

    private void txtPrePlantioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrePlantioMouseClicked
         JOptionPane.showMessageDialog(null, "Analise o solo e veja se há necessidade de "
                   + "aplicar o Herbicida pré plantio."
                   + "\no tempo para progredir para proxima fase depende do tempo de ação do Herbicida usado.    ","APLICAÇÃO DO HERBICIDA", ICONIFIED);
    }//GEN-LAST:event_txtPrePlantioMouseClicked

    private void txtPlantioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlantioMouseClicked
        JOptionPane.showMessageDialog(null, "Realize o plantio das mudas ultilizando gel para plantação, o gel evita que o solo"
                    + "\nao redor das mudas fique muito seco. ","PLANTIO", ICONIFIED);
    }//GEN-LAST:event_txtPlantioMouseClicked

    private void txtControleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtControleMouseClicked
        JOptionPane.showMessageDialog(null, "Após Feito o plantio é muito importante realizar a verificação regular das árvores para realizar"
                    + "\n o controle de pragas caso necessario ","CONTROLE DE PRAGAS", ICONIFIED);
    }//GEN-LAST:event_txtControleMouseClicked

    private void txtAdubacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAdubacaoMouseClicked
        JOptionPane.showMessageDialog(null, "Se possivel adube o solo das mudas uma vez a cada 6 meses"
                  +" para maximizar o efeito do gel e melhorar o solo. ","ADUBAGEM ", ICONIFIED);
    }//GEN-LAST:event_txtAdubacaoMouseClicked

    private void txtPosPlantioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPosPlantioMouseClicked
         JOptionPane.showMessageDialog(null, "Realize a aplicação "
                    + "do herbicida pós plantio."
                    + "\n Essa aplicação deve ser feita regularmente a cada 2 meses ou antes caso as plantas estejam sendo assoladas por pragas. ","CONTROLE PÓS PLANTIO ", ICONIFIED);
    }//GEN-LAST:event_txtPosPlantioMouseClicked

    private void txtLogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogMouseEntered
         txtLog.setOpaque(true);
         txtLog.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_txtLogMouseEntered

    private void txtLogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogMouseExited
         txtLog.setOpaque(true);
         txtLog.setForeground(Color.WHITE);
    }//GEN-LAST:event_txtLogMouseExited

    private void txtLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogMouseClicked
       JOptionPane.showMessageDialog(null, "Voce será Deslogado", "Logout", ICONIFIED);
       
       new TelaLogin().setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_txtLogMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPainel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt01;
    private javax.swing.JLabel txt02;
    private javax.swing.JLabel txt03;
    private javax.swing.JLabel txt04;
    private javax.swing.JLabel txt05;
    private javax.swing.JLabel txt06;
    private javax.swing.JLabel txt07;
    private javax.swing.JLabel txtAdubacao;
    private javax.swing.JLabel txtControle;
    private javax.swing.JLabel txtLog;
    private javax.swing.JLabel txtPlantio;
    private javax.swing.JLabel txtPosPlantio;
    private javax.swing.JLabel txtPrePlantio;
    private javax.swing.JLabel txtPreparacao;
    private javax.swing.JLabel txtSub;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtVer;
    // End of variables declaration//GEN-END:variables

  
}
