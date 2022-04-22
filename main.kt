
// -------- Submodules for REQUESTOR --------
  // Objectives of Requestor:
  // 1. send URL to browserRequestHandler.
  // 2. browserRequestHandler edits URL and sends to Mediator.
  // 3. Mediator will send back correct username and password (if they exist) 
  //    by calling the loginInjector.
  // 4. loginInjector inputs username and password into the proper text fields.

// edits URL and sends to Mediator
fun browserRequestHandler(browserURL: String)  {
  /*
   <--- simplify URL for Mediator
  */
  sampleMediator(browserURL) // function for testing
}

// inputs username and password into the proper text fields
fun loginInjector(username: String, password: String)  {
  println("username(" + username + ") and password(" + password + ") will be injected into the browser.")
  /*
   <--- code for injecting into browser's proper test field
  */
}

// --- Sample Functions for testing ---

// simulates the Mediator module
fun sampleMediator(currentBrowser: String)  {
  var valid: Boolean = true
  var sampleUser: String = "sampleUser"
  var samplePass: String = "samplePass"

  println("Current browser is: " + currentBrowser)

  if (valid)  {
    loginInjector(sampleUser, samplePass)
  }
  else  {
    println("There did not exist a username/passord for that URL")
  }
}

// --------- MAIN ----------
fun main()  {
  // 1. send URL to browserRequestHandler.
  // 2. browserRequestHandler edits URL and sends to Mediator.
  // 3. Mediator will send back correct username and password (if they exist) 
  //    by calling the loginInjector.
  // 4. loginInjector inputs username and password into the proper text fields.
  
  var browserURL: String = "samepleURL.com/login";
  browserRequestHandler(browserURL)  
}