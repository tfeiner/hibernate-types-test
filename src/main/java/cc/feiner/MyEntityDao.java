package cc.feiner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityDao extends JpaRepository<MyEntity, Long> {

}
