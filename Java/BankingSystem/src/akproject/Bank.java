package akproject;

    public class Bank {

        private String customerName;
        private String customerEmail;
        private String customerPhoneNum;
        private String accountNumber;
        private double balance;

        public Bank(String customerName, String customerEmail, String customerPhoneNum, String accountNumber, double balance) {
            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.customerPhoneNum = customerPhoneNum;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void DepositMoney(double DepositMoney){
            balance += DepositMoney;
            System.out.println("\nThe deposit is successful, the new balance is ₹"+balance);
        }

        public void WithdrawMoney(double WithdrawMoney){
            balance -= WithdrawMoney;

            if (balance<0){
                System.out.println("\nInsufficient balance");
            }
            else{
                System.out.println("\nThe withdrawal is successful, the new balance is ₹"+balance);
            }

        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
        }

        public String getCustomerPhoneNum() {
            return customerPhoneNum;
        }

        public void setCustomerPhoneNum(String customerPhoneNum) {
            this.customerPhoneNum = customerPhoneNum;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }