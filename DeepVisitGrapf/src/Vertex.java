/**
 * GraphAlgorithms
 * Deep Visiting
 * Created by Ryabenkiy Sergey on 03.07.2015 23:26.
 */
public class Vertex {
    public char label; // метка (например, 'A')
    public boolean wasVisited;

    // ------------------------------------------------------------
    public Vertex(char lab) // Конструктор
    {
        label = lab;
        wasVisited = false;
    }
// ------------------------------------------------------------
}
