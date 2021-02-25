
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int LITERAL_4 = 4;
    private static final int LITERAL_2 = 2;
    
    public void generateStarWarsName(String nombre, String apellido, String apellidoMadre, String ciudad) 
    {
        String sub1 = apellido.substring(0, LITERAL_4);
        String sub2 = nombre.substring(0, LITERAL_2+1);
        String sub3 = apellidoMadre.substring(0, LITERAL_2);
        String sub4 = ciudad.substring(0, LITERAL_4+1);
        System.out.println(sub1 + sub2 + " " + sub3 + sub4);
    }
}
