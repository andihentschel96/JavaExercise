package OOP3.Singleton;

public class SingletonClass {
    public static void main(String[] args) {
        Database db1;
        //refers to the only object in Database
        db1 = Database.getInstance();

        db1.getConnection();
    }
}

class Database {
    private static Database dbObj;

    private Database() {

    }

    public static Database getInstance() {
        //Create object if not already created
        if (dbObj == null) {
            dbObj = new Database();
        }
        //returns the singleton object
        return dbObj;
    }
    public void getConnection() {
        System.out.println("You are connected to the database");
    }
}