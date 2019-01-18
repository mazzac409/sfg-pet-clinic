package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by chrismazza on 2019-01-17
 **/

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthdate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
