package exp.exp6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pass {
    private String password;
    private String degree;
    private Pattern strong = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    private Pattern medium = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");

    public String getDegree() {
        return degree;
    }

    private void calDegree() {
        Matcher strongMatcher = strong.matcher(this.password);
        Matcher mediumMatcher = medium.matcher(this.password);
        if (strongMatcher.matches()) {
            degree = "strong";
        } else if (mediumMatcher.matches()) {
            degree = "medium";
        } else {
            degree = "easy";
        }
    }

    public Pass(String password) {
        this.password = password;
        this.calDegree();
    }
}
