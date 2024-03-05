import java.util.ArrayList;
import java.util.List;

public class Scene {
    List<GameObject> objects = new ArrayList<>();
    Renderer renderer = new Renderer();
    Physics physics = new Physics();

    public void addObject(GameObject object) {
        objects.add(object);
    }

    public void update() {

        physics.simulate(objects);
        renderer.render(objects);
    }
}