package busquedasecuencial;

/**
 *
 * @author Eduardo
 */
public class BusqSecuencial { //Clase

    public int busquedaSecuencial(int arreglo[], int elemento) {//Método de entero que recibe como parámetro un arreglo y elemento
        int i;
        boolean encontrado = false;
        for (i = 0; i < arreglo.length && encontrado == false; i++) { //Recorrido del arreglo
            if (elemento == arreglo[i]) {
                encontrado = true;
                return i;
            }
        }
        return -1; //Retornando -1
    }

    public void mostrarArreglo(int[] arreglo) { //Método mostrarArreglo
        int k;
        for (k = 0; k < arreglo.length; k++) { //Recorrido del arreglo
            System.out.println("[" + arreglo[k] + "]"); 
        }
        System.out.println();
    }
}
