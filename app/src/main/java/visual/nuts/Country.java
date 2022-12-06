package visual.nuts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Country {
  private String country;
  private List<String> languages;

}
