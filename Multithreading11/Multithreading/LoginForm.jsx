import React from 'react';
import './login.css';

class LoginForm extends React.Component {
  componentDidMount() {
    const handleCredentialResponse = (response) => {
      console.log("Google Token: ", response.credential);

      const jwt = response.credential;
      const userData = JSON.parse(atob(jwt.split('.')[1]));

      alert("Welcome, " + userData.name);
      console.log("User Info: ", userData);

      localStorage.setItem("user", JSON.stringify(userData));

      document.body.innerHTML = `
        <h2>Welcome, ${userData.name}!</h2>
        <img src="${userData.picture}" alt="Profile Picture">
      `;
    };

    window.onload = function () {
      google.accounts.id.initialize({
        client_id: "113078392706-5p1kkul4u7m887uslprndqcagbfj678e.apps.googleusercontent.com", // Replace with your actual Client ID
        callback: handleCredentialResponse
      });

      google.accounts.id.renderButton(
        document.getElementById("googleLogin"), 
        { theme: "outline", size: "large" }
      );

      document.getElementById("googleLogin").addEventListener("click", function () {
        google.accounts.id.prompt();
      });
    };
  }

  render() {
    return (
      <div className="container">
        <div className="screen">
          <div className="screen__content">
            <form className="login">
              <div className="login__field">
                <i className="login__icon fas fa-user"></i>
                <input type="text" className="login__input" placeholder="User name / Email" />
              </div>
              <div className="login__field">
                <i className="login__icon fas fa-lock"></i>
                <input type="password" className="login__input" placeholder="Password" />
              </div>
              <button className="button login__submit">
                <span className="button__text">Log In Now</span>
                <i className="button__icon fas fa-chevron-right"></i>
              </button>             
            </form>
            <div className="social-login">
              <h3>log in via</h3>
              <div className="social-icons">
                <div id="googleLogin" className="social-login__icon"></div>
              </div>
            </div>
          </div>
          <div className="screen__background">
            <span className="screen__background__shape screen__background__shape4"></span>
            <span className="screen__background__shape screen__background__shape3"></span>      
            <span className="screen__background__shape screen__background__shape2"></span>
            <span className="screen__background__shape screen__background__shape1"></span>
          </div>        
        </div>
      </div>
    );
  }
}

export default LoginForm;
ho