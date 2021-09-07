package org.stepic.java.MailServiceFinal;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Info<T>> {
    private List<T> listOfOldValues = new ArrayList<>();
    private List<T> listOfValues = new ArrayList<>();
    private String oldName;
    private String name;
    private T value;
    public Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, Collections.EMPTY_LIST);
        }
    };


    @Override
    public void accept(Info<T> tInfo) {
        name = tInfo.getTo();
        value = tInfo.getContent();
        if (!mailBox.containsKey(name)) {
            mailBox.put(name, new ArrayList<>());
        }

        listOfValues = mailBox.get(name);
        listOfValues.add(value);

    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

}


