
import java.util.List;

// 🔍 Busca Binária
// A Busca Binária é um algoritmo eficiente para encontrar um elemento em uma lista ordenada. Ele funciona dividindo repetidamente a lista ao meio e comparando o elemento buscado com o valor do meio da lista.
// Se o valor do meio for igual ao elemento desejado, a busca termina. Caso contrário, o algoritmo decide se deve continuar a busca na metade esquerda ou direita da lista, descartando metade dos elementos a cada passo.
public class Main {
    public static void main(String[] args) {    
        System.out.println("Value: " + 5 + "\n" + "Index: " + Search(5) + "\n \n");
        System.out.println("Value: " + 8 + "\n" + "Index: " + Search(8) + "\n \n");
    }
    
    public static Integer Search(Integer item) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer low = 0;
        Integer high = list.size();

        while (low <= high) {
            Integer mid = (low + high) / 2;
            Integer value = list.get(mid);

            if (value.equals(item)) {
                return mid;
            }

            if (value < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}