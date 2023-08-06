module hello {
 //only can be access using reflection, (spring , hibernate)
  //exports hello;//export works for both direct and with reflection
   opens hello;//only with reflection
}