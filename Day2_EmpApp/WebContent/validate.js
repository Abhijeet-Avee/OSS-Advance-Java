function validate() {
    let name = document.getElementById("nameId").value;
    let city = document.getElementById("cityId").value;
    let desi = document.getElementById("desiId").value;
    let salary = document.getElementById("salaryId").value;


    if (isBlank(name)) {
        document.getElementById("nameMsg").innerHTML = "Enter name";
        document.getElementById("nameMsg").style.color = "red";
        return false;
    }

    if (isBlank(city)) {
        document.getElementById("cityMsg").innerHTML = "Enter city";
        document.getElementById("cityMsg").style.color = "red";
        return false;
    }

    if (isBlank(desi)) {
        document.getElementById("desiMsg").innerHTML = "Enter desi";
        document.getElementById("desiMsg").style.color = "red";
        return false;
    }

    if (isBlank(salary)) {
        document.getElementById("salaryMsg").innerHTML = "Enter salary";
        document.getElementById("salaryMsg").style.color = "red";
        return false;
    }
 
    return true;
}
function isBlank(val) {
    return (val.trim() == "") ? true : false;
}