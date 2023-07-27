
package views;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class PomodoroAdvence extends javax.swing.JFrame {

   
    public PomodoroAdvence() {
        initComponents();
    }

private final int FOCUS_TIME = 25;
private final int FAST_BREAK = 5;
private final int LONG_BREAK_TIME = 15;
private final int ROUNDS = 4;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincip = new javax.swing.JPanel();
        timer = new javax.swing.JPanel();
        settingsButton = new javax.swing.JLabel();
        playAndPause = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        fechaSettings = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelTempoFoco = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        labelRounds = new javax.swing.JLabel();
        labelBreakCurto = new javax.swing.JLabel();
        sliderBreakCurto = new javax.swing.JSlider();
        sliderBreakLongo = new javax.swing.JSlider();
        sliderRounds = new javax.swing.JSlider();
        sliderTempoFoco = new javax.swing.JSlider();
        labelBreakLongo = new javax.swing.JLabel();
        buttonAplic = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincip.setLayout(new java.awt.CardLayout());

        timer.setBackground(new java.awt.Color(51, 51, 0));

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semana02/engrenagem.png"))); // NOI18N
        settingsButton.setText("jLabel4");
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });

        playAndPause.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playAndPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semana02/play.png"))); // NOI18N

        timerLabel.setFont(new java.awt.Font("EngraversGothic BT", 1, 90)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(0, 204, 153));
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("25:00");

        statusLabel.setFont(new java.awt.Font("DS ISO 1", 1, 24)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 204, 153));
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText("TEMPO DE FOCO");

        javax.swing.GroupLayout timerLayout = new javax.swing.GroupLayout(timer);
        timer.setLayout(timerLayout);
        timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(playAndPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(settingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playAndPause, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        painelPrincip.add(timer, "timer");

        settings.setBackground(new java.awt.Color(51, 51, 0));

        fechaSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semana02/claro.png"))); // NOI18N
        fechaSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaSettingsMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("TEMPO DE FOCO");

        labelTempoFoco.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 24)); // NOI18N
        labelTempoFoco.setForeground(new java.awt.Color(0, 153, 153));
        labelTempoFoco.setText("25:00");

        jLabel14.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 102));
        jLabel14.setText("BREAK CURTO");

        jLabel18.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 102));
        jLabel18.setText("BREAK LONGO");

        jLabel22.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 102));
        jLabel22.setText("ROUNDS");

        labelRounds.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 24)); // NOI18N
        labelRounds.setForeground(new java.awt.Color(0, 153, 153));
        labelRounds.setText("25:00");

        labelBreakCurto.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 24)); // NOI18N
        labelBreakCurto.setForeground(new java.awt.Color(0, 153, 153));
        labelBreakCurto.setText("5:00");

        sliderBreakCurto.setForeground(new java.awt.Color(0, 153, 153));
        sliderBreakCurto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBreakCurtoStateChanged(evt);
            }
        });

        sliderBreakLongo.setForeground(new java.awt.Color(0, 153, 153));
        sliderBreakLongo.setMaximum(30);
        sliderBreakLongo.setMinimum(15);
        sliderBreakLongo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBreakLongoStateChanged(evt);
            }
        });

        sliderRounds.setForeground(new java.awt.Color(0, 153, 153));
        sliderRounds.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRoundsStateChanged(evt);
            }
        });

        sliderTempoFoco.setForeground(new java.awt.Color(0, 153, 153));
        sliderTempoFoco.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderTempoFocoStateChanged(evt);
            }
        });

        labelBreakLongo.setFont(new java.awt.Font("Dutch801 Rm BT", 0, 24)); // NOI18N
        labelBreakLongo.setForeground(new java.awt.Color(0, 153, 153));
        labelBreakLongo.setText("15:00");

        buttonAplic.setText("Aplicar");
        buttonAplic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAplicActionPerformed(evt);
            }
        });

        resetButton.setText("Reset Default");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(386, 386, 386)
                                .addComponent(labelBreakCurto))
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(jLabel22))
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(labelTempoFoco))
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(jLabel18)))
                        .addGap(86, 491, Short.MAX_VALUE))
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sliderTempoFoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaSettings))
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(sliderBreakCurto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderBreakLongo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderRounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(settingsLayout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(labelRounds)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addGap(31, 31, 31)
                .addComponent(buttonAplic, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingsLayout.createSequentialGroup()
                    .addGap(388, 388, 388)
                    .addComponent(labelBreakLongo)
                    .addContainerGap(547, Short.MAX_VALUE)))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addComponent(fechaSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(labelTempoFoco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderTempoFoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBreakCurto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderBreakCurto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addGap(47, 47, 47)
                .addComponent(sliderBreakLongo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel22)
                .addGap(2, 2, 2)
                .addComponent(labelRounds)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderRounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(buttonAplic))
                .addGap(24, 24, 24))
            .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingsLayout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(labelBreakLongo)
                    .addContainerGap(275, Short.MAX_VALUE)))
        );

        painelPrincip.add(settings, "settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPrincip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelPrincip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
         changePanel("settings");
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void fechaSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaSettingsMouseClicked
        changePanel("timer");
    }//GEN-LAST:event_fechaSettingsMouseClicked

    private void sliderTempoFocoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderTempoFocoStateChanged
      sliderLabel(sliderTempoFoco, labelTempoFoco);
    }//GEN-LAST:event_sliderTempoFocoStateChanged

    private void sliderBreakCurtoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBreakCurtoStateChanged
      sliderLabel(sliderBreakCurto, labelBreakCurto);
    }//GEN-LAST:event_sliderBreakCurtoStateChanged

    private void sliderBreakLongoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBreakLongoStateChanged
      sliderLabel(sliderBreakLongo, labelBreakLongo);
    }//GEN-LAST:event_sliderBreakLongoStateChanged

    private void sliderRoundsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRoundsStateChanged
      sliderLabel(sliderRounds, labelRounds);
    }//GEN-LAST:event_sliderRoundsStateChanged

    private void buttonAplicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAplicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAplicActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        this.sliderTempoFoco.setValue(this.FOCUS_TIME);
        this.sliderBreakCurto.setValue(this.LONG_BREAK_TIME);
        this.sliderRounds.setValue(this.ROUNDS);
    }//GEN-LAST:event_resetButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAplic;
    private javax.swing.JLabel fechaSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel labelBreakCurto;
    private javax.swing.JLabel labelBreakLongo;
    private javax.swing.JLabel labelRounds;
    private javax.swing.JLabel labelTempoFoco;
    private javax.swing.JPanel painelPrincip;
    private javax.swing.JLabel playAndPause;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel settings;
    private javax.swing.JLabel settingsButton;
    private javax.swing.JSlider sliderBreakCurto;
    private javax.swing.JSlider sliderBreakLongo;
    private javax.swing.JSlider sliderRounds;
    private javax.swing.JSlider sliderTempoFoco;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel timer;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables

    private void changePanel(String cardName){
         CardLayout cardLayout =(CardLayout)  this.painelPrincip.getLayout();
        cardLayout.show(this.painelPrincip, cardName);
    }
    
      private void sliderLabel(JSlider slider, JLabel label){
         int value = slider.getValue();
       String valueFormat = String.format("%o2d:%02d", value, 00);
       label.setText(valueFormat);
    }
}
