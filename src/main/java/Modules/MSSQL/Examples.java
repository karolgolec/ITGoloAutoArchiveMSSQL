package Modules.MSSQL;

import Modules.MSSQL.Models.Database;
import Modules.MSSQL.Interfaces.IDatabase;

/**
 * Created by Karol Golec on 05.08.2016.
 */
public class Examples {
    private void examples(){
        IDatabase dbConn = new Database();
        boolean result = dbConn.hasConnection("192.168.1.150", "WFMAG", "WFMAG", "username", "password");
        System.out.println(result);
    }
}
