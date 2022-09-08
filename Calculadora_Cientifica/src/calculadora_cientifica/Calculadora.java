
package calculadora_cientifica;

/**
 *
 * @author Sanchez Cano Alejandro 33
 */

public class Calculadora extends javax.swing.JFrame {
    
    Metodos metodx=new Metodos();
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultado2 = new java.awt.Label();
        Operación2 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        división = new javax.swing.JButton();
        más = new javax.swing.JButton();
        multiplicación = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        parentesis_Derecha = new javax.swing.JButton();
        exponente = new javax.swing.JButton();
        numero_pi = new javax.swing.JButton();
        nExclamación = new javax.swing.JButton();
        negativo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        AlCuadrado = new javax.swing.JButton();
        raíz = new javax.swing.JButton();
        A_la_X = new javax.swing.JButton();
        DiezA_la_X = new javax.swing.JButton();
        log = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        euler = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        Parentesis_Izquierda = new javax.swing.JButton();
        c = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Cientifica");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(5, 6, 26));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado2.setAlignment(java.awt.Label.RIGHT);
        resultado2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        resultado2.setForeground(new java.awt.Color(235, 125, 70));
        jPanel1.add(resultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 340, -1));

        Operación2.setAlignment(java.awt.Label.RIGHT);
        Operación2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Operación2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        Operación2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Operación2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 170));

        jPanel2.setBackground(new java.awt.Color(19, 18, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(36, 36, 74));

        división.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        división.setForeground(new java.awt.Color(255, 255, 255));
        división.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        división.setText("÷");
        división.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        división.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        división.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        división.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisiónActionPerformed(evt);
            }
        });

        más.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        más.setForeground(new java.awt.Color(255, 255, 255));
        más.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        más.setText("+");
        más.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        más.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        más.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        más.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                másActionPerformed(evt);
            }
        });

        multiplicación.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        multiplicación.setForeground(new java.awt.Color(255, 255, 255));
        multiplicación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        multiplicación.setText("X");
        multiplicación.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multiplicación.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        multiplicación.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        multiplicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicaciónActionPerformed(evt);
            }
        });

        resta.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        resta.setForeground(new java.awt.Color(255, 255, 255));
        resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        resta.setText("-");
        resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        igual.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(3).png"))); // NOI18N
        igual.setText("=");
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicación, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(más, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(división, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(división, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(multiplicación, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(más, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 90, 380));

        parentesis_Derecha.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        parentesis_Derecha.setForeground(new java.awt.Color(255, 255, 255));
        parentesis_Derecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        parentesis_Derecha.setText("(");
        parentesis_Derecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        parentesis_Derecha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        parentesis_Derecha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        parentesis_Derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentesis_DerechaActionPerformed(evt);
            }
        });
        jPanel2.add(parentesis_Derecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 50, 50));

        exponente.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        exponente.setForeground(new java.awt.Color(255, 255, 255));
        exponente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        exponente.setText("^");
        exponente.setFocusPainted(false);
        exponente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exponente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        exponente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exponenteActionPerformed(evt);
            }
        });
        jPanel2.add(exponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        numero_pi.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        numero_pi.setForeground(new java.awt.Color(255, 255, 255));
        numero_pi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        numero_pi.setText("π");
        numero_pi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        numero_pi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        numero_pi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        numero_pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_piActionPerformed(evt);
            }
        });
        jPanel2.add(numero_pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        nExclamación.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        nExclamación.setForeground(new java.awt.Color(255, 255, 255));
        nExclamación.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        nExclamación.setText("n!");
        nExclamación.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nExclamación.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        nExclamación.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        nExclamación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nExclamaciónActionPerformed(evt);
            }
        });
        jPanel2.add(nExclamación, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        negativo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        negativo.setForeground(new java.awt.Color(255, 255, 255));
        negativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        negativo.setText("(-)");
        negativo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        negativo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        negativo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativoActionPerformed(evt);
            }
        });
        jPanel2.add(negativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 50, 50));

        jPanel4.setBackground(new java.awt.Color(36, 36, 74));

        AlCuadrado.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        AlCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        AlCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        AlCuadrado.setText("x²");
        AlCuadrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AlCuadrado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        AlCuadrado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        AlCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlCuadradoActionPerformed(evt);
            }
        });

        raíz.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        raíz.setForeground(new java.awt.Color(255, 255, 255));
        raíz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        raíz.setText("√");
        raíz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        raíz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        raíz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        raíz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raízActionPerformed(evt);
            }
        });

        A_la_X.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        A_la_X.setForeground(new java.awt.Color(255, 255, 255));
        A_la_X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        A_la_X.setText("xʸ");
        A_la_X.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        A_la_X.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        A_la_X.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        A_la_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_la_XActionPerformed(evt);
            }
        });

        DiezA_la_X.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        DiezA_la_X.setForeground(new java.awt.Color(255, 255, 255));
        DiezA_la_X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        DiezA_la_X.setText("10x");
        DiezA_la_X.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DiezA_la_X.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        DiezA_la_X.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        DiezA_la_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiezA_la_XActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        log.setText("log");
        log.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        log.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        log.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cos.setForeground(new java.awt.Color(255, 255, 255));
        cos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        cos.setText("cos");
        cos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        cos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        exp.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        exp.setForeground(new java.awt.Color(255, 255, 255));
        exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        exp.setText("exp");
        exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        tan.setForeground(new java.awt.Color(255, 255, 255));
        tan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        tan.setText("tan");
        tan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        tan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        mod.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 12)); // NOI18N
        mod.setForeground(new java.awt.Color(255, 255, 255));
        mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        mod.setText("mod");
        mod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mod.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        mod.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        sin.setForeground(new java.awt.Color(255, 255, 255));
        sin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(4).png"))); // NOI18N
        sin.setText("sin");
        sin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        sin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(5).png"))); // NOI18N
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raíz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiezA_la_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_la_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_la_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raíz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiezA_la_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 140));

        jButton17.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        jButton17.setText("X");
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        jButton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        euler.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        euler.setForeground(new java.awt.Color(255, 255, 255));
        euler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        euler.setText("e");
        euler.setFocusPainted(false);
        euler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        euler.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        euler.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        euler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eulerActionPerformed(evt);
            }
        });
        jPanel2.add(euler, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 50));

        siete.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        siete.setForeground(new java.awt.Color(255, 255, 255));
        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        siete.setText("7");
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        siete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        siete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });
        jPanel2.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 50, 50));

        cuatro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        cuatro.setForeground(new java.awt.Color(255, 255, 255));
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        cuatro.setText("4");
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        cuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        jPanel2.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 50, 50));

        uno.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        uno.setForeground(new java.awt.Color(255, 255, 255));
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        uno.setText("1");
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        uno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        jPanel2.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 50, 50));

        Parentesis_Izquierda.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        Parentesis_Izquierda.setForeground(new java.awt.Color(255, 255, 255));
        Parentesis_Izquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        Parentesis_Izquierda.setText(")");
        Parentesis_Izquierda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Parentesis_Izquierda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        Parentesis_Izquierda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        Parentesis_Izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parentesis_IzquierdaActionPerformed(evt);
            }
        });
        jPanel2.add(Parentesis_Izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 50, 50));

        c.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        c.setText("C");
        c.setFocusPainted(false);
        c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel2.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 50, 50));

        ocho.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        ocho.setForeground(new java.awt.Color(255, 255, 255));
        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        ocho.setText("8");
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ocho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        ocho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });
        jPanel2.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 50));

        cinco.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        cinco.setForeground(new java.awt.Color(255, 255, 255));
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        cinco.setText("5");
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        cinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        jPanel2.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 50, 50));

        dos.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        dos.setForeground(new java.awt.Color(255, 255, 255));
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        dos.setText("2");
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        dos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        jPanel2.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 50, 50));

        cero.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        cero.setForeground(new java.awt.Color(255, 255, 255));
        cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        cero.setText("0");
        cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel2.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 50, 50));

        borrar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        borrar.setText("<");
        borrar.setFocusPainted(false);
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel2.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 50, 50));

        nueve.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        nueve.setForeground(new java.awt.Color(255, 255, 255));
        nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        nueve.setText("9");
        nueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        nueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });
        jPanel2.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 50));

        seis.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        seis.setForeground(new java.awt.Color(255, 255, 255));
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        seis.setText("6");
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        seis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        jPanel2.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 50, 50));

        tres.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        tres.setForeground(new java.awt.Color(255, 255, 255));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        tres.setText("3");
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        tres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        jPanel2.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 50, 50));

        punto.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        punto.setForeground(new java.awt.Color(255, 255, 255));
        punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        punto.setText(".");
        punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(1).png"))); // NOI18N
        punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Botón(2).png"))); // NOI18N
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        jPanel2.add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 820, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parentesis_DerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentesis_DerechaActionPerformed
        //addNumber("(");
    }//GEN-LAST:event_parentesis_DerechaActionPerformed

    private void AlCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlCuadradoActionPerformed
        //addNumber("^2");
        //Operación2.setText(metodx.concatenamiento("^2"));
        metodx.alcuadrado(Operación2.getText());
    }//GEN-LAST:event_AlCuadradoActionPerformed

    private void raízActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raízActionPerformed
        //addNumber("√");
        //Operación2.setText(metodx.concatenamiento("√"));
        metodx.raiz(Operación2.getText());
    }//GEN-LAST:event_raízActionPerformed

    private void exponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exponenteActionPerformed
        //addNumber("^");
        metodx.alapotencia(Operación2.getText());
    }//GEN-LAST:event_exponenteActionPerformed

    private void numero_piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_piActionPerformed
        //addNumber("π");
        metodx.pi(Operación2.getText());
    }//GEN-LAST:event_numero_piActionPerformed

    private void nExclamaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nExclamaciónActionPerformed
        //addNumber("n!");
    }//GEN-LAST:event_nExclamaciónActionPerformed

    private void negativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativoActionPerformed
        //addNumber("-");
        metodx.negativo(Operación2.getText());
    }//GEN-LAST:event_negativoActionPerformed

    private void A_la_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_la_XActionPerformed
        //addNumber("x^");
        metodx.alapotencia(Operación2.getText());
    }//GEN-LAST:event_A_la_XActionPerformed

    private void DiezA_la_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiezA_la_XActionPerformed
        //addNumber("10^");
        metodx.diezal(Operación2.getText());
    }//GEN-LAST:event_DiezA_la_XActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed

        //addNumber("log()");
        metodx.logaritmo(Operación2.getText());
    }//GEN-LAST:event_logActionPerformed

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        //addNumber("cos()");
        metodx.coseno(Operación2.getText());
    }//GEN-LAST:event_cosActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        //addNumber("^");
        metodx.alapotencia(Operación2.getText());
    }//GEN-LAST:event_expActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        //addNumber("tan()");
        metodx.tangente(Operación2.getText());
    }//GEN-LAST:event_tanActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        //addNumber("mod");
        metodx.mod(Operación2.getText());
    }//GEN-LAST:event_modActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        //addNumber("sin()");
    }//GEN-LAST:event_sinActionPerformed

    private void divisiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisiónActionPerformed
        //addNumber("÷");
        metodx.division(Operación2.getText());
    }//GEN-LAST:event_divisiónActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void másActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_másActionPerformed
        //addNumber("+");
        metodx.suma(Operación2.getText());
    }//GEN-LAST:event_másActionPerformed

    private void multiplicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicaciónActionPerformed
        //addNumber("x");
        metodx.multiplicacion(Operación2.getText());
    }//GEN-LAST:event_multiplicaciónActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        //addNumber("-");
        metodx.resta(Operación2.getText());
    }//GEN-LAST:event_restaActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
       
        resultado2.setText(""+ metodx.resultado(Operación2.getText()));
    }//GEN-LAST:event_igualActionPerformed

    private void eulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eulerActionPerformed
        //addNumber("e");
        metodx.eu(Operación2.getText());
    }//GEN-LAST:event_eulerActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        //addNumber("7");
        Operación2.setText(metodx.concatenamiento("7"));
    }//GEN-LAST:event_sieteActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        //addNumber("4");   
        Operación2.setText(metodx.concatenamiento("4"));
    }//GEN-LAST:event_cuatroActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        //addNumber("1");
        Operación2.setText(metodx.concatenamiento("1"));
    }//GEN-LAST:event_unoActionPerformed

    private void Parentesis_IzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parentesis_IzquierdaActionPerformed
        //addNumber(")");
    }//GEN-LAST:event_Parentesis_IzquierdaActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        Operación2.setText("");
        resultado2.setText("");
        metodx.borrar(Operación2.getText());
        
    }//GEN-LAST:event_cActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        //addNumber("8");
        Operación2.setText(metodx.concatenamiento("8"));
    }//GEN-LAST:event_ochoActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        //addNumber("5");       
        Operación2.setText(metodx.concatenamiento("5"));
    }//GEN-LAST:event_cincoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        //addNumber("2");
        Operación2.setText(metodx.concatenamiento("2"));
    }//GEN-LAST:event_dosActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        //addNumber("0");
        Operación2.setText(metodx.concatenamiento("0"));
    }//GEN-LAST:event_ceroActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        //addNumber("9");
        Operación2.setText(metodx.concatenamiento("9"));
    }//GEN-LAST:event_nueveActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        //addNumber("6"); 
        Operación2.setText(metodx.concatenamiento("6"));
    }//GEN-LAST:event_seisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        //addNumber("3");
        Operación2.setText(metodx.concatenamiento("3"));
    }//GEN-LAST:event_tresActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        //addNumber(".");
        Operación2.setText(metodx.concatenamiento("."));
    }//GEN-LAST:event_puntoActionPerformed

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
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    /*public void addNumber(String digito){
        Operación2.setText(Operación2.getText() + digito);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_la_X;
    private javax.swing.JButton AlCuadrado;
    private javax.swing.JButton DiezA_la_X;
    private java.awt.Label Operación2;
    private javax.swing.JButton Parentesis_Izquierda;
    private javax.swing.JButton borrar;
    private javax.swing.JButton c;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cos;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton división;
    private javax.swing.JButton dos;
    private javax.swing.JButton euler;
    private javax.swing.JButton exp;
    private javax.swing.JButton exponente;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton log;
    private javax.swing.JButton mod;
    private javax.swing.JButton multiplicación;
    private javax.swing.JButton más;
    private javax.swing.JButton nExclamación;
    private javax.swing.JButton negativo;
    private javax.swing.JButton nueve;
    private javax.swing.JButton numero_pi;
    private javax.swing.JButton ocho;
    private javax.swing.JButton parentesis_Derecha;
    private javax.swing.JButton punto;
    private javax.swing.JButton raíz;
    private javax.swing.JButton resta;
    private java.awt.Label resultado2;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton sin;
    private javax.swing.JButton tan;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
