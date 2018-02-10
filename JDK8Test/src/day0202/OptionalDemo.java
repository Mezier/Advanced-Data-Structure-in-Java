package day0202;

import java.util.Optional;

public class OptionalDemo {
   public static void main(String[] args) {
	Optional<String> op=Optional.of("Hello");
	/*op.ifPresent(value -> System.out.println("length:"+value.length()));
     Optional<String> s=op.map(value->value.toUpperCase());
     System.out.println(s.orElse("No value"));*/
	Optional empty=Optional.ofNullable(null);
	if(op.isPresent()){
		System.out.println(op.get());
	}
	  try{System.out.println(empty.get());
	  
	  }catch(Exception e){
		  e.getMessage();
	  }
	  op.ifPresent(value->System.out.println("length:"+value.length()));
	  System.out.println(empty.orElse("no value"));
	  System.out.println(op.orElse("there is value"));
	  System.out.println(empty.orElseGet(()->"defalt value"));
	  System.out.println(op.orElseGet(()->"default"));
	  Optional<String> upper=op.map(value->value.toUpperCase());
	  System.out.println(upper.orElse("no such value"));
	  upper=op.flatMap(value->Optional.of(value.toUpperCase()));
	  System.out.println(upper.orElse("novalue"));
	  Optional<String> num=op.filter(value->value.length()>5);
	  System.out.println(num.orElse("the length is less than 5"));
	  
   }
}
