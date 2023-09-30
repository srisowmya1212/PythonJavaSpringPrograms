const mongoose=require("mongoose")

mongoose.connect("mongodb://localhost:27017/eddata")
.then(()=>{
    console.log("Database connected successfully");
})
.catch(()=>{
    console.log("failed to connect to database");
})

const LogInData=new mongoose.Schema({
    email:{
        type:String,
        required:true
    },
    password:{
        type:String,
        required:true
    }
})

const collection=new mongoose.model("Users",LogInData)

module.exports=collection