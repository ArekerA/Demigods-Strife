package dane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import kreator.Postac;

/**
 * Klasa do obsługi danych
 * 
 * @author Zespół
 */
public final class Dane {
	
	
	 static ArrayList<Postac> tab = new ArrayList();
     // dodanie elementu (obiektu) do listy
	 /**
	  * Dodaje postać do listy i zapisuje do pliku
	  * @param p Postać
	  */
     public static void dodaj(Postac p){
	 odczyt();
	 tab.add(p);
    
     try {
              ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("a.txt"));
              out.writeObject(tab);
              out.close();
         }
     catch(IOException ioe)
         {
              System.out.println("Error!");
         } 	
     }
     /**
      * Odczyt nazwy postaci
      * @param indeks
      * @return
      */
     public static String odczytimion(int indeks)
     {
    	 return odczyt().get(indeks).getNazwa();
     }
	/**
	 * Odczyt listy postaci
	 * @return
	 */
     public static ArrayList<Postac> odczyt()
     {        
         FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         try {
			tab = (ArrayList<Postac>) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         try {
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println("Zadziałało");
         return tab;
     }
     /**
      * Odczyt pojedynczej postaci
      * @param i
      * @return
      */
     public static Postac odczytp(int i)
     {        
        return tab.get(i);
     }
    /**
     * Wyświetla w konsoli pełną listę postaci
     * @param tab
     * @param size
     */
    static void PokazWszystkie(ArrayList tab, int size){
    	for(int i = 0; i<size; i++)
    	{
    		System.out.println(tab.get(i));
    	}
    }
}
