import java.util.ArrayList;
import java.util.List;

public class SimpleGameEngine {
    public static void main(String[] args) {

        Scene scene = new Scene();

        GameObject object1 = new GameObject(new Vector3D(0, 0, 0));
        GameObject object2 = new GameObject(new Vector3D(1, 1, 1));

        scene.addObject(object1);
        scene.addObject(object2);

        for (int i = 0; i < 100; i++) {

            scene.update();
        }
    }
}
	