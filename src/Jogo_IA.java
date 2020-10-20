
import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.Random;

public class Jogo_IA extends javax.swing.JFrame {

    public static int dificuldade = 0;

    static boolean Jogador1Ativo = true; //O jogador vai começar por padrão
    static boolean Computador = true; //é o vencedor 2

    String m[][] = new String[3][3]; //matriz para ir marcando as casas do jogo

    static LinkedList lista = new LinkedList();

    static int cont_empates = 0;
    static int vencedor = 3;

    int valor = 99; //para n deixar jogar depois que alguem ganhou

    public Jogo_IA() {
        initComponents();
    }

    public void Inicia() {
        m[0][0] = " ";
        m[0][1] = " ";
        m[0][2] = " ";
        m[1][0] = " ";
        m[1][1] = " ";
        m[1][2] = " ";
        m[2][0] = " ";
        m[2][1] = " ";
        m[2][2] = " ";
    }

    //1
    public void Teste_difi(int dificuldade) { //recebe a dificuldade e chama os metodos
        switch (dificuldade) {
            case 1:
                Jogador1Ativo = false;
                Computador = true;
                Jogada_Facil();
                break;
            case 2:
                Jogador1Ativo = false;  //se for a dificuldade média o PC comeca
                Computador = true;
                Jogada_Medio();
                break;
            case 3:
                Jogador1Ativo = false;
                Computador = true;
                Jogada_Dificil();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selecione uma dificuldade para jogar.");
        }
    }

    public void Jogada_Facil() { //testar 1 a um
        if (valor == 99) {
            cont_empates++;
            if (B1.getText().equals("")) {
                B1.setText("0");
                Matriz_teste(B1);
                JogadorAtivo();
            } else if (B2.getText().equals("")) {
                B2.setText("0");
                Matriz_teste(B2);
                JogadorAtivo();
            } else if (B3.getText().equals("")) {
                B3.setText("0");
                Matriz_teste(B3);
                JogadorAtivo();
            } else if (B4.getText().equals("")) {
                B4.setText("0");
                Matriz_teste(B4);
                JogadorAtivo();
            } else if (B5.getText().equals("")) {
                B5.setText("0");
                Matriz_teste(B5);
                JogadorAtivo();
            } else if (B6.getText().equals("")) {
                B6.setText("0");
                Matriz_teste(B6);
                JogadorAtivo();
            } else if (B10.getText().equals("")) {
                B10.setText("0");
                Matriz_teste(B10);
                JogadorAtivo();
            } else if (B11.getText().equals("")) {
                B11.setText("0");
                Matriz_teste(B11);
                JogadorAtivo();
            } else if (B12.getText().equals("")) {
                B12.setText("0");
                Matriz_teste(B12);
                JogadorAtivo();
            }
        } else if (valor == 10) {
            Botao_Enabled_False();
        }
    }

