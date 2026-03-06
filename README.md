# Palindrome Checker App

## Objective

The objective of the **Palindrome Checker App** is to develop a console-based Java application that determines whether a given string is a palindrome. The project aims to strengthen understanding of core Java programming concepts and data structures such as linked lists, pointer traversal, and in-place operations. The application checks whether a string reads the same forward and backward under different implementation approaches.

---

## Project Flow

1. The program starts and prompts the user to enter a string.
2. The input string is read using the `Scanner` class.
3. Each character of the string is converted into a node and inserted into a singly linked list.
4. The program uses the **fast and slow pointer technique** to locate the middle of the linked list.
5. The second half of the linked list is reversed using in-place reversal.
6. The first half and the reversed second half are compared node by node.
7. If all characters match, the string is declared a **Palindrome**.
8. If any mismatch occurs, the string is declared **Not a Palindrome**.
9. The result is displayed in the console.

---

## Use Case: UC8 – Linked List Based Palindrome Checker

### Goal

To determine whether a given string is a palindrome using a **singly linked list data structure**.

### Description

In this use case, the input string is first converted into a linked list where each node stores a character of the string. The algorithm then identifies the middle of the list using the fast and slow pointer method. The second half of the list is reversed and compared with the first half to check if the characters match. If both halves match, the string is a palindrome.

---

## Key Concepts Used

### Singly Linked List

A dynamic data structure in which elements (nodes) are connected using references. Each node stores data and a pointer to the next node.

### Node Traversal

Accessing each element sequentially through the `next` reference of the linked list.

### Fast and Slow Pointer Technique

Two pointers traverse the list at different speeds to efficiently find the middle node.

### In-Place Reversal

The second half of the linked list is reversed without using extra memory, improving efficiency.

---

## Data Structure Used

**Singly Linked List**

Each node contains:

* Character data
* Reference to the next node

---

## Output

The application prints either:

* `Palindrome`
* `Not Palindrome`

depending on whether the input string satisfies the palindrome condition.

---

## Conclusion

This project demonstrates how linked lists and pointer techniques can be applied to solve string problems efficiently. It reinforces important concepts such as dynamic data structures, traversal methods, and algorithmic problem solving in Java.
