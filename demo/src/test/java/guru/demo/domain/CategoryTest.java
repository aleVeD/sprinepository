package guru.demo.domain;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

  Category category;
  @Before
  public void setUp(){
    category = new Category();
  }
  @Test
  void getId() {
    Long idValue = 4L;
    category.setId(idValue);
    assertEquals(idValue, category.getId());
  }

  @Test
  void getDescription() {
  }

  @Test
  void getRecipes() {
  }
}