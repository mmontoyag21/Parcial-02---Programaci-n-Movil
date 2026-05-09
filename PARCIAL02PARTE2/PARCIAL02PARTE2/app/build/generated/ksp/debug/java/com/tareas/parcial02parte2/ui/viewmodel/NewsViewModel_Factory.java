package com.tareas.parcial02parte2.ui.viewmodel;

import com.tareas.parcial02parte2.domain.usecase.GetTopHeadlinesUseCase;
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
public final class NewsViewModel_Factory implements Factory<NewsViewModel> {
  private final Provider<GetTopHeadlinesUseCase> getTopHeadlinesUseCaseProvider;

  public NewsViewModel_Factory(Provider<GetTopHeadlinesUseCase> getTopHeadlinesUseCaseProvider) {
    this.getTopHeadlinesUseCaseProvider = getTopHeadlinesUseCaseProvider;
  }

  @Override
  public NewsViewModel get() {
    return newInstance(getTopHeadlinesUseCaseProvider.get());
  }

  public static NewsViewModel_Factory create(
      Provider<GetTopHeadlinesUseCase> getTopHeadlinesUseCaseProvider) {
    return new NewsViewModel_Factory(getTopHeadlinesUseCaseProvider);
  }

  public static NewsViewModel newInstance(GetTopHeadlinesUseCase getTopHeadlinesUseCase) {
    return new NewsViewModel(getTopHeadlinesUseCase);
  }
}
