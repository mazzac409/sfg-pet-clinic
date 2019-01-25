package guru.springframework.sfgpetclinic.model;

/**
 * Created by chrismazza on 2019-01-17
 **/

public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
