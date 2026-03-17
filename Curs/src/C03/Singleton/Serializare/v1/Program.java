package C03.Singleton.Serializare.v1;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setState("stare 1");

        try {
            FileOutputStream fos = new FileOutputStream("singleton.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("singleton.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);


            // serializare
            oos.writeObject(s1);

            // deserializare
            Singleton s2 = (Singleton) ois.readObject();

            // verificare stare obj (verific SingletonData)
            if(s1.getState().equals(s2.getState()))
                System.out.println("Acceasi informatie in stare");

            // verificare instante unice
            if (s1 == s2)
                System.out.println("Instante identice");
            else
                System.out.println("Instantele nu sunt identice");

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
