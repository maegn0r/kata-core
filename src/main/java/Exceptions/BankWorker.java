//package Exceptions;
//
//public class BankWorker {
//    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
//        try {
//            return bankWorker.checkClientForCredit(bankClient);
//        } catch (BadCreditHistoryException | ProblemWithLawException ex) {
//            if (ex instanceof BadCreditHistoryException) {
//                System.out.println("Проблемы с банковской историей");
//                return false;
//            }
//        }
//    }
//}