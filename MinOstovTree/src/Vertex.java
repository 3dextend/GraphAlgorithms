/**
 * GraphAlgorithms
 * Created by Ryabenkiy Sergey on 04.07.2015 0:27.
 */
public class Vertex {

    public char label; // Метка (например, 'A')
    public boolean wasVisited;

    // -------------------------------------------------------------
    public Vertex(char lab) // Конструктор
    {
        label = lab;
        wasVisited = false;
    }
}
