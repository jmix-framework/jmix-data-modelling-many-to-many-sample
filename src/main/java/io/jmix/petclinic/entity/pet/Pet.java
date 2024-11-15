package io.jmix.petclinic.entity.pet;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.petclinic.entity.NamedEntity;
import io.jmix.petclinic.entity.insurance.InsuranceCoverage;
import io.jmix.petclinic.entity.owner.Owner;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

// tag::start-class[]
@JmixEntity
@Table(name = "PETCLINIC_PET")
@Entity(name = "petclinic_Pet")
public class Pet extends NamedEntity {

    // ...
    // end::start-class[]

    @Column(name = "IDENTIFICATION_NUMBER", nullable = false)
    @NotNull
    private String identificationNumber;

    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;

    @JoinColumn(name = "TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PetType type;

    @JoinColumn(name = "OWNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Owner owner;


    // tag::insurance-coverages[]
    @OnDelete(DeletePolicy.CASCADE)
    @Composition
    @OneToMany(mappedBy = "policyHolder")
    private List<InsuranceCoverage> insuranceCoverages;

    public List<InsuranceCoverage> getInsuranceCoverages() {
        return insuranceCoverages;
    }

    public void setInsuranceCoverages(List<InsuranceCoverage> insuranceCoverages) {
        this.insuranceCoverages = insuranceCoverages;
    }
    // end::insurance-coverages[]

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

// tag::end-class[]
}
// end::end-class[]