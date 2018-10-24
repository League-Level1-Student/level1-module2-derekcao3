public class TeaParty {

       public String welcome(String name, boolean isWoman, boolean isKnighted)
       {
if(isWoman) {

if(isKnighted) {
	return "Hello Lady " +name;
}
else{return "Hello Ms. " +name;

}
}


else {
	if(isKnighted) {
		return "Hello Sir " + name;
	}
	else {
	return "Hello Mr. " + name;
	}
}
       }

}
