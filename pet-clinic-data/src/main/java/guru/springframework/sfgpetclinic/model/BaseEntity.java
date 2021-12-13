package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author flerma
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
}
