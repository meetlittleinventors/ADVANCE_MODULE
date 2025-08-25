class TicketBooking {
    int tickets = 10;

    public synchronized void bookTicket(String name) {
        if(tickets > 0) {
            System.out.println(name + " booked ticket " + tickets);
            tickets--;
        } else {
            System.out.println(name + " no tickets available");
        }
    }
}

class BookingThread extends Thread {
    TicketBooking booking;
    BookingThread(TicketBooking booking) { this.booking = booking; }
    public void run() {
        for(int i=0;i<5;i++) booking.bookTicket(Thread.currentThread().getName());
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();
        Thread t1 = new BookingThread(booking);
        Thread t2 = new BookingThread(booking);
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
