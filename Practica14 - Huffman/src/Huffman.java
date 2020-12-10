import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman {

    // Функция для вывода
    public static void printCode(HuffmanNode root, String s)
    {

        // base case. Если потомки left and right не существуют (== null)
        //То это leaf node (узел, лежащий 'внизу' дерева, не имеющий потомков)
        //Его и выводим, пробегаясь по дереву
        if (root.left
                == null
                && root.right
                == null
                && Character.isLetter(root.c)) {

            //"c" - это символ узла, s - шифр Хаффмана
            System.out.println(root.c + ":" + s);

            return;
        }

        // Если перемещаемся влево, то добавляем 0
        // Если перемещаемся вправо, то добавляем 1

        //Рекурсивные вызовы для поддеревьев левого и правого потомков узла
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    // main функция
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        // Вводим кол-во уникальных символов
        int n = 13;
        char[] charArray = { 'п', 'у', 'к', 'и', 'н', 'в','а','с','л','й','р','о','ч'};
        int[] charfreq = { 2, 1, 2, 6, 1, 2,2,1,1,3,1,1,1,1};

        // Создаём приоритетную очередь q
        // через min heap (двоичную кучу)
        PriorityQueue<HuffmanNode> q
                = new PriorityQueue<HuffmanNode>(n, new MyComparator());

        for (int i = 0; i < n; i++) {

            // создёем Huffman node объект...

            HuffmanNode hn = new HuffmanNode();

            hn.c = charArray[i];
            hn.data = charfreq[i];

            hn.left = null;
            hn.right = null;

            //...и добавляем к приоритетной очереди.
            q.add(hn);
        }

        // создаём корневой узел
        HuffmanNode root = null;

        // Извлекаем два минимальных значения из кучи
        // каждый раз, пока её размер не станет 1,
        // т.е. пока все узлы не будут извлечены
        while (q.size() > 1) {

            // первое извлечение
            HuffmanNode x = q.peek();
            q.poll();

            // sвторое
            HuffmanNode y = q.peek();
            q.poll();

            //новый HuffmanNode f, равный...
            HuffmanNode f = new HuffmanNode();

            // ...сумме частот появления двух узлов. Присваиваем значение f узлу.
            f.data = x.data + y.data;
            f.c = '-';

            // Первый извлеченный узел как левый потомок
            f.left = x;

            // Второй извлеченный узел как правый потомок
            f.right = y;

            // Помечаем f узел как корневой узел...
            root = f;

            //...И добавляем его к нашей очереди приоритетов
            q.add(f);
        }

        //Вывод
        printCode(root, "");
    }
}