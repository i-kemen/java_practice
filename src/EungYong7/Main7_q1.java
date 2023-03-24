package EungYong7;

import java.io.Serializable;

class Employee implements Serializable {
    String name;
    int age;
}


class Department implements Serializable {
    String name;
    Employee leader;
}
