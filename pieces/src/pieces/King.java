package pieces;

import java.util.ArrayList;

import chess.Cell;

public class King extends Piece{
	
	private int x, y; // Variables adicionales para King para hacer un seguimiento de la posición del rey
	
	/**
	 * Constructor para King
	 * 
	 * @param i Identificador de la pieza
	 * @param p Ruta de la imagen de la pieza
	 * @param c Color de la pieza
	 * @param x Posición x del rey
	 * @param y Posición y del rey
	 */
	public King(String i, String p, int c, int x, int y){
		setx(x);
		sety(y);
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	/**
	 * Funciones de acceso a los valores generales
	 */
	
	/**
	 * Establece la posición x del rey
	 * 
	 * @param x Posición x del rey
	 */
	public void setx(int x){
		this.x = x;
	}
	
	/**
	 * Establece la posición y del rey
	 * 
	 * @param y Posición y del rey
	 */
	public void sety(int y){
		this.y = y;
	}
	
	/**
	 * Obtiene la posición x del rey
	 * 
	 * @return Posición x del rey
	 */
	public int getx(){
		return x;
	}
	
	/**
	 * Obtiene la posición y del rey
	 * 
	 * @return Posición y del rey
	 */
	public int gety(){
		return y;
	}
	
	/**
	 * Función de movimiento para King, reemplaza a la función move() de Piece
	 * 
	 * @param state Estado actual del tablero de ajedrez
	 * @param x Posición x a la que se desea mover el rey
	 * @param y Posición y a la que se desea mover el rey
	 * @return ArrayList de Cell que representan los posibles movimientos del rey
	 */
	public ArrayList<Cell> move(Cell state[][], int x, int y){
		// El rey solo puede moverse un paso, por lo que se han considerado todas las 8 celdas adyacentes
		possiblemoves.clear();
		int posx[]={x,x,x+1,x+1,x+1,x-1,x-1,x-1};
		int posy[]={y-1,y+1,y-1,y,y+1,y-1,y,y+1};
		for(int i=0;i<8;i++)
			if((posx[i]>=0&&posx[i]<8&&posy[i]>=0&&posy[i]<8))
				if((state[posx[i]][posy[i]].getpiece()==null||state[posx[i]][posy[i]].getpiece().getcolor()!=this.getcolor()))
					possiblemoves.add(state[posx[i]][posy[i]]);
		return possiblemoves;
	}
	
/**
 * Determina si la pieza está en peligro de ser atacada por otra pieza.
 * 
 * @param state un array de dos dimensiones que representa el tablero actual
 * @return true si la pieza está en peligro, false en caso contrario
 */
public boolean isindanger(Cell state[][]) {
    // Comprobando si la pieza está amenazada desde la izquierda, derecha, arriba y abajo
    for (int i = x + 1; i < 8; i++) {
        if (state[i][y].getpiece() == null) {
            continue;
        } else if (state[i][y].getpiece().getcolor() == this.getcolor()) {
            break;
        } else {
            if ((state[i][y].getpiece() instanceof Rook) || (state[i][y].getpiece() instanceof Queen)) {
                return true;
            } else {
                break;
            }
        }
    }
    for (int i = x - 1; i >= 0; i--) {
        if (state[i][y].getpiece() == null) {
            continue;
        } else if (state[i][y].getpiece().getcolor() == this.getcolor()) {
            break;
        } else {
            if ((state[i][y].getpiece() instanceof Rook) || (state[i][y].getpiece() instanceof Queen)) {
                return true;
            } else {
                break;
            }
        }
    }
    for (int i = y + 1; i < 8; i++) {
        if (state[x][i].getpiece() == null) {
            continue;
        } else if (state[x][i].getpiece().getcolor() == this.getcolor()) {
            break;
        } else {
            if ((state[x][i].getpiece() instanceof Rook) || (state[x][i].getpiece() instanceof Queen)) {
                return true;
            } else {
                break;
            }
        }
    }
    for (int i = y - 1; i >= 0; i--) {
        if (state[x][i].getpiece() == null) {
            continue;
        } else if (state[x][i].getpiece().getcolor() == this.getcolor()) {
            break;
        } else {
            if ((state[x][i].getpiece() instanceof Rook) || (state[x][i].getpiece() instanceof Queen)) {
                return true;
            } else {
                break;
            }
        }
    }

    // Comprobando si la pieza está amenazada en diagonal
    int tempx = x + 1, tempy = y - 1;
    while (tempx < 8 && tempy >= 0) {
        if (state[tempx][tempy].getpiece() == null) {
            tempx++;
            tempy--;
        } else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor()) {
            break;
        } else {
            if (state[tempx][tempy].getpiece() instanceof Bishop || state[tempx][tempy].getpiece() instanceof Queen) {
                return true;
            } else {
                break;
            }
        }
    }
    tempx = x - 1;
    tempy = y + 1;
    while (tempx >= 0 && tempy < 8
))
					if(state[pox[i]][poy[i]].getpiece()!=null && state[pox[i]][poy[i]].getpiece().getcolor()!=this.getcolor() && (state[pox[i]][poy[i]].getpiece() instanceof King))
					{
						return true;
					}
		}
		if(getcolor()==0)
		{
			if(x>0&&y>0&&state[x-1][y-1].getpiece()!=null&&state[x-1][y-1].getpiece().getcolor()==1&&(state[x-1][y-1].getpiece() instanceof Pawn))
				return true;
			if(x>0&&y<7&&state[x-1][y+1].getpiece()!=null&&state[x-1][y+1].getpiece().getcolor()==1&&(state[x-1][y+1].getpiece() instanceof Pawn))
				return true;
		}
		else
		{
			if(x<7&&y>0&&state[x+1][y-1].getpiece()!=null&&state[x+1][y-1].getpiece().getcolor()==0&&(state[x+1][y-1].getpiece() instanceof Pawn))
				return true;
			if(x<7&&y<7&&state[x+1][y+1].getpiece()!=null&&state[x+1][y+1].getpiece().getcolor()==0&&(state[x+1][y+1].getpiece() instanceof Pawn))
				return true;
		}
    	return false;
    }
}