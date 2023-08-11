package com.example.GerenciamentoEscola.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_teacher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeacherModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(length = 50, nullable = false)
  private String name;
  @Column(length = 2, nullable = false)
  private Integer age;

  @ManyToOne
  @JoinColumn(name = "course_id")
  private CourseModel courseModel;

  @Column(nullable = false)
  private Double wage;
}
