package org.stepic.java.MailServiceFinal;

import org.stepic.java.MailServise.MailPackage;

public class Salary extends AbstractMail<Integer> {

    public Salary(String from, String to, Integer salary) {
        super(from, to, salary);
    }
}
