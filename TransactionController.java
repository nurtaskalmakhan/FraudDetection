package ECommerce.Java FRaud Detection;

@Controller
public class TransactionController {
    @Autowired
    private DataService dataService;

    @GetMapping("/transactions")
    public String showTransactions(Model model) {
        List<Transaction> allTransactions = dataService.getAllTransactions();
        model.addAttribute("transactions", allTransactions);
        return "transactions-page";
    }

    @GetMapping("/transactions/{customerId}")
    public String showCustomerTransactions(@PathVariable String customerId, Model model) {
        List<Transaction> customerTransactions = dataService.getTransactionsByCustomerId(customerId);
        model.addAttribute("transactions", customerTransactions);
        return "customer-transactions-page";
    }

    // Other methods for data processing or handling form submissions
}

