package io.jmix.petclinic.view.treatmentroom;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.petclinic.entity.visit.TreatmentRoom;
import io.jmix.petclinic.view.main.MainView;

@Route(value = "treatmentRooms/:id", layout = MainView.class)
@ViewController(id = "petclinic_TreatmentRoom.detail")
@ViewDescriptor(path = "treatment-room-detail-view.xml")
@EditedEntityContainer("treatmentRoomDc")
public class TreatmentRoomDetailView extends StandardDetailView<TreatmentRoom> {
}