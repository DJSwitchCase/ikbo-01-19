import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

// Этот класс нужен для представления каждого из узлов, входящих в бинарное дерево Хаффмана
class HuffmanNode {

    int data;
    char c;

    HuffmanNode left;
    HuffmanNode right;
}

// Comparator класс нужен для сравнения двух узлов на основании какого-либо их свойства
// В данном случае сравнивать будем по значению (свойство data)
class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y)
    {

        return x.data - y.data;
    }
} 