package uz.pdp.clickuppartially.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.clickuppartially.entity.Attachment;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
