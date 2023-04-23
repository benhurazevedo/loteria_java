import java.awt.event.*;

class EventoLimpar implements ActionListener
{
    private Formulario f;
    public EventoLimpar(Formulario formulario)
    {
        f = formulario;
        f.getBotaoLimpar().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        f.getDezenaMaxima().setText("");
        f.getQuantDezJogo().setText("");
        f.getQuantJogos().setText("");
        f.getResultado().setText("");
    }
    
}
