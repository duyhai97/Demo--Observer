class Client {
    public static void main(String[] args) {
        Observer phone = new Phone();
        Account hai = new Account("hai");
        Account ha = new Account("ha");
        hai.add(phone);
        ha.add(phone);
        hai.notification("chuyen 500k: " , ha );
    }
}