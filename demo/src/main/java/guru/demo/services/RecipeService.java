package guru.demo.services;

import guru.demo.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
  Set<Recipe> getRecipes();
}
