package org.stepic.java.MailServise;

import java.util.logging.Logger;

public class TestMail {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    public static void main(String[] args) {

        Inspector cat = new Inspector();
        Thief thief = new Thief(45);
        Spy spy = new Spy(Logger.getLogger("spy"));
        Package content = new Package("food", 65);
        MailMessage message = new MailMessage(AUSTIN_POWERS, "Alena", "Hi");
        MailPackage packageA = new MailPackage("Dad", "Mama", content);
        MailService [] workers = new MailService[] {cat, thief, spy};
        UntrustworthyMailWorker badworker = new UntrustworthyMailWorker(workers);

        System.out.println(badworker.processMail(message));
        //System.out.println(badworker.processMail(packageA));
        System.out.println(badworker.getRealMailService());


    }
}
