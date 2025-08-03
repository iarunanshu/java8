package com.arunanshu.optional;

import java.util.Optional;

/*
    Advantages of Optional
        Null checks are not required.
        No more NullPointerException at run-time.
        We can develop clean and neat APIs.
        No more Boiler plate code

    Important methods provided by Optional in Java 8,
        of() - Returns an Optional describing the given non-null value.
               If you pass null to Optional.of(), it will immediately throw a NullPointerException
        ofNullable() - Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
                       if you pass null value then it won't throw exception instead it returns empty optional
        empty() - Returns an empty Optional instance
        isPresent() - Returns true if a value is present; otherwise, returns false
        get() - Returns the value wrapped by this Optional if present; otherwise, throws a NoSuchElementException
        ifPresent() - Ifa value is present, invokes the specified consumer with the value; otherwise, does nothing
        orElse() - Returns the value if present; otherwise, returns the given default value
        orElseGet () - Returns the value if present; otherwise, returns the one provided by the given Supplier
        orElseThrow() - Returns the value if present; otherwise, throws the exception created by the given Supplier
        map () - If a value isis present, applies the provided mapping function to it
        filter() - If the value is present and matches the given predicate, returns this Optional; otherwise, returns the empty one
 */
public class AllOptionalMethod {
    public static void main(String[] args) {
        //1
        String str1="Arunanshu";
        Optional<String> s1=Optional.ofNullable(str1);
        System.out.println("1"+s1);
        //2
        String str2=null;
        Optional<String> s2=Optional.ofNullable(str2);
        System.out.println("2"+s2);
        //3
        Optional s3=Optional.empty();
        System.out.println("3"+s3);
        //4
        Optional<String> s4=Optional.ofNullable(null);
        System.out.println("4"+s4.isPresent());
        //5
        Optional<String> s5 = Optional.of("Hyderabad");
        String str5=s5.get();
        System.out.println("5"+ str5);
        //6
        Optional<String>s6=Optional.ofNullable("Hyd");
        s6.ifPresent(s -> System.out.println("6"+s));
        //7
        Optional<String>s7=Optional.ofNullable("Banglore");
        System.out.println("7"+s7.orElse("value is absent"));
        //8
        Optional<String>s8=Optional.ofNullable(null);
        System.out.println("8"+s8.orElseGet(()->"value is absent"));
        //9
        Optional<String>s9=Optional.ofNullable("jena");
        System.out.println("9"+s9.orElseThrow(()->new IllegalStateException("value is absent")));
        //10
        System.out.println("10"+s9.map(String::toUpperCase));
        //11
        System.out.println("11"+s9.filter(x->x.length()>2));
    }
}
