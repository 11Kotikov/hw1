package inMemoryModel;

import modelElements.Camera;
import modelElements.Flash;
import modelElements.PoligonalModel;
import modelElements.Scene;

public class ModelStore implements IModelChanger {
PoligonalModel models;
Scene scenes;
Flash flashes;
Camera cameras;
private IModelChangedObserver changedObserver;

ModelStore () {
    this.cameras = new Camera();
    this.flashes = new Flash();
    this.scenes = new Scene();
    this.models = new PoligonalModel();
}

Scene getScena(Int) {

}

notifyChange(IModelChanger) {

}

}
