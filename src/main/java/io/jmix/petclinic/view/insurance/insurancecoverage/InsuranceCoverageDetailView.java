package io.jmix.petclinic.view.insurance.insurancecoverage;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.petclinic.entity.insurance.InsuranceCoverage;
import io.jmix.petclinic.view.main.MainView;

@Route(value = "insuranceCoverages/:id", layout = MainView.class)
@ViewController(id = "petclinic_InsuranceCoverage.detail")
@ViewDescriptor(path = "insurance-coverage-detail-view.xml")
@EditedEntityContainer("insuranceCoverageDc")
public class InsuranceCoverageDetailView extends StandardDetailView<InsuranceCoverage> {
}