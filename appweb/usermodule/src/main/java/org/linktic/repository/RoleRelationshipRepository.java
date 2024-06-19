package org.linktic.repository;

import org.linktic.entity.RolRelationShipEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRelationshipRepository extends JpaRepository<RolRelationShipEntity, Long> {
}
