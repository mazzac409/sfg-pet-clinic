package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by chrismazza on 2019-01-24
 **/

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
