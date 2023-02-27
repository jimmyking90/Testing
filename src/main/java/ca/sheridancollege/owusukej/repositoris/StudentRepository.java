package ca.sheridancollege.owusukej.repositoris;
import ca.sheridancollege.owusukej.beans.*;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

	public interface StudentRepository extends CrudRepository<Student, Long> {}




