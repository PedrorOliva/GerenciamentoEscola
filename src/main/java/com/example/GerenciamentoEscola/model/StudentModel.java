package com.example.GerenciamentoEscola.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(length = 50, nullable = false)
  private String name;
  @Column(length = 2, nullable = false)
  private Integer age;
  @Column(length = 25, nullable = false)
  private String email;

}
