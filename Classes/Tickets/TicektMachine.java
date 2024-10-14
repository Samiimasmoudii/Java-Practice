package Tickets;
public class TicektMachine{
    public static void main(String[] args)  {
        Ticket ticket = new Ticket();
        ticket.setDestination("New York");
        ticket.setPrice(1000);
        ticket.setReturn(false);
        System.out.println(ticket.getDestination());
        System.out.println(ticket.getPrice());
        System.out.println(ticket.isReturn());

        
    }
}