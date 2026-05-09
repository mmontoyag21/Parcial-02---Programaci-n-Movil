package com.tareas.parcial02parte2.domain.usecase;

import com.tareas.parcial02parte2.domain.repository.RecipeRepository;
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
public final class GetRecipesUseCase_Factory implements Factory<GetRecipesUseCase> {
  private final Provider<RecipeRepository> repositoryProvider;

  public GetRecipesUseCase_Factory(Provider<RecipeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetRecipesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetRecipesUseCase_Factory create(Provider<RecipeRepository> repositoryProvider) {
    return new GetRecipesUseCase_Factory(repositoryProvider);
  }

  public static GetRecipesUseCase newInstance(RecipeRepository repository) {
    return new GetRecipesUseCase(repository);
  }
}
