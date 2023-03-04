<template>
  <div>
    <form @submit.prevent="submitForm" v-if="!formSubmitted">
      <h1>Sexual History</h1>
      <input type="radio" value="i-have-symptoms" />
      <label>I have symptoms of an STI</label><br>
      <input type="radio" value="partner-has-symptoms" />
      <label>My sex partner has an STI</label><br>
      <input type="radio" value="partner-has-symptoms" />
      <label>I just want testing</label><br>

      <h2>What symptoms are you having?</h2>
      <input type="text" placeholder="" /><br>
      <h2>Number of sex partners</h2>
      <h3>In the past 2 months</h3>
      <input type="text" placeholder="" />
      <h3>In the past 12 months</h3>
      <input type="number" placeholder="" /><br>

      <h2>Gender of sex partners</h2>
      <input type="radio" value="Male" />
      <label>Male</label>
      <input type="radio" value="Female" />
      <label>Female</label>
      <input type="radio" value="Both" />
      <label>Both</label><br>

      <h2>Have you ever had syphilis?</h2>
      <input type="radio" value="Yes" />
      <label>Yes</label>
      <input type="radio" value="No" />
      <label>No</label><br>
      <input class="submit" type="submit" value="Submit">

    </form>
    <div v-if="formSubmitted">
      <h3>Form Submitted</h3>
      <p>Name: {{ name }}</p>
      <p>Email: {{ email }}</p>
      <p>Gender: {{ gender }}</p>
      <small>Click on run to launch the app again.</small>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      name: "",
      email: "",
      gender: "",
      formSubmitted: false
    };
  },
  methods: {
    submitForm: function () {
      this.formSubmitted = true
    }
  },
};
</script>
<style>
form {
  padding: 10px;
  /* border: 2px solid black; */
  border-radius: 5px;
}

input {
  padding: 4px 8px;
  margin: 4px;
}

input[type='radio'] {
  /* padding: 8px 8px; */
  margin: 10px;
}

h2 {
  font-size: 18px;
  margin: 4px;
  font-weight: 500;
}

/* .submit {
  font-size: 15px;
  color: #fff;
  background: #222;
  padding: 6px 12px;
  border: none;
  margin-top: 8px;
  cursor: pointer;
  border-radius: 5px;
} */
</style>