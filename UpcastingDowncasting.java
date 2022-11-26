abstract class DB{
    void open(){
        System.out.println("DB open");
    }
    void close(){
        System.out.println("DB Close");
    }
    abstract void login();
}
class OracleDB extends DB{

    @Override
    void login(){

    }
    void maxJoin(){
        System.out.println("Oracle Joins");
    }

}
/* 
class PosGres extends DB{

}
class H2 extends DB{

}*/
class DBCaller{
    void call(DB db){
        db.open();
        db.close();
        if(db instanceof OracleDB){
           ( (OracleDB)db).maxJoin(); // Downcasting
        }
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        DBCaller db = new DBCaller();
       // DB db2 = new OracleDB(); // Upcasting
        db.call(new OracleDB());
        // db.call(new H2());
        // db.call(new DB());
    }

}
