import { h } from 'vue'

// export component
export default {
    name: "login-view",
    functional: true,
    render(h, c) {
      let { onLogin, onRegister } = c.props
      let email = ""
      let password = ""
  
      const onChangeEmail = newValue => {
        email = newValue
      }
  
      const onChangePassword = newValue => {
        password = newValue
      }
  
      return (
        <div>
          <a>Welcome</a>
          <input
            type="text"
            class="form-control"
            placeholder="email"
            onChange={newValue => onChangeEmail(newValue.target.value)}
          />
          <input
            type="text"
            class="form-control"
            placeholder="password"
            onChange={newValue => onChangePassword(newValue.target.value)}
          />
          <div class="d-grid gap-2 col-6 mx-auto">
            <button
              type="button"
              class="btn btn-primary"
              onClick={() => onLogin(email, password)}
            >
              Login
            </button>
            <button type="button" class="btn btn-link">
              Forgot Password?
            </button>
            <button type="button" class="btn btn-link">
              Privacy
            </button>
            <button
              type="button"
              class="btn btn-link"
              onClick={() => onRegister()}
            >
              Register
            </button>
          </div>
        </div>
      )
    }
  }
  