package homework.homework02;

public class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {

        StringBuilder builder = new StringBuilder(QUERY);

        PARAMS = PARAMS.replace("{\"", "").replace("}", "");
        PARAMS = PARAMS.replace("\":", "=").replace(" \"", " and ");
        PARAMS = PARAMS.replace("\"", "'");
        String[] arrParams = PARAMS.split(",");

        for (String value : arrParams) {
            if (! value.contains("null")){
                builder.append(value);
            }
        }
        return builder;
    }
}
