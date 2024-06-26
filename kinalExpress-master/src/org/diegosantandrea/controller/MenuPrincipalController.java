
package org.diegosantandrea.controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import org.diegosantandrea.system.Principal;

public class MenuPrincipalController implements Initializable {

    private Principal escenarioPrincipal;
    @FXML
    MenuItem btnMenuClientes;
    @FXML
    MenuItem btnMenuProgramador;
    @FXML
    MenuItem btnMenuProveedor;
    @FXML
    MenuItem btnTipoDeProducto;
    @FXML
    MenuItem btnMenuCompras;
    @FXML
    MenuItem btnMenuCargoEmpleado;
    @FXML
    MenuItem btnMenuProductos;
    @FXML
    MenuItem btnMenuEmailProveedor;
    @FXML
    MenuItem btnMenuEmpleado;
    @FXML
    MenuItem btnMenuTelefonoProveedor;
    @FXML
    MenuItem btnMenuDetallesCompras;
    @FXML
    MenuItem btnMenuFactura;
    @FXML
    MenuItem btnMenuDetalleFactura;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnMenuClientes) {
            escenarioPrincipal.menuClienteView();
        } else if (event.getSource() == btnMenuProgramador) {
            escenarioPrincipal.menuProgramadorView();
        } else if (event.getSource() == btnMenuProveedor) {
            escenarioPrincipal.menuProveedorView();
        } else if (event.getSource() == btnTipoDeProducto) {
            escenarioPrincipal.menuTipoDeProductoView();
        } else if (event.getSource() == btnMenuCompras) {
            escenarioPrincipal.menuComprasView();
        } else if (event.getSource() == btnMenuCargoEmpleado) {
            escenarioPrincipal.menuCargoEmpleadoView();
        } else if (event.getSource() == btnMenuProductos) {
            escenarioPrincipal.menuProductoView();
        } else if (event.getSource() == btnMenuEmailProveedor) {
            escenarioPrincipal.menuEmailProveedorView();
        } else if (event.getSource() == btnMenuEmpleado) {
            escenarioPrincipal.menuEmpleadoView();
        } else if (event.getSource() == btnMenuTelefonoProveedor) {
            escenarioPrincipal.menuTelefonoProveedorView();
        } else if (event.getSource() == btnMenuDetallesCompras) {
            escenarioPrincipal.menuDetalleCompraView();
        } else if (event.getSource() == btnMenuFactura) {
            escenarioPrincipal.menuFacturaView();
        } else if (event.getSource() == btnMenuDetalleFactura) {
            escenarioPrincipal.menuDetalleFacturaView();
        }

    }
}
