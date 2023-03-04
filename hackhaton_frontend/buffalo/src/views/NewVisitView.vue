<template>
  <div>
    <form @submit.prevent="submitForm" v-if="!formSubmitted">
      <h1>Sexual History</h1>
      <input type="radio" v-model="gender" value="i-have-symptoms" />
      <label>I have symptoms of an STI</label><br>
      <input type="radio" v-model="gender" value="partner-has-symptoms" />
      <label>My sex partner has an STI</label><br>
      <input type="radio" v-model="gender" value="partner-has-symptoms" />
      <label>I just want testing</label><br>

      <input v-model="name" type="text" placeholder="Enter your name" /><br>
      <span>Email</span><br>
      <input v-model="email" type="email" placeholder="Enter your email" /><br>
      <label>Gender</label><br>

      <input type="radio" v-model="gender" value="Female" />
      <label>Female</label><br>
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

span {
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