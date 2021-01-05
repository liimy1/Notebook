package com.SEdesign.notebook.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.SEdesign.notebook.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
