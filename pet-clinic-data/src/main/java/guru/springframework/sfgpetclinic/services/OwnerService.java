package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * @author flerma
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findBylastName(String lastName);

}
