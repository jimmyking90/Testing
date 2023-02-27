package ca.sheridancollege.owusukej.beans;


import jakarta.persistence.*;

import lombok.*;

	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	@Entity
	@Builder
	
	public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;

}
