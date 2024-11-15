package io.jmix.petclinic.entity.insurance;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.petclinic.entity.NamedEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

// tag::class[]
@JmixEntity
@Table(name = "PETCLINIC_INSURANCE_PROVIDER")
@Entity(name = "petclinic_InsuranceProvider")
public class InsuranceProvider extends NamedEntity {
    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "insuranceProvider")
    private List<InsuranceCoverage> policies;

    public List<InsuranceCoverage> getPolicies() {
        return policies;
    }
    public void setPolicies(List<InsuranceCoverage> policies) {
        this.policies = policies;
    }
}
// end::class[]