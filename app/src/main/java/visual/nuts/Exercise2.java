package visual.nuts;

import java.util.*;
import java.util.stream.Stream;

import static com.google.common.base.Strings.isNullOrEmpty;


public class Exercise2 {

  private final List<Country> countries;

  public Exercise2(List<Country> countries) {
    Objects.requireNonNull(countries);
    this.countries = countries;
  }

  public Integer countCountries() {
    return countries.size();
  }

  public Country getCountryMaxLanguagesIncluding(String language) {

    Stream<Country> stream = countries.stream();

    if (!isNullOrEmpty(language)) {
      stream = stream.filter(country -> country.getLanguages().contains(language));
    }

    return stream
        .reduce((country1, country2) -> {
          if (country1.getLanguages().size() >= country2.getLanguages().size()) {
            return country1;
          }
          return country2;
        })
        .get();
  }

  private Set<String> getAllLanguages() {
    Set<String> allLanguages = new HashSet<>();
    for (int i = 0; i < countries.size(); i++) {
      Country country = countries.get(i);
      allLanguages.addAll(country.getLanguages());
    }
    return allLanguages;
  }

  public long countAllOfficialLanguages() {
    return getAllLanguages().size();
  }

  public Country getCountryMaxLanguages() {
    return getCountryMaxLanguagesIncluding(null);
  }

  public String findMostCommonOfficialLanguage() {
    Set<String> allLanguages = getAllLanguages();

    List<String> collect = countries.stream()
        .flatMap(country -> country.getLanguages().stream())
        .toList();

    int count = 0;
    String lang = null;

    for (String language : allLanguages) {

      int frequency = Collections.frequency(collect, language);

      if (frequency > count) {
        count = frequency;
        lang = language;
      }
    }

    return lang;

  }

  //    - to find the country with the highest number of official languages.



}
