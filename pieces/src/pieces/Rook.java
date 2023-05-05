package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la clase Rook heredada de la clase Piece abstracta
 *
 */
public class Rook extends Piece{
	
	//Constructor
	public Rook(String i,String p,int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	//Función de movimiento definida
	public ArrayList<Cell> move(Cell state[][],int x,int y) {
		//La torre solo puede moverse horizontal o verticalmente
		possiblemoves.clear();
		int tempx=x-1;
		while(tempx>=0) {
			if(state[tempx][y].getpiece()==null)
				possiblemoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx--;
		}
		tempx=x+1;
		while(tempx<8) {
			if(state[tempx][y].getpiece()==null)
				possiblemoves.add(state[tempx][y]);
			else if(state[tempx][y].getpiece().getcolor()==this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][y]);
				break;
			}
			tempx++;
		}
		int tempy=y-1;
		while(tempy>=0) {
			if(state[x][tempy].getpiece()==null)
				possiblemoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else {
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy--;
		}
		tempy=y+1;
		while(tempy<8) {
			if(state[x][tempy].getpiece()==null)
				possiblemoves.add(state[x][tempy]);
			else if(state[x][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else {
				possiblemoves.add(state[x][tempy]);
				break;
			}
			tempy++;
		}
		return possiblemoves;
	}
}