function validateForm(){
    let username = document.getElementsByName("user"); //try it later
    // let username = document.mla.user.value;
    let password = document.mla.pwd.value;

    if(username==null || username==""){
        alert("Enter your username");
        return false;
    }
    else if(password.length < 8){
        alert("Minimum Password length is 8");
        return false;
    }
}