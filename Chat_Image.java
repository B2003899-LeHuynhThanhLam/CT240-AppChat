/***********************************************************************
 * Module:  ChatImage.java
 * Author:  admin
 * Purpose: Defines the Class ChatImage
 ***********************************************************************/

import java.util.*;

/** @pdOid 9d18c9e0-9e89-43e8-a114-a26872842905 */
public class ChatImage extends MessageType {
   /** @pdOid 0c557ee4-b784-4cad-8ef1-606a45e48c76 */
   private String image;
   
   /** @param dataImage
    * @pdOid 9e1e5a43-4d54-4c80-a437-917a5cd34d5c */
   public void adImage(Model_Receive_Image dataImage) {
      // TODO: implement
   }
   
   /** @param fileSender
    * @pdOid 20def255-5e88-4662-a73e-ddf227bb5448 */
   public void adImage(Model_File_Sender fileSender) {
      // TODO: implement
   }
   
   /** @param com 
    * @param image
    * @pdOid 5be93e62-0807-4a2c-8559-37a99d9f3c61 */
   public void adEvent(Component com, Icon image) {
      // TODO: implement
   }
   
   /** @pdOid 535a2641-0991-4faf-a68e-b546ac24bb51 */
   public Dimension getAutoSize() {
      // TODO: implement
      return null;
   }

}
