# Movie Tickets Coding Kata

It's your first day of work at your local movie theater and you've already got a crisis
on your hands. The theater recently upgraded all of the point of sale terminals to a 
new cloud-based solution from Congo Web Services (CWS), but now CWS has gone offline and 
none of your coworkers are able to do the math required to sell movie tickets.

You figure out that the fancy internet-enabled popcorn machine is running Java, so you grab
the theater ticket pricing menu and get to work building your own cash register. Your 
popcorn-powered cash register will need to calculate the total purchase price for each 
customer, and you'll need to work quickly... the line outside is growing!

| Basic admission rates (regular weekday, 2D movie, &lt;=120 min, parquet) |            |
| ------------------------------------------------------------------------ | ---------: |
| General admission                                                        |     $11.00 |
| Students                                                                 |      $8.00 |
| Senior Citizens (65 & older)                                             |      $6.00 |
| Children (under 13)                                                      |      $5.50 |
| Group (20 people or more)                                                | $6.00 each |

| Exceptions*                               |        |
| ----------------------------------------- | -----: |
| 3D movie                                  | +$3.00 |
| Over-length (more than 120 min.)          | +$1.50 |
| Movie Day (Thursday, except for groups!)  | -$2.00 |
| Weekends                                  | +$1.50 |
| Loge                                      | +$2.00 |

_*Exceptions are applied for each ticket purchased._

**Customer satisfaction is important, so always charge the lowest possible price!**

##### Additional Facts:
* Each customer can purchase any number of tickets, but all the tickets will be for the 
same movie.
* There are no age requirements for any of the movies (this is a family-friendly theater).



> Adapted from original "movie tickets coding kata" by Marco Dierenfeldt: 
> http://codingkata.org/katas/unit/movie-tickets