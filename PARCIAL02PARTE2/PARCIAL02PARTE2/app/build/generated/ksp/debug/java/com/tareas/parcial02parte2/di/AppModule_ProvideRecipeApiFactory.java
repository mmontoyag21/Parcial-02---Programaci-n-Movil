package com.tareas.parcial02parte2.di;

import com.tareas.parcial02parte2.data.remote.api.RecipeApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class AppModule_ProvideRecipeApiFactory implements Factory<RecipeApi> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvideRecipeApiFactory(Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public RecipeApi get() {
    return provideRecipeApi(okHttpClientProvider.get());
  }

  public static AppModule_ProvideRecipeApiFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvideRecipeApiFactory(okHttpClientProvider);
  }

  public static RecipeApi provideRecipeApi(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRecipeApi(okHttpClient));
  }
}
