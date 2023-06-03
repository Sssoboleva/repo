package com.example.sobolevawork.repo;

import com.example.sobolevawork.model.Document;
import com.example.sobolevawork.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findAllByProfile(Profile profile);
}
