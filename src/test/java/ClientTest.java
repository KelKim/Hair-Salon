import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import  org.sql2o.*;

public class ClientTest {
  @Rule
  public DatabaseRule database = new DatabaseRule();

  @Test
  public void client_instantiatesCorrectly_true() {
    Client testClient = new Client("Rasta", 1);
    assertEquals(true, testClient instanceof Client);
  }

  @Test
  public void getClientName_clientInstantiatesWithName_Home() {
    Client testClient = new Client("Lentimo",1);
    assertEquals("Lentimo", testClient.getClientName());
  }
}