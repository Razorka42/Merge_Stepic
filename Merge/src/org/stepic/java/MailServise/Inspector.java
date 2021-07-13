package org.stepic.java.MailServise;

public class Inspector implements MailService{
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mailpackage = (MailPackage) mail;
            Package content = mailpackage.getContent();
            String content1 = content.getContent();
            if(content1.contains(WEAPONS) || content1.contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException("Package contains illegal content!");
            }
            if(content1.contains("stones")) {
                throw new StolenPackageException("This package was stolen!");
            }
        }
        return mail;
    }
}
