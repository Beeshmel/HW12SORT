import java.util.Arrays;

    public class QuickSort {
        public static void quickSort(int[] source, int leftBorder, int rightBorder) {
            //(1 = n / 2i - повторяем деление на отрезки необходимое число раз с помощью рекурсии)
            int leftMarker = leftBorder;
            int rightMarker = rightBorder;
            int pivot = source[(leftMarker + rightMarker) / 2];

            do {
                // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
                while (source[leftMarker] < pivot) {
                    leftMarker++;//O(n)+
                }
                // Двигаем правый маркер, пока элемент больше, чем pivot
                while (source[rightMarker] > pivot) {
                    rightMarker--; //O(n)+
                }
                // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
                if (leftMarker <= rightMarker) {
                    // Левый маркер будет меньше правого только если мы должны выполнить swap
                    if (leftMarker < rightMarker) {
                        int tmp = source[leftMarker];
                        source[leftMarker] = source[rightMarker];
                        source[rightMarker] = tmp;
                    }
                    // Сдвигаем маркеры, чтобы получить новые границы
                    leftMarker++;
                    rightMarker--;  //O(n)+
                }
            } while (leftMarker <= rightMarker); //= O(n)*

            // Выполняем рекурсивно для частей
            if (leftMarker < rightBorder) {
                quickSort(source, leftMarker, rightBorder);   // O(log( n ))    1 = n / 2i   (i = log( n ))+
            }
            if (leftBorder < rightMarker) {
                quickSort(source, leftBorder, rightMarker); // O(log( n ))    1 = n / 2i   (i = log( n ))+
            }
        }

        // n + 2(n/2) + 4(n/4) + ... + n(n/n) = n + n + ... + n = n * k = n * log2n
        public static void main(String[] args) {
            int[] x = { 8, 10, 4, 7, 3, -7, 10, 12, -3,-23,56,-2,34,1,-2 };
            System.out.println("Было");
            System.out.println(Arrays.toString(x));

            int first = 0;
            int size = x.length - 1;

            quickSort(x, first, size);
            System.out.println("Стало");
            System.out.println(Arrays.toString(x));
        }
    }