    public void Jogada_Medio() { //gera 1 n rando. se for x n, atribui 0 à x casa
        if (valor == 99) {
            cont_empates++;

            for (int i = 0; i < 9; i++) //adiciona os numeros de 1-9 na lista
            {
                lista.add(i);
            }

            int x = 0; //para parar de verificar as casas

            while (x == 0) {

                Random num = new Random();

                if (lista.size() > 0) { //enquanto houverem numeros na lista (pra n dar erro aí avisa)
                    int posicao = num.nextInt(lista.size()); //sorteia um valor dentro do tamanho da lista
                    lista.remove(posicao); //remove o n da lista aí n repete

                    switch (posicao) {
                        case 0:
                            if (B1.getText().equals("")) { // SE botão correspondente a casa não está preenchido
                                B1.setText("0"); //colocar 0 no botao
                                Matriz_teste(B1); //preencher a casa da matriz
                                JogadorAtivo();
                                x = 1; //sai do while
                            }
                            break;
                        case 1:
                            if (B2.getText().equals("")) {
                                B2.setText("0");
                                Matriz_teste(B2);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 2:
                            if (B3.getText().equals("")) {
                                B3.setText("0");
                                Matriz_teste(B3);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 3:
                            if (B4.getText().equals("")) {
                                B4.setText("0");
                                Matriz_teste(B4);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 4:
                            if (B5.getText().equals("")) {
                                B5.setText("0");
                                Matriz_teste(B5);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 5:
                            if (B6.getText().equals("")) {
                                B6.setText("0");
                                Matriz_teste(B6);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 6:
                            if (B10.getText().equals("")) {
                                B10.setText("0");
                                Matriz_teste(B10);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 7:
                            if (B11.getText().equals("")) {
                                B11.setText("0");
                                Matriz_teste(B11);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 8:
                            if (B12.getText().equals("")) {
                                B12.setText("0");
                                Matriz_teste(B12);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                    }
                }

            }
        } else if (valor == 10) {
            Botao_Enabled_False();
        }
        //ai espera o usuario clicar numa casa dnv
    }

    public void Jogada_Dificil() {
        if (valor == 99) { //para desabilitar os botoes quando ganhar
            cont_empates++;

            for (int i = 0; i < 9; i++) //adiciona os numeros de 1-9 na lista
            {
                lista.add(i);
            }

            int x = 0; //para parar de verificar as casas

            while (x == 0) {

                Random num = new Random();

                if (lista.size() > 0) { //enquanto houverem numeros na lista (pra n dar erro aí avisa)
                    int posicao = num.nextInt(lista.size()); //sorteia um valor dentro do tamanho da lista
                    lista.remove(posicao); //remove o n da lista aí n repete

                    switch (posicao) {
                        case 0:
                            if (Computador == true) { //para nao mostrar o aviso de ganhador 2 vezes
                                Teste_Linhas(); //faz o teste antes de jogar, pra tentar vencer
                                if (B1.getText().equals("")) { // SE botão correspondente a casa não está preenchido
                                    B1.setText("0"); //colocar 0 no botao
                                    Matriz_teste(B1); //preencher a casa da matriz
                                    JogadorAtivo();
                                    x = 1; //sai do while
                                }
                            }
                            break;
                        case 1:
                            Teste_Linhas();
                            if (B2.getText().equals("")) {
                                B2.setText("0");
                                Matriz_teste(B2);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 2:
                            Teste_Linhas();
                            if (B3.getText().equals("")) {
                                B3.setText("0");
                                Matriz_teste(B3);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 3:
                            Teste_Linhas();
                            if (B4.getText().equals("")) {
                                B4.setText("0");
                                Matriz_teste(B4);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 4:
                            Teste_Linhas();
                            if (B5.getText().equals("")) {
                                B5.setText("0");
                                Matriz_teste(B5);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 5:
                            Teste_Linhas();
                            if (B6.getText().equals("")) {
                                B6.setText("0");
                                Matriz_teste(B6);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 6:
                            Teste_Linhas();
                            if (B10.getText().equals("")) {
                                B10.setText("0");
                                Matriz_teste(B10);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 7:
                            Teste_Linhas();
                            if (B11.getText().equals("")) {
                                B11.setText("0");
                                Matriz_teste(B11);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                        case 8:
                            Teste_Linhas();
                            if (B12.getText().equals("")) {
                                B12.setText("0");
                                Matriz_teste(B12);
                                JogadorAtivo();
                                x = 1;
                            }
                            break;
                    }
                }

            }

        } else if (valor == 10) {
            Botao_Enabled_False();
        }
    }

    public void Teste_Linhas() {
        //linhas 
        if (m[0][0].equals("0") && m[0][1].equals("0")) {
            if (B3.getText().equals("")) {
                B3.setText("0");
                Matriz_teste(B3);
                JogadorAtivo();
            }
        } else if (m[0][1].equals("0") && m[0][2].equals("0")) {
            if (B1.getText().equals("")) {
                B1.setText("0");
                Matriz_teste(B1);
                JogadorAtivo();
            }
        } else if (m[1][0].equals("0") && m[1][1].equals("0")) {
            if (B6.getText().equals("")) {
                B6.setText("0");
                Matriz_teste(B6);
                JogadorAtivo();
            }
        } else if (m[1][1].equals("0") && m[1][2].equals("0")) {
            if (B4.getText().equals("")) {
                B4.setText("0");
                Matriz_teste(B4);
                JogadorAtivo();
            }
        } else if (m[2][0].equals("0") && m[2][1].equals("0")) {
            if (B12.getText().equals("")) {
                B12.setText("0");
                Matriz_teste(B12);
                JogadorAtivo();
            }
        } else if (m[2][1].equals("0") && m[2][2].equals("0")) {
            if (B10.getText().equals("")) {
                B10.setText("0");
                Matriz_teste(B10);
                JogadorAtivo();
            }
        } else if (m[0][0].equals("0") && m[0][2].equals("0")) {
            if (B2.getText().equals("")) {
                B2.setText("0");
                Matriz_teste(B2);
                JogadorAtivo();
            }
        } else if (m[1][0].equals("0") && m[1][2].equals("0")) {
            if (B5.getText().equals("")) {
                B5.setText("0");
                Matriz_teste(B5);
                JogadorAtivo();
            }
        } else if (m[2][0].equals("0") && m[2][2].equals("0")) {
            if (B11.getText().equals("")) {
                B11.setText("0");
                Matriz_teste(B11);
                JogadorAtivo();
            }
        }

        //colunas
        if (m[0][0].equals("0") && m[1][0].equals("0")) {
            if (B10.getText().equals("")) {
                B10.setText("0");
                Matriz_teste(B10);
                JogadorAtivo();
            }
        } else if (m[1][0].equals("0") && m[2][0].equals("0")) {
            if (B1.getText().equals("")) {
                B1.setText("0");
                Matriz_teste(B1);
                JogadorAtivo();
            }
        } else if (m[0][1].equals("0") && m[1][1].equals("0")) {
            if (B11.getText().equals("")) {
                B11.setText("0");
                Matriz_teste(B11);
                JogadorAtivo();
            }
        } else if (m[1][1].equals("0") && m[2][1].equals("0")) {
            if (B2.getText().equals("")) {
                B2.setText("0");
                Matriz_teste(B2);
                JogadorAtivo();
            }
        } else if (m[0][2].equals("0") && m[1][2].equals("0")) {
            if (B12.getText().equals("")) {
                B12.setText("0");
                Matriz_teste(B12);
                JogadorAtivo();
            }
        } else if (m[1][2].equals("0") && m[2][2].equals("0")) {
            if (B3.getText().equals("")) {
                B3.setText("0");
                Matriz_teste(B3);
                JogadorAtivo();
            }
        } else if (m[0][0].equals("0") && m[2][0].equals("0")) {
            if (B4.getText().equals("")) {
                B4.setText("0");
                Matriz_teste(B4);
                JogadorAtivo();
            }
        } else if (m[0][1].equals("0") && m[2][1].equals("0")) {
            if (B5.getText().equals("")) {
                B5.setText("0");
                Matriz_teste(B5);
                JogadorAtivo();
            }
        } else if (m[0][2].equals("0") && m[2][2].equals("0")) {
            if (B6.getText().equals("")) {
                B6.setText("0");
                Matriz_teste(B6);
                JogadorAtivo();
            }
        }

        //diagonais
        if (m[0][0].equals("0") && m[1][1].equals("0")) {
            if (B12.getText().equals("")) {
                B12.setText("0");
                Matriz_teste(B12);
                JogadorAtivo();
            }
        } else if (m[2][2].equals("0") && m[1][1].equals("0")) {
            if (B1.getText().equals("")) {
                B1.setText("0");
                Matriz_teste(B1);
                JogadorAtivo();
            }
        } else if (m[0][2].equals("0") && m[1][1].equals("0")) {
            if (B10.getText().equals("")) {
                B10.setText("0");
                Matriz_teste(B10);
                JogadorAtivo();
            }
        } else if (m[2][0].equals("0") && m[1][1].equals("0")) {
            if (B3.getText().equals("")) {
                B3.setText("0");
                Matriz_teste(B3);
                JogadorAtivo();
            }
        } else if (m[0][0].equals("0") && m[2][2].equals("0")) {
            if (B5.getText().equals("")) {
                B5.setText("0");
                Matriz_teste(B5);
                JogadorAtivo();
            }
        } else if (m[0][2].equals("0") && m[2][0].equals("0")) {
            if (B11.getText().equals("")) {
                B11.setText("0");
                Matriz_teste(B11);
                JogadorAtivo();
            }
        }
    }

    //3
    public void Jogada_Jogador(javax.swing.JButton botao) {
        cont_empates++; // add 1 ao cont de jogadas feitas
        if (botao.getText().equals("")) { // e o botão não está preenchido
            botao.setText("X"); //colocar X pois é o Jogador 
            Matriz_teste(botao); //coloca a posicao na matriz
            JogadorAtivo();
        }
        if (valor == 99) {
            if (dificuldade == 1) {
                Jogada_Facil();
            } else if (dificuldade == 2) {
                Jogada_Medio();
            } else if (dificuldade == 3) {
                Jogada_Dificil();
            }
        } else if (valor == 10) {
            Botao_Enabled_False();
        }
    }

    //8
    public void JogadorAtivo() { //Se está na vez do jogador, muda ele para falso e da true ao pc
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Computador = true;
        } else { //o contrário
            Jogador1Ativo = true;
            Computador = false;
        }

    }

    //4
    public void Matriz_teste(javax.swing.JButton botao) { //vai colocar X ou 0 na posição da matriz. 

        if (botao == B1) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[0][0] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[0][0] = "0";
            }
        } else if (botao == B2) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[0][1] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[0][1] = "0";
            }
        } else if (botao == B3) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[0][2] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[0][2] = "0";
            }
        } else if (botao == B4) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[1][0] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[1][0] = "0";
            }
        } else if (botao == B5) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[1][1] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[1][1] = "0";
            }
        } else if (botao == B6) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[1][2] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[1][2] = "0";
            }
        } else if (botao == B10) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[2][0] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[2][0] = "0";
            }
        } else if (botao == B11) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[2][1] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[2][1] = "0";
            }
        } else if (botao == B12) { //se for o botao x
            if (Jogador1Ativo == true) { //e a vez do j1
                m[2][2] = "X"; //coloca X na posicao x
            } else if (Computador == true) {
                m[2][2] = "0";
            }
        }
        Teste_Jogador_Vencedor();

    }

    //5
    public void Teste_Jogador_Vencedor() {

        //Jogador 1
        //linhas
        if (m[0][0].equals("X") && m[0][1].equals("X") && m[0][2].equals("X")) {
            vencedor = 1;
            JogadorVencedor(vencedor);
            valor = 10; //para nao deixar o pc jogar depois que alguem ganhou
        } else if (m[1][0].equals("X") && m[1][1].equals("X") && m[1][2].equals("X")) {
            vencedor = 1;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[2][0].equals("X") && m[2][1].equals("X") && m[2][2].equals("X")) {
            vencedor = 1;
            JogadorVencedor(vencedor);
            valor = 10;
        }

        //colunas
        if (m[0][0].equals("X") && m[1][0].equals("X") && m[2][0].equals("X")) {
            vencedor = 1;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[0][1].equals("X") && m[1][1].equals("X") && m[2][1].equals("X")) {
            vencedor = 1;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[0][2].equals("X") && m[1][2].equals("X") && m[2][2].equals("X")) {
            vencedor = 1;
            JogadorVencedor(vencedor);
            valor = 10;
        }

        //diagonais
        if (m[0][0].equals("X") && m[1][1].equals("X") && m[2][2].equals("X")) {
            vencedor = 1;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[0][2].equals("X") && m[1][1].equals("X") && m[2][0].equals("X")) {
            vencedor = 1;
            JogadorVencedor(vencedor);
            valor = 10;
        }

        //Jogador 2
        //linhas
        if (m[0][0].equals("0") && m[0][1].equals("0") && m[0][2].equals("0")) {
            vencedor = 2;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[1][0].equals("0") && m[1][1].equals("0") && m[1][2].equals("0")) {
            vencedor = 2;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[2][0].equals("0") && m[2][1].equals("0") && m[2][2].equals("0")) {
            vencedor = 2;
            JogadorVencedor(vencedor);
            valor = 10;
        }

        //colunas
        if (m[0][0].equals("0") && m[1][0].equals("0") && m[2][0].equals("0")) {
            vencedor = 2;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[0][1].equals("0") && m[1][1].equals("0") && m[2][1].equals("0")) {
            vencedor = 2;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[0][2].equals("0") && m[1][2].equals("0") && m[2][2].equals("0")) {
            vencedor = 2;
            JogadorVencedor(vencedor);
            valor = 10;
        }

        //diagonais
        if (m[0][0].equals("0") && m[1][1].equals("0") && m[2][2].equals("0")) {
            vencedor = 2;
            JogadorVencedor(vencedor);
            valor = 10;
        } else if (m[0][2].equals("0") && m[1][1].equals("0") && m[2][0].equals("0")) {
            vencedor = 2;
            JogadorVencedor(vencedor);
            valor = 10;
        }

        if (vencedor == 0) {
            JogadorVencedor(vencedor);
            valor = 10;
        }

    }

    //6
    public void JogadorVencedor(int vencedor) { //Testa quem ganha
        if (vencedor == 1) {
            JOptionPane.showMessageDialog(null, "Jogador 1 venceu. ");
            Fim();
        } else if (vencedor == 2) {
            JOptionPane.showMessageDialog(null, "Computador venceu. ");
            Fim();
        } else if (vencedor == 3) {
            Empate();
            Fim();
        }
    }

    public void Fim() {
        Jogador1Ativo = false;
        Computador = false;

    }

    //7
    public void Empate() {
        if (cont_empates >= 9) {
            JOptionPane.showMessageDialog(null, "Deu velha!");
        }
    }

    public void Botao_Enabled_False() {
        B1.setEnabled(false);
        B2.setEnabled(false);
        B3.setEnabled(false);
        B4.setEnabled(false);
        B5.setEnabled(false);
        B6.setEnabled(false);
        B10.setEnabled(false);
        B11.setEnabled(false);
        B12.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SairJogo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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

        B10.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        B11.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B12.setFont(new java.awt.Font("This Is Ridiculous", 0, 48)); // NOI18N
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic", 0, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setText("Jogador           Símbolo: X");

        jLabel3.setText("Computador    Símbolo: 0");

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
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Selecione a dificuldade:");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Fácil");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Médio");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Difícil");

        jButton1.setText("Jogar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jButton1)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Botao_Enabled_False();

        Inicia();
    }//GEN-LAST:event_formWindowOpened

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if (Jogador1Ativo == true) { //quando clicarmos nele, muda para o user
            Jogada_Jogador(B1);
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        Jogo_IA transicao = new Jogo_IA();
        transicao.setVisible(true);
        dispose();
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void SairJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairJogoActionPerformed
        Menu transicao = new Menu();
        transicao.setVisible(true);
        dispose();
    }//GEN-LAST:event_SairJogoActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if (Jogador1Ativo == true) {
            Jogada_Jogador(B2);
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if (Jogador1Ativo == true) {
            Jogada_Jogador(B3);
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if (Jogador1Ativo == true) {
            Jogada_Jogador(B4);
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if (Jogador1Ativo == true) {
            Jogada_Jogador(B5);
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if (Jogador1Ativo == true) {
            Jogada_Jogador(B6);
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // Não é utilizado
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        //  Não é utilizado
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // Não é utilizado
    }//GEN-LAST:event_B9ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        if (Jogador1Ativo == true) {
            Jogada_Jogador(B10);
        }
    }//GEN-LAST:event_B10ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        if (Jogador1Ativo == true) {
            Jogada_Jogador(B11);
        }
    }//GEN-LAST:event_B11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        if (Jogador1Ativo == true) {
            Jogada_Jogador(B12);
        }
    }//GEN-LAST:event_B12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButton2.isSelected() || jRadioButton3.isSelected() || jRadioButton4.isSelected()) {
            B1.setEnabled(true);
            B2.setEnabled(true);
            B3.setEnabled(true);
            B4.setEnabled(true);
            B5.setEnabled(true);
            B6.setEnabled(true);
            B10.setEnabled(true);
            B11.setEnabled(true);
            B12.setEnabled(true);
        }

        if (jRadioButton2.isSelected()) {
            dificuldade = 1;
            Teste_difi(dificuldade);
        } else if (jRadioButton3.isSelected()) {
            dificuldade = 2;
            Teste_difi(dificuldade);
        } else if (jRadioButton4.isSelected()) {
            dificuldade = 3;
            Teste_difi(dificuldade);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo_IA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo_IA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo_IA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo_IA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo_IA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
