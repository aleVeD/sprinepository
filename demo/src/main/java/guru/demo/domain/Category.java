package guru.demo.domain;

import javax.persistence.*;
import java.util.Set;

import lombok.*;

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String description;

  @ManyToMany(mappedBy = "categories")
  private Set<Recipe> recipes;

}
