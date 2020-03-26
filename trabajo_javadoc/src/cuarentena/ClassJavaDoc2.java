package cuarentena;
/**

 * Esta clase ha sido creada rapidamente como practica de la creacxi�n de un JavaDoc

 * @author: �lvaro Mois�s Inocente S�enz

 * @version: 19/03/2020/A

 * @see <a href = "https://github.com/Moises0102" /> Mi pagina GitHub</a>

 */
public class ClassJavaDoc2 {

	
	
	//atributos de la clase
	/** atributos declarados con su valor por defecto
	 */
	private int atributo1 = 0;
	private double atributo2 = 0;
	private float atributo3 = 0;
	private String atributo4 = null;
	private char atributo5 = (Character) null;
	private boolean atributo6 = false;

	//constructores de la clase
	/**
	 *Estos constructores son b�sicos 
	 */
	public ClassJavaDoc2(){

	}
	public ClassJavaDoc2(int atributo1, double atributo2, float atributo3){
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;

	}
	public ClassJavaDoc2(int atributo1, double atributo2, float atributo3, String atributo4, char atributo5, boolean atributo6){
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
		this.atributo4 = atributo4;
		this.atributo5 = atributo5;
		this.atributo6 = atributo6;
	}
	/**metodos
	 * Son los metodos getters and setters generados automaticamente
	 */
	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}
	public double getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(double atributo2) {
		this.atributo2 = atributo2;
	}
	public float getAtributo3() {
		return atributo3;
	}
	public void setAtributo3(float atributo3) {
		this.atributo3 = atributo3;
	}
	public String getAtributo4() {
		return atributo4;
	}
	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}
	public char getAtributo5() {
		return atributo5;
	}
	public void setAtributo5(char atributo5) {
		this.atributo5 = atributo5;
	}
	public boolean isAtributo6() {
		return atributo6;
	}
	public void setAtributo6(boolean atributo6) {
		this.atributo6 = atributo6;
	} //Cierre del m�todo

} //Cierre de la clase y del ejemplo aprenderaprogramar.com