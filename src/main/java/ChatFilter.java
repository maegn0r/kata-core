//import java.util.Arrays;
//
//public class ChatFilter {
//    public static void main(String[] args) {
//
//        String[] spamKeywords = {"spam", "bad"};
//        int commentMaxLength = 40;
//        TextAnalyzer[] textAnalyzers1 = {
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers2 = {
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers3 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers4 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords)
//        };
//        TextAnalyzer[] textAnalyzers5 = {
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers6 = {
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords)
//        };
//
//        // тестовые комментарии
//        String[] tests = new String[8];
//
//        tests[0] = "This comment is so good.";                            // OK
//        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
//        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
//        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
//        tests[4] = "This comment is so bad....";                          // SPAM
//        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
//        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
//        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
//        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
//                textAnalyzers4, textAnalyzers5, textAnalyzers6};
//        ChatFilter testObject = new ChatFilter();
//        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
//        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
//        for (String test : tests) {
//            numberOfAnalyzer = 1;
//            System.out.print("test #" + numberOfTest + ": ");
//            System.out.println(test);
//            for (TextAnalyzer[] analyzers : textAnalyzers) {
//                System.out.print(numberOfAnalyzer + ": ");
//                System.out.println(testObject.checkLabels(analyzers, test));
//                numberOfAnalyzer++;
//            }
//            numberOfTest++;
//        }
//    }
//
//    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
//        for (int i = 0; i < analyzers.length; i++) {
//            Label label = analyzers[i].processText(text);
//            if (label != Label.OK) {
//                return label;
//            }
//        }
//        return Label.OK;
//    }
//
//
//    interface TextAnalyzer {
//        Label processText(String text);
//    }
//
//    public abstract class KeywordAnalyzer implements TextAnalyzer {
//        protected abstract String[] getKeywords();
//
//        protected abstract Label getLabel();
//
//        @Override
//        public Label processText(String text) {
//            String[] wordsArray = getKeywords();
//            for (int i = 0; i < wordsArray.length; i++) {
//                if (text.contains(wordsArray[i])) {
//                    return getLabel();
//                }
//            }
//            return Label.OK;
//        }
//    }
//
//    enum Label {
//        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
//    }
//
//    public class SpamAnalyzer extends KeywordAnalyzer {
//        private String[] keywords;
//        private Label label = Label.SPAM;
//
//        @Override
//        public Label processText(String text) {
//            return super.processText(text);
//        }
//
//        @Override
//        protected String[] getKeywords() {
//            return keywords;
//        }
//
//        @Override
//        protected Label getLabel() {
//            return label;
//        }
//
//        public SpamAnalyzer(String[] keywords) {
//            this.keywords = keywords;
//        }
//    }
//
//    public class NegativeTextAnalyzer extends KeywordAnalyzer {
//        private String[] keywords = {":(", "=(", ":|"};
//        private Label label = Label.NEGATIVE_TEXT;
//
//        @Override
//        public Label processText(String text) {
//            return super.processText(text);
//        }
//
//        @Override
//        protected String[] getKeywords() {
//            return keywords;
//        }
//
//        @Override
//        protected Label getLabel() {
//            return label;
//        }
//
//    }
//
//    public class TooLongTextAnalyzer implements TextAnalyzer {
//
//        private final int maxLength;
//
//        @Override
//        public Label processText(String text) {
//            if (text.length() > maxLength) {
//                return Label.TOO_LONG;
//            } else {
//                return Label.OK;
//            }
//        }
//
//        public TooLongTextAnalyzer(int maxLength) {
//            this.maxLength = maxLength;
//        }
//    }
//}

// 2.1.7


