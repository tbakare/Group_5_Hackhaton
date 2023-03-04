<template>
  <div>
    <form @submit.prevent="submitForm" v-if="!formSubmitted">
      <h1>Sexual History</h1>
      <input type="radio" name="sh" value="i-have-symptoms" />
      <label>I have symptoms of an STI</label><br>
      <input type="radio" name="sh" value="partner-has-symptoms" />
      <label>My sex partner has an STI</label><br>
      <input type="radio" name="sh" value="partner-has-symptoms" />
      <label>I just want testing</label><br>

      <h2>What symptoms are you having?</h2>
      <input type="text" placeholder="" /><br>
      <h2>Number of sex partners</h2>
      <h3>In the past 2 months</h3>
      <input type="text" placeholder="" />
      <h3>In the past 12 months</h3>
      <input type="number" placeholder="" /><br>

      <h2>Gender of sex partners</h2>
      <input type="radio" name="gender" value="Male" />
      <label>Male</label>
      <input type="radio" name="gender" value="Female" />
      <label>Female</label>
      <input type="radio" name="gender" value="Both" />
      <label>Both</label><br>

      <h2>Have you ever been diagnosed with HIV?</h2>
      <input type="radio" name="hiv" value="Yes" />
      <label>Yes</label>
      <input type="radio" name="hiv" value="No" />
      <label>No</label><br>

      <h2>Have you ever had syphilis?</h2>
      <input type="radio" name="syphilis" value="Yes" />
      <label>Yes</label>
      <input type="radio" name="syphilis" value="No" />
      <label>No</label><br>

      <h2>Which testing would you like to order?</h2>
      <input type="radio" name="order" value="All" />
      <label>All</label><br>
      <input type="radio" name="order" value="HIV and Syphilis Only" />
      <label>HIV and Syphilis Only</label><br>
      <input type="radio" name="order" value="Chlamydia and Gonorrhea Only" />
      <label>Chlamydia and Gonorrhea Only</label><br>
      <input class="submit" type="submit" value="Submit">

    </form>
    <div v-if="formSubmitted">
      <h3>Order Sent</h3>
      <!-- <p>Name: {{ name }}</p>
      <p>Email: {{ email }}</p>
      <p>Gender: {{ gender }}</p> -->
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