package io.jmix.petclinic.entity.veterinarian;

import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.petclinic.entity.NamedEntity;
import io.jmix.petclinic.entity.visit.Visit;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@JmixEntity
@Table(name = "PETCLINIC_SPECIALTY")
@Entity(name = "petclinic_Specialty")
public class Specialty extends NamedEntity {
    @ManyToMany(mappedBy = "requiredSpecialities")
    private List<Visit> visits;

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }
}