/***********************************************************************
 * Module:  Client.java
 * Author:  admin
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;

/** @pdOid e072ba3f-a05f-4b29-8a88-b235281075e5 */
public class Client implements Runable {
   /** @pdOid 028caa00-60f5-4394-833b-8e6250a3af85 */
   private Thread thread;
   /** @pdOid 983c4e0a-808d-4e30-aa21-33a6f85a0dc0 */
   private BufferedReader is;
   /** @pdOid 6907f767-5969-4e78-81bc-032e9cac2887 */
   private BufferedWritter os;
   /** @pdOid a6caf03b-4873-4742-ad8e-071f2c5d8c3f */
   private Socket socketOfClient;
   /** @pdOid 92f48102-43ae-4629-8be1-b2bb60227b31 */
   private LoginPage loginPage;
   /** @pdOid f3f7ba7e-8f80-420d-b192-54efbc3faf2e */
   private Home home;
   
   /** @pdRoleInfo migr=no name=ConnectDatabase assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<ConnectDatabase> connectDatabase;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ConnectDatabase> getConnectDatabase() {
      if (connectDatabase == null)
         connectDatabase = new java.util.HashSet<ConnectDatabase>();
      return connectDatabase;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorConnectDatabase() {
      if (connectDatabase == null)
         connectDatabase = new java.util.HashSet<ConnectDatabase>();
      return connectDatabase.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newConnectDatabase */
   public void setConnectDatabase(java.util.Collection<ConnectDatabase> newConnectDatabase) {
      removeAllConnectDatabase();
      for (java.util.Iterator iter = newConnectDatabase.iterator(); iter.hasNext();)
         addConnectDatabase((ConnectDatabase)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newConnectDatabase */
   public void addConnectDatabase(ConnectDatabase newConnectDatabase) {
      if (newConnectDatabase == null)
         return;
      if (this.connectDatabase == null)
         this.connectDatabase = new java.util.HashSet<ConnectDatabase>();
      if (!this.connectDatabase.contains(newConnectDatabase))
         this.connectDatabase.add(newConnectDatabase);
   }
   
   /** @pdGenerated default remove
     * @param oldConnectDatabase */
   public void removeConnectDatabase(ConnectDatabase oldConnectDatabase) {
      if (oldConnectDatabase == null)
         return;
      if (this.connectDatabase != null)
         if (this.connectDatabase.contains(oldConnectDatabase))
            this.connectDatabase.remove(oldConnectDatabase);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllConnectDatabase() {
      if (connectDatabase != null)
         connectDatabase.clear();
   }

}
