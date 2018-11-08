
public class Vault {

private int code = 3000;

Vault(int code){
	this.code = code;
}



boolean tryCode(int number){
	if(code == number) {
		return true;
	}
	else {
		return false;
	}
}

}

	