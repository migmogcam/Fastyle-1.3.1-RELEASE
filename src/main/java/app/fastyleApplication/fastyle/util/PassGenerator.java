package app.fastyleapplication.fastyle.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGenerator  {
	
	public static String getPassEncode(String pass) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        //El String que mandamos al metodo encode es el password que queremos encriptar.
        String resultado = bCryptPasswordEncoder.encode(pass);
	return resultado;
    }

}
