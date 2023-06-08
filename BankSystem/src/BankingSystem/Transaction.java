package BankingSystem;
import java.util.*;

public class Transaction {
    private String type;
    private Date date;
    private String description;

    public Transaction(String type, Date date, String description) {
        this.type = type;
        this.date = date;
        this.description = description;
    }
    
    public String getType(){
        return type;
    }
    public Date getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }
    
}


