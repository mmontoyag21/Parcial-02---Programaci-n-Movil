package com.tareas.parcial02parte2.ui.viewmodel;

import com.tareas.parcial02parte2.domain.usecase.GetRecipesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class RecipeViewModel_Factory implements Factory<RecipeViewModel> {
  private final Provider<GetRecipesUseCase> getRecipesUseCaseProvider;

  public RecipeViewModel_Factory(Provider<GetRecipesUseCase> getRecipesUseCaseProvider) {
    this.getRecipesUseCaseProvider = getRecipesUseCaseProvider;
  }

  @Override
  public RecipeViewModel get() {
    return newInstance(getRecipesUseCaseProvider.get());
  }

  public static RecipeViewModel_Factory create(
      Provider<GetRecipesUseCase> getRecipesUseCaseProvider) {
    return new RecipeViewModel_Factory(getRecipesUseCaseProvider);
  }

  public static RecipeViewModel newInstance(GetRecipesUseCase getRecipesUseCase) {
    return new RecipeViewModel(getRecipesUseCase);
  }
}
