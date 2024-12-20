package io.jmix.petclinic.entity.veterinarian;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.JmixEntity;
import java.util.List;

import io.jmix.petclinic.entity.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@JmixEntity
@Table(name = "PETCLINIC_VETERINARIAN")
@Entity(name = "petclinic_Veterinarian")
public class Veterinarian extends Person {

    @OnDelete(DeletePolicy.CASCADE)
    @JoinTable(
            name = "PETCLINIC_VET_SPECIALTY_LINK",
            joinColumns = @JoinColumn(name = "VETERINARIAN_ID"),
            inverseJoinColumns = @JoinColumn(name = "SPECIALTY_ID")
    )
    @ManyToMany
    private List<Specialty> specialties;

    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }
}
