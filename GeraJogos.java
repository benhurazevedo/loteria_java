import java.util.Random;
import java.util.Vector;
import java.util.Collections;
import java.lang.Math;

public class GeraJogos
{
    public GeraJogos()
    {
        this.gerador = new Random();
    }
    private Random gerador;
    public int GeraRandomico(int dezenaMaxima)
    {
        /*
        int resultado;
         
        do
        {
            resultado = gerador.nextInt();
            if(resultado > 0 && resultado <= dezenaMaxima)
                return resultado;
        } while(true);
        */
        return Math.abs(gerador.nextInt() % (dezenaMaxima + 1));
    }
    public Vector<Integer> geraJogo(int dezenaMaxima, int quantidadeDezenas)
    {
        Vector<Integer> jogo = new Vector<Integer>(0, 1);
        int dezena;
        while(true)
        {
            dezena = this.GeraRandomico(dezenaMaxima);
            if(!jogo.contains(dezena))
                jogo.add(dezena);
            
            if(quantidadeDezenas == jogo.size())
            {
                Collections.sort(jogo);
                return jogo;
            } 
        }

    }
    Vector<Vector<Integer>> geraJogos(int dezenaMaxima, int quantidadeDezenas, int quantidadeJogos)
    {
        Vector<Vector<Integer>> jogos = new Vector<Vector<Integer>>(0,1);
        Vector<Integer> jogo;
        while(true)
        {
            jogo = this.geraJogo(dezenaMaxima, quantidadeDezenas);
            if(!jogos.contains(jogo))
                jogos.add(jogo);
            
            if(quantidadeJogos == jogos.size())
            {
                return jogos;
            } 
        }
    }
}