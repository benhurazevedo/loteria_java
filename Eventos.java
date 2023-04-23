import java.awt.event.*;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Eventos implements ActionListener{
    private String dezenaMaxima, quantDezenasJogo, quantJogos;
    private Formulario formulario;
    public Eventos(Formulario formulario)
    {
        this.formulario = formulario;
        this.formulario.getBotaoJogar().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(!validaFormulario())
            return;
        
        int dezenaMaxima, quantDezenasJogo, quantJogos;
        dezenaMaxima = Integer.parseInt(this.dezenaMaxima);
        quantDezenasJogo = Integer.parseInt(this.quantDezenasJogo);
        quantJogos = Integer.parseInt(this.quantJogos);
            
        GeraJogos geraJogos = new GeraJogos();
        Vector<Vector<Integer>> jogos = geraJogos.geraJogos(dezenaMaxima, quantDezenasJogo, quantJogos);
        String resultado = "";
        for (Vector<Integer> jogo : jogos) {
            resultado +=jogo.toString() + "\n";
        }
        this.formulario.getResultado().setText(resultado);
        this.enviaMensagemAplicativo("Jogo(s) processado(s)!");
    }
    private boolean validaFormulario()
    {
        this.dezenaMaxima = this.formulario.getDezenaMaxima().getText();
        this.quantDezenasJogo = this.formulario.getQuantDezJogo().getText();
        this.quantJogos = this.formulario.getQuantJogos().getText();
        if(!this.dezenaMaxima.matches("^[0-9]{1,2}$"))
        {
            enviaMensagemAplicativo("Preencha o campo dezena máxima!");
            return false;
        }
        if(!this.quantDezenasJogo.matches("^[0-9]{1,2}$"))
        {
            enviaMensagemAplicativo("Preencha o campo quantidade de dezenas por jogo!");
            return false;
        }
        if(!this.quantJogos.matches("^[0-9]{1,2}$"))
        {
            enviaMensagemAplicativo("Preencha o campo quantidade de jogos!");
            return false;
        }
        return true;
    }
    private void enviaMensagemAplicativo(String mensagem)
    {
        JOptionPane.showMessageDialog(this.formulario, mensagem, "mensagem do aplicativo", JOptionPane.INFORMATION_MESSAGE);
    }
}
