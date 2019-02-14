import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import  org.sql2o.*;

public class StylistTest {
  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void stylist_instantiatesCorrectly_true() {
    Stylist testStylist = new Stylist("Rasta");
    assertEquals(true, testStylist instanceof Stylist);
  }

  @Test
  public void getStylistName_stylistInstantiatesWithName_Home() {
    Stylist testStylist = new Stylist("Lentimo");
    assertEquals("Lentimo", testStylist.getStylistName());
  }
}