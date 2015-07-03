/**
 * GraphAlgorithms
 * Created by Ryabenkiy Sergey on 04.07.2015 0:52.
 */
public class DistPar {
    public int distance; // Расстояние от начальной вершины до текущей
    public int parentVert; // Текущий родитель вершины

    // -------------------------------------------------------------
    public DistPar(int pv, int d) // Конструктор
    {
        distance = d;
        parentVert = pv;
    }

}
