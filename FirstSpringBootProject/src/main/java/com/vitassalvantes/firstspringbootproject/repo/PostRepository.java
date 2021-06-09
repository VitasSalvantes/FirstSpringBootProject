package com.vitassalvantes.firstspringbootproject.repo;

import com.vitassalvantes.firstspringbootproject.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
