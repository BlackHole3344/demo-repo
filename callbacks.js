// /express server 



const express = require("express")


const app = express() 


const port = 3000 
app.get("/room1" , (req , res) => {
  const {name} = req.body ; 

  console.log(name) 
  res.status(200).json({success : true , message : `hello ${name} from `})
})










