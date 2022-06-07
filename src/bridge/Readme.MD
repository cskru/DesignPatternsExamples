# Bridge Pattern  
Helps to split a large chunk of class / related classes to 2 separate hierarchies:  
1. abstraction  
2. implementation  

which can be developed independently of each other.  

The Bridge pattern attempts to solve this problem by switching **from inheritance to the object composition**. What this
means is that you extract one of the dimensions into a separate class hierarchy, so that the original classes will reference
an object of the new hierarchy, instead of having all of its state
and behaviors within one class.  

In the example, we see how Keyboard, Display can be developed separately.  
The Keyboard, Mouse or other external devices can be considered as abstractions.  
The Display is considered as the implementation.