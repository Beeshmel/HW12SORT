package singleton;

public class Catalog {
    SingleConnection connection;
    private Catalog(){
        connection = SingleConnection.getObj();
    }
    void getGoods(){
        connection.select();
    }
    void insertGoods(){
        connection.insert();
    }
}
