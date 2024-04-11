import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(UayAnnotations.class)
@Documented
public @interface UayAnnotation {
    int Revision();
    String Author();
    String ModifiedDate();
    String ModifyReason();
    String[] Approvers();
}
