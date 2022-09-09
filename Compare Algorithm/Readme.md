# Understanding "Comparable" and "Comparator"

As many people would already know, "Comparable" and "Comparator" are both **interface**. 
Therefore meaning whoever wants to use "Comparable" and "Comparator" must use the declared methods inside the interface.


The following document [Oracle Document for Comparator](docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#method.summary) has information about the Comparator. Even if it seems like it is a lot of method, the only thing we actually need to define is **compare(T o1, To2)**
The following document [Oracle Document for Comparable](docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html#method.summary) has information about the Comparable. In this case we need to define **compareTo(T o)



Both of these methods help to compare objects.
However "Comparable" compares an object with itself, while "Comparator" will compare two different objects.
They are both same as the way of comparing, but different target.
