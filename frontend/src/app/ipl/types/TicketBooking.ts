
export class TicketBooking {
bookingId:number;
email:string;
matchId:number;
numberOfTickets:number;
constructor(bookingId:number,
    email:string,
    matchId:number,
    numberOfTickets:number){
        this.bookingId = bookingId;
        this.email = email;
        this.matchId =matchId;
        this.numberOfTickets = numberOfTickets;
    }
    displayInfo():void{
        console.log(`Booking ID: ${this.bookingId}`);
        console.log(`Email: ${this.email}`);
        console.log(`Number of Tickets: ${this.numberOfTickets}`);
    }
}