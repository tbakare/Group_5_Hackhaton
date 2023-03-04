import { h } from 'vue'

// export component
export default {
    name: "register",
    functional: true,
    render(h, c) {
      let { onRegister } = c.props
      const user = {
        name: "",
        date: "",
        hCNumber: "",
        tNumber: "",
        address: "",
        email: "",
        phone: ""
      }
      return (
        <div class="mb-3">
          <h1>Register an account</h1>
          <label class="form-label">First and last name</label>
          <div class="input-group">
            <input
              type="text"
              class="form-control"
              placeholder="Text field in empty state."
              aria-describedby="basic-addon3"
              onChange={newValue => {
                user.name = newValue.target.value
              }}
            />
          </div>
  
          <label class="form-label">Date of birth (must be 16 or older)</label>
          <div class="input-group">
            <input
              type="text"
              class="form-control"
              placeholder="Text field in empty state."
              aria-describedby="basic-addon3"
              onChange={newValue => {
                user.date = newValue.target.value
              }}
            />
          </div>
  
          <label class="form-label">Alberta personal health care number</label>
          <div class="input-group">
            <input
              type="text"
              class="form-control"
              placeholder="Text field in empty state."
              aria-describedby="basic-addon3"
              onChange={newValue => {
                user.hCNumber = newValue.target.value
              }}
            />
          </div>
  
          <label class="form-label">Treaty number</label>
          <div class="input-group">
            <input
              type="text"
              class="form-control"
              placeholder="Text field in empty state."
              aria-describedby="basic-addon3"
              onChange={newValue => {
                user.tNumber = newValue.target.value
              }}
            />
          </div>
  
          <label class="form-label">Mailing address</label>
          <div class="input-group">
            <input
              type="text"
              class="form-control"
              placeholder="Text field in empty state."
              aria-describedby="basic-addon3"
              onChange={newValue => {
                user.address = newValue.target.value
              }}
            />
          </div>
  
          <label class="form-label">Email address</label>
          <div class="input-group">
            <input
              type="text"
              class="form-control"
              placeholder="Text field in empty state."
              aria-describedby="basic-addon3"
              onChange={newValue => {
                user.email = newValue.target.value
              }}
            />
          </div>
  
          <label class="form-label">Phone number</label>
          <div class="input-group">
            <input
              type="text"
              class="form-control"
              placeholder="Text field in empty state."
              aria-describedby="basic-addon3"
              onChange={newValue => {
                user.email = newValue.target.value
              }}
            />
          </div>
  
          <div class="d-grid gap-2 col-6 mx-auto">
            <button
              type="button"
              class="btn btn-primary"
              onClick={() => onRegister(user)}
            >
              Register
            </button>
          </div>
        </div>
      )
    }
  }
  