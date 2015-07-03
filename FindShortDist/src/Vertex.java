/**
 * GraphAlgorithms
 * Created by Ryabenkiy Sergey on 04.07.2015 0:53.
 */
public class Vertex {
    public char label; // Метка (например, 'A')
    public boolean isInTree;
    // -------------------------------------------------------------
    public Vertex(char lab) // Конструктор
    {
        label = lab;
        isInTree = false;
    }
}
