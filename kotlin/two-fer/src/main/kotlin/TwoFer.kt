fun twofer(name: String = "One for you, one for me."): String {
    if (name != "One for you, one for me." || name =="") {
        return "One for $name, one for me."
    } else {
        return name
    }
}
