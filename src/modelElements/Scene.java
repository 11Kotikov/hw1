package modelElements;

public class Scene {
    int id;
    PoligonalModel models;
    Flash flashes;

    Scene (PoligonalModel model, Flash flash) {
        this.models = model;
        this.flashes = flash;
    }

    Type method1(Type) {}
    Type method1(Type, Type) {}
}
