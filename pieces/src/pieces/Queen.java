package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la clase Reina, heredada de la clase abstracta Pieza.
 *
 * @since 1.0
 * @version 1.0
 */
public class Reina extends Pieza {

    /**
     * Constructor de la clase Reina.
     *
     * @param i el identificador de la pieza
     * @param p la ruta de la imagen de la pieza
     * @param c el color de la pieza (0 para blanco, 1 para negro)
     * @since 1.0
     */
    public Reina(String i, String p, int c) {
        setId(i);
        setPath(p);
        setColor(c);
    }

    /**
     * Función que define el movimiento de la pieza Reina.
     *
     * @param state el estado actual del tablero
     * @param x la posición vertical de la pieza en el tablero
     * @param y la posición horizontal de la pieza en el tablero
     * @return un ArrayList con las celdas a las que la pieza puede moverse
     * @since 1.0
     */
    public ArrayList<Cell> move(Cell state[][], int x, int y) {
        // La reina tiene la mayoría de los movimientos posibles.
        // Puede moverse cualquier cantidad de pasos en las 8 direcciones.
        // Los movimientos posibles de la reina son una combinación de los de la Torre y el Alfil.
        possibleMoves.clear();

        // Comprobación de los movimientos posibles en dirección vertical.
        int tempx = x - 1;
        while (tempx >= 0) {
            if (state[tempx][y].getPieza() == null)
                possibleMoves.add(state[tempx][y]);
            else if (state[tempx][y].getPieza().getColor() == this.getColor())
                break;
            else {
                possibleMoves.add(state[tempx][y]);
                break;
            }
            tempx--;
        }

        tempx = x + 1;
        while (tempx < 8) {
            if (state[tempx][y].getPieza() == null)
                possibleMoves.add(state[tempx][y]);
            else if (state[tempx][y].getPieza().getColor() == this.getColor())
                break;
            else {
                possibleMoves.add(state[tempx][y]);
                break;
            }
            tempx++;
        }

        // Comprobación de los movimientos posibles en dirección horizontal.
        int tempy = y - 1;
        while (tempy >= 0) {
            if (state[x][tempy].getPieza() == null)
                possibleMoves.add(state[x][tempy]);
            else if (state[x][tempy].getPieza().getColor() == this.getColor())
                break;
            else {
                possibleMoves.add(state[x][tempy]);
                break;
            }
            tempy--;
        }

        tempy = y + 1;
        while (tempy < 8) {
            if (state[x][tempy].getPieza() == null)
                possibleMoves.add(state[x][tempy]);
            else if (state[x][tempy].getPieza().getColor() == this.getColor())
                break;
            else {
                possibleMoves.add(state[x][tempy]);
                break;
            }
            tempy++;
        }


		return possiblemoves;
	}
}