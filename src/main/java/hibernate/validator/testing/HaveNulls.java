package hibernate.validator.testing;

import javax.validation.constraints.NotNull;

import java.util.Objects;

/**
 *
 */
public class HaveNulls {

    /**
     * First text field
     */
    @NotNull
    private String textField;

    /**
     * First text field
     */
    @NotNull
    private String secondTextField;

    // Getters omitted for the clarity

    public HaveNulls(String textField, String secondTextField) {
        this.textField = textField;
        this.secondTextField = secondTextField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HaveNulls haveNulls = (HaveNulls) o;
        return Objects.equals(textField, haveNulls.textField) &&
                Objects.equals(secondTextField, haveNulls.secondTextField);
    }

    @Override
    public int hashCode() {
        // Similar hashCode that Immutables auto-generate
        int result = 5381;
        result += (result << 5) + textField.hashCode();
        result += (result << 5) + secondTextField.hashCode();
        return result;

        //return Objects.hash(textField, secondTextField);
    }
}
