package visual.nuts;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

  @Test
  @DisplayName("returns the number of countries in the world")
  void countCountries() {
    var exercise = new Exercise2(CountryHelper.create1());
    assertEquals(5,  exercise.countCountries());
    exercise = new Exercise2(CountryHelper.create2());
    assertEquals(5,  exercise.countCountries());
  }

  @Test
  @DisplayName("finds the country with the most official languages, where they officially speak (not only) German (de")
  void getCountryMaxLanguagesIncluding() {
    var exercise = new Exercise2(CountryHelper.create1());
    Country country = exercise.getCountryMaxLanguagesIncluding("fy");
    assertEquals(2, country.getLanguages().size());
    assertEquals("NL", country.getCountry());

    exercise = new Exercise2(CountryHelper.create2());
    country = exercise.getCountryMaxLanguagesIncluding("pt");
    assertEquals(2, country.getLanguages().size());
    assertEquals("BR", country.getCountry());
  }

  @Test
  @DisplayName("that counts all the official languages spoken in the listed countries")
  void countAllOfficialLanguages() {
    var exercise = new Exercise2(CountryHelper.create1());
    long l = exercise.countAllOfficialLanguages();
    assertEquals(6, l);

    exercise = new Exercise2(CountryHelper.create2());
    l = exercise.countAllOfficialLanguages();
    assertEquals(3, l);

  }

  @Test
  @DisplayName("to find the country with the highest number of official languages")
  void getCountryMaxLanguages() {
    var exercise = new Exercise2(CountryHelper.create1());
    Country country = exercise.getCountryMaxLanguages();
    assertEquals(3, country.getLanguages().size());
    assertEquals("BE", country.getCountry());

    exercise = new Exercise2(CountryHelper.create2());
    country = exercise.getCountryMaxLanguages();
    assertEquals(2, country.getLanguages().size());
    assertEquals("BR", country.getCountry());

  }

  @Test
  @DisplayName("to find the most common official language(s), of all countries")
  void findMostCommonOfficialLanguage() {
    var exercise = new Exercise2(CountryHelper.create1());
    String mostCommonOfficialLanguage = exercise.findMostCommonOfficialLanguage();
    assertEquals("de", mostCommonOfficialLanguage);

    exercise = new Exercise2(CountryHelper.create2());
    mostCommonOfficialLanguage = exercise.findMostCommonOfficialLanguage();
    assertEquals("es", mostCommonOfficialLanguage);

  }
}