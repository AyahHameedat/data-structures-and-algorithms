# Singly Linked List
<!-- Short summary or background information -->
### The singly linked list is a linear data structure in which each element of the list contains a pointer that points to the next element in the list.

## Challenge
<!-- Description of the challenge -->

#### Create a **Node** class that has properties for the value stored in the Node, and a pointer to the next Node.
#### create 3 methods inside Linked List class:-
#### 1) Insert Value.
#### 2) includes Value.
#### 3) to string.

<br>

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
#### InsertValue method -> O(1)
#### IncludeValue method -> O(logn)
#### toString method -> O(logn)

<br>

## API
<!-- Description of each method publicly available to your Linked List -->
#### insert: to Adds a new node with that value to the head of the list with an O(1) Time performance.
#### includes: to Indicates whether that value exists as a Node’s value somewhere within the list.
#### to string:  a string representing all the values in the Linked List.