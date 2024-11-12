/*TERMINADO
Programa que permite hacer una pila con ArrayList, insertar números, borrar e imprimir el primer dato, así como
imprimir todas las posiciones y sus datos o sólo las posiciones con datos.
Hecho por Ricardo García Félix ISC 4.1*/
package ed14_pila_ricardo;
import java.util.*;

public class ED14_Pila_Ricardo 
{
    static int modNum, busNum;
    public static String us = ""; public static String bus = ""; public static String mod = "";
    public static String nom = "";
    static List lista = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    //------------------------------------------------------------------------------------
    
    public static void insertarDatoP() //TERMINADO
    {
        System.out.print("Dato: ");
        us = leer.next();
        System.out.println();
        
        lista.add(0, us);
    }
    
    //------------------------------------------------------------------------------------
    
    public static void sacarDatoP() //TERMINADO
    {
        if (!lista.isEmpty())
        {
            System.out.println("Se borrará el Dato: " + lista.get(0) + "\n");
            lista.remove(0);
        }
        else
        {
            System.out.println("No hay datos que borrar.\n");
        }
    }
    
    //------------------------------------------------------------------------------------
    
    public static void buscarDatoP() //TERMINADO
    {
        System.out.print("Dato a buscar: ");
        bus = leer.next();
        System.out.println();
        
        if (lista.indexOf(bus) != -1)
        {
            busNum = lista.indexOf(bus); busNum = busNum + 1;
            System.out.println(bus + " está en la posición " + busNum + "\n");
        }
        else
        {
            System.out.println("No hay tal dato dentro de la Pila\n");
        }
    }
    
    //------------------------------------------------------------------------------------
    
    public static void modificarDatoP() //TERMINADO
    {
        System.out.print("Posición del dato a Modificar: ");
        modNum = leer.nextInt(); modNum = modNum - 1;
        
        if (modNum > (lista.size() - 1) || modNum < 0)
        {
            System.out.println("\nNo hay tal posición\n");
        }
        else
        {
            System.out.print("\nNuevo Dato: ");
            mod = leer.next();
            System.out.println("");
        
            lista.set(modNum, mod);
        }
    }
    
    //------------------------------------------------------------------------------------
    
    public static void listarTODOP() //TERMINADO
    {
        System.out.print("Posición      Dato\n");
        for (int x = 0; x < lista.size(); x++)
        {
            System.out.println((x+1) + "             " + lista.get(x));
        }
        System.out.println("");
    }
    
    //------------------------------------------------------------------------------------
    
    public static void listarH() //TERMINADO
    {
        System.out.println("\nPILA horizontal\n");
        for (Object x : lista)
        {
            System.out.print(x + "    ");
        }
        System.out.println("\n");
    }
    
    //------------------------------------------------------------------------------------
    
    public static void sacarDatoNom()
    {
        if (!lista.isEmpty())
            {
                System.out.print("Dato a eliminar: ");
                nom = leer.next();
                
                if (lista.indexOf(nom) != -1)
                {
                    System.out.println("\nSe eleminará " + nom + " de la PILA\n");
                    lista.remove(nom);
                }
                else
                {
                    System.out.println("\nNo hay tal dato dentro de la Pila\n");
                }
            }
            else
            {
                System.out.println("\nNo hay datos que borrar.\n");
            }
    }
   
    //------------------------------------------------------------------------------------
    
    public static void acerca() //TERMINADO
    {
        System.out.println("Hecho por Ricardo García Félix\nISC 4.1\n");
    }
    
    //------------------------------------------------------------------------------------
    
    public static void salir() //TERMINADO
    {
        System.out.println();
    }
   
    //------------------------------------------------------------------------------------
    
    public static void defecto() //TERMINADO
    {
	System.out.println("Opción inválida\n");
    }
    
    //------------------------------------------------------------------------------------

    public static void main(String[] Args)
    {
    //Entrada.
        int opc = 0;
	System.out.println("Este programa permite crear una PILA (ArrayList) y editar el último valor añadido.\n");

	do
	{
            System.out.println("1) Insertar dato en PILA\n2) Sacar dato de PILA\n3) Buscar dato en PILA\n"
                    + "4) Modificar dato en PILA \n5) Listar PILA\n6) Listar PILA Horizontalmente\n"
                    + "7) Sacar dato por Nombre\n8) Acerca de\n9) Salir...\n");
            
            System.out.print("Seleccione una opción...  ");
            opc = leer.nextInt();
            System.out.println();		
    //Proceso.
            switch (opc)
            {

                case 1:
                    insertarDatoP();
                    break;
                    
		case 2:
                    sacarDatoP();
                    break;
			
		case 3:
                    buscarDatoP();
                    break;
                    
		case 4:
                    modificarDatoP();
                    break;
    //Salida                
                case 5:
                    listarTODOP();
                    break;
                    
                case 6:
                    listarH();
                    break;
                    
                case 7:
                    sacarDatoNom();
                    break;
                    
                case 8:
                    acerca();
                    break;
			
		case 9:
                    salir();
                    break;

		default:
                    defecto();
                    break;
            }
        } while (opc != 9);

        System.out.println("Programa terminado.");
	System.out.println("----------------------------------------------------------------------------------------------");
	System.out.println("Hecho por Ricardo García Félix");
    }
    
}