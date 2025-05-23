
# Tester_Group13

This project contains 16 automated test cases for the Railway Ticket Booking System developed by Group 13. It follows the Page Object Model (POM) design pattern and is structured as a Maven-based Java project.

---

## 📁 Project Structure

```
src/
├── main/
│   └── java/
│       ├── common/
│       │   ├── Common/
│       │   │   └── Untilities.java
│       │   └── Constant/
│       │       └── Constant.java
│       ├── org/example/
│       │   └── Main.java
│       └── pageObjects/Railway/
│           ├── BookTicketPage.java
│           ├── ChangePassword.java
│           ├── ForgotPassword.java
│           ├── GeneralPage.java
│           ├── HomePage.java
│           ├── LoginPage.java
│           ├── MyTicket.java
│           ├── RegisterPage.java
│           └── TimeTablePage.java
└── test/
    └── java/com/railway/
        ├── base/
        │   └── baseTest.java
        └── test/
            ├── PreparationCommonTest.java
            ├── TC01.java
            ├── TC02.java
            ├── TC03.java
            ├── TC04.java
            ├── TC05.java
            ├── TC06.java
            ├── TC07.java
            ├── TC08.java
            ├── TC09.java
            ├── TC10.java
            ├── TC11.java
            ├── TC12.java
            ├── TC13.java
            ├── TC14.java
            ├── TC15.java
            └── TC16.java
```

---

## 🧪 Test Case List

- **TC01–TC16**: Functional UI test cases covering login, registration, ticket booking, password changes, and more.

---

## 🛠️ Technologies Used

- Java 17+
- Maven
- TestNG
- Selenium WebDriver
- Page Object Model (POM)

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/nguyenhoangsang7/Tester_Group13.git
```

2. Navigate to the project folder:

```bash
cd Tester_Group13
```

3. Run tests with Maven:

```bash
mvn test
```

---

## 👥 Group Members

- Group 13 – Software Testing Course  
(You may list member names here)

---

## 📄 License

This project is intended for academic and non-commercial educational use only.
