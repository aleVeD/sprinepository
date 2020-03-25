package guru.demo.services;

import guru.demo.domain.Recipe;
import guru.demo.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

  private final RecipeRepository recipeRepository;

  public RecipeServiceImpl(RecipeRepository recipeRepository) {
    log.debug("in the service recipe");
    this.recipeRepository = recipeRepository;
  }


  @Override
  public Set<Recipe> getRecipes() {
    Set<Recipe> recipes = new HashSet<>();
    recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
    return recipes;
  }
}
