package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.*;

public class MessageEventListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        super.onMessageReceived(event);
        String messageSent = event.getMessage().getContentRaw();

        List<String> xuxu = new ArrayList<>();
        List<String> laolao = new ArrayList<>();
        List<String> jonglee = new ArrayList<>();
        List<String> bboy = new ArrayList<>();

        xuxu.add("AHHH XIAO XUXU");
        xuxu.add("WHERE EVIE AT");
        xuxu.add("you weirdo!");

        laolao.add("LAO LAO MAO");
        laolao.add("you gatekeeper");
        laolao.add("WAAAA WAAAA");

        jonglee.add("JONG LEH KELLY JONG LEHHHH");
        jonglee.add("WHERE KELLY AT");
        jonglee.add("KELLY OR KELLY");
        jonglee.add("typical lil tecca enjoyer");

        bboy.add("insert random emoticon");
        bboy.add("YO CAT IS NOT BLUE!!!");
        bboy.add("yo mama lol");


        int val = (int)(Math.random()*(4 - 1) + 1);
        val--;
        int val2 = (int)(Math.random()*(5 - 1) + 1);
        val2--;
        if(!event.getAuthor().isBot()){
            String author = event.getAuthor().getId();
            int valT = (int)(Math.random()*(4 - 1) + 1);
            valT--;
            while(valT == val){
                valT = (int)(Math.random()*(4 - 1) + 1);
                valT--;
            }
            val = valT;
            if(author.equals("251955517944102912")) {
                String output = xuxu.get(valT);
                event.getGuildChannel().sendMessage(output).queue();
            }
            else if(author.equals("931992522610319371")) {
                String output = laolao.get(valT);
                event.getGuildChannel().sendMessage(output).queue();
            }
            else if(author.equals("1032407133406367846")) {
                int valTT = (int)(Math.random()*(5 - 1) + 1);
                valTT--;
                while(valTT == val2){
                    valTT = (int)(Math.random()*(5 - 1) + 1);
                    valTT--;
                }
                val = valTT;
                String output = jonglee.get(valTT);
                event.getGuildChannel().sendMessage(output).queue();
            }
            else if(author.equals("502141625980420096")) {
                String output = bboy.get(valT);
                event.getGuildChannel().sendMessage(output).queue();
            }
        }
    }
}
