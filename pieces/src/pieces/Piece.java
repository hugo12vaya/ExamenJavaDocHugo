package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * Esta es la clase Piece (Pieza). Es una clase abstracta de la cual todas las piezas reales son heredadas.
 * Define todas las funciones comunes a todas las piezas.
 * La función move() es una función abstracta que debe ser sobrescrita en todas las clases heredadas.
 * Implementa la interfaz Cloneable ya que una copia de la pieza se requiere con frecuencia.
 * 
 * @author Hugo
 * @version 1.0
 * @since 2023-05-05
 */
public abstract class Piece implements Cloneable{

	// Variables miembro
	private int color;
	private String id = null;
	private String path;
	protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();  // Protegido (acceso desde las clases hijas)

	/**
	 * Método abstracto que debe ser sobrescrito en todas las clases heredadas.
	 * 
	 * @param pos Arreglo de celdas del tablero de ajedrez
	 * @param x   La posición x actual de la pieza
	 * @param y   La posición y actual de la pieza
	 * @return Un arreglo de celdas que contienen todos los posibles movimientos de la pieza
	 */
	public abstract ArrayList<Cell> move(Cell pos[][],int x,int y);

	/**
	 * Setter para el id.
	 * 
	 * @param id El id de la pieza
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Setter para la ruta de la imagen de la pieza.
	 * 
	 * @param path La ruta de la imagen de la pieza
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * Setter para el color de la pieza.
	 * 
	 * @param c El color de la pieza
	 */
	public void setColor(int c) {
		this.color = c;
	}

	/**
	 * Getter para la ruta de la imagen de la pieza.
	 * 
	 * @return La ruta de la imagen de la pieza
	 */
	public String getPath() {
		return path;
	}

	/**
	 * Getter para el id de la pieza.
	 * 
	 * @return El id de la pieza
	 */
	public String getId() {
		return id;
	}

	/**
	 * Getter para el color de la pieza.
	 * 
	 * @return El color de la pieza
	 */
	public int getColor() {
		return this.color;
	}

	/**
	 * Función para retornar una copia superficial del objeto. La copia tiene el mismo valor de variable pero una referencia diferente.
	 * 
	 * @return Una copia superficial de la pieza
	 * @throws CloneNotSupportedException Si la clonación no está permitida para el objeto
	 */
	public Piece getCopy() throws CloneNotSupportedException {
		return (Piece) this.clone();
	}
}
