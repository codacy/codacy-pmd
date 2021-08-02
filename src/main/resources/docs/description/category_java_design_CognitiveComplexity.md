Since: PMD 6.35.0

Methods that are highly complex are difficult to read and more costly to maintain. If you include too much decisional
            logic within a single method, you make its behavior hard to understand and more difficult to modify.

            Cognitive complexity is a measure of how difficult it is for humans to read and understand a method. Code that contains
            a break in the control flow is more complex, whereas the use of language shorthands doesn't increase the level of
            complexity. Nested control flows can make a method more difficult to understand, with each additional nesting of the
            control flow leading to an increase in cognitive complexity.

            Information about Cognitive complexity can be found in the original paper here:
            &lt;https://www.sonarsource.com/docs/CognitiveComplexity.pdf&gt;

            By default, this rule reports methods with a complexity of 15 or more. Reported methods should be broken down into less
            complex components.

Example(s):
```
public class Foo {
  // Has a cognitive complexity of 0
  public void createAccount() {
    Account account = new Account("PMD");
    // save account
  }

  // Has a cognitive complexity of 1
  public Boolean setPhoneNumberIfNotExisting(Account a, String phone) {
    if (a.phone == null) {                          // +1
      a.phone = phone;
      return true;
    }

    return false;
  }

  // Has a cognitive complexity of 4
  public void updateContacts(List<Contact> contacts) {
    List<Contact> contactsToUpdate = new ArrayList<Contact>();

    for (Contact contact : contacts) {                           // +1
      if (contact.department.equals("Finance")) {                // +2 (nesting = 1)
        contact.title = "Finance Specialist";
        contactsToUpdate.add(contact);
      } else if (contact.department.equals("Sales")) {           // +1
        contact.title = "Sales Specialist";
        contactsToUpdate.add(contact);
      }
    }
    // save contacts
  }
}
```
