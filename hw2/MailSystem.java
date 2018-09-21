package hw2;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
   A system of voice mail boxes.
*/
public class MailSystem
{
   /**
      Constructs a mail system with a given number of mailboxes
      @param mailboxCount the number of mailboxes
   */
   public MailSystem(int mailboxCount)
   {
      mailboxes = new ArrayList<>();

      // Initialize mail boxes.

      for (int i = 0; i < mailboxCount; i++)
      {
         String passcode = "" + (i + 1);
         String greeting = "You have reached mailbox " + (i + 1)
               + ". \nPlease leave a message now.";
         mailboxes.add(new Mailbox(passcode, greeting));
      }
   }

   /**
      Locate a mailbox.
      @param ext the extension number
      @return the mailbox or null if not found
   */
   public Mailbox findMailbox(String ext)
   {
      int i = Integer.parseInt(ext);
      boolean numFound = false;
      if (1 <= i && i <= mailboxes.size())
         return  mailboxes.get(i - 1);
      else
      {
    	  try {
    		  while(!numFound) {
    			  i = Integer.parseInt(ext);
    			  Pattern p = Pattern.compile("[A-Z,a-z]");
    			  Matcher m = p.matcher(ext);
    			  if (m.find()) {
    				  System.out.println("Invalid Entry");
    			  }
    			  else {
    				  i = Integer.parseInt(ext);
    				  numFound = true;
    			  }
    		  }
    	  }
    	  catch(Exception e) {
    		  e.printStackTrace();
    	  }
      }
      return null;
   }

   private ArrayList<Mailbox> mailboxes;
}
