package guru.demo.controllers;

import guru.demo.services.RecipeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.*;

public class IndexControllerTest {

  @Mock
  RecipeService recipeService;

  @Mock
  Model model;

  IndexController indexController;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    indexController = new IndexController(recipeService);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void getIndexPage() {
    String viewName = indexController.getIndexPage(model);
    assertEquals("index", viewName);
  }
}