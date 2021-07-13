package org.stepic.java.MailServise;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService{
private final Logger logger;
    public static final String AUSTIN_POWERS = "Austin Powers";

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            MailMessage mailmessage = (MailMessage) mail;
            String message = mailmessage.getMessage();
                if(mailmessage.from.equals(AUSTIN_POWERS) || mailmessage.to.equals(AUSTIN_POWERS)) {
                    logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\" ", new Object[] {mailmessage.from, mailmessage.to, message});
                }
                else {
                    logger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[] {mailmessage.from, mailmessage.to});
                }
        }
        return mail;
    }
}
