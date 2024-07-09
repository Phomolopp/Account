This project simulates a multi-threaded banking application where multiple deposit and withdrawal transactions are performed on a single account simultaneously. The key components of the project include:

# Account Class:

Manages the account balance.
Provides methods to get and set the balance.
# AccountManager Class:

Implements the AccountInterface.
Handles synchronized deposit and withdrawal transactions on the account.
Ensures thread safety during transactions by using synchronized methods.
# DepositThread Class:

Implements the Runnable interface.
Simulates a deposit transaction on the account.
# WithdrawThread Class:

Implements the Runnable interface.
Simulates a withdrawal transaction on the account.
# AccountThread Class:

The main class that initializes the account and account manager.
Creates and starts multiple threads for deposit and withdrawal transactions with varying amounts.
The project demonstrates the use of threads to handle concurrent access to a shared resource (the account) and ensures that transactions are processed safely and accurately through synchronization mechanisms.
