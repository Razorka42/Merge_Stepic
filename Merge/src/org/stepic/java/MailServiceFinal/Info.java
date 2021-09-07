package org.stepic.java.MailServiceFinal;

public interface Info <T> {
    String getFrom();
    String getTo();
    T getContent();
}
