import commands.BotCommands;
import events.MessageEventListener;
import events.ReadyEventListener;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.requests.GatewayIntent;


import javax.security.auth.login.LoginException;
public class jtBot {
    public static void main(String[] args) throws LoginException {
        JDABuilder jdaBuilder = JDABuilder.createDefault("insert token");

        jdaBuilder.setActivity(Activity.listening("BREN JOY"));
        jdaBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES);
        jdaBuilder.addEventListeners(new ReadyEventListener(), new MessageEventListener(), new BotCommands());
        jdaBuilder.build();

        jdaBuilder.build().getGuildById("insert channel token").upsertCommand("jtCounter", "Another day without JT: ").queue();
    }
}
