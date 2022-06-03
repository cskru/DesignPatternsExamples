# Singleton Pattern
Ensures that the class has only one instance with a global (global to whoever has access) access point.  
Protects that instance from being overwritten.  

1. Default constructor is private
2. Public Static method that acts as constructor calls the actual constructor if the instance is not yet created.  
   This instance is stored in a private static instance.  
   It returns the instance of the same class.  
   This is the only way to get Singleton object.  
   Thread lock must be placed if multithreading is supported.  

The above example is a simple combination of Prototype and Singleton.


    




