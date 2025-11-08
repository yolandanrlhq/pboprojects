package dip;

public class Main {
    public static void main(String[] args) {
        
        Database mysqlDatabase = new MySQL();
        UserService mysqlUserService = new UserService(mysqlDatabase);
        mysqlUserService.registerUser("Yolanda");
        
        Database postgresqlDatabase = new PostgreSQL();
        UserService postgresqlUserService = new UserService(postgresqlDatabase);
        postgresqlUserService.registerUser("Nurul");
    }    
}