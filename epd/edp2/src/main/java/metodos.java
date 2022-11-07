import org.apache.commons.lang3.ArrayUtils;

public class metodos {

    public static void main(String[] args) {
        System.out.println(cadenaRandom(10));
        System.out.println(alfanumerico(5));
        System.out.println(ArrayUtils.toString(array(5, 8)));
    }

    public static String cadenaRandom(int l) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String cadena = "";
        for (int x = 0; x < l; x++) {
            int random = (int) (Math.random() * (caracteres.length() - 1) + 1);
            char caracterRandom = caracteres.charAt(random);
            cadena += caracterRandom;
        }
        return cadena;
    }

    public static String alfanumerico(int l) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String cadena = "";
        for (int x = 0; x < l; x++) {
            int random = (int) (Math.random() * (caracteres.length() - 1) + 1);
            char caracterRandom = caracteres.charAt(random);
            cadena += caracterRandom;
        }
        return cadena;

    }

    public static String[] array(int l, int c) {
        String[] cadena = new String[l];
        for (int x = 0; x < l; x++) {
            cadena[x] = cadenaRandom(c);
        }
        return cadena;
    }

    public static String[] copiaArrayInverso(String[] cadena) {
        String[] copia = ArrayUtils.clone(cadena);
        ArrayUtils.reverse(copia);
        return copia;
    }

}
