package com.project.pojos;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User extends BaseClass {

	@Column(length = 30, nullable = false)
	private String name;

	@Column(length = 50, nullable = false, unique = true)
	private String email;

	@Column(length = 50, nullable = false)
	private String password;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(nullable = false)
	private int age;

	@Column(nullable = false)
	private double height;

	@Column(nullable = false)
	private double weight;

	@Column(columnDefinition = "varchar(10) DEFAULT 'MEMBER'")
	private String role;

	@Column(columnDefinition = "varchar(10) DEFAULT 'ACTIVE'")
	private String status;

	@ManyToOne
	@JoinColumn(name = "membership_id")
	private Membership membershipId;

	@ManyToOne
	@JoinColumn(name = "trainer_id")
	private Trainer personalTrainerId;
	
	@ManyToOne
	@JoinColumn(name = "workout_plan_id")
	private WorkoutPlan workoutPlanId;
	
	@ManyToOne
	@JoinColumn(name = "diet_plan_id")
	private DietPlan dietPlanId;

	@ManyToOne
	@JoinColumn(name = "class_id")
	private Classes classId;
	
}
