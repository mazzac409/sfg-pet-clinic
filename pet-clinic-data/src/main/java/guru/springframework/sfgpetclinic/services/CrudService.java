package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by chrismazza on 2019-01-26
 **/

public interface CrudService<T, ID>  {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
