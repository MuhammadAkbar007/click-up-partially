package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.template.AbsUUIDEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class TaskAttachment extends AbsUUIDEntity {
    @OneToOne
    private Task task;

    @OneToOne
    private Attachment attachment;

    private boolean pinCoverImage;
}
