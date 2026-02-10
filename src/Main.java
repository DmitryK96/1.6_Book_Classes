void main() {
    Author sapkowski = new Author("Анджей", "Сапковский", 56);
    Author gerbert = new Author("Фрэнк", "Герберт", 61);
    Author achern = new Author("Сесилия", "Ахерн", 41);

    Book book1 = new Book("Ведьмак", sapkowski, "Фэнтези", 1545);
    Book book2 = new Book("Дюна", gerbert,"Научная фантастика", 1130);
    Book book3 = new Book("Там где заканчивается радуга", achern,"Романтика", 649);


    User user1 = new User("ValyaNchik", "vala987@mail.ru");
    User user2 = new User("Genka214", "gen_ka@gmail.com");

    System.out.println("Добро пожаловать в онлайн-читалку 'Library-Online'!");
    System.out.println("Сейчас онлайн: " + User.onlineUsers + " пользователя");

    System.out.println("\nСейчас доступно " + Book.onlineBook + " книг");
    System.out.println("У нас в ассортименте сейчас имеется следующие доступные книги:");
    System.out.println(book1.toString());
    System.out.println(book2.toString());
    System.out.println(book3.toString());
}
