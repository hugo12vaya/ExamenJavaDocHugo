package pieces;

import java.util.ArrayList;

import chess.Cell;


/**
 * This is the Bishop Class.
 * The Move Function defines the basic rules for movement of Bishop on a chess board
 * 
 *
 */
public class Bishop extends Piece{
	
	//Constructor
	public Bishop(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	//move function defined. It returns a list of all the possible destinations of a Bishop
	//The basic principle of Bishop Movement on chess board has been implemented
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Bishop can Move diagonally in all 4 direction (NW,NE,SW,SE)
		//This function defines that logic
		possiblemoves.clear();
		int tempx=x+1,tempy=y-1;
		while(tempx<8&&tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
			{
				possiblemoves.add(state[tempx][tempy]);
			}
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}
		tempx=x-1;tempy=y+1;
		while(tempx>=0&&tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}
		tempx=x-1;tempy=y-1;
		while(tempx>=0&&tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}
		tempx=x+1;tempy=y+1;
		while(tempx<8&&tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return possiblemoves;
	}
}package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la clase Alfil.
 * La función move define las reglas básicas para el movimiento del Alfil en un tablero de ajedrez.
 */
public class Bishop extends Piece {

	/**
	 * Constructor de la clase Alfil.
	 * @param i Identificador de la pieza.
	 * @param p Ruta de la imagen de la pieza.
	 * @param c Color de la pieza.
	 */
	public Bishop(String i, String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}

	/**
	 * Función move. Retorna una lista de todos los posibles destinos de un Alfil.
	 * Implementa los principios básicos del movimiento de un Alfil en un tablero de ajedrez.
	 * @param state Matriz que representa el estado actual del tablero.
	 * @param x Posición x de la pieza en el tablero.
	 * @param y Posición y de la pieza en el tablero.
	 * @return Una lista de objetos Cell que contienen las posiciones posibles a las que puede moverse el Alfil.
	 */
	public ArrayList<Cell> move(Cell state[][], int x, int y) {
		// El Alfil puede moverse en diagonal en las cuatro direcciones (NO, NE, SO, SE).
		// Esta función define esa lógica.
		possiblemoves.clear();
		int tempx = x + 1, tempy = y - 1;
		while (tempx < 8 && tempy >= 0) {
			if (state[tempx][tempy].getpiece() == null) {
				possiblemoves.add(state[tempx][tempy]);
			} else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}
		tempx = x - 1;
		tempy = y + 1;
		while (tempx >= 0 && tempy < 8) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}
		tempx = x - 1;
		tempy = y - 1;
		while (tempx >= 0 && tempy >= 0) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
				break;
			else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}
		tempx = x + 1;
		tempy = y + 1;
		while (tempx < 8 && tempy < 8) {
			if (state[tempx][tempy].getpiece() == null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return possiblemoves;
	}
}
