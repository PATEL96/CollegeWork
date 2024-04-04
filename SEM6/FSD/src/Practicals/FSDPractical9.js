const mongoose = require('mongoose');

// Connect to MongoDB
mongoose.connect('mongodb+srv://patel96:PQLGYzSQiOvIyT7u@anychat.vsxj2el.mongodb.net/?retryWrites=true&w=majority&appName=AnyChat', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

// Define a schema
const Schema = mongoose.Schema;
const userSchema = new Schema({
  name: String,
  email: String,
  age: Number,
});

// Define a model
const User = mongoose.model('User', userSchema);

// Create operation
const createUser = async ({name, email, age}) => {
  try {
    const newUser = new User({
      name,
      email,
      age,
    });
    const savedUser = await newUser.save();
    console.log('User created:', savedUser);
  } catch (error) {
    console.error('Error creating user:', error);
  }
};

// Read operation
const findUsers = async () => {
  try {
    const users = await User.find();
    console.log('Users found:', users);
  } catch (error) {
    console.error('Error finding users:', error);
  }
};

// Update operation
const updateUser = async (id) => {
  try {
    const updatedUser = await User.findByIdAndUpdate(id, { age: 35 }, { new: true });
    console.log('User updated:', updatedUser);
  } catch (error) {
    console.error('Error updating user:', error);
  }
};

// Delete operation
const deleteUser = async (id) => {
  try {
    const deletedUser = await User.findByIdAndDelete(id);
    console.log('User deleted:', deletedUser);
  } catch (error) {
    console.error('Error deleting user:', error);
  }
};

// createUser({name: "PATEl96", email: "test@patel96.com", age: 22})
// createUser({name: "rajdpatel", email: "raj@patel96.com", age: 22})
// createUser({name: "Raj D. Patel", email: "rdp@patel96.com", age: 22})
// createUser({name: "PATEl 96", email: "p96@patel96.com", age: 22})

// findUsers()

deleteUser("660ea7e8420d46023ff5fc9c")

findUsers()