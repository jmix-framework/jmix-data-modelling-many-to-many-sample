package io.jmix.petclinic.view.treatmentroom;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import io.jmix.petclinic.entity.visit.TreatmentRoom;
import io.jmix.petclinic.view.main.MainView;


@Route(value = "treatmentRooms", layout = MainView.class)
@ViewController(id = "petclinic_TreatmentRoom.list")
@ViewDescriptor(path = "treatment-room-list-view.xml")
@LookupComponent("treatmentRoomsDataGrid")
@DialogMode(width = "64em")
public class TreatmentRoomListView extends StandardListView<TreatmentRoom> {
}