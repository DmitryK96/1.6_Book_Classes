public class User {
    public static int onlineUsers = 0;

    public String nick;
    public String email;

    public User(String nick, String email){
        this.nick = nick;
        this.email = email;

        onlineUsers++;
    }

    @Override
    public String toString(){
        return "Пользователь: " + nick + " Email: " + email;
    }
}
