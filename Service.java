/***********************************************************************
 * Module:  Service.java
 * Author:  admin
 * Purpose: Defines the Class Service
 ***********************************************************************/

import java.util.*;

/** @pdOid fb4fc2b5-16f1-4d47-bf22-7bc0ed0fc08f */
public class Service {
   /** @pdOid 314e1ca2-fe86-489b-8ebd-76c4ac2bf55f */
   public void startServer() {
      // TODO: implement
   }
   
   /** @param file 
    * @param message
    * @pdOid d93f7c78-0bcd-4d69-8772-efc4cdd73a42 */
   public Model_File_Sender addFile(File file, Model_Send_Message message) {
      // TODO: implement
      return null;
   }
   
   /** @param data
    * @pdOid 7f95c4c5-a1db-45ca-b061-2bdd14daa9b2 */
   public void fileSendFinish(Model_File_Sender data) {
      // TODO: implement
   }
   
   /** @param data
    * @pdOid 62b0838b-7379-4e14-b3b4-ef57b88fb9d5 */
   public void fileReceiveFinish(Model_File_Receiver data) {
      // TODO: implement
   }
   
   /** @param field 
    * @param event
    * @pdOid b2b56c32-e4b2-4845-8ee0-0ccd978bb744 */
   public void addFileReceiver(int field, EventFileReceiver event) {
      // TODO: implement
   }
   
   /** @pdOid 919e0861-f136-47e8-9fc9-6d6f33ccc34b */
   public Socket getClient() {
      // TODO: implement
      return null;
   }
   
   /** @param user
    * @pdOid 70fc2fe1-94bc-447b-a45b-aebf15ef1e5b */
   public void setUser(Model_User_Account user) {
      // TODO: implement
   }
   
   /** @pdOid 0b93016b-ec23-4de4-9424-5939bfe04806 */
   public void error() {
      // TODO: implement
   }
   
   /** @pdOid 1bf1488f-2a4b-4dd7-9a22-e777c1e68f26 */
   public void userConnect() {
      // TODO: implement
   }
   
   /** @pdOid 6ad23647-6cf4-4a5d-8e56-692cbd34c1f5 */
   public void userDisconnect() {
      // TODO: implement
   }
   
   /** @pdOid 336ff261-7754-4ac9-a063-70d0ab0847c4 */
   public void addClient() {
      // TODO: implement
   }
   
   /** @pdOid 36df3a45-683e-4efc-a080-abd2658b60b1 */
   public void sendToClient() {
      // TODO: implement
   }
   
   /** @pdOid bbf88788-0b6d-4349-b232-7df6252bb152 */
   public void sendItemFileToClient() {
      // TODO: implement
   }
   
   /** @pdOid 83b7be77-dd79-44cf-bce3-035fc34b88b8 */
   public void removeClient() {
      // TODO: implement
   }
   
   /** @pdOid 9f70b51a-2670-4519-9a7b-892c94bcf138 */
   public List getListClient() {
      // TODO: implement
      return null;
   }

}
