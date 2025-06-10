# Codtech Java Internship – Task 1: File Handling Utility

---

## 🏢 Internship Details

- **Company**: CODTECH IT SOLUTIONS PVT. LTD.
- **Name**: SHIVAM MISHRA
- **Intern ID**: CT12WS112
- **Domain**: Java Programming
- **Internship Duration**: 12 Weeks (March 28, 2025 – June 28, 2025)
- **Mentor**: NEELA SANTOSH KUMAR

---
## 📝 Task Description

This Java program sends an HTTP GET request to a public REST API and parses the JSON response using `org.json` library.

🔗 **API Endpoint Used**:  
`https://jsonplaceholder.typicode.com/users`

It displays selected user details such as:
- Name  
- Email  
- City (from address object)

---

## 🛠️ Tools & Technologies Used

- **Programming Language**: Java (JDK 22)  
- **IDE Used**: Eclipse IDE  
- **API Handling**: `HttpURLConnection`, `BufferedReader`  
- **JSON Parsing**: `org.json` (via `json-20240303.jar`)  
- **I/O**: `InputStreamReader`, `StringBuilder`

---

## 📂 Files Included

- `ApiFetcher.java` — main Java file to fetch & display user data  
- `json-20240303.jar` — external library for parsing JSON

---

## ▶️ How to Run

1. Open the project in **Eclipse IDE**  
2. Add `json-20240303.jar` to classpath  
   - Right-click project → Build Path → Configure Build Path → Add External JARs  
3. Run `ApiFetcher.java`  
4. Output will display user list with name, email, and city

---

## 📸 Output Screenshot
