package singleton;

import java.sql.Connection;

//Цель паттерна Singleton - получение единого объекта класса

public class SingleConnection {
    private static SingleConnection obj;
    Connection connection;

    private SingleConnection(){
        connection = null;//здесь выполняем подключение к базе данных
    }

    public static SingleConnection getObj(){
        if(obj == null){
            obj = new SingleConnection();
        }
        return obj;
    }

    void select(){}
    void update(){}
    void insert(){}
    void delete(){}
}
