<b>Author</b>
<p>Kade Omprasad<p>
#User registration and authentication using java servelts
<u><h2>Description</h2></u>
The <b>AmazonApp Registration and Login System</b> is a web-based application designed to handle user registration and authentication processes for an online platform similar to Amazon. The system ensures secure storage and retrieval of user data using password encryption and includes a user-friendly interface for registration and login.

<u><h2>Key Features</h2></u>
<ol>
<li><b>User Registration:</b>
<ul>
<li>Users can register by providing their ID, name, password, email, and phone number.</li>

<li>Form validation to ensure all required fields are filled out.</li>

<li>Passwords are securely encrypted using BCrypt before storage in the database.</li>

<li>Successful registration redirects users to a success page, while failures redirect to an error page.</li></ul></li>

<li>User Login:

<ul><li>Users can log in by providing their username and password.</li>

<li>The system verifies the credentials by comparing the provided password with the encrypted password stored in the database.</li>

<li>Successful login redirects users to the dashboard, while failures redirect to an error page.
</li></ul></li>

<li>Database Management:

<ul><li>Utilizes MySQL for storing user information.</li>

<li>Ensures secure connections to the database using JDBC.
</li></ul></li>

<li>Web Interface:

<ul><li>A clean and intuitive HTML/CSS-based interface for user registration and login.</li>

<li>Form elements include input fields for ID, name, password, email, and phone number.
</li></ul></li>
</ol>

<u><h2>Technology Stacks:</h2></u>
<ol>
<li><b>Frontend:</b> HTML, CSS</li>

<li><b>Backend:</b> Java Servlets</li>

<li><b>Database:</b> MySQL</li>

<li><b>Encryption:</b> BCrypt for password hashing</li>

<li><b>Tools:</b> Apache Tomcat for server deployment</li>
</ol>
<u><h2>System Architecture:</h2></u>
<ol>
<li>
Frontend (HTML/CSS):
<ul>
<li><b>Registration Page:</b> Users enter their details and submit the form.</li>

<li><b>Login Page:</b> Users enter their credentials to log in.</li>
</ul>
</li>
<li>
Backend (Java Servlets):
<ul>
<li><b>UserController:</b> Handles user registration by receiving form data, encrypting the password, and storing the user details in the database.</li>
<li><b>LoginController:</b> Handles user authentication by verifying the provided credentials against the stored data.</li>
</ul>
</li>
<li>
Database (MySQL):
<ul><li>
<b>User Table:</b> Stores user details including ID, name, encrypted password, email, and phone number.
</li></ul>
</li>
<li>
Security Considerations:
<ul>
<li><b>Password Encryption:</b> Ensures that user passwords are stored securely using BCrypt hashing.</li>

<li><b>Form Validation:</b> Prevents incomplete or invalid data from being submitted.</li>

<li><b>Secure Database Connections:</b> Protects data during transmission between the application and the database.</li>
</ul>
</li>
</ol>
<u><h2>How to Run:</h2></u>
<ol>
<li><b>Set Up the Database:</b>
<ul>
<li>Install MySQL and create a database named amazon.</li>

<li>Create a table users with columns for ID, name, encrypted password, email, and phone number.</li>
</ul>
</li>
<li>
<b>Deploy the Application:</b>
<ul>
<li>Set up Apache Tomcat and deploy the web application.</li>

<li>Ensure JDBC drivers are correctly configured and the database connection details are accurate.</li>
</ul>
</li>
<li>
<b>Access the Application:</b>
<ul>
<li>Open the registration page (http://localhost:9090/AmazonApp/register.html) to create a new user account.</li>

<li>Use the login page (http://localhost:9090/AmazonApp/login.html) to log in with the registered credentials.</li>
</ul>
</li>
</ol>
This project demonstrates a secure and efficient way to manage user authentication for web applications. Feel free to modify and expand on this basic framework to suit your specific needs and requirements!
