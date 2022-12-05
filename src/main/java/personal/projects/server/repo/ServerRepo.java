package personal.projects.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.projects.server.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
