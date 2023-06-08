# SMD-OOImplementation

This is a basic implementation of a Bank System following the requirements seen in the Software Modeling and Design course.

We have chosen to implement the following design patterns:
- Command where we added DepositCommand and WithdrawCommand objects and execute them via the Bank's executeTransaction method.
- State where calculateInterest() method in the Account delegates to the current InterestMechanism implementation. 
- Decorator where OverdraftAccount decorates BasicAccount and allows it to go into negative balance up to the overdraft limit. The OverdraftAccount overrides the withdraw method and provides its own implementation while delegating the deposit and getBalance methods to the decorated account.
- Chain of Responsability

We have made the unit tests with the help of Intel Jay IDE and the test reports can be found in the out file.
