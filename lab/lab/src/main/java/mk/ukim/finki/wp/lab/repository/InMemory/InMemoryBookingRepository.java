package mk.ukim.finki.wp.lab.repository.InMemory;

import mk.ukim.finki.wp.lab.model.EventBooking;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryBookingRepository {
    public void addBooking(String attende_name,String event_name,long numTickets,String attende_address){
        //DataHolder.bookings.add(new EventBooking(event_name,attende_name,attende_address,numTickets));
    }
    public List<EventBooking> search(String text){
        // return DataHolder.bookings.stream().filter(i->i.getAttendeeAddress().contains(text) || i.getAttendeeName().contains(text) || i.getEventName().contains(text) || i.getNumberOfTickets()==Long.parseLong(text)).collect(Collectors.toList());
        return null;
    }
}
