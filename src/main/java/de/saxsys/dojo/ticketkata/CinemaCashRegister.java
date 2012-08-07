package de.saxsys.dojo.ticketkata;

/**
 * Cashregister implementation that is able to support the salesprocess of
 * multiple tickets for a movie as defined in the
 * <code>TicketKataInterface</code>.
 * <table width="500px" border="1">
 * <tr>
 *  <th colspan="2" align ="left" bgcolor="#CCCCFF">Basic admission rates (regular weekday, 2D movie, &lt;=120 min, parquet)</th>
 * </tr>
 * <tr><td>General admission</td><td>$11.00</td></tr>
 * <tr><td>Students</td><td>$8.00</td></tr>
 * <tr><td>Senior Citizens (65 & older)</td><td>$6.00</td></tr>
 * <tr><td>Children (under 13)</td><td>$5.50</td></tr>
 * <tr><td>Group (20 people or more)</td><td>$6.00 each</td></tr>
 *
 * <tr><th colspan="2" align="left" bgcolor="#CCCCFF">Exceptions</th></tr>
 * <tr><td>3D movie</td><td>+$3.00</td></tr>
 * <tr><td>Over-length (more than 120 min.)</td><td>+$1.50</td></tr>
 * <tr><td>Movie Day (Thurdsday, except for groups!)</td><td>-$2.00</td></tr>
 * <tr><td>Weekends</td><td>+$1.50</td></tr>
 * <tr><td>Loge</td><td>+$2.00</td></tr>
 * </table>
 * @author Marco Dierenfeldt
 * @version 0.1
 * @see TicketKataInterface
 */
public class CinemaCashRegister implements TicketKataInterface {
  
    /**
     * (1) New customers arrive at your ticket booth and tell you
     * what movie they'd like to see (so keep it in mind ;-)
     *
     * @param runtime       movie's runtime in minutes
     * @param day           day of the week (enum)
     * @param isParquet     true if seating category is 'parquet' (and not 'loge')
     * @param is3D          true if the movie's shown in 3D
     */
    public void startPurchase(int runtime, Day day, boolean isParquet, boolean is3D) {

    }

    /**
     * (2) Add a ticket to the customers' bill
     *
     * @param age           the age of the ticket buyer in years
     * @param isStudent     true if the ticket buyer is a student
     */
    public void addTicket(int age, boolean isStudent) {
        
    }

    /**
     * (3) Calculate the total admission for the current customer(s)
     *
     * @return  total in dollars
     */
    public float finishPurchase() {
        return 0.0f;
    }

}
