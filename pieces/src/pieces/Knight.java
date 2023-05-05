package pieces;

import java.util.ArrayList;
import chess.Cell;

/**
 * Esta es la clase Knight, que hereda de la clase Piece.
 * Representa a una pieza de ajedrez "caballo".
 */
public class Knight extends Piece{

    /**
     * Constructor de la clase Knight.
     * 
     * @param i el identificador de la pieza.
     * @param p la ruta de la imagen asociada a la pieza.
     * @param c el color de la pieza.
     */
    public Knight(String i,String p,int c)
    {
        setId(i);
        setPath(p);
        setColor(c);
    }

    /**
     * Método para calcular los posibles movimientos de un caballo en el tablero.
     * 
     * @param state el estado actual del tablero.
     * @param x la fila actual de la pieza.
     * @param y la columna actual de la pieza.
     * @return un ArrayList con las celdas a las que el caballo puede moverse.
     */
    public ArrayList<Cell> move(Cell state[][],int x,int y)
    {
        possiblemoves.clear();
        int posx[]={x+1,x+1,x+2,x+2,x-1,x-1,x-2,x-2};
        int posy[]={y-2,y+2,y-1,y+1,y-2,y+2,y-1,y+1};
        for(int i=0;i<8;i++)
            if((posx[i]>=0&&posx[i]<8&&posy[i]>=0&&posy[i]<8))
                if((state[posx[i]][posy[i]].getpiece()==null||state[posx[i]][posy[i]].getpiece().getcolor()!=this.getcolor()))
                {
                    possiblemoves.add(state[posx[i]][posy[i]]);
                }
        return possiblemoves;
    }
}
