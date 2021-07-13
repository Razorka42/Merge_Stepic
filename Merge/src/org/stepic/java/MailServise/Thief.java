package org.stepic.java.MailServise;

public class Thief implements MailService {
    private static int minPrice;
    private static int stolenPrice = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        MailPackage stolenPackage;

        if (mail instanceof MailPackage) {
            MailPackage mailpackage = (MailPackage) mail;
            Package content = mailpackage.getContent();
            int price = content.getPrice();
            String content1 = content.getContent();
            if (price >= minPrice) {
                stolenPackage = mailpackage;
                stolenPrice = stolenPrice + price;
                int price1 = 0;
                String content2 = "stones instead of " + content1;
                Package package1 = new Package(content2, price1);
                MailPackage badmailpackage = new MailPackage(mailpackage.from, mailpackage.to, package1);
                return badmailpackage;
            } else {
                return mailpackage;
            }

        }
        return mail;
    }

    public int getStolenValue() {
        return stolenPrice;
    }

}