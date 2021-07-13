package org.stepic.java.MailServise;

public class UntrustworthyMailWorker implements MailService {
    private static MailService[] workers;
    private static RealMailService realWorker = new RealMailService();
public UntrustworthyMailWorker(MailService[] workers) {
    this.workers = workers;
    this.realWorker = realWorker;
}
public RealMailService getRealMailService(){
    return realWorker;
}
    @Override
    public Sendable processMail(Sendable mail) {
    Sendable result = mail;
    for (int i=0; i<workers.length; i++) {
        if(result instanceof MailMessage){
            String mes = ((MailMessage) result).getMessage();
            System.out.println("Кем получено = " + workers[i]);
            System.out.println("Что получено = " + mes);
        }
        if (result instanceof MailPackage) {
            MailPackage pack = (MailPackage) result;
            Package contentpack = pack.getContent();
            String mes = contentpack.getContent();
            int price = contentpack.getPrice();

            System.out.println("Кем получено = " + workers[i]);
            System.out.println("Что получено = " + mes + "price = " + price);
        }
        result = workers[i].processMail(result);
        if(result instanceof MailMessage){
            String mes = ((MailMessage) result).getMessage();
            //System.out.println("workers = " + workers[i]);
            System.out.println("Что отдано = " + mes);
        }
        if (result instanceof MailPackage) {
            MailPackage pack = (MailPackage) result;
            Package contentpack = pack.getContent();
            String mes = contentpack.getContent();
            int price = contentpack.getPrice();

            //System.out.println("workers = " + workers[i]);
            System.out.println("Что отдано = " + mes + "price = " + price);
        }
    }
    result = realWorker.processMail(result);
            return result;
    }
}
