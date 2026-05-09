package com.tareas.parcial02parte2.di;

import com.tareas.parcial02parte2.data.remote.api.RecipeApi;
import com.tareas.parcial02parte2.domain.repository.RecipeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideRecipeRepositoryFactory implements Factory<RecipeRepository> {
  private final Provider<RecipeApi> apiProvider;

  public AppModule_ProvideRecipeRepositoryFactory(Provider<RecipeApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public RecipeRepository get() {
    return provideRecipeRepository(apiProvider.get());
  }

  public static AppModule_ProvideRecipeRepositoryFactory create(Provider<RecipeApi> apiProvider) {
    return new AppModule_ProvideRecipeRepositoryFactory(apiProvider);
  }

  public static RecipeRepository provideRecipeRepository(RecipeApi api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRecipeRepository(api));
  }
}
