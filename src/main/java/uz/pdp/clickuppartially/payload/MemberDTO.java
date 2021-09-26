package uz.pdp.clickuppartially.payload;

import lombok.Data;
import uz.pdp.clickuppartially.entity.enums.AddType;

import java.util.UUID;

@Data
public class MemberDTO {
    private UUID id;

    private UUID roleId;

    private AddType addType;//ADD, EDIT, REMOVE
}
