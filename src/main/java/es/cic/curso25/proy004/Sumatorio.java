package es.cic.curso25.proy004;

public class Sumatorio {
    public void lanzar() {
        int s1[];
        int a = 0;
        
        s1 = new int[10];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = i+1;
        }
        int suma = 0;
        for (int i = 0; i < s1.length; i++) {
            suma += s1[i];
        }

        int suma2 = 0;
        for (int i = s1.length -1; i >= 0; i--) {
            suma += s1[i];
        }
    }
}
