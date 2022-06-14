# Decorator Pattern  
This pattern enables us to decorate / associate new behaviour(s) to the objects by **wrapping the objects inside special wrapper objects**.  
Decorator can also be considered as a wrapper.  

Create concrete decorators by extending them from the base
decorator. A concrete decorator must execute its behavior
before or after the call to the parent method (**which always
delegates to the wrapped object**).