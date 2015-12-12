package org.ababup1192;

enum CompareType {
    EQUAL("=", true), EXCEEDS(">", true), AT_LEAST(">=", true), LESS_THAN("<", true), AT_MOST("<=", true), NOT_EQUAL(
            "<>", true), IS_NOT_NULL("IS NOT NULL", false), IS_NULL("IS NULL", false), LIKE("LIKE", true), BETWEEN(
            "BETWEEN", true), IN("IN", true), NOT_IN("NOT IN", true);

    private String text;
    private boolean hasRightExpression;

    CompareType(String text, boolean hasRightExpression) {
        this.text = text;
        this.hasRightExpression = hasRightExpression;
    }

    String getString() {
        return text;
    }

    boolean hasRightExpression() {
        return hasRightExpression;
    }

}
