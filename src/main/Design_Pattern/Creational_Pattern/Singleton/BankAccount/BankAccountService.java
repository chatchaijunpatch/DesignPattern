package Creational_Pattern.Singleton.BankAccount;

import java.net.HttpURLConnection;
import java.sql.Connection;

public class BankAccountService {
    private  static  BankAccountService instance;
    private HttpURLConnection httpconnection;
    private Connection dbConection;
    private BankAccountService(){
//        httpconnection = new HttpURLConnection();
//        dbConection = new Connection(){};
    }
    public  static  final BankAccountService getInstance(){
        if (instance == null){
            instance = new BankAccountService();
        }
        return instance;
    }
    public void createData(String data){
        // insert into database
    }
}
