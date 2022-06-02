# Prototype Pattern
Useful while cloning complex objects without depending on the concrete classes.  
Prototype Interface has clone method.
The class (whose instance has to be copied) can extend the Prototype interface.  
The Class itself has the clone method that takes care of detailed copying.  
A registry of prototypes can be maintained if required - For High demand prototypes for replication.  
