package dane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import kreator.Postac;


public final class Dane {
	
	
	 static ArrayList<Postac> tab = new ArrayList();
     // dodanie elementu (obiektu) do listy
     static void dodaj(Postac p){
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
	
     static ArrayList<Postac> odczyt()
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
    
    static void PokazWszystkie(ArrayList tab, int size){
    	for(int i = 0; i<size; i++)
    	{
    		System.out.println(tab.get(i));
    	}
    }
     
    public static void main(String[] args)
    {
    	Postac pierwsza=new Postac();
    	pierwsza.setNazwa("Janusz");
    	pierwsza.setRasa("Ork");
    	pierwsza.setKlasa("Wojownik");
    	Postac druga=new Postac();
    	druga.setNazwa("Jan");
    	druga.setRasa("Człowiek");
    	druga.setKlasa("Wojownik");
    	dodaj(pierwsza);
    	dodaj(druga);
    	odczyt();
    	PokazWszystkie(tab, tab.size());
    	
    }
}
