package structra.assignment.task.impl;

import structra.assignment.framework.llm.KeyProvider;

public class KeyProviderImpl implements KeyProvider {

    private static final String API_KEY = "structra-1343abnc-dGhpcyBpcyBub3Qgb3VyIGFwaSBrZXksIG5pY2UgdHJ5IHRobyA6KQ==";

    @Override
    public String getApiKey() {
        if (API_KEY == null || API_KEY.isBlank()) {
            throw new RuntimeException("API-KEY is null or empty");
        }
        return API_KEY;
    }
}
