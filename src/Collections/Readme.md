# collections
The java collections framework provides a set of 
interfaces and classes to implement various data structures
and algorithms. These interfaces include several methods to
perform different operations on collections.
![img.png](img.png)

Main Interfaces in the Collection Framework:

| Interface      | Description                                                                          |
| -------------- | ------------------------------------------------------------------------------------ |
| **Collection** | Root interface for most collections (List, Set, Queue)                               |
| **List**       | Ordered collection (allows duplicates)                                               |
| **Set**        | Unordered collection (no duplicates)                                                 |
| **Queue**      | Follows FIFO (First In, First Out)                                                   |
| **Map**        | Stores key-value pairs (not part of Collection interface, but part of the framework) |


Key Classes You Use:

| Interface | Common Implementations                             |
| --------- | -------------------------------------------------- |
| `List`    | `ArrayList`, `LinkedList`, `Vector`, `Stack`       |
| `Set`     | `HashSet`, `LinkedHashSet`, `TreeSet`              |
| `Queue`   | `PriorityQueue`, `ArrayDeque`                      |
| `Map`     | `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable` |


![img_2.png](img_2.png)

![img_4.png](img_4.png)

![img_3.png](img_3.png)
### The collection interface is the root interface of the java collection framework

1) List : The list interface extends the collection interface and adds methods that are specific to lists, which are
ordered collections that allow duplicate elements. here are some methods present in the List interface but not in
collection interface
![img_1.png](img_1.png)
![img_5.png](img_5.png)
![img_6.png](img_6.png)
2) LinkedList: The LinkedList class of the java collections framework provides the functionality
of the linked list data structure(doubly linkedlist).
elements in the linked lists are not stored in sequence. Instead, they are scattered and connected through links(Prev and Next).
![img_8.png](img_8.png)
3) Vector: 
![img_9.png](img_9.png)
4) Stack
![img_10.png](img_10.png)


## Queue
Queue is an interface which an extends to the collection interface
and Queue should be implemented by "priority queue" && "ArrayDeque" && "LinkedList"
![img_11.png](img_11.png)

### Queue Methods
![img_12.png](img_12.png)
1) Deque
It should be implemented from ArrayDeque and the Deque.
which gives the ability to do an perform operations from both side.
![img_13.png](img_13.png)

## Stack and queue operations using ArrayDeque
![img_14.png](img_14.png)

## Set Interface
![img_16.png](img_16.png)
Meaning of "Mathematical Set" in Java:
A mathematical set:
*     Contains unique elements (no duplicates)
*     Has no defined order (in regular sets)
Java's Set interface models the same behavior.
![img_17.png](img_17.png)

![img_18.png](img_18.png)

## Maps 
![img_19.png](img_19.png)
![img_20.png](img_20.png)
![img_21.png](img_21.png)