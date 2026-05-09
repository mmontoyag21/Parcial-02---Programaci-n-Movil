package com.tareas.parcial02parte2.data.remote.repository;

import com.tareas.parcial02parte2.data.remote.api.NewsApi;
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
public final class NewsRepositoryImpl_Factory implements Factory<NewsRepositoryImpl> {
  private final Provider<NewsApi> apiProvider;

  public NewsRepositoryImpl_Factory(Provider<NewsApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public NewsRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static NewsRepositoryImpl_Factory create(Provider<NewsApi> apiProvider) {
    return new NewsRepositoryImpl_Factory(apiProvider);
  }

  public static NewsRepositoryImpl newInstance(NewsApi api) {
    return new NewsRepositoryImpl(api);
  }
}
