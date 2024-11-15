package io.jmix.petclinic.view.insurance.insuranceprovider;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import io.jmix.petclinic.entity.insurance.InsuranceProvider;
import io.jmix.petclinic.view.main.MainView;


@Route(value = "insuranceProviders", layout = MainView.class)
@ViewController(id = "petclinic_InsuranceProvider.list")
@ViewDescriptor(path = "insurance-provider-list-view.xml")
@LookupComponent("insuranceProvidersDataGrid")
@DialogMode(width = "64em")
public class InsuranceProviderListView extends StandardListView<InsuranceProvider> {
}