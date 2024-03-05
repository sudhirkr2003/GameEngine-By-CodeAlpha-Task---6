import java.util.List;

public class Physics {
    public void simulate(List<GameObject> objects) {
        System.out.println("Simulating physics in the 3D scene...");

        for (GameObject object : objects) {

            object.position.y -= 0.1;
        }
    }
}