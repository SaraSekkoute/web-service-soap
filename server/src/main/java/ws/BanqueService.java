//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(
        serviceName = "BanqueWS"
)
public class BanqueService {
    public BanqueService() {
    }

    @WebMethod(
            operationName = "ConversionEuroToDH"
    )
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 11.3;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "Code") int Code) {
        return new Compte(Code, Math.random() * 6000.0, new Date());
    }

    @WebMethod
    public List<Compte> listComptes() {
        return List.of(new Compte(1, Math.random() * 6000.0, new Date()), new Compte(2, Math.random() * 6000.0, new Date()), new Compte(3, Math.random() * 6000.0, new Date()));
    }
}
