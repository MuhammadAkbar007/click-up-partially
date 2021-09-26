package uz.pdp.clickuppartially.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.clickuppartially.entity.template.AbsUUIDEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Task extends AbsUUIDEntity {
    @Column(nullable = false)
    private String name;

    private String description;


    @ManyToOne
    private Category category;

    @ManyToOne
    private Priority priority;

    @ManyToOne
    private Task parentTask;

    private Timestamp statedDate;

    private boolean startTimeHas;

    private Date dueDate;
    private boolean dueDateHas;

    private Long estimateTime;

    private Date activeDate;
}
