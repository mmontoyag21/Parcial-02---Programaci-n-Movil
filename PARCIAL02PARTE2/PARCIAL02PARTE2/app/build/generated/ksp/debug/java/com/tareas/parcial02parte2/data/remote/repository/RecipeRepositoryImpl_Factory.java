package com.tareas.parcial02parte2.data.remote.repository;

import com.tareas.parcial02parte2.data.remote.api.RecipeApi;
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
public final class RecipeRepositoryImpl_Factory implements Factory<RecipeRepositoryImpl> {
  private final Provider<RecipeApi> apiProvider;

  public RecipeRepositoryImpl_Factory(Provider<RecipeApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public RecipeRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static RecipeRepositoryImpl_Factory create(Provider<RecipeApi> apiProvider) {
    return new RecipeRepositoryImpl_Factory(apiProvider);
  }

  public static RecipeRepositoryImpl newInstance(RecipeApi api) {
    return new RecipeRepositoryImpl(api);
  }
}
