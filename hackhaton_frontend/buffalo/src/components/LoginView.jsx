const LoginView = ({ onLogin, onRegister }) => {
    let email = "";
    let password = "";
    const onChangeEmail = (newValue) => {
      email = newValue;
    };
    const onChangePassword = (newValue) => {
      password = newValue;
    };
    return (
      <div>
        <a>Welcome</a>
        <input
          type="text"
          className="form-control"
          placeholder="email"
          onChange={(newValue) => onChangeEmail(newValue.target.value)}
        />
        <input
          type="text"
          className="form-control"
          placeholder="password"
          onChange={(newValue) => onChangePassword(newValue.target.value)}
        />
        <div className="d-grid gap-2 col-6 mx-auto">
          <button
            type="button"
            className="btn btn-primary"
            onClick={() => onLogin(email, password)}
          >
            Login
          </button>
          <button type="button" className="btn btn-link">
            Forgot Password?
          </button>
          <button type="button" className="btn btn-link">
            Privacy
          </button>
          <button
            type="button"
            className="btn btn-link"
            onClick={() => onRegister()}
          >
            Register
          </button>
        </div>
      </div>
    );
  };
  
  export default LoginView;