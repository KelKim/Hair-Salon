import org.sql2o.*;
import java.util.List;

public class Stylist {
    private String stylistName;
    private int id;

    public Stylist(String stylistName){
        this.stylistName = stylistName;
    }

    public String getStylistName(){
        return stylistName;
    }
    public int getId(){
        return id;
    }

    public static List<Stylist> all(){
        String sql = "SELECT id, stylistName FROM stylists";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Stylist.class);
        }
    }
    public List<Client> getClients() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM clients where stylistId=:id";
            return con.createQuery(sql)
                    .addParameter("id", this.id)
                    .executeAndFetch(Client.class);
        }
    }
    @Override
    public boolean equals(Object otherStylist) {
        if (!(otherStylist instanceof Stylist)) {
            return false;
        } else {
            Stylist newStylist = (Stylist) otherStylist;
            return this.getStylistName().equals(newStylist.getStylistName()) &&
                    this.getId() == newStylist.getId();
        }
    }
    public void save() {
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO stylists (stylistName) VALUES (:stylistName)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("stylistName", this.stylistName)
                    .executeUpdate()
                    .getKey();
        }
    }
    public static Stylist find(int id) {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM stylists where id=:id";
            Stylist stylist = con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Stylist.class);
            return stylist;
        }
    }
    public void delete() {
        try(Connection con = DB.sql2o.open()) {
        String sql = "DELETE FROM stylists WHERE id=:id;";
        con.createQuery(sql)
          .addParameter("id", id)
          .executeUpdate();
        }
      }


}
