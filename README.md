This repo goes through some exercises from the course [SE281 - Object Oriented Programming](https://softeng281.digitaledu.ac.nz/)

## Management system for Books R Us
We need to develop a system that with the following functionality:

- Maintain the book seller’s cash balance.
- When the book seller purchases a new book:
  - The cash balance is reduced (by the cost price).
  - The book is added to the collection of books on offer.
  - Give each book a unique ID.
  - A book can have its selling price reduced.
- When the book seller sells a book:
  - The book is sold by scanning the book’s unique ID.
  - The cash balance is increased (by the sale price).
  - The book is marked as sold in the collections of books on offer.
- Given a unique ID, grab the book that corresponds to that ID (if any).
- Given a keyword in a book’s title, search and grab a book that matches the keyword (if any).
- Determine the total number of sold and unsold books (include duplicate books).
- Determine the total number of unsold books (include duplicate books).
- Given a book, sell all copies of that book (equality based on title, author, publication year).

We also notice there is the possibility for our system to cater for multiple book sellers.


## Forest example for interfaces
We are hiking in the forest and come across interesting items, that we are allowed to gather and but into our backpack. Some items are edible and some are not.
Implementing these items with indiviual/separate and distinct classes can make it more complicated later on to add to the backpack, especially if we start to add more types of items.

We can have items like:
- Stones, Leaves, 
- Berries, Apples, Nuts, Mushroom

We can think of them all as Findable Objects, and some as Edible - use interfaces to define these