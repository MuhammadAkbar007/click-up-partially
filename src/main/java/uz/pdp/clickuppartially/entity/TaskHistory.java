package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.template.AbsUUIDEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class TaskHistory extends AbsUUIDEntity {
    @ManyToOne
    private Task task;

    private String changeFieldName;

    private String before;
    private String after;
    private Date date;
}
