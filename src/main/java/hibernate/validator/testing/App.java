package hibernate.validator.testing;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        HaveNulls haveNulls = new HaveNulls("first", null);
        Set<ConstraintViolation<HaveNulls>> constraintViolations = null;
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

            Validator validator = factory.getValidator();

            constraintViolations = validator.validate(haveNulls);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }

        if (constraintViolations != null) {
            constraintViolations.forEach(violation -> System.out.println(violation.getMessage()));
        }

    }
}
