# Composite Pattern  

Compose objects into **tree structures** and work with them as if they are individual objects.  
The operation / set of operations we perform apply to Leaf as well as Composite nodes of the tree, making the composite pattern special.  
A composite node can have 1 or more components.  
Component - Either a composite or a Leaf.  

Composite node delegates work to its children.  
So, most work is done at leaf.  

This example tries to deal with an immutable sort of tree structure. We can apply same principles with some modifications to a mutable structure as well.