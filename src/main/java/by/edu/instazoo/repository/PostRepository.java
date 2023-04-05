package by.edu.instazoo.repository;

import by.edu.instazoo.entity.Post;
import by.edu.instazoo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByUserOrderByCreationDateDesc(User user);

    List<Post> findAllByOrderByCreationDateDesc();

    Optional<Post> findByIdAndUser(Long id, User user);

}
