For this POJO class 

```java
package org.example;

public class TestEvent {
    private boolean is1Foo;
    private boolean isOneFoo;

    public TestEvent(
        final boolean is1Foo,
        final boolean isOneFoo
    ) {
        this.is1Foo = is1Foo;
        this.isOneFoo = isOneFoo;
    }

    public boolean is1Foo() {
        return is1Foo;
    }

    public void set1Foo(boolean is1Foo) {
        this.is1Foo = is1Foo;
    }

    public boolean isOneFoo() {
        return isOneFoo;
    }

    public void setOneFoo(boolean oneFoo) {
        isOneFoo = oneFoo;
    }
}
```

serialization behavior differs between Jackson 2 & 3. 

Jackson 2 serializes this class instance to:
```json
{"1Foo":false,"oneFoo":false}
```

while Jackson 3 to:
```json
{"oneFoo":false}
```

Run `org.example.ComparisonTest` to see this happen.