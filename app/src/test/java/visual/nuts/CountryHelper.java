package visual.nuts;

import java.util.Arrays;
import java.util.List;

public class CountryHelper {
  public static List<Country> create1() {
    return List.of(
        new Country("US", List.of("en")),
        new Country("BE", List.of("nl", "fr", "de")),
        new Country("NL", List.of("nl", "fy")),
        new Country("DE", List.of("de")),
        new Country("ES", List.of("es"))
    );
  }

  public static List<Country> create2() {
    return List.of(
        new Country("BR", List.of("pt", "en")),
        new Country("AR", List.of("es", "en")),
        new Country("BO", List.of("es")),
        new Country("AO", List.of("pt")),
        new Country("UY", List.of("es"))
    );
  }
}
