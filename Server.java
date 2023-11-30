/***********************************************************************
 * Module:  Server.java
 * Author:  admin
 * Purpose: Defines the Class Server
 ***********************************************************************/

import java.util.*;

/** @pdOid 388db5ad-24c8-4c7a-809f-d39d1ea2949c */
public class Server implements Runable {
   /** @pdOid 72f821f8-d12f-4e13-841e-4c552ec6d2ca */
   private Socket socketOfServer;
   /** @pdOid 704d2959-f130-4fa2-a6c2-6dd53056d233 */
   private MySQL database;
   
   /** @pdRoleInfo migr=no name=ConnectDatabase assc=association10 mult=0..1 */
   public ConnectDatabase connectDatabase;

}
