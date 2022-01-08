package demo.blitz.service;

import demo.blitz.model.Mail;

import java.util.ArrayList;

public class Search_Body extends ISearch {

    private String query;

    public Search_Body(String query) {
        this.query = query.toLowerCase();
    }

    @Override
    public ArrayList<Mail> search(ArrayList<Mail> mails) {
        ArrayList<Mail> result = new ArrayList<Mail>();
        for (Mail mail : mails) {
            String content = mail.getBody().toLowerCase();
            if (content.contains(this.query))
                result.add(mail);
        }
        return result;
    }

}
