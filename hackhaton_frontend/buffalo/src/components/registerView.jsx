const Register = ({ onRegister }) => {
    const user = {
      name: "",
      date: "",
      hCNumber: "",
      tNumber: "",
      address: "",
      email: "",
      phone: "",
    };
    return (
      <div className="mb-3">
        <h1>Register an account</h1>
        <label className="form-label">First and last name</label>
        <div className="input-group">
          <input
            type="text"
            className="form-control"
            placeholder="Text field in empty state."
            aria-describedby="basic-addon3"
            onChange={(newValue) => {
              user.name = newValue.target.value;
            }}
          />
        </div>
  
        <label className="form-label">Date of birth (must be 16 or older)</label>
        <div className="input-group">
          <input
            type="text"
            className="form-control"
            placeholder="Text field in empty state."
            aria-describedby="basic-addon3"
            onChange={(newValue) => {
              user.date = newValue.target.value;
            }}
          />
        </div>
  
        <label className="form-label">Alberta personal health care number</label>
        <div className="input-group">
          <input
            type="text"
            className="form-control"
            placeholder="Text field in empty state."
            aria-describedby="basic-addon3"
            onChange={(newValue) => {
              user.hCNumber = newValue.target.value;
            }}
          />
        </div>
  
        <label className="form-label">Treaty number</label>
        <div className="input-group">
          <input
            type="text"
            className="form-control"
            placeholder="Text field in empty state."
            aria-describedby="basic-addon3"
            onChange={(newValue) => {
              user.tNumber = newValue.target.value;
            }}
          />
        </div>
  
        <label className="form-label">Mailing address</label>
        <div className="input-group">
          <input
            type="text"
            className="form-control"
            placeholder="Text field in empty state."
            aria-describedby="basic-addon3"
            onChange={(newValue) => {
              user.address = newValue.target.value;
            }}
          />
        </div>
  
        <label className="form-label">Email address</label>
        <div className="input-group">
          <input
            type="text"
            className="form-control"
            placeholder="Text field in empty state."
            aria-describedby="basic-addon3"
            onChange={(newValue) => {
              user.email = newValue.target.value;
            }}
          />
        </div>
  
        <label className="form-label">Phone number</label>
        <div className="input-group">
          <input
            type="text"
            className="form-control"
            placeholder="Text field in empty state."
            aria-describedby="basic-addon3"
            onChange={(newValue) => {
              user.email = newValue.target.value;
            }}
          />
        </div>
  
        <div className="d-grid gap-2 col-6 mx-auto">
          <button
            type="button"
            className="btn btn-primary"
            onClick={() => onRegister(user)}
          >
            Register
          </button>
        </div>
      </div>
    );
  };
  
  export default Register;