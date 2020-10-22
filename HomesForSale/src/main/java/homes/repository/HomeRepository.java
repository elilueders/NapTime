package homes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homes.beans.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {

}
