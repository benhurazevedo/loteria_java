import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.*;

public class Formulario extends JFrame
{
    private JTextField txtDezenaMaxima, txtQuantDezJogo, txtQuantJogos;
    private JButton botaoJogar, botaoLimpar;
    private JTextArea txtJogos;
    public Formulario ()
    {
        super("Jogue na Loto!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridBagLayout());
        //setSize(300, 400);
        setResizable(false);

        geraLabelDezenaMaxima();
        geraTxtDezenaMaxima();
        geraLabelQuantDezJogo();
        geraTxtQuantDezJogo();
        geraLabelQuantJogos();
        geraTxtQuantJogos();
        geraBotaoLimpar();
        geraBotaoJogar();
        geraTxtAreaJogos();
        this.pack();
    }
    public void tornarVisivel()
    {
        this.setVisible(true);
    }
    private void geraLabelDezenaMaxima()
    {
        JLabel label = new JLabel("Dezena máxima:");
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;

        this.add(label, c);
    }
    private void geraTxtDezenaMaxima()
    {
        txtDezenaMaxima = new JTextField();
        GridBagConstraints c = new GridBagConstraints();

        txtDezenaMaxima.setColumns(2);
        txtDezenaMaxima.setDocument(new JTextFieldLimit(2));

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;

        this.add(txtDezenaMaxima, c);
    }
    private void geraLabelQuantDezJogo()
    {
        JLabel label = new JLabel("Quantidade de dezenas no jogo:");
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;

        this.add(label, c);
    }
    private void geraTxtQuantDezJogo()
    {
        txtQuantDezJogo = new JTextField();
        GridBagConstraints c = new GridBagConstraints();

        txtQuantDezJogo.setColumns(2);
        txtQuantDezJogo.setDocument(new JTextFieldLimit(2));

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;

        this.add(txtQuantDezJogo, c);
    }
    private void geraLabelQuantJogos()
    {
        JLabel label = new JLabel("Quantidade de jogos:");
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;

        this.add(label, c);
    }
    private void geraTxtQuantJogos()
    {
        txtQuantJogos = new JTextField();
        GridBagConstraints c = new GridBagConstraints();

        txtQuantJogos.setColumns(2);
        txtQuantJogos.setDocument(new JTextFieldLimit(2));

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;

        this.add(txtQuantJogos, c);
    }
    private void geraBotaoLimpar()
    {
        botaoLimpar = new JButton("Limpar!");
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;

        this.add(botaoLimpar, c);
        new EventoLimpar(this);
        
    }
    private void geraBotaoJogar()
    {
        botaoJogar = new JButton("Jogar!");
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;

        this.add(botaoJogar, c);
    }
    private void geraTxtAreaJogos()
    {
        txtJogos = new JTextArea();
        txtJogos.setEditable(false);

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.ipady = 40;

        this.add(txtJogos, c);
    }
    public JButton getBotaoJogar()
    {
        return this.botaoJogar;
    }
    public JButton getBotaoLimpar()
    {
        return this.botaoLimpar;
    }
    public JTextField getDezenaMaxima()
    {
        return this.txtDezenaMaxima;
    }
    public JTextField getQuantDezJogo()
    {
        return this.txtQuantDezJogo;
    }
    public JTextField getQuantJogos()
    {
        return this.txtQuantJogos;
    }
    public JTextArea getResultado()
    {
        return this.txtJogos;
    }
}
