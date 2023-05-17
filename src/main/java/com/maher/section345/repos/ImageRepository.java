package com.maher.section345.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maher.section345.entities.Image;
public interface ImageRepository extends JpaRepository<Image , Long> {
}
