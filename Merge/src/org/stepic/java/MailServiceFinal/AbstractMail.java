package org.stepic.java.MailServiceFinal;

public abstract class AbstractMail <T> implements Info <T>{
    public String from;
    public String to;
    public T content;
    public AbstractMail(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }
    @Override
    public T getContent(){
        return content;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractMail that = (AbstractMail) o;

        if (!from.equals(that.from)) return false;
        if (!to.equals(that.to)) return false;
        if (!content.equals(that.content)) return false;
        return true;
    }
}
